package Day_6;

public class Code_12 {
    public static void main(String[] args) {
        int age = 16;
        if(age<13){
            System.out.println("Child");
        }
        else if(age>=13 && age<18){
            System.out.println("Teenager");
        }
        else if(age>=18 && age<60){
            System.out.println("Adult");
        }
        else if(age>=60){
            System.out.println("Senior citizen");
        }
        // else{
        //     System.out.println("Senior citizen");
        // }
    }
}
