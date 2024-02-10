public class VariableAssignment {
    public static void main(String[] args){
        // int i = j = k = 2;
        int k = 2;
        int j = k;
        int i = j;
        System.out.println(i + " " + j + " " + k);
    }
}
