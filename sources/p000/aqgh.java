package p000;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: aqgh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqgh extends srp {
    /* renamed from: c */
    private final void m71571c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE upload_queue");
        } catch (SQLException e) {
        }
        onCreate(sQLiteDatabase);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE upload_queue (id INTEGER PRIMARY KEY AUTOINCREMENT, package_name STRING, version_code INTEGER, sha256_digest BLOB, token BLOB, timestamp INTEGER, state INTEGER, last_update_time INTEGER, upload_attempts INTEGER, upload_reason);");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m71571c(sQLiteDatabase);
    }

    public aqgh(Context context) {
        super(context, "upload_queue.db", "upload_queue.db", 3);
    }
}
