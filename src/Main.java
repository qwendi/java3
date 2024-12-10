import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:/Users/qwend/IdeaProjects/lab3/file.txt"));
        Stack<String> strings = new Stack<String>();

        // считывание строк в стек
        while (sc.hasNextLine()) {
            strings.push(sc.nextLine());
        }

        // вывод строк из стека
        while (!strings.empty()) {
            System.out.println(strings.pop());
        }
    }
}