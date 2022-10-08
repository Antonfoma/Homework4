public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//      Задание 1

        int ageUser = 10;
        if ( ageUser >= 18 ) {
            System.out.println(" Поздравляем пользователя с совершенолетием. ");
        } else {
            System.out.println( " Возраст совершеннолетия ещё не наступил, и нужно немного подождать.");
        }
//     Задание  2

        int ageKid = ;
        if ( ageKid >= 7 ) {
            System.out.println   (" Ребенок ходит в школу");
        } else {
            System.out.println   (" Ребенок  не ходит в школу");
        }
        int ageMen = 16;
        if ( ageMen >= 18 ){
            System.out.println   (" Человек уже закончил школу и может отправляться в университет");
        } else
        {System.out.println   (" Человек еще не закончил школу и не может отправляться в университет");
        }
        int ageWoman = 20;
        if ( ageWoman >= 24 ) {
            System.out.println   (" Человек окончил университет и ему пора искать первую работу");}
        else {
            System.out.println   (" Человек  еще не окончил университет и ему не может  работь");
        }

 //      Задание 3
        int capacity = 102;
        int seatsCount = 60;
        int otherCount = capacity - seatsCount;

        int seatsUsed = 60;
        int otherUsed = 42;
        if ( seatsUsed < seatsCount ){
            System.out.println   (" Есть еще " + (seatsCount - seatsUsed )+ " сидячих мест ");}
        else {
            System.out.println( " Сидячих мест нет! ");
        }
        if (otherUsed < otherCount ){
            System.out.println   (" Есть еще " + (otherCount - otherUsed) + " стоячих мест ");
        }
         else {
            System.out.println( " Стоячих мест нет! ");}
        int man = 19;
        if ( man >= 18 && man < 21) {
            System.out.println   (" Ты достаточно взрослый водить автомобиль, но не достаточно взрослый чтобы пить алкоголь ");
        }
        if ( man < 7 || man >18 ){
            System.out.println   ("Я думаю ты не ходишь в школу ");
        }

 //      Задание 4
        int age = 9;
        if ( age >2 && age <6 ){
            System.out.println   (" Если возраст человека " + age +   " то ему нужно ходить в детский сад ");
        }
        else if ( age  >6 && age <= 18 ){
            System.out.println   (" Если возраст человека " + age + " то ему нужно ходить в школу ");}
         else if ( age  >18 && age <= 24 ){
            System.out.println   (" Если возраст человека " + age + " то ему нужно ходить в университет ");
        }
         else if ( age  > 24 ){
            System.out.println   (" Если возраст человека " + age + " то ему нужно ходить на работу ");
        }
  //      Задание 5
        int boy = 10;
        if ( boy < 5 ){
            System.out.println ( " Ребенок не может кататься на аттракционе" ); }
         else if ( boy < 14 ) {
            System.out.println   (" Ребенок  может кататься , но в сопровождении взрослого.");
        }
        else if ( boy >= 14 ) {
            System.out.println   (" Ребенок  может кататься без сопровождении взрослого.");
        }
 //   Задание 6
        int one = 10;
        int two = - 2;
        int three = 50;
        if ( one > two ) {
            if (one >= three) {
                System.out.println(" Максимальное число - " + one);
            } else {
                System.out.println(" Максимальное число - " + three);
            }
        }  else if  (two > one ) {
            if (two >= three) {
                System.out.println(" Максимальное число - " + two);
            } else {
                System.out.println(" Максимальное число - " + three);
            }
        } else {
            if ( one > three){
                System.out.println(" Максимальное число - " + one);
            } else if (three > one ) {
                System.out.println(" Максимальное число - " + three);
            } else {
                System.out.println(" Все 3 числа равны " );
            }

        }

    }
}