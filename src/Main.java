import java.math.MathContext;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*1.Организовать беспрерывный ввод чисел с клавиатуры, пока пользователь не введёт 0.
        После ввода нуля, показать на экран количество чисел, которые были введены,
        их общую сумму и среднее арифметическое.*/
        System.out.println("Введите число (int). Как только вы введете 0, ввод закончится.");
        int oneNum = 1;
        do {
            oneNum = in.nextInt();
        } while(oneNum != 0 );

        /*2.Написать программу, выводящую факториал числа (произведение чисел от 1 одного до n), заданного с клавиатуры.*/
        System.out.print("Введите число (int), факториал которого Вам нужен: ");
        int twoNum = in.nextInt();
        if (twoNum < 0)
            System.out.println("Факториал определен только для множества целых неотрицательных чисел");
        else if (twoNum == 0)
            System.out.println("Факториал 0 равен 1. Ваше ответ: 1");
        else {
            int twoFak = 1; //Минимальное значение факториала, при twoNum == 0 || twoNum == 1
            for (int i = 1; i < twoNum; i++) {
                twoFak *= (i + 1);
            }
            System.out.println("Факториал " + twoNum + " равен: " + twoFak);
        }

        /*3.Написать программу, которая выводит на экран значение функции y = 5*x2-3*x-10 в диапазоне от -4 до 4,
        с шагом изменения аргумента в 0.5.*/
        for (float i = -4f; i <= 4f; i+=0.5f)
            System.out.print(((10 * i) - (3 * i) - 1) + " ");

        /*4.Вводится действительное х и натуральное n. Вычислить: sin x + sin x в квадрате + ... sin x в степени n.*/
        System.out.print("\nВведите действительное x = "); double fourX = in.nextFloat();
        System.out.print("Введите натуральное n = "); short fourN = in.nextShort();
        fourX *= Math.PI/180; //Переводим градусы в радианы
        double fourResult = 0;
        if (Math.sin(fourX) == 0) //Не вычисляем константный результат
            System.out.println("Результат вычисления: 0");
        else if (Math.sin(fourX) == 1) //Также не вычисляем результат ввода
            System.out.println("Результат вычисления: " + fourN);
        else {
            for (short i = 1; i <= fourN; i++) {
                fourResult += Math.pow(Math.sin(fourX), i);
            }
            System.out.println("Результат вычисления: " + fourResult);
        }

        /*5.Вводится натуральное число. Найти сумму четных цифр, входящих в его состав.*/
        System.out.print("Введите натуральное число: "); short fiveNum = in.nextShort();
        if (fiveNum <= 0)
            System.out.println("Отрицательные числа и ноль не относятся к натуральным");
        else if (fiveNum == 1)
            System.out.println("Сумма четных цифр, входящих в состав вашего: 0");
        else {
            short fiveResult = 0;
            for (short i = 0; i <= fiveNum; i += 2) {
                fiveResult += i;
            }
            System.out.println("Сумма четных цифр, входящих в состав вашего: " + fiveResult);
        }

        /*6.Вывести на экран ряд чисел Фибоначчи, состоящий из n элементов.*/
        System.out.print("Введите кол-во чисел ряда Фибоначчи для вывода: "); short sixN = in.nextShort();
        if (sixN < 0)
            System.out.println("Отрицательное число не может служить кол-вом элементов");
        else if (sixN == 0)
            System.out.println("Ряд, состоящий из нуля элементов пуст");
        else if (sixN == 1)
            System.out.println("Ряд Фибоначчи из 1 элемента: 0");
        else {
            int sixFibPP = 0, sixFibP = 1, sixTemp = 0;//в данном случае 0й и 1й элементы ряда
            System.out.print("Ряд Фибоначчи из " + sixN + " элементов: 0 1 ");
            for (short i = 0; i < sixN; i++) {
                System.out.print((sixFibP + sixFibPP) + " ");
                sixTemp = sixFibP;
                sixFibP += sixFibPP;
                sixFibPP = sixTemp;
            }
            System.out.println("");//просто перенос строки
        }

        /*7.Вывести на экран таблицу умножения в виде таблицы*/
        short sevenN1 = 2, sevenN2 = 2; //Множители, минимальное значение в таблице = 2
        for (short i = 0; i < 18; i++) { //Каждый цикл - новая строка
            if (i < 9) { //1й ряд столбцов
                for (short j = 0; j < 4; j++) { //Вывод в рамках строки
                    if ((sevenN2 < 10) && ((sevenN1 * sevenN2) >= 10)) //все эти условия просто форматирование однозначных и двузначных чисел для выравнивания столбцов
                        System.out.print(sevenN1 + " x " + sevenN2 + " = " + (sevenN1 * sevenN2) + "    ");
                    else if ((sevenN1 * sevenN2) < 10)
                        System.out.print(sevenN1 + " x " + sevenN2 + " =  " + (sevenN1 * sevenN2) + "    ");
                    else
                        System.out.print(sevenN1 + " x " + sevenN2 + "= " + (sevenN1 * sevenN2) + "    ");
                    sevenN1 += 1; //Увеличиваем 1й множитель в рамках строки
                }
                sevenN2 += 1; //Увеличиваем 2й множитель к началу каждой строки
                sevenN1 = 2; //Восстанавливаем значение 2 для 1го множителя к началу каждой строки
                System.out.println(); //Перенос каретки в конце строки
            } else { //2й ряд столбцов
                if (sevenN2 == 11) { //тут 2й множитель впервые становится >10, рисуем пустую линию для разделения рядов и восстанавливаем значение 2го множителя. Сюда попадаем единожды.
                    System.out.println();
                    sevenN2 = 2;

                }
                sevenN1 = 6; //Восстанавливаем значение 6 для 1го множителя к началу каждой строки
                for (short j = 0; j < 4; j++) { //Вывод в рамках строки
                    if (sevenN2 < 10) //все эти условия просто форматирование однозначных и двузначных чисел для выравнивания столбцов
                        System.out.print(sevenN1 + " x " + sevenN2 + " = " + (sevenN1 * sevenN2) + "    ");
                    else
                        System.out.print(sevenN1 + " x " + sevenN2 + "= " + (sevenN1 * sevenN2) + "    ");
                    sevenN1 += 1; //Увеличиваем 1й множитель в рамках строки
                }
                sevenN2 += 1; //Увеличиваем 2й множитель к началу каждой строки
                System.out.println(); //Перенос каретки в конце строки
            }
        }

        /*8.Бизнесмен взял ссуду М тысяч рублей в банке под 20% годовых.
        Через сколько лет его долг превысит S тысяч рублей, если за это время он не будет отдавать долг.*/
        System.out.print("Сумма ссуды бизнесмена (int): "); int eightSumm = in.nextInt();
        System.out.print("Сумма долга (int), которую нужно превысить: "); int eightFinalDuty = in.nextInt();
        if (eightFinalDuty < eightSumm)
            System.out.print("Долг не может быть меньше займа");
        else {
            short eightYears = 0; //Счетчик лет
            float eightCurrDuty = eightSumm; //Изначальный долг равен займу
            do {
                eightCurrDuty += (eightSumm * 0.2f);
                eightYears++;
                //На деле это работает так, % берется от изначальной суммы и не меняется, если нужно было брать каждый год % от полной суммы долга, просто меняем формулу на
                //eightSumm *= 1.2f и избавляемся от доп переменной
            } while (eightCurrDuty < eightFinalDuty);
            System.out.println("Долг бизнесмена превысит порог через " + eightYears + " год(а)/лет");
        }

        /*9.Найти сумму n-го количества элементов ряда 1, -0.5, 0.25, -0.125, …*/
        System.out.print("Введите кол-во элементов ряда (short): "); short nineCount = in.nextShort();
        if (nineCount <= 0)
            System.out.println("Ряд из нулевого или отрицательного кол-ва элементов не имеет смысла");
        else {
            float nineSumm = 1; //Минимальный элемент
            float nineFinalSumm = 0; //Сумма
            for (int i = 0; i < nineCount; i++) {
                nineFinalSumm += nineSumm;
                nineSumm = nineSumm * -0.5f;
            }
            System.out.println("Сумма всех чисел ряда равна " + nineFinalSumm);
        }

        /*10.Напечатать все четырехзначные числа, в десятичной записи которых нет двух одинаковых цифр.*/
        int tenServCounter = 0; //Служебный счетчик для переноса каретки
        int tenCounter = 0; //Счетчик для подсчета чисел, удовлетворяющих условию
        for (int i = 1023; i <= 9876; i++) { //у чисел меньше 1023 и больше 9876 по любому есть повторы
            MathContext thousends = new MathContext(i/1000);
            MathContext houndrets = new MathContext((i/100)%10);
            MathContext dozens = new MathContext((i/10)%10);
            MathContext units = new MathContext(i%10);

            if (thousends.equals(houndrets)) System.out.print(i + " ");
//            int thousends = i/1000;
//            int houndrets = (i/100)%10;
//            int dozens = (i/10)%10;
//            int units = i%10;
            if ((thousends != houndrets) && (thousends != dozens) && (thousends != units)
                && (houndrets != dozens) && (houndrets != units)
                && (dozens != units)) {
                System.out.print(i + " ");
                tenCounter++;
                tenServCounter++;
                if (tenServCounter == 40) {
                    System.out.println();
                    tenServCounter = 0;
                }
            }
        }
        System.out.println("\nВсего таких чисел " + tenCounter);

        /*1*)Вывести (Естественно не просто забить в консольный вывод):
        ^^^^^^^^^^^^^^^^^^^^^^^^^^^
        |  А а  ||  К к  ||  Х х  |
        ^^^^^^^^^^^^^^^^^^^^^^^^^^^
        |  Б б  ||  Л л  ||  Ц ц  |
        ^^^^^^^^^^^^^^^^^^^^^^^^^^^
        |  В в  ||  М м  ||  Ч ч  |
        ^^^^^^^^^^^^^^^^^^^^^^^^^^^
        |  Г г  ||  Н н  ||  Ш ш  |
        ^^^^^^^^^^^^^^^^^^^^^^^^^^^
        |  Д д  ||  О о  ||  Щ щ  |
        ^^^^^^^^^^^^^^^^^^^^^^^^^^^
        |  Е е  ||  П п  ||  Ъ ъ  |
        ^^^^^^^^^^^^^^^^^^^^^^^^^^^
        |  Ё ё  ||  Р р  ||  Ы ы  |
        ^^^^^^^^^^^^^^^^^^^^^^^^^^^
        |  Ж ж  ||  С с  ||  Ь ь  |
        ^^^^^^^^^^^^^^^^^^^^^^^^^^^
        |  З з  ||  Т т  ||  Э э  |
        ^^^^^^^^^^^^^^^^^^^^^^^^^^^
        |  И и  ||  У у  ||  Ю ю  |
        ^^^^^^^^^^^^^^^^^^^^^^^^^^^
        |  Й й  ||  Ф ф  ||  Я я  |
        ^^^^^^^^^^^^^^^^^^^^^^^^^^^*/
        int elevenStringChar = 1040; //Положение каретки в строке. 1040 - Номер кириллической заглавной А
        int elevenColumnChar = 1040; //Положение каретки в столбце
        System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        for (short i = 0; i < 11; i++){
            for (short j = 0; j < 3; j++){
                if (j == 0) //Перенос каретки на новую строку, выставляем начальный символ
                    elevenStringChar = elevenColumnChar;
                if ((i == 6) && (j == 0))
                    System.out.print("|  " + (char) 1025 + " " + (char) 1105 + "  |"); //Отрисовка Ё
                else
                    System.out.print("|  " + (char) elevenStringChar + " " + (char) (elevenStringChar + 32) + "  |"); //Отрисовка всего, что не Ё
                if (i < 7) { // пока не дошли до Ё
                    if (j == 1) elevenStringChar += 1; //сдвиг между 1 и 2 столбцами в строке - 10, а между 2 и 3 - 11
                    elevenStringChar += 10;
                } //после Ё всегда сдвиг - 11
                else elevenStringChar += 11;
            }
            System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            if (i != 6) elevenColumnChar += 1;
        }
        System.out.println();

        /*2*) Валентина прогуляла лекцию по математике.
        Преподаватель решил подшутить над нерадивой студенткой и
        попросил ее на практическом занятии перечислить все положительные делители некоторых целых чисел.
        Для несложных примеров студентка быстро нашла решения (для числа 6 это: 1, 2, 3, 6; а для числа 16 это: 1, 2, 4, 8, 16), но этим все не закончилось.
        На домашнее задание ей дали варианты посложнее: 23436, 190187200, 380457890232.
        Решить такое вручную, как вы понимаете, практически нереально.
        Вот Валентина и обратилась к вам за помощью.*/

        //Боюсь представить, насколько это трудно читать.
        System.out.print("Введите натуральное число, которое будем разбивать на целочисленные положительные делители: "); int twelveNum = in.nextInt();
        int twelveIter = 1;
        int twelveTemp = 1;

        System.out.print(twelveNum + " 1 ");

        if (twelveNum % 10 == 0) { //Вывод частного 10
            if ((twelveNum / (twelveNum / 10)) != (twelveNum / 10))
                System.out.print(twelveNum / (twelveNum / 10) + " " + (twelveNum / 10) + " ");
            else
                System.out.print((twelveNum / 10) + " ");
        }
        while ((twelveNum % (twelveIter * 2)) == 0) { //Выводим все четные делители и их частное
            twelveIter *= 2;
            if ((twelveNum / twelveIter) != twelveIter) {
                System.out.print(twelveNum / twelveIter + " " + twelveIter + " ");
                if ((twelveNum / twelveIter) % 10 == 0)
                    System.out.print(twelveNum / ((twelveNum / twelveIter) / 10) + " " + ((twelveNum / twelveIter) / 10) + " ");
            }
            else
                System.out.print(twelveIter + " ");
        }

        //Обработка 3
        while ((twelveNum % (twelveTemp * 3)) == 0) { //Выводим все делители числа 3, как простого числа и его частное
            twelveTemp *= 3;
            if ((twelveTemp != twelveNum) && (twelveTemp != 1)) //Убираем повторы
                if (twelveTemp != (twelveNum /twelveTemp )) {  //Убираем повторы вроде 49 7 7 1
                    System.out.print(twelveNum / twelveTemp + " " + twelveTemp + " ");
                    if ((twelveNum / twelveTemp) % 2 == 0)
                        System.out.print(twelveNum / ((twelveNum / twelveTemp) / 2) + " " + ((twelveNum / twelveTemp) / 2) + " ");
                    if ((twelveNum / twelveTemp) % 10 == 0)
                        System.out.print(twelveNum / ((twelveNum / twelveTemp) / 10) + " " + ((twelveNum / twelveTemp) / 10) + " ");
                } else {
                    System.out.print(twelveTemp + " ");
                }
        }

        //Обработка простых чисел, кроме 3, цикл гоняем до половины основного числа, далее избыточно
        for (int i = 0; i <= (twelveNum/2); i++) { //Получаем в цикле простые числа, кроме 3, ее придется обрабатывать отдельно
            int twelveTemp1 = (6 * i) + 1; //Записываю числа в переменные, дабы дальше исключить излишние расчеты в условиях
            int twelveTemp2 = (6 * i) + 5;
            if ((twelveNum % twelveTemp1 == 0) || (twelveNum % twelveTemp2 == 0) && //Если оба числа являются делителями исходного
                ((twelveTemp1 % 5 != 0) //И 1е не кратно 5 (не может быть = 5)
                        && ((twelveTemp1 % 7 != 0) || (twelveTemp1 == 7)) //И 1е не кратно 7 или не равно 7
                        && ((twelveTemp2 % 5 != 0) || (twelveTemp2 == 5)) //И 2е не кратно 5 или не равно 5
                        && (twelveTemp2 % 7 != 0) //И 2е не кратно 7 (не может быть = 7)
                )) {
                if ((twelveNum % twelveTemp1 != 0) || (twelveTemp1 == 1)) //Выясняем которое и записываем в переменную twelveTemp1, 1 всегда перезаписываем
                    twelveTemp1 = twelveTemp2;
                if (((twelveNum / twelveTemp1) % 2 != 0) || ((twelveNum / twelveTemp1) > (twelveNum / 2))) //Исключаем четные частные, убираем дубликаты из прогона по четным числам
                    if (twelveNum / twelveTemp1 % 3 != 0) //Исключаем дубликат деления на 3
                        if (twelveTemp1 != twelveNum) //Убираем повторы вида 13 1 1 13
                            if ((twelveTemp1 != (twelveNum/((6 * (i + 1)) + 1))) && (twelveTemp1 != (twelveNum/((6 * (i + 1)) + 5))))  //Убираем повторы, в которых делитель и частное - простые числа, например 11 13 13 11
                                if ((twelveNum / twelveTemp1) == twelveTemp1)
                                    System.out.print(twelveTemp1 + " ");
                                else
                                    System.out.print((twelveNum / twelveTemp1) + " " + twelveTemp1 + " ");
            }
        }
        System.out.println();
    }
}