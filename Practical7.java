
class Pratical7 {

    public static void main(String[] args) {
        int size =15;
        getDisplayPatternS(size);
        System.out.println();
        getDisplayPatternH(size);
        System.out.println();
        getDisplayPatternA(size);
        System.out.println();
        getDisplayPatternD(size);
    }

    // Print 'S'
    static void getDisplayPatternS(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || i == size / 2) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else if (i < size / 2 && j == 0) {
                    System.out.print("*");
                } else if (i > size / 2 && j == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Print 'H'
    static void getDisplayPatternH(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0 || j == size - 1) {
                    System.out.print("*");
                } else if (i == size / 2) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Print 'A'
    static void getDisplayPatternA(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == size / 2 - i || j == size / 2 + i) {
                    System.out.print("*");
                } else if (i == size / 2) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Print 'D'
    static void getDisplayPatternD(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0 || (j == size - 1 && i != 0 && i != size - 1)) {
                    System.out.print("*");
                } else if ((i == 0 || i == size - 1) && j < size - 1) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
