package app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "settle")
public class Settle {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String settleName;
    private int settleDate;
}
