package FileIO;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileInputStreamLesson {
    public static void main(String[] args) {
        java.io.FileInputStream fis = null; //FileInputStream байтовый поток
        InputStreamReader isr=null; //InputStreamReader символьный поток
        int b;
        try {
            fis = new java.io.FileInputStream("C:/1.txt");//"C:/1.txt путь к файлу
            isr=new InputStreamReader(fis, StandardCharsets.UTF_8);
            while ((b = fis.read()) != -1) { // read помещяем в цикл так-как он читает за раз только один байт
                System.out.println((char) b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally { //далее мы закрываем потоки данных и обрабатываем каждый в отделньом блоке try catch
            try {
                assert fis != null;//проверка входящего аргумента на null
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                assert isr != null;
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
