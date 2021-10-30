package SpringDemo1.service;

import SpringDemo1.dao.UserDao;
import SpringDemo1.dao.UserDaoImpl;

import javax.jws.soap.SOAPBinding;

public class UserService {

    private UserDao dao;

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    public void add(){
        System.out.println("Service add!");
        dao.update();
    }
}
