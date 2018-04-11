package com.u91porn.data.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.u91porn.data.model.AutoCompleteModel;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "AUTO_COMPLETE_MODEL".
*/
public class AutoCompleteModelDao extends AbstractDao<AutoCompleteModel, Long> {

    public static final String TABLENAME = "AUTO_COMPLETE_MODEL";

    /**
     * Properties of entity AutoCompleteModel.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property UseTime = new Property(2, int.class, "useTime", false, "USE_TIME");
        public final static Property Type = new Property(3, int.class, "type", false, "TYPE");
        public final static Property AddDate = new Property(4, java.util.Date.class, "addDate", false, "ADD_DATE");
        public final static Property UpdateDate = new Property(5, java.util.Date.class, "updateDate", false, "UPDATE_DATE");
    }


    public AutoCompleteModelDao(DaoConfig config) {
        super(config);
    }
    
    public AutoCompleteModelDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"AUTO_COMPLETE_MODEL\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"NAME\" TEXT," + // 1: name
                "\"USE_TIME\" INTEGER NOT NULL ," + // 2: useTime
                "\"TYPE\" INTEGER NOT NULL ," + // 3: type
                "\"ADD_DATE\" INTEGER," + // 4: addDate
                "\"UPDATE_DATE\" INTEGER);"); // 5: updateDate
        // Add Indexes
        db.execSQL("CREATE UNIQUE INDEX " + constraint + "IDX_AUTO_COMPLETE_MODEL_NAME ON \"AUTO_COMPLETE_MODEL\"" +
                " (\"NAME\" ASC);");
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"AUTO_COMPLETE_MODEL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, AutoCompleteModel entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
        stmt.bindLong(3, entity.getUseTime());
        stmt.bindLong(4, entity.getType());
 
        java.util.Date addDate = entity.getAddDate();
        if (addDate != null) {
            stmt.bindLong(5, addDate.getTime());
        }
 
        java.util.Date updateDate = entity.getUpdateDate();
        if (updateDate != null) {
            stmt.bindLong(6, updateDate.getTime());
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, AutoCompleteModel entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
        stmt.bindLong(3, entity.getUseTime());
        stmt.bindLong(4, entity.getType());
 
        java.util.Date addDate = entity.getAddDate();
        if (addDate != null) {
            stmt.bindLong(5, addDate.getTime());
        }
 
        java.util.Date updateDate = entity.getUpdateDate();
        if (updateDate != null) {
            stmt.bindLong(6, updateDate.getTime());
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public AutoCompleteModel readEntity(Cursor cursor, int offset) {
        AutoCompleteModel entity = new AutoCompleteModel( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.getInt(offset + 2), // useTime
            cursor.getInt(offset + 3), // type
            cursor.isNull(offset + 4) ? null : new java.util.Date(cursor.getLong(offset + 4)), // addDate
            cursor.isNull(offset + 5) ? null : new java.util.Date(cursor.getLong(offset + 5)) // updateDate
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, AutoCompleteModel entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setUseTime(cursor.getInt(offset + 2));
        entity.setType(cursor.getInt(offset + 3));
        entity.setAddDate(cursor.isNull(offset + 4) ? null : new java.util.Date(cursor.getLong(offset + 4)));
        entity.setUpdateDate(cursor.isNull(offset + 5) ? null : new java.util.Date(cursor.getLong(offset + 5)));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(AutoCompleteModel entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(AutoCompleteModel entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(AutoCompleteModel entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
