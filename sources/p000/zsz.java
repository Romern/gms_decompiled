package p000;

/* renamed from: zsz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zsz {

    /* renamed from: a */
    static final String f55853a = String.format("CREATE TABLE %s (%s, %s, %s);", "DataTypes", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "name TEXT NOT NULL", "proto BLOB NOT NULL");

    /* renamed from: b */
    static final String f55854b = String.format("CREATE INDEX IF NOT EXISTS DataTypeNames ON %s(%s)", "DataTypes", "name");

    /* renamed from: c */
    static final String f55855c = String.format("DROP TABLE %s", "DataTypes");
}
