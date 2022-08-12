public class Main {
    public static void main(String[] args) {
        int i,y;
        for (i =2; i<100;i++){
            for (y =2; y<i;y++){
                if (i%y == 0){
                    break;
                }
            }if (i == y){
                System.out.print(i + " ");
            }
        }
    }
}
