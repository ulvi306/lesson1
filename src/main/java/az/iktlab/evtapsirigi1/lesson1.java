package az.iktlab.evtapsirigi1;


public class lesson1 {
    public static void main(String[] args) {
int say=0;
        int a;
       for (int i=1000; i<10000;i++){
           a=i;
           int a1=a/1000;
           int a2=(a/100)%10;
           int a3=(a/10)%10;
           int a4=a%10;
           int c1=a1+a2;
           int c2=a3+a4;

           if (c1==c2){
               say++;
               System.out.println(a);
           }
       }
        System.out.println("Uygun gelen ededlerin say: "+say);
    }
}

