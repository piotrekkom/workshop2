package pl.coderslab.entity;

public class MainDao {

    public static void main(String[] args) {
        UserDao userDao = new UserDao();

/////////////  CREATE NEW USER
//        User newUser = new User();
//        newUser.setUsername("Jerzy Brzęczek");
//        newUser.setEmail("wuja@laczynaspilka.pl");
//        newUser.setPassword("wujagol");
//        userDao.create(newUser);

/////////////  DELETE USER
//        userDao.delete(4);

/////////////  READ USER INFO
//        System.out.println(userDao.read(7));

/////////////  UPDATE
//        User userToUpdate = userDao.read(5);
//        userToUpdate.setUsername("Józek");
//        userToUpdate.setEmail("email@buziaczek.com");
//        userToUpdate.setPassword("trzasło");
//        userDao.update(userToUpdate);

///////////////  FIND ALL
//        User[] all = userDao.findAll();
//        for (User u : all) {
//            System.out.println(u);
//        }

    }
}
