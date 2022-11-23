package hibernate.entities;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "receiptdetail")

public class ReceiptDetail {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ReceiptDetailID")
    private int id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ReceiptID",nullable = false,foreignKey = @ForeignKey(name = "receiptdetail_ibfk_1"))
    private Receipt receipt;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ProductID",nullable = false,foreignKey = @ForeignKey(name = "product_ibfk_2"))
    private Product product;

    @Column(name = "Quantity")
    private int quantity;
    @Column(name = "Price")
    private  float price;

    @Override
    public String toString() {
        return "ReceiptDetail(id=" + id + " -- " +product.toString() +" -- " +" Quantity=" + quantity + ", price "+price+ ")";
    }
}
