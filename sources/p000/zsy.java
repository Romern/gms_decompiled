package p000;

/* renamed from: zsy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zsy {

    /* renamed from: a */
    static final String f55848a = String.format("SELECT %s FROM %s WHERE %s LIKE '%%%s'", "_id", "DataSources", "stream_name", "_local");

    /* renamed from: b */
    static final String f55849b = String.format("CREATE TABLE %s (%s, %s, %s, %s);", "DataSources", "_id INTEGER PRIMARY KEY AUTOINCREMENT", String.format("%s INTEGER REFERENCES %s(%s)", "data_type_id", "DataTypes", "_id"), "identifier TEXT NOT NULL", "proto BLOB NOT NULL");

    /* renamed from: c */
    static final String f55850c = String.format("CREATE UNIQUE INDEX IF NOT EXISTS DataSourcesIdentifiers ON %s(%s)", "DataSources", "identifier");

    /* renamed from: d */
    static final String f55851d = String.format("DELETE FROM %s WHERE %s IN (%s)", "DataSources", "_id", f55848a);

    /* renamed from: e */
    static final String f55852e = String.format("DROP TABLE %s", "DataSources");
}
