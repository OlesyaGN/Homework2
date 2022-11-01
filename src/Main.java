public class Main {
    public static void main(String[] args) {
     //
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxerFirstWeight = 78.2;

        var boxerSecondWeignt = 82.7;

        var totalBoxerWeight = boxerFirstWeight + boxerSecondWeignt;
        System.out.printf("Общий вес боксеров " + totalBoxerWeight + " кг!");


        var differenceWeight= boxerSecondWeignt - boxerFirstWeight;
        System.out.printf("Разница между весами бойцов " + differenceWeight + " кг!");

        var overload = boxerSecondWeignt % boxerFirstWeight;
        System.out.printf("Разница состовляет " + overload + " кг!");

        var sharedHours = 640;

        var hoursOne = 8;


        var quantityPeople = sharedHours  /  hoursOne;
        System.out.printf("Всего работников в компании " + quantityPeople + " человек. ");

        var newQuantity = quantityPeople + 94;
        var newSharedHours = newQuantity * hoursOne;
        System.out.printf("Если в компании работает " + newQuantity + " человек " + " ,то всего "
                + newSharedHours + " часов работы может быть поделено между сотрудниками");




    }
}