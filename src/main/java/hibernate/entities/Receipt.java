package hibernate.entities;

import lombok.*;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "receipt")

public class Receipt {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ReceiptID")
    private int id;
    @Column(name = "Date")
    private Date createdDate;
    @Column(name = "Price")
    private int price;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PublisherID",nullable = false,foreignKey = @ForeignKey(name = "receipt_ibfk_1"))
    private Publisher publisher;
    @OneToMany(mappedBy = "receipt",fetch = FetchType.EAGER)
    private Set<ReceiptDetail> receiptDetail;

    @Override
    public  String toString() {
        return "Receipt [id=" + id +receiptDetail.toString()+ " -- "+publisher.toString()+", date=" + createdDate+", totalPrice=" + price+"]";
    }
}
