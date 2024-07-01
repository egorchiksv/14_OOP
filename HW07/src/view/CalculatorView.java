package view;

import controller.ComplexCalculatorController;
import controller.ComplexNumberController;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class CalculatorView {
    private ComplexCalculatorController complexCalculatorController = new ComplexCalculatorController();
    private ComplexNumberController complexNumberController = new ComplexNumberController();

    Logger logger = Logger.getLogger(CalculatorView.class.getName());

    public void start() throws IOException {
        FileHandler logFile = new FileHandler("Logger.txt", true);
        logger.addHandler(logFile);
        logger.setUseParentHandlers(false);
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        logFile.setFormatter(simpleFormatter);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите 1 действительное число: ");
            int a1 = scanner.nextInt();
            System.out.print("Введите 1 мнимое число: ");
            int bi1 = scanner.nextInt();
            System.out.print("Введите 2 действительное число: ");
            int a2 = scanner.nextInt();
            System.out.print("Введите 2 мнимое число: ");
            int bi2 = scanner.nextInt();
            System.out.print("Выберете действие (1 - '+', 2 - '-', 3 - '*', 4 - '/'): ");
            int cmd = scanner.nextInt();
            System.out.print(complexCalculatorController.builderComplex(a1, bi1, cmd, a2, bi2));
            switch (cmd) {
                case 1 -> {System.out.println(complexCalculatorController
                        .sumComplexNumbers(complexNumberController.createComplexNumbers(a1, bi1),
                                complexNumberController.createComplexNumbers(a2, bi2)));
                        logger.info("Суммирование чилсел" + complexCalculatorController.
                                builderComplex(a1, bi1, cmd, a2, bi2) + complexCalculatorController
                                .sumComplexNumbers(complexNumberController.createComplexNumbers(a1, bi1),
                                        complexNumberController.createComplexNumbers(a2, bi2)));
                        }
                case 2 -> {System.out.println("(" + complexNumberController
                        .createComplexNumbers(a1, bi1) + ")" + " - " + "(" + complexNumberController
                        .createComplexNumbers(a2, bi2) + ") " + "Результат: " + complexCalculatorController
                        .difComplexNumbers(complexNumberController.createComplexNumbers(a1, bi1),
                                complexNumberController.createComplexNumbers(a2, bi2)));
                        logger.info("Разность чилсел" + complexCalculatorController.
                            builderComplex(a1, bi1, cmd, a2, bi2) + complexCalculatorController
                            .sumComplexNumbers(complexNumberController.createComplexNumbers(a1, bi1),
                                    complexNumberController.createComplexNumbers(a2, bi2)));
                        }
                case 3 -> {System.out.println("(" + complexNumberController
                        .createComplexNumbers(a1, bi1) + ")" + " * " + "(" + complexNumberController
                        .createComplexNumbers(a2, bi2) + ") " + "Результат: " + complexCalculatorController
                        .multipComplexNumbers(complexNumberController.createComplexNumbers(a1, bi1),
                                complexNumberController.createComplexNumbers(a2, bi2)));
                        logger.info("Умножение чилсел" + complexCalculatorController.
                            builderComplex(a1, bi1, cmd, a2, bi2) + complexCalculatorController
                            .sumComplexNumbers(complexNumberController.createComplexNumbers(a1, bi1),
                                    complexNumberController.createComplexNumbers(a2, bi2)));
                        }
                case 4 -> {System.out.println("(" + complexNumberController
                        .createComplexNumbers(a1, bi1) + ")" + " / " + "(" + complexNumberController
                        .createComplexNumbers(a2, bi2) + ") " + "Результат: " + complexCalculatorController
                        .divComplexNumbers(complexNumberController.createComplexNumbers(a1, bi1),
                                complexNumberController.createComplexNumbers(a2, bi2)));
                        logger.info("Деление чилсел" + complexCalculatorController.
                            builderComplex(a1, bi1, cmd, a2, bi2) + complexCalculatorController
                            .sumComplexNumbers(complexNumberController.createComplexNumbers(a1, bi1),
                                    complexNumberController.createComplexNumbers(a2, bi2)));
                        }
                default -> System.out.println("Нет такого дейтсвия");
            }
            System.out.println("Нажмити '0' для выхода или любую цифру для продолжения");
            if (scanner.nextInt() == 0) System.exit(0);
        }
    }
}
