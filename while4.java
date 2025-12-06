public class while4 {
    public static void main(String[] args) {
        int i=0;

        while(true){
            if(i>=3)break;
            ++i;
            if(i%2==0) continue;
            System.out.println(i);
        }
    }
    
}
//odd values