package ua.edu.ucu.apps.flowerstore.flowers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface FlowerRepository extends JpaRepository<Flower, Integer> {

    
}
