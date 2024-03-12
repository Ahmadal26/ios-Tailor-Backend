package tailorApp1.tailorApp1.Entity;




import javax.persistence.*;

@Entity
@Table(name = "tailor_entity")
public class TailorEntity {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tailorId;

    @Column(name = "tailorName", nullable = false)
    private String tailorName;
    @Column(name = "consultation", nullable = false)
    private String consultation;
    @Column(name = "location", nullable = false)
    private String location;
    @Column(name = "image", nullable = false)
    private String image;
    @Column(name = "gender", nullable = false)
    private String gender;
    @Column(name = "number",nullable = false)
    private String number;
    @Column(name = "aboutUs",nullable = false)
    private String aboutUs;
   @Column(name = "durationTime",nullable = false)
    private String durationTime;

    @ManyToOne
    @JoinColumn(name = "clothingTypeid")
    private ClothingTypeEntity clothingTypeEntity;

    @OneToOne(cascade = CascadeType.ALL)
    private UserEntity userEntity;


    public Long getTailorId() {
        return tailorId;
    }

    public void setTailorId(Long tailorId) {
        this.tailorId = tailorId;
    }

    public String getTailorName() {
        return tailorName;
    }

    public void setTailorName(String tailorName) {
        this.tailorName = tailorName;
    }

    public String getConsultation() {
        return consultation;
    }

    public void setConsultation(String consultation) {
        this.consultation = consultation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAboutUs() {
        return aboutUs;
    }

    public void setAboutUs(String aboutUs) {
        this.aboutUs = aboutUs;
    }

    public String getDurationTime() {
        return durationTime;
    }

    public void setDurationTime(String durationTime) {
        this.durationTime = durationTime;
    }




    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }
}