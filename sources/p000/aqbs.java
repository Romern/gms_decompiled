package p000;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: aqbs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqbs extends srp {
    /* renamed from: c */
    static void m71321c(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cache");
            } catch (SQLException e) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE metadata (threat_type INTEGER PRIMARY KEY, checksum BLOB, state BLOB)");
        sQLiteDatabase.execSQL("CREATE TABLE cache (hash BLOB UNIQUE NOT NULL, find_threat_matches_response_proto BLOB, time_cached_ms INTEGER)");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS metadata");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cache");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public aqbs(Context context) {
        super(context, "snet_safe_browsing.db", "snet_safe_browsing.db", 7);
    }
}
