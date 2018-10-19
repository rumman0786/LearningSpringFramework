package module.hello.service;

import module.hello.model.AuthUser;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author rumman
 * @since 10/9/18
 */
@Repository
public class AuthUserService {

    @PersistenceContext(unitName = "myEmf")
    public EntityManager em;

    @Transactional
    public void save(AuthUser authUser) {
        em.persist(authUser);
    }
}
