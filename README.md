# TEST AUTOESCUELA.
Aplicación en la cual a partir de una base de datos nos permite realizar examanes de atutoescula.

## CONSTRUIDO CON 🛠️
* [Java](https://www.java.com/es/) - Lenguaje de programación usado en la aplicación.
* [Maven](https://maven.apache.org/) - Manejador de dependencias.
* [SQLITE](https://sqlite.org/index.html) - Base de datos.

## FUNCIONES DEL PROGRAMA 📋
- Permite cargar una base de datos con preguntas.
- Permite resolver las preguntas con imaganes para una clara resolucion del problema. 
- Utilizacion de mnemonic en los radio buttons (teclas alt+1, alt+2, alt+3, alt+4) y en los botones para pasar las preguntas (alt+tecla izquierda del teclado o alt+derecha del teclado)
- Utilizacion de un TabPane para la visualiacion de las preguntas con su respueta correcta.
- Funcionalidad de aprobado o suspendo, con imagen.
- Modo oscuro o clarito.

## DISEÑO ✏️
- Pantalla de inicio; en la cual el usuario puede escoger la BBDD para efectuar el test., modalidad de cambio de tema.
- Pantalla de Test, incluye el numero de la pregunta con su imagen asociada, con sus diferentes respuestas.
- Pantalla Resultados, visualiza el resultado final de los test. Con una pantalla de las preguntas. Imagen de aprobado o suspendo. Y boton de volver al meno principal.

## BASE DE DATOS 📋
Mi base de datos dispone de 2 tablas:
- Preguntas.
- Respuestas.

<h3>PREGUNTA</h3>

Tabla que contiene 3 campos.
- id_preguntas, INTEGER y clave primaria.
- enunciado, VARCHAR.
- imagen, VARCHAR.

<h3>RESPUESTA</h3>

Tabla que contiene 5 campos.
- id_respuestas, INTEGER y clave primaria.
- respuesta_uno, VARCHAR.
- respuesta_dos, VARCHAR.
- respuesta_tres, VARCHAR.
- respuesta_correcta, VARCHAR.

## CODIGO ⚙️ 

<h3>CLASES</h3>

<h3>Main_Selector</h3>
- Es la pantalla principal del programa

- Codigo que se ejecuta cuando el usuario elige la base de datos, mediante un boton
  
      JFileChooser fc = new JFileChooser();
      int numero = fc.showOpenDialog(this);

      if (numero == JFileChooser.APPROVE_OPTION) {
          archivoPreguntas = fc.getSelectedFile();
          JOptionPane.showMessageDialog(this, "Base de datos cargada.", "¡Enhorabuena!", JOptionPane.PLAIN_MESSAGE);;
      }
          
<h3>ConexionBBDD</h3>
- Recupera de la base de datos las diferentes datos.

- Metodo que devuelve un arrayList con las preguntas. 
  
  
      public ArrayList<Pregunta> ConexionBBDD() {
        ArrayList<Pregunta> preguntas = new ArrayList();
        
        try ( var con = DriverManager.getConnection("jdbc:sqlite:" + archivoPreguntas.getAbsolutePath())) {
            System.out.println("¡Conexión con exito!");
            try ( var psPreguntas = con.createStatement()) {

                // 1º CONSULTA PARA OBTENER LA PREGUNTA //
                ResultSet rs = psPreguntas.executeQuery(queryP);
                while (rs.next()) {
                    preguntas.add(new Pregunta(rs.getInt(1), rs.getString(2), rs.getString(3),null, null, null, null, null));
                }
                for (Pregunta pr : preguntas) {
                    ArrayList<Respuesta> respuestas = new ArrayList();

                    // 2º CONSULTA PARA OBTENER LAS RESPUESTAS //
                    rs = psPreguntas.executeQuery(queryR + pr.getId());
                    if (rs.next()) {
                        respuestas.add(new Respuesta(rs.getString(1), false));
                        respuestas.add(new Respuesta(rs.getString(2), false));
                        respuestas.add(new Respuesta(rs.getString(3), false));
                        respuestas.add(new Respuesta(rs.getString(4), true));
                    }
                    // LLAMADA AL METODO RANDOM -> Cambia el orden de las preguntas. //
                    randomizadorDeRespuestas(respuestas);

                    pr.setRespuestaUno(respuestas.get(0));
                    pr.setRespuestaDos(respuestas.get(1));
                    pr.setRespuestaTres(respuestas.get(2));
                    pr.setRespuestaCuatro(respuestas.get(3));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (SQLException ex) {
            System.err.println("Error al establecer la conexión: " + ex.toString());
        }
        return preguntas;
    }
    
    
<h3>ComponenteRespuestaFinal.</h3>
- Componente creado especificamente para el resultado de las diferentes preguntas, con su correspondiente respuesta correcta.

<h3>Panel_respuestas.</h3>
- Pantalla que recibe los datos de la clase <b>ConexionBBDD</b> y genera el test.

Metodo que genera el test.


    public void escrituraPreguntasRespuestas() {
            Pregunta objPregunta = listaDePreguntas.get(contadorPregunta);
            numPregunta.setText(String.valueOf(contadorPregunta + 1)+".");
           preguntaTest.setText("<html><h3>"+objPregunta.getPregunta()+ "</h3></html>");

          respUno.setText("<html><p>" +objPregunta.getRespuestaUno().getTextoRespuesta()+ "</p></html>");
          respDos.setText("<html><p>" +objPregunta.getRespuestaDos().getTextoRespuesta()+ "</p></html>");
          respTres.setText("<html><p>" +objPregunta.getRespuestaTres().getTextoRespuesta()+ "</p></html>");
          respCuatro.setText("<html><p>" +objPregunta.getRespuestaCuatro().getTextoRespuesta()+ "</p></html>");

          // pinta las imagenes para cada pregunta //
          pintarImagenes(objPregunta);

          if (respuestaGuardada[contadorPregunta] != null) {
              Respuesta respuesta = respuestaGuardada[contadorPregunta];
              String valor = respuesta.getTextoRespuesta();

              if (respUno.getText().equals(valor)) {
                  respUno.setSelected(true);
              } else if (respDos.getText().equals(valor)) {
                  respDos.setSelected(true);
              } else if (respTres.getText().equals(valor)) {
                  respTres.setSelected(true);
              } else if (respTres.getText().equals(valor)) {
                  respTres.setSelected(true);
              }
          }
          ...
      }



<h3>Panel_resultados</h3>
- Pantalla que recibe los resultados, pinta el componente <b>ComponenteRespuestaFinal</b> con las respuestas correctas a la preguntas.

  Metodo que calcula si has aprobado o suspendido el test.
  
  
      public void resultado (int aciertos, int cantidadPreguntas){
            if (aciertos >=(cantidadPreguntas - 3)) {
                jResultado.setText("¡APROBADO!");
                imagenAprobado();
            } else {
                jResultado.setText("¡SUSPENSO!");
                imagenSuspenso();
            }
        }
    
    
  
  
  
<h3>Pregunta</h3>
Componente que genera objetos de tipo Pregunta. 

<h3>Respuesta</h3>
Componente que genera objetos de tipo Respuesta. 


## Creador & licencia ✒️
Iván Pérez Vivas.
