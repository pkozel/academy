package theory.lecture_5.polimorphism;

import theory.lecture_5.interfaces_and_abstract.Runnable;
import theory.lecture_5.interfaces_and_abstract.ToyotaCamry;

public class Main {
    public static void main(String[] args) {

        // мы в переменную типа А кладем ссылку на объект класса В. Мы можем так сделать, потому что В extends A
        // все переменные и методы (кроме приватных - их другие классы не видят, и static - они находятся в классе, а не в объектах) переопределены.
        //это возможно за счет позднего связывания в java, какие методы будут у A object решается во время работы приложения.

        A object = new B();

        // это пример полиморфизма, метод getB() переопределен в классе-потомке.
        System.out.println(object.getVariable());
        System.out.println(object.getStaticVar());

        // статические методы относятся к классу и не переопределяются!
        // В примере выводится в консоль переменная предка, т.к. у нас A object переменная, берется метод этого класса.Т.е. для статических методов\переменных не действует полиморфизм

        ToyotaCamry camry = new ToyotaCamry();
        Runnable camry1 = new ToyotaCamry();

    }

    public void print(Runnable abc) {
        System.out.println(abc);
    }
}
