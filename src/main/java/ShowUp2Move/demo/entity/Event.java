package ShowUp2Move.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.security.Timestamp;
import java.time.LocalDateTime;

@Entity
@Data
public class Event {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    private String location;
    private LocalDateTime dateTime;
    private String sport;
    private String description;
    private int price;
    private int members;

}
