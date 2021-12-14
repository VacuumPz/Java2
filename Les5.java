import java.io.*;

public class Les5 {
    public static void main(String[] args) {
        write();
        read();
    }

    public static void write() {
        String header = "Column1; Column2; Column3";
        String field1 = "1; 2; 3";
        String field2 = "4; 5; 6";
        String field3 = "7; 8; 9";

        try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("src/file.csv", false))) {
            objOut.write('\n');
            objOut.write(header.getBytes());
            objOut.write('\n');
            objOut.write(field1.getBytes());
            objOut.write('\n');
            objOut.write(field2.getBytes());
            objOut.write('\n');
            objOut.write(field3.getBytes());
            objOut.write('\n');
            objOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static void read() {
        File file = new File("src/file.csv");
        byte[] buf = new byte[100];

        try (FileInputStream in = new FileInputStream("src/file.csv")) {
            int count;
            while ((count = in.read(buf)) > 0) {
                for (int i = 0; i < count; i++) {
                    System.out.print((char) buf[i]);
                }
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
