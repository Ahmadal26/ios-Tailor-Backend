package tailorApp1.tailorApp1.Entity;

import tailorApp1.tailorApp1.util.Roles;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class RoleEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Roles title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Roles getTitle() {
        return title;
    }

    public void setTitle(Roles title) {
        this.title = title;
    }
}