import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static boolean CFG1(String strings){
        if(strings.isEmpty()){return true;}
        int countA = 0;
        int countB = 0;
        for (char ch : strings.toCharArray()) {
            if (ch == 'a') {countA++;}
            else if (ch == 'b') {countB++;}
        }
        return countA == countB;
    }

    public static boolean CFG2(String strings){
        if(strings.isEmpty()){return true;}
        int countA = 0;
        int countB = 0;
        for (char ch : strings.toCharArray()) {
            if (ch == 'a') {countA++;}
            else if (ch == 'b') {countB++;}
        }
        return countA == 2 * countB;
    }
    public static boolean CFG3(String strings){
        if(strings.isEmpty()){return true;}
        int start = 0;
        int end = strings.length() - 1;
        while (start < end) {
            if (strings.charAt(start) != strings.charAt(end)) {return false;}
            start++;
            end--;
        }
        return true;
    }
    public static boolean CFG4(String strings){
        int countA = 0;
        int countB = 0;
        if(strings.isEmpty()){return true;}
        for (char c : strings.toCharArray()) {
            if (c == 'a') {countA++;}
            else if (c == 'b') {countB++;}
            else {return false;}
        }
        return countA == (2 * countB + 3);
    }

    public static boolean pda1(String strings){
        int countA = 0;
        int countB = 0;
        if(strings.isEmpty()){return true;}
        for (char c : strings.toCharArray()) {
            if (c == 'a') {countA++;}
            else if (c == 'b') {countB++;}
            else {return false;}
        }
        return countA == countB;
    }
    public static boolean pda2(String strings){
        int countA = 0;
        int countB = 0;
        if(strings.isEmpty()){return true;}
        for (char c : strings.toCharArray()) {
            if (c == 'a') {countA++;}
            else if (c == 'b') {countB++;}
            else {return false;}
        }
        int n = countA/2;
        return countB == ( n * 3);
    }
    public static boolean pda3(String strings){
        int open = 0;
        int close = 0;
        if(strings.isEmpty()){return true;}
        for (char c : strings.toCharArray()) {
            if (c == '{') {open++;}
            else if (c == '}') {close++;}
            else if(c == ' '){continue;}
            else {return false;}
        }
        return open == close;
    }

    public static boolean pda4(String strings){
        int countA = 0;
        int countB = 0;
        int countC = 0;
        if(strings.isEmpty()){return true;}
        for (char c : strings.toCharArray()) {
            if (c == 'a') {countA++;}
            else if (c == 'b') {countB++;}
            else if(c == 'c'){countC++;}
            else if(c == ' '){continue;}
            else {return false;}
        }
        return countA == (countB+countC);
    }

    public static void main(String[] args) throws IOException {
        File cfgFile = new File("input_cfg.txt");
        File pdaFile = new File("input_pda.txt");
        FileWriter cfgOutputFile = new FileWriter("output_cfg.txt");
        FileWriter pdaOutputFile = new FileWriter("output_pda.txt");
        Scanner cfgReader = new Scanner(cfgFile);
        Scanner pdaReader = new Scanner(pdaFile);

        //===========> cfg_problem 1 <==============
        System.out.println("\n===========> cfg_problem1 <==============");
        String data = cfgReader.nextLine();
        cfgOutputFile.write(data + "\n");

        while (cfgReader.hasNextLine()) {
            data = cfgReader.nextLine();
            if (Objects.equals(data, "end")){cfgOutputFile.write("end\n");break;}
            System.out.print(data);
            if(CFG1(data)){cfgOutputFile.write("accepted\n"); System.out.println("\t\tTrue");}
            else {cfgOutputFile.write("not accepted\n");  System.out.println("\t\tFalse");}
        }

        //===========> cfg_problem 2 <==============
        System.out.println("\n===========> cfg_problem2 <==============");
        data = cfgReader.nextLine();
        cfgOutputFile.write(data + "\n");

        while (cfgReader.hasNextLine()) {
            data = cfgReader.nextLine();
            if (Objects.equals(data, "end")){cfgOutputFile.write("end\n");break;}
            System.out.print(data);
            if(CFG2(data)){cfgOutputFile.write("accepted\n"); System.out.println("\t\tTrue");}
            else {cfgOutputFile.write("not accepted\n");  System.out.println("\t\tFalse");}
        }

        //===========> cfg_problem 3 <==============
        System.out.println("\n===========> cfg_problem3 <==============");
        data = cfgReader.nextLine();
        cfgOutputFile.write(data + "\n");

        while (cfgReader.hasNextLine()) {
            data = cfgReader.nextLine();
            if (Objects.equals(data, "end")){cfgOutputFile.write("end\n");break;}
            System.out.print(data);
            if(CFG3(data)){cfgOutputFile.write("accepted\n"); System.out.println("\t\tTrue");}
            else {cfgOutputFile.write("not accepted\n");  System.out.println("\t\tFalse");}
        }

        //===========> cfg_problem 4 <==============
        System.out.println("\n===========> cfg_problem4 <==============");
        data = cfgReader.nextLine();
        cfgOutputFile.write(data + "\n");

        while (cfgReader.hasNextLine()) {
            data = cfgReader.nextLine();
            if (Objects.equals(data, "end")){cfgOutputFile.write("end\n");break;}
            System.out.print(data);
            if(CFG4(data)){cfgOutputFile.write("accepted\n"); System.out.println("\t\tTrue");}
            else {cfgOutputFile.write("not accepted\n");  System.out.println("\t\tFalse");}
        }
        cfgReader.close();
        cfgOutputFile.close();


        //===========> pda_problem 1 <==============
        System.out.println("\n===========> pda_problem 1 <==============");
        data = pdaReader.nextLine();
        pdaOutputFile.write(data + "\n");

        while (pdaReader.hasNextLine()) {
            data = pdaReader.nextLine();
            if (Objects.equals(data, "end")){pdaOutputFile.write("end\n");break;}
            System.out.print(data);
            if(pda1(data)){pdaOutputFile.write("accepted\n"); System.out.println("\t\taccepted");}
            else {pdaOutputFile.write("not accepted\n");  System.out.println("\t\tnot accepted");}
        }

        //===========> pda_problem 2 <==============
        System.out.println("\n===========> pda_problem 2 <==============");
        data = pdaReader.nextLine();
        pdaOutputFile.write(data + "\n");

        while (pdaReader.hasNextLine()) {
            data = pdaReader.nextLine();
            if (Objects.equals(data, "end")){pdaOutputFile.write("end\n");break;}
            System.out.print(data);
            if(pda2(data)){pdaOutputFile.write("accepted\n"); System.out.println("\t\taccepted");}
            else {pdaOutputFile.write("not accepted\n");  System.out.println("\t\tnot accepted");}
        }

        //===========> pda_problem 3 <==============
        System.out.println("\n===========> pda_problem 3 <==============");
        data = pdaReader.nextLine();
        pdaOutputFile.write(data + "\n");

        while (pdaReader.hasNextLine()) {
            data = pdaReader.nextLine();
            if (Objects.equals(data, "end")){pdaOutputFile.write("end\n");break;}
            System.out.print(data);
            if(pda3(data)){pdaOutputFile.write("accepted\n"); System.out.println("\t\taccepted");}
            else {pdaOutputFile.write("not accepted\n");  System.out.println("\t\tnot accepted");}
        }

        //===========> pda_problem 4 <==============
        System.out.println("\n===========> pda_problem 4 <==============");
        data = pdaReader.nextLine();
        pdaOutputFile.write(data + "\n");
        while (pdaReader.hasNextLine()) {
            data = pdaReader.nextLine();
            if (Objects.equals(data, "end")){pdaOutputFile.write("end\n");break;}
            System.out.print(data);
            if(pda4(data)){pdaOutputFile.write("accepted\n"); System.out.println("\t\taccepted");}
            else {pdaOutputFile.write("not accepted\n");  System.out.println("\t\tnot accepted");}
        }
        pdaReader.close();
        pdaOutputFile.close();
    }
}