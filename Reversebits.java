public class Reversebits {
    public static void main(String[] args) {
        int num = 13;
        int rev = 0;
        for (int i =1;i<=32;i++){
            rev =rev<<1;
            if((num&1)>0){
            rev = rev + 1;
            num = num >> 1;
            }

        }
        System.out.println(rev);
    }
}
