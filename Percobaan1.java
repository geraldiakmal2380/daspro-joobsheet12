public class Percobaan1{

    private static int faktorialrekrusif(int n){
        if (n==0){
            return(1);
        }
        else{
            return(n*faktorialrekrusif(n-1));
        }
    }

    private static int faktorialIteratif(int n){
        int faktor =1;
        for(int i =faktor;i>=1;i--){
            faktor = faktor*i;
        }
        return faktor;
    }
    public static void main(String[] args) {
        System.out.println(faktorialrekrusif(5));
        System.out.println(faktorialIteratif(5));
    }
}