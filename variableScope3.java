public class variableScope3 {
    public static void main(String[] args) {
        
        int outerVariable=10;
        if(outerVariable>5){
            int innerVariable=20;
            System.out.println(innerVariable);
        }
    }
}
