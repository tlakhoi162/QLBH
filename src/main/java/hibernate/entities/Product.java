package hibernate.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@Getter
@Setter
@ToString()

@Entity
@Table(name = "product")
@NoArgsConstructor

public class Product {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductID")
    private int id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CategoryID",nullable = false,foreignKey = @ForeignKey(name = "product_ibfk_1"))
    private Category category;

    @Column(name = "ProductName")
    private String name;

    @Column(name = "Unit")
    private String unit;

    @Column(name = "Amount",nullable=false)
    private int amount;

    @Column(name = "Price")
    private float price;

    @Column(name = "Image")
    private String image;

    @OneToMany(mappedBy = "product",fetch=FetchType.EAGER)
    private Set<OrderDetail> orderDetail;

    @Override
    public String toString() {
        return "Product(id=" + id + ", name=" + name + ", unit=" + unit+" , price="+price+", img="+image+" )";
    }
}
