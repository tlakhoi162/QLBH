package hibernate.entities;

import lombok.*;

import javax.persistence.*;

import java.util.Date;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "`order`")

public class Order {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderID")
    private int id;
    @Column(name = "Total")
    private float totalPrice;
    @Column(name = "Date")
    private Date createdDate;
    @Column(name = "Note")
    private String note;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CustomerID",nullable = false,foreignKey = @ForeignKey(name = "order_ibfk_1"))
    private Customer customer;
    @OneToMany(mappedBy = "order",fetch = FetchType.EAGER)
    private Set<OrderDetail> orderDetail;

    @Override
    public  String toString() {
        return "Order [id=" + id +orderDetail.toString()+ " -- "+customer.toString()+", totalPrice=" + totalPrice+"]";
    }
}
