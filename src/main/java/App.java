import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        // JPA -> Entity 관리 -> 매니저
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
        // persistence.xml에서의 persistence unit 이름과 Factory의 유닛 네임 일치해야...
        EntityManager em = emf.createEntityManager();

        // 트랜잭션 시작
        em.getTransaction().begin();
        Student student = new Student("DragonJae", 20);
        em.persist(student);
        // 트랜잭션 저장
        em.getTransaction().commit();
        System.out.println("트랜잭션 완료!");
        em.close();
        emf.close();

        // JPA를 통한 CRUD.
    }
}
