package hr.magicpot.task.storage.db.model;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by xxx on 20.11.2016..
 */
@DatabaseTable(tableName = "modeltable")
public class DBModel {

    public static final String ID = "id";
    public static final String URL = "url";
    public static final String HASHCODE = "hash";

    @DatabaseField(columnName = ID, generatedId = true) private int id;
    @DatabaseField(columnName = URL, dataType = DataType.STRING) private String url;
    @DatabaseField(columnName = HASHCODE, dataType = DataType.LONG) private long hashcode;

    public DBModel(){}

    public DBModel(String url, long hashcode) {
        this.url = url;
        this.hashcode = hashcode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getHashcode() {
        return hashcode;
    }

    public void setHashcode(long hashcode) {
        this.hashcode = hashcode;
    }
}
