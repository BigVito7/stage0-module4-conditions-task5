package school.mjc.stage0.conditions.task5;

public class RangeNumbersPrinter {
    public void printRange(int number) {
        switch (number) {
            case 2:
            case 3:
            case 4:
                System.out.println("number is between 1 and 5");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("number is between 6 and 10");
                break;
            default:
                System.out.println("out of range");
            break;
        }
    }
}
