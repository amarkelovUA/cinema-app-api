package cinema.dao.impl;

import cinema.dao.AbstractDao;
import cinema.dao.RoleDao;
import cinema.exception.DataProcessingException;
import cinema.model.Role;
import cinema.model.Role.RoleName;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Role getByName(String roleName) {
        try (Session session = factory.openSession()) {
            return session.createQuery(
                            "SELECT r FROM Role r WHERE r.roleName = :roleName", Role.class)
                    .setParameter("roleName", RoleName.valueOf(roleName))
                    .getSingleResult();
        } catch (Exception e) {
            throw new DataProcessingException("Can't find role with name: " + roleName, e);
        }
    }
}
