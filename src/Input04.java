import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Input04 {
    public static void main(String[] args) {
        String fileName = "input04text.txt"; // Nome do arquivo a ser lido

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("BlueBumper")) { // Verifica se a linha contém "BlueBumper"
                    String[] parts = line.split("\\s+"); // Divide a linha em partes separadas por espaços em branco
                    int xPositon = Integer.parseInt(parts[3]); // Extrai a posição X
                    int yPosition = Integer.parseInt(parts[4]); // Extrai a posição Y
                    // Imprime as coordenadas
                    System.out.println("Coordenadas do BlueBumper: xPositon = " + xPositon + ", yPosition = " + yPosition);
                    break; // Interrompe a leitura após encontrar o "BlueBumper"
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}