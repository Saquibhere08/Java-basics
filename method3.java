public class method3 {
    
    static int addTwo(int num1,int num2){
        return num1+num2;
    }

    int addTwo(int num){
        return num+10;//method overloading
    }
    public static void main(String[] args) {
        addTwo(5,7);
        addTwo(5);  
    }
    
    
}
