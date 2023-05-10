import java.util.Collections;
import java.util.List;

public class MainApp {


    public static void main(String[] args) {

        Personal personal = new Personal();
        personal.addUser(new User("Ivan", "Petrov", 33))
                .addUser(new User("Semyon", "Sverdlov", 35))
                .addUser(new User("Anna", "Samoilova", 27))
                .addUser(new User("Olga", "Antonova", 44))
                .addUser(new User("Olga", "Antonova", 20))
                .addUser(new User("Anton", "Antonov", 49));


        Personal personal2 = new Personal();  
        personal2.addUser(new User("Vasilyi", "Tsvetkov", 23))
                 .addUser(new User("Andrey", "Tulpanov", 55));

        User user = new User("Lena", "Noskova", 22);
        user.setSubordinate(personal);

        personal2.addUser(user);

        User boss = new User("Boss", "Big ", 67);
        boss.setSubordinate(personal2);

        Company company = new Company(boss);
        for(User subordinates: company) {
            System.out.println(subordinates);
        }

        //for (User user: personal){
        //    System.out.println(user);
        //}

        //for (int i = 0; i < personal.users.size(); i++)
        //System.out.println(personal.users.get(i));

        // List<User> users = personal.toList();

        // System.out.println("____________");
        // Collections.sort(users);
        // System.out.println("____________");
        // System.out.println(users);


    }
}