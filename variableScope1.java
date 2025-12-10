public class variableScope1 {
    public static void main(String[] args) {
        displayMessage();
        String localvar="Hello, Java Inside main function!";
        System.out.println(localvar);
    }
    static void displayMessage(){
        String localvar="Hello, Java inside displayMessage function!";
        System.out.println(localvar);
    }
}
//scope variable allows to same variable name but completely different functionality as this will never show any type of error.