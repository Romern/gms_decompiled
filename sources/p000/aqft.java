package p000;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: aqft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqft extends srp {
    /* renamed from: c */
    private final void m71526c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE files_info");
        } catch (SQLException e) {
        }
        onCreate(sQLiteDatabase);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE files_info (full_path TEXT PRIMARY KEY, time_ms INTEGER, sha256_digest BLOB, is_setuid_root INTEGER, is_symlink INTEGER, symlink_target TEXT, file_permissions INTEGER, file_owner INTEGER, file_group INTEGER, se_linux_security_context TEXT);");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder(64);
        sb.append("Can't downgrade database from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        throw new SQLiteException(sb.toString());
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m71526c(sQLiteDatabase);
    }

    public aqft(Context context) {
        super(context, "snet_files_info.db", "snet_files_info.db", 1);
    }
}
