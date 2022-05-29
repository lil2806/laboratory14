package collection.com;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class example {



    public static void main(String[] args) throws IOException {
        List<String> employees = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("src/data.txt"))){

            String line;
            while ((line = br.readLine()) !=null){
                employees.add(line);
            }
        }catch (IOException e){
            e.printStackTrace();

        System.out.println(" size of the collection : " + employees.size());

        System.out.println("looping : ");
        for (String employee:employees
        ) {
            System.out.println(employee);
        }

        HashSet<String> set = new HashSet<String>(employees);

        List<String> newlist = new ArrayList<>(set);

        System.out.println(" ");
        for (Object ob:newlist)
            System.out.println(ob);

    }
}
