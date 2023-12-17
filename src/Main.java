public class Main {
    public static void main(String[] args) {
        //Задача.1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
//Задача.2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
//Задача.3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
//Задача.4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
//Задача.5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
//Задача.6 ... Задача.7
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var sum = boxer1 + boxer2;
        System.out.println(sum);
        var diff = boxer2 % boxer1;
        System.out.println(diff);
        var diff2 = boxer2 - boxer1;
        System.out.println(diff2);
//Задача.8
        var totalTime = 640.0;
        var workingDay = 8.0;
        var numberOfWorkers = totalTime / workingDay;
        System.out.println(numberOfWorkers);
        var workingDay2 = totalTime / ( numberOfWorkers + 94 );
        System.out.println(workingDay2);
    }
}