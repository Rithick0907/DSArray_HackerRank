package linked_list;
import java.util.*;
public class Class_Group_Using_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> l=new LinkedList<>();
        String[][] g=new String[5][11];
        String[] color={"Blue","Green","Pink","White","Yellow"};
        String[] Num={"CS01","CS02","CS03","CS04","CS05","CS06","CS07","CS08","CS09","CS10","CS11","CS12","CS13","CS14","CS15","CS16","CS17","CS18","CS19","CS20",
            "CS21","CS22","CS23","CS24","CS25","CS26","CS27","CS28","CS29","CS30","IT01","IT02","IT03","IT04","IT05","IT06","IT07","IT08","IT09","IT10","IT11",
            "IT12","IT13","IT14","IT15","IT16","IT17","IT20","IT21","IT22","IT24","IT25","IT26","IT27","IT28"};
        for(int i=0;i<Num.length;i++)
            l.add(Num[i]);
        int n,min=1,max=55;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<11;j++)
            {
                n=(int)(Math.random()*max);
                g[i][j]=l.get(n);
                l.remove(n);
                max--;
            }
        }
        System.out.println("\t\t\tGroup List");
        for(int i=0;i<5;i++)
        {
            System.out.println("\t\t\t"+color[i]);
            for(int j=0;j<11;j++)
            {
                System.out.println(g[i][j]);
            }
        }
            
    }
}
