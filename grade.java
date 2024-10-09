import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(".....to find student grade ......");
        System.out.println("enter the number of subject...");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        System.out.println("enter marks of each subject...");
        for(int i=1;i<=n;i++){
            Scanner ab=new Scanner(System.in);
            int marks=ab.nextInt();
            sum+=marks;


        }
        System.out.println("total marks obtained:"+ sum);
        int avg=sum/n;
        System.out.println("average marks:"+ avg);
        if (avg>=90) {
            System.out.println("grade A ");
        }

        else if((avg>=80) && (avg < 90)){
            System.out.println("grade B ");}
        else if((avg>=70) && (avg < 80)){
            System.out.println("grade C");
        }
        else if((avg>=60) && (avg < 70)){
            System.out.println("grade D");}
        else if(avg < 60){
            System.out.println("grade E ");}
        else {
            System.out.println("invalid grade");
        }

    }
}