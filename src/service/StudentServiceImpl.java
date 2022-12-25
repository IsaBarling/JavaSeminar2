package service;

import data.User;
import util.ReaderFromTxt;
import util.WriterToTxt;

public abstract class StudentServiceImpl implements DataService {

    @Override
    public void write(User user) {
        WriterToTxt.writes(user);
    }

    @Override
    public User read(User user) {
       return ReaderFromTxt.reads(user);

    }
}
