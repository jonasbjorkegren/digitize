package se.kb.digitize.business.orders.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDateTime;

/**
 * Created by jonbjo on 17-04-28.
 */
@XmlRootElement
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@Table(name = "d_order")
@NamedQuery(name = "all", query = "SELECT o FROM Order o")
public class Order {

    public Order(String description) {
        this.description = description;
    }

    public Order() {};

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;

    private String description;

    @Column(columnDefinition = "DATETIME")
    private LocalDateTime orderDate;

    /*
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }
    */
}

