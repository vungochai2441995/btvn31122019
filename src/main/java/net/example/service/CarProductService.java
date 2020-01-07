package net.example.service;

import net.example.dao.CarDao;
import net.example.dao.ShowroomDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarProductService implements ICarProductService {
    @Autowired
    ShowroomDAO showroomDAO;

    @Override
    public List<String> searchLocation() {
        return null;
//        return showroomDAO.searchAllLocation();
    }
}
