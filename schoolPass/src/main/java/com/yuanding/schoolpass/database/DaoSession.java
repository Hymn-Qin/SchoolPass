package com.yuanding.schoolpass.database;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig userInfosDaoConfig;

    private final UserInfosDao userInfosDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        userInfosDaoConfig = daoConfigMap.get(UserInfosDao.class).clone();
        userInfosDaoConfig.initIdentityScope(type);

        userInfosDao = new UserInfosDao(userInfosDaoConfig, this);

        registerDao(UserInfos.class, userInfosDao);
    }
    
    public void clear() {
        userInfosDaoConfig.getIdentityScope().clear();
    }

    public UserInfosDao getUserInfosDao() {
        return userInfosDao;
    }

}
