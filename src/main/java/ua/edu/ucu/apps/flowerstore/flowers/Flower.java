package ua.edu.ucu.apps.flowerstore.flowers;


import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@AllArgsConstructor  @Getter
@Entity
@Table
@NoArgsConstructor
public class Flower {
    @Id
    private int id;
    private double sepalLength;
    private double price;
    private FlowerColor color;
}


