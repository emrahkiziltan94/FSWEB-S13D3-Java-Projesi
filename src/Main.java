public class Main {
    public static void main(String[] args) {

       /* Person person1 = new Person("emrah", "kızıltan", 30);
        Person person2 = new Person("dummy", "test", 83);
        System.out.println(person1.getFirstName());
        System.out.println(person2.getFirstName());
        System.out.println(person2.getSalary());
        Person person3 = new Person("ali", "veli", 24, 27000, false, new String[]{"piano", "chess"});
        System.out.println(Arrays.toString(person3.getHobbies()));
        System.out.println(person3.getFirstName());*/

        Wall wall = new Wall(13.2, 22.2);
        System.out.println(wall.getWidth());
        System.out.println(wall.getHeight());
        System.out.println("area = " + wall.getArea());
        System.out.println(wall.getHeight());
        System.out.println(wall.getArea());
    }
}