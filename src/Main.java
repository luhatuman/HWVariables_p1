public class Main {
    public static void main(String[] args) {
    //Task 1
        System.out.println("Исходные значения");
        float dog = 8f; // мняем тип на float
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog + "\n" + "cat = " + cat + "\n" + "paper = " + paper);
            //Task 2
        System.out.println();
        System.out.println("Увеличиваем все значения на 4");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog + "\n" + cat + "\n" + paper);
            //Task 3
        System.out.println();
        System.out.println("Уменьшаем dog на 3.5, cat на 1.6, paper на 7639");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog + "\n" + cat + "\n" + paper);
        // Task 4
        System.out.println();
        System.out.println("(friend +2) / 7");
            var friend = 19;
        System.out.println(friend);
            friend += 2;
        System.out.println(friend);
            friend /=7;
        System.out.println(friend);
        // Task 5
        System.out.println();
        System.out.println("frog * 10 / 3.5 + 4");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        // Task 6
        System.out.println();
        System.out.println("Бокс");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var totalWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общий вес двух боксеров " + totalWeight);

        var differenceWeight = boxer2Weight - boxer1Weight;
        System.out.println("Разница в весе боксеров " + differenceWeight);
        // Task 7
        System.out.println();
        System.out.println("Разница в весе боксеров");
        var differenceWeight1 = boxer2Weight - boxer1Weight;
        System.out.println("Метод вычитания " + differenceWeight1);
        var differenceWeight2 = boxer2Weight % boxer1Weight;
        System.out.println("Метод остатка от деления " + differenceWeight2);
    }
}