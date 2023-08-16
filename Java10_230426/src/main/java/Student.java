import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "age", nullable = false)
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

// default constructor, getters, and setters
}
//
//    위의 코드는 JPA 엔티티 객체 문법으로 표현된 것으로,
//    @Entity 어노테이션으로 이 클래스가 JPA 엔티티임을 표시하고,
//    @Table 어노테이션으로 해당 클래스가 매핑될 데이터베이스 테이블 이름을 지정하였습니다.
//
//@Id 어노테이션으로 해당 필드가 해당 엔티티의 primary key임을 표시하고,
//@GeneratedValue 어노테이션으로 id 필드 값의 자동 생성 전략을 지정하였습니다.
//
//@Column 어노테이션으로 해당 필드가 매핑될 데이터베이스 컬럼 이름, 길이, null 허용 여부 등을 지정하였습니다.