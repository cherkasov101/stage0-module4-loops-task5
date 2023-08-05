package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int right = height - 1;
        for (int i = 0; i < height / 2; i++) {
            for (int j = 0; j < height; j++) {
                if (j >= i && j <= right) {
                    System.out.print(8);
                } else {
                    System.out.print(" ");
                }
            }
            right--;
            System.out.println();
        }

        int left = height / 2 - 1;
        right = height / 2;
        for (int i = 0; i < height / 2; i++) {
            for (int j = 0; j < height; j++) {
                if (j >= left && j <= right) {
                    System.out.print(8);
                } else {
                    System.out.print(" ");
                }
            }
            left--;
            right++;
            System.out.println();
        }
    }
}
