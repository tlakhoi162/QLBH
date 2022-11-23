package hibernate.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@RequiredArgsConstructor

@AllArgsConstructor
@Entity
@Table(name = "customers")

public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CustomerID")
	private int id;
	@Column(name = "Fullname")
	private String fullname;
	@Column(name = "Gender")
	private String gender;
	@Column(name = "Address")
	private String address;
	@Column(name = "City")
	private String city;
	@Column(name = "TotalSpending")
	private int totalSpending;

	@OneToMany(mappedBy = "customer",fetch=FetchType.EAGER)
	    private Set<Order> order;

	@Override public String toString() {
	    return "Customer( id="+id+" fullname= "+fullname+" gender= "+gender+" address= "+address+" totalSpending = "+totalSpending+")";
	}

}
