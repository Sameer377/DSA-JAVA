import java.util.Random;

class Student{

    float sub[]=new float[6];
    float maxmarks=150f;
    String name;
    public Student(){

    }

    public Student(String name , float ...sub){
        this.name=name;
        for(int i=0;i<6;i++){
            if(sub[i]>=0&&sub[i]<=150){

                this.sub[i]=sub[i];
            }else{
                System.out.println("Invalid Marks");
                break;
            }
        }
    }


    float getPercentage(){

        float sum = 0 ;
        for (float f : sub) {
            sum+=f;
        }
        
        return (sum/(maxmarks*6))*100;
    }

    String getResult(){

        float per = getPercentage();
        String res="Failed";
        if(per>=40f){
            res="Pass";
            int kt = 0;
            for(float score : sub){
                if(score<60f){
                    kt++;
                }
            }
            if(kt==3){
                res="ATKT";
            }else if(kt>3){
                res="Failed";
            }
        }else{
            res="Failed";
        }

       
    

        return res;
    }


    public void printSheet(){
        System.out.printf("%-20s", "Name");
        for (int i = 0; i < 6; i++) {
                System.out.printf("%-10s", "S" + (i + 1));
        }

        System.out.printf("%-20s", "Percentage");
        System.out.printf("%-10s", "Result");

        System.out.println();
        System.out.printf("%-10s", "----------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10s", "----------");

        }
        System.out.println();
        System.out.printf("%-20s", name);
        for (int i = 0; i < 6; i++) {
           
            System.out.printf("%-10.2f", sub[i]);
            
        }
        System.out.printf("%-20.2f",getPercentage());
        System.out.printf("%-10s",getResult());
        System.out.println();
        System.out.println();
        System.out.println();
    }

}



public class Task1 {
    public static void main(String[] args) {

    Student[] TY = new Student[50];
    Random random = new Random();
    for(int i=0;i<50;i++){
        String name = "";
        int nameL=random.nextInt(5,8);
        for(int k=0;k<nameL;k++){
            char c= (char) random.nextInt(65,90);
            name+=c;
        }
        TY[i]=new Student(name,random.nextInt(0,150),random.nextInt(0,150),random.nextInt(0,150),random.nextInt(0,150),random.nextInt(0,150),random.nextInt(0,150));
    }

    for(int i=0;i<50;i++){
        TY[i].printSheet();
    } 
        
    }
    
}
