package p000;

/* renamed from: eer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface eer {

    /* renamed from: a */
    public static final String[] f14792a = {"_id", "context_id", "context_name", "module_id", "time_type", "start_time", "end_time", "context_family", "proto_blob", "string_key1", "string_key2", "string_key3", "version", "sync_state", "sync_state_mod_time_millis"};

    /* renamed from: b */
    public static final String[] f14793b = {"INTEGER PRIMARY KEY", "TEXT UNIQUE NOT NULL", "INTEGER", "TEXT NOT NULL", "INTEGER", "INTEGER", "INTEGER", "INTEGER", "BLOB", "TEXT", "TEXT", "TEXT", "INTEGER NOT NULL", "INTEGER NOT NULL", "sync_state_mod_time_millis"};

    /* renamed from: c */
    public static final String[][] f14794c = {new String[]{"context_name", "start_time", "end_time"}, new String[]{"sync_state"}};
}
