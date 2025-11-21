package SimpleAlg;

public class ReverseName {
    public static void main(String[] args) {
        String name="Sai";
        String reverse=" ";

        for(int i=name.length()-1;i>=0;i--){//loop starts from the last element and moves backward
            reverse +=name.charAt(i);//gets each char and adds it to the reversed string
        }
        System.out.println("the real name "+name);
        System.out.println(("the reverse name "+reverse));
    }
}
