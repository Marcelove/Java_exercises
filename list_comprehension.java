
public class Asics {

    public static void main (String[] args){

        comprimir("aabcccccaaa");
    }

    public static void comprimir (String stringer) {

        String vazio = "";
        int quantidade = 1;
        int i;

        for (i = 0; i < stringer.length()-1; i++) {

            if (stringer.charAt(i) == stringer.charAt(i+1)) {
                quantidade ++;
            } 
            else {
                vazio = vazio + stringer.charAt(i) + quantidade;
                quantidade = 1;
            }
        }

        vazio = vazio + stringer.charAt(stringer.length() -1) + quantidade;

        if (vazio.length() > stringer.length()){
            System.out.println(stringer);
        }
        else{
            System.out.println(vazio);
        }
    }

}