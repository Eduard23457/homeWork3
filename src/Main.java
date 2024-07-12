import com.sun.source.doctree.SystemPropertyTree;

import javax.annotation.processing.SupportedSourceVersion;

public class Main {
    public static void main(String[] args) {

        //Задача 1
        int a = 35000;
        System.out.println(a);

        byte b = 5;
        System.out.println(b);

        short c = 30000;
        System.out.println(c);

        long d = 1000000000;
        System.out.println(d);

        float g =(float) 10.5555555f;
        System.out.println(g);

        double h = 3.3555555555555555;
        System.out.println(h);

        //Задача 2
        float n =(float) 3.75f;
        System.out.println(n);

        long q = 987678965549L;

        float m =(float) 2.786;
        System.out.println(m);

        short r = 569;
        System.out.println(r);

        short t = - 159;
        System.out.println(t);

        short y = 27897;
        System.out.println(y);

        byte u = 67;
        System.out.println(u);

        //Задача 3
        byte p = 23;
        byte o = 27;
        byte i = 30;
        short j = 480;

        int k = p + o + i;
        System.out.println(k);

        int childrens = j / k ;
        System.out.println("На каждого ученика расчитано "  + childrens + " листов ,бумаги");

        //Задача 4

        int botlTwoMinutes = 16;
        int timeTwo = 2;
        int workOne = botlTwoMinutes / timeTwo;
        System.out.println("Бутылок производится " + workOne + " штук за 1 минуту");

        int botlTwentyMinutes = 20;
        int timeTwenty = botlTwentyMinutes * botlTwoMinutes;
        System.out.println("Столько производится " + timeTwenty + " штук за 20 минут");

        int botl = timeTwenty * 3;
        System.out.println("Производится " + botl + " бутылок за 1 час");
        int botlDay = timeTwenty * 24;
        System.out.println("Производится "+ botlDay + " штук за день");

        int botlThree = botlDay * 3;
        System.out.println("Производится " + botlThree + " штук за 3 дня");

        int botlMonth = botlThree * 10;
        System.out.println("Производится " + botlMonth + " штук за месяц");

        //Задача  5
        int X = 120;
        byte C = 2;
        short V = 4;
        int B = C + V;
        System.out.println("Требуется " + B + " банок краски на 1 класс");

        int N = X / B;
        System.out.println("Узнали, что " + N + " классов в школе");
        int M = N * V;
        System.out.println(M + " штук коричневой краски");
        int J = X - M;
        System.out.println("В школе, где " + N + " классов, нужно " + J + " банок белой краски и " + M + " банок коричневой краски");

        //Задача 6
        byte bananas = 5;
        short percent = 80;
        int all = bananas * percent;
        System.out.println("Сумма " + all + " граммов бананов");
        short A = 210;
        System.out.println(A + " грамов, это вес молока");
        byte D = 2;
        Short F = 100;
        int G = D * F;
        System.out.println(G + " грамов вес мороженного");
        byte  egg = 4;
        short eg = 70;
        int it = egg * eg;
        System.out.println(it + " грамов вес яиц");
        int amount = all + A + G + it;
        System.out.println(amount + " это количество в граммах спортзавтрака");
        float kg = amount / 1000;
        System.out.println(kg + " это количество в килограммах спортзавтрака");

        //Задача 7
        short weightA = 250;
        byte weightB = 7;
        int weight = weightB * 1000;
        System.out.println(weight + " грамов, перевел килограммы в граммы");
        int weightD = weight / weightA;
        System.out.println( "Уйдет на похудение " + weightD + " дней, при сбросе веса 250 грамм каждый день");

        short weightI = 500;
        int weightF = weight / weightI;
        System.out.println("Уйдет на похудение " + weightF + " дней при сбросе веса 500 грамм каждый день");

        //Задача 8
        int salaryA = 67760;
        int salaryB = 83690;
        int salaryC = 76230;

        int salaryAA = salaryA * 10 / 100;
        System.out.println(salaryAA);
        int salaryAAA = salaryAA + salaryA;
        System.out.println("Зарплата Саши после повышения ЗП равняется " + salaryAAA + " рублей");
        int salaryAAAA = salaryA * 12;
        System.out.println("Годовой доход саши до повышения ЗП на 10% " + salaryAAAA + " рублей");
        int salaryAAAAA = salaryAAA * 12;
        System.out.println("Годовой доход Саши после повышения ЗП на 10% " + salaryAAAAA + " рублей");

        int salaryBB = salaryB * 10 / 100;
        System.out.println(salaryBB);
        int salaryBBB = salaryB + salaryBB;
        System.out.println("Зарплата Дениса после повышения зп на 10% " + salaryBBB + " рублей");
        int salaryBBBB = salaryB * 12;
        System.out.println("Годовой доход Дениса до повышения ЗП на 10% " + salaryBBBB + " рублей");
        int salaryBBBBB = salaryBBB * 12;
        System.out.println("Годовой доход Дениса после повышения ЗП " + salaryBBBBB + " рублей ");

        int salaryCC = salaryC *10 / 100;
        System.out.println(salaryCC);
        int salaryCCC = salaryC + salaryCC;
        System.out.println("Зарплата Кристины после повышения ЗП на 10% " + salaryCCC + " рублей");
        int salaryCCCC = salaryC * 12;
        System.out.println("Годовой доход Кристины до повышения ЗП на 10% " + salaryCCCC + " рублей ");
        int salaryCCCCC = salaryCCC * 12;
        System.out.println("Годовой доход Кристины после повышения ЗП на 10% " + salaryCCCCC + " рублей");









    }
}