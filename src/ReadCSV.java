import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
    public static void main(String[] args) {
        String csvFile = "contry.csv";
        String line = "";
        String csvSplitBy = ",";
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(csvFile));
            while ((line = bufferedReader.readLine()) != null){
                String[] contry = line.split(csvSplitBy);
//                System.out.println("contry " + contry[4] + contry[5]);
                for (int i = 0; i < contry.length; i++) {
                    System.out.print(contry[i] + ",");
                }
                System.out.println();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            if (bufferedReader != null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
