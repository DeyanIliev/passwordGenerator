import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);
        char thirdSymbol = scanner.nextLine().charAt(0);

        System.out.printf("%c%c%c", firstSymbol,secondSymbol,thirdSymbol);*/


        String firstRow = scanner.nextLine();
        String secondRow = scanner.nextLine();

        String[] firstArray = firstRow.split(" ");
        String[] secondArray = secondRow.split(" ");

        for (String secondElement : secondArray){
            for (String firstElement : firstArray) {
                if (firstElement.equals(secondElement)){
                    System.out.print(firstElement + " ");
                }
            }
        }

    }
}
