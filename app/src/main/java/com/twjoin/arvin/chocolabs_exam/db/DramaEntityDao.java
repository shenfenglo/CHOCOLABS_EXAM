package com.twjoin.arvin.chocolabs_exam.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import com.twjoin.arvin.chocolabs_exam.db.model.DramaEntity;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "DRAMA_ENTITY".
*/
public class DramaEntityDao extends AbstractDao<DramaEntity, Long> {

    @SuppressWarnings("unused")
    public static final String TABLENAME = "DRAMA_ENTITY";

    /**
     * Properties of entity DramaEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    @SuppressWarnings("WeakerAccess")
    public static class Properties {
        @SuppressWarnings("unused")
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        @SuppressWarnings("unused")
        public final static Property DramaId = new Property(1, int.class, "dramaId", false, "DRAMA_ID");
        @SuppressWarnings("unused")
        public final static Property DramaName = new Property(2, String.class, "dramaName", false, "DRAMA_NAME");
        @SuppressWarnings("unused")
        public final static Property TotalViews = new Property(3, long.class, "totalViews", false, "TOTAL_VIEWS");
        @SuppressWarnings("unused")
        public final static Property CreateAt = new Property(4, String.class, "createAt", false, "CREATE_AT");
        @SuppressWarnings("unused")
        public final static Property Thumb = new Property(5, String.class, "thumb", false, "THUMB");
        @SuppressWarnings("unused")
        public final static Property Rating = new Property(6, float.class, "rating", false, "RATING");
    }


    public DramaEntityDao(DaoConfig config) {
        super(config);
    }
    
    public DramaEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DRAMA_ENTITY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"DRAMA_ID\" INTEGER NOT NULL ," + // 1: dramaId
                "\"DRAMA_NAME\" TEXT," + // 2: dramaName
                "\"TOTAL_VIEWS\" INTEGER NOT NULL ," + // 3: totalViews
                "\"CREATE_AT\" TEXT," + // 4: createAt
                "\"THUMB\" TEXT," + // 5: thumb
                "\"RATING\" REAL NOT NULL );"); // 6: rating
        // Add Indexes
        db.execSQL("CREATE UNIQUE INDEX " + constraint + "IDX_DRAMA_ENTITY_DRAMA_ID ON \"DRAMA_ENTITY\"" +
                " (\"DRAMA_ID\" ASC);");
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DRAMA_ENTITY\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, DramaEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getDramaId());
 
        String dramaName = entity.getDramaName();
        if (dramaName != null) {
            stmt.bindString(3, dramaName);
        }
        stmt.bindLong(4, entity.getTotalViews());
 
        String createAt = entity.getCreateAt();
        if (createAt != null) {
            stmt.bindString(5, createAt);
        }
 
        String thumb = entity.getThumb();
        if (thumb != null) {
            stmt.bindString(6, thumb);
        }
        stmt.bindDouble(7, entity.getRating());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, DramaEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getDramaId());
 
        String dramaName = entity.getDramaName();
        if (dramaName != null) {
            stmt.bindString(3, dramaName);
        }
        stmt.bindLong(4, entity.getTotalViews());
 
        String createAt = entity.getCreateAt();
        if (createAt != null) {
            stmt.bindString(5, createAt);
        }
 
        String thumb = entity.getThumb();
        if (thumb != null) {
            stmt.bindString(6, thumb);
        }
        stmt.bindDouble(7, entity.getRating());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        //noinspection PointlessArithmeticExpression,PointlessArithmeticExpression
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public DramaEntity readEntity(Cursor cursor, int offset) {
        @SuppressWarnings({"UnnecessaryLocalVariable", "PointlessArithmeticExpression"}) DramaEntity entity = new DramaEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getInt(offset + 1), // dramaId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // dramaName
            cursor.getLong(offset + 3), // totalViews
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // createAt
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // thumb
            cursor.getFloat(offset + 6) // rating
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, DramaEntity entity, int offset) {
        //noinspection PointlessArithmeticExpression,PointlessArithmeticExpression
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setDramaId(cursor.getInt(offset + 1));
        entity.setDramaName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTotalViews(cursor.getLong(offset + 3));
        entity.setCreateAt(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setThumb(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setRating(cursor.getFloat(offset + 6));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(DramaEntity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(DramaEntity entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(DramaEntity entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
