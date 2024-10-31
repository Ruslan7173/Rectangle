
package org.example;
//1.Создать класс Прямоугольник, заданный шириной и длиной
//Предусмотреть, что если в конструктор подать отрицательные параметры,
// то будет выброшено исключение
//В прямоугольнике сделать методы вычисления площади и периметра
//Считать равными прямоугольники, если длина одного = длине другого  и ширина одного = ширине другого                                 или длина одного = ширине другого и ширина одного = длине другого
//Покрыть класс прямоугольник тестами
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}