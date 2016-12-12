import java.io.*;
import javax.swing.*;

public class FileInputOutputDemo {
    public static void main(String[] args) throws IOException {
        String FilePath="F:/Bufer/javaFileDemo/";
        FilePath+=JOptionPane.showInputDialog("Введите имя файла");
        try{
        FileInputStream fin=new FileInputStream(FilePath);
        FileOutputStream fout=new FileOutputStream("F:/Bufer/javaFileDemo/result.txt");
        int s=fin.read();
        while(s!=-1){
            switch(s){
                case 'T':
                    s='t';
                    break;
                case '.':
                    fout.write('<');
                    fout.write('*');
                    s='>';
                    break; 
            }
        fout.write(s);
        s=fin.read();
        }

        JOptionPane.showMessageDialog(null, "Изменения в файл внесены!",
                "Программа закнчила работу.",JOptionPane.INFORMATION_MESSAGE);
        fin.close();
        fout.close();
        }catch(FileNotFoundException e){JOptionPane.showMessageDialog(null, 
                "Такого файла нет!!",
                "Произошла ошибка.",JOptionPane.ERROR_MESSAGE);}
        
        
        
        
    }
    
}
