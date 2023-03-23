package FileIO;

import java.io.*;

public class FileOutputStreamLesson {
    public static void main(String[] args) {
        FileWriter fw = null;
//        FileOutputStream fos = null;
        String loadInfo = "Я только учусь";
        File file=new File("C:/3.txt");
        try {
//            fw = new FileWriter("С:/1.txt", true); // если append:false  то файл ПЕРЕзаписывается иначе ДОзаписывается
            fw = new FileWriter(file, true);
            fw.write(loadInfo);
//            fos = new FileOutputStream("D:/1.txt");
//            fos.write(loadInfo.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fw != null;
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
