public class RandomNumbers {
    public static void main(String[] args) {
        for (int i = 0; i<10; i++) {
            int random = (int) (Math.random() * 10);
            System.out.println("#" + (i+1) + ":" + random);
        }

    }


}
