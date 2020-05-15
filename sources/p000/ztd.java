package p000;

/* renamed from: ztd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ztd {

    /* renamed from: a */
    static final String f55867a = String.format("CREATE TABLE %s (%s, %s, %s, %s, %s, %s);", "SyncStatus", "_id INTEGER PRIMARY KEY AUTOINCREMENT", String.format("%s INTEGER UNIQUE NOT NULL REFERENCES %s(%s)", "data_source_id", "DataSources", "_id"), "sync_token TEXT", "is_remote INTEGER NOT NULL DEFAULT 0", "last_synced_time INTEGER", "min_local_timestamp INTEGER DEFAULT -1");

    /* renamed from: b */
    static final String f55868b = String.format("DELETE FROM %s WHERE %s IN (%s)", "SyncStatus", "data_source_id", zsy.f55848a);
}
