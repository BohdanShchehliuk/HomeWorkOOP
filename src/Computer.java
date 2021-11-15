public class Computer {
    public int number;
    public static void main (String[] arg) {
        Computer array [] = new Computer [5];
        array[0] = new Computer();
        array[1] = new Computer();
        array[2] = new Computer();
        array[3] = new Computer();
        array[4] = new Computer();

        for (int i = 0; i<5; i++) {
            array[i].number = (int)(Math.random()*100);
            System.out.print(array[i].number+ " ");

        }

    }





}
