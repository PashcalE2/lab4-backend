package main.lab4.services;

import main.lab4.data.AreaPoint;
import main.lab4.repositories.AreaPointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.Collection;

@Service
@ApplicationScope
public class AreaPointRepositoryService {
    private final AreaPointRepository areaPointRepository;

    @Autowired
    public AreaPointRepositoryService(AreaPointRepository areaPointRepository) {
        this.areaPointRepository = areaPointRepository;
    }

    public Collection<AreaPoint> getAreaPointsByUserLogin(String login) {
        return areaPointRepository.getAreaPointsByUserLogin(login);
    }

    public AreaPoint save(AreaPoint point) {
        return areaPointRepository.save(point);
    }

    public void removeAreaPointsByUserLogin(String login) {
        areaPointRepository.removeAreaPointsByUserLogin(login);
    }
}
