package app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String taskName;

    @ManyToOne(optional = false)
    @JoinColumn(name = "value_way_id", referencedColumnName = "id")
    private ValueWay valueWayId;

    private Long showCount;
    private Long clickCount;
    private Long unitPrice;
    private boolean isPublic;
    private String seller;

    @ManyToOne(optional = false)
    @JoinColumn(name = "settle_id", referencedColumnName = "id")
    private Settle settle;

    @ManyToOne(optional = false)
    @JoinColumn(name = "creater", referencedColumnName = "username")
    private User creater;

    private String desc;

    public void setId(Long id) {this.id = id;}
    public Long getId() {return id;}
}
