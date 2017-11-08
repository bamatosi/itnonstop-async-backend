package net.matosiuk.itnonstop.async.repository;

import net.matosiuk.itnonstop.async.model.Permissions;
import org.springframework.stereotype.Repository;

@Repository
public class PermissionsMocks {

    public Permissions getPermissions(int userId) {
        return new Permissions(
                true,
                true,
                false,
                true,
                false,
                false);
    }
}
