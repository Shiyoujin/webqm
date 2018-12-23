import java.io.IOException;
import java.util.Scanner;

public class one{
    static int u =0;
    public int go(String read) throws IOException {
        Student[] student = FileUtil.parseStudents("C:\\Users\\white matter\\Desktop\\students.txt");
        for (; u < student.length; u++) {
            if (read.equals(student[u].getStuid())) {
                return 1;
            }
        }
        return 2;
    }

    public static void main(String[] args) throws IOException {
        Student[] stus = FileUtil.parseStudents("C:\\Users\\white matter\\Desktop\\students.txt");
        Scanner scan = new Scanner(System.in);
        String read = scan.nextLine();
        one o = new one();
        if(o.go(read)==1) {
            System.out.println("姓名： " + stus[u].getName() + "  学号： " + stus[u].getStuid());
        }
        else if (o.go(read)==2){
            System.out.println("该学生不存在");
        }
        }
    }
