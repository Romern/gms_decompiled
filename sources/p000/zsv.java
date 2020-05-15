package p000;

/* renamed from: zsv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zsv {

    /* renamed from: a */
    static final String f55837a = String.format("CREATE TABLE %s (%s, %s, %s, %s, %s, %s, %s, %s);", "ChangeLog", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "timestamp INTEGER NOT NULL", "is_delete INTEGER NOT NULL", "source_table TEXT NOT NULL", "content BLOB NOT NULL", "sync_tries INTEGER DEFAULT 0", "last_sync_ms INTEGER DEFAULT 0", "value_timestamp INTEGER DEFAULT 0");

    /* renamed from: b */
    static final String f55838b = String.format("CREATE INDEX IF NOT EXISTS ChangeLogTimestamps ON %s(%s)", "ChangeLog", "timestamp");

    /* renamed from: c */
    static final String f55839c = String.format("CREATE INDEX IF NOT EXISTS ChangeLogTimestamps ON %s(%s, %s)", "ChangeLog", "source_table", "timestamp");
}
