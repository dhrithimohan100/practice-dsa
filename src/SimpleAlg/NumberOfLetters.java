package SimpleAlg;

public class NumberOfLetters {
    public static void main(String[] args) {
        String word="))";
        int count=0;
        for(int i=0;i<word.length();i++){
            if(Character.isLetter(word.charAt(i)));
            count++;
        }
        System.out.println("the count of the word "+word+" is "+count);
    }
}
