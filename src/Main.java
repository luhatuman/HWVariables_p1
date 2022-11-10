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
    }
}