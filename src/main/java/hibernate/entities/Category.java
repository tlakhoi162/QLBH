package hibernate.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString()
@Entity
@Table(name = "`category`")

public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CategoryID")
	private int id;
	@Column(name = "Name")
	private String name;
	@Column(name = "Description")
	private String desc;
	
	@OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
	@ToString.Exclude
	private Set<Product> product;
	
	@Override
	public String toString() {
		return "Category( id="+id+" name= "+name+" description = "+desc+")";
	}
}
