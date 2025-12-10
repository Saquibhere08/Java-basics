public class variableScope2 {

    static String classVar="Hello, Java";
    
     public static void main(String[] args) {
        displayMessage();
        //String localvar="Hello, Java Inside main function!";
        //System.out.println(localvar);
        classVar="Hello, World!";
        displayMessage();
    }
    static void displayMessage(){
        //String localvar="Hello, Java inside displayMessage function!";
        System.out.println(classVar);
    }
}
