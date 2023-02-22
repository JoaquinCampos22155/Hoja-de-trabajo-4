import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
public class LectorDoc {
    private ArrayList<ArrayList<String>> texto;

/** 
 * @param nombredoc
 * @return ArrayList<ArrayList<String>>
 */
// con ayuda de chatgpt se genero el codigo teniendo la idea principal de ordenar las lineas de texto y evaluarlas
    public ArrayList<ArrayList<String>> read(String nombredoc) {
        texto = new ArrayList<ArrayList<String>>();
        Path direccion = Paths.get(nombredoc);
        try {
            BufferedReader lectorgpt = Files.newBufferedReader(direccion);
            String linea;

            while ((linea = lectorgpt.readLine()) != null) {
                String[] lTexto = linea.split("");
                ArrayList<String> lineaT = new ArrayList<String>();

                for (String i : lTexto) {
                    lineaT.add(i);
                }

                texto.add(lineaT);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return texto;
    }
 
    public String gettextoAsString() {
        StringBuilder tAstring = new StringBuilder();

        for (ArrayList<String> row : texto) {
            for (String i : row) {
                tAstring.append(i).append(" ");
            }

            tAstring.append("\n");
        }

        String textoString = tAstring.toString().trim();
        System.out.println(textoString);
        return textoString;
    }
}