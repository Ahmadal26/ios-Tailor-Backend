package tailorApp1.tailorApp1.Entity;

import javax.persistence.*;

//package tailorApp1.tailorApp1.Entity;
//
//import javax.persistence.*;
//
@Entity
@Table(name = "clothingtype_entity")
public class ClothingTypeEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clothingTypeid;

    public String getDshdasha() {
        return dshdasha;
    }

    public void setDshdasha(String dshdasha) {
        this.dshdasha = dshdasha;
    }

    public String getDress() {
        return dress;
    }

    public void setDress(String dress) {
        this.dress = dress;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public String getPants() {
        return pants;
    }

    public void setPants(String pants) {
        this.pants = pants;
    }

    @Column(name = "dshdasha", nullable = false)
    private String dshdasha;
    @Column(name = "dress", nullable = false)
    private String dress;
    @Column(name = "top", nullable = false)
    private String top;
    @Column(name = "pants", nullable = false)
    private String pants;


}
