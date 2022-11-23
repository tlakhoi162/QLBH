package hibernate.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString()
@Entity
@Table(name = "publishers")

public class Publisher {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PublisherID")
    private int id;

    @Column(name = "PublisherName")
    private String name;
    
    @Column(name = "Address")
    private String address;
    
    @Column(name = "PhoneNumber")
    private String phoneNumber;
    
    @Override
    public String toString() {
        return "Publisher(id=" + id + ", name=" + name + ", address=" + address+" , phone="+phoneNumber+")";
    }
}
