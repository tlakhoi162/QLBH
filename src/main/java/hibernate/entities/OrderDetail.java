package hibernate.entities;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "`orderdetail`")

public class OrderDetail {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OrderDetailID")
    private int id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "OrderID",nullable = false,foreignKey = @ForeignKey(name = "orderdetail_ibfk_1"))
    private Order order;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ProductID",nullable = false,foreignKey = @ForeignKey(name = "product_ibfk_2"))
    private Product product;

    @Column(name = "Quantity")
    private int quantity;
    @Column(name = "Price")
    private  float price;

    @Override
    public String toString() {
        return "OrderDetail(id=" + id + " -- "+product.toString() +" -- " +" Quantity=" + quantity + ", price "+price+ ")";
    }

}
