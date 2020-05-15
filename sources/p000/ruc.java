package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.TimeUnit;

/* renamed from: ruc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ruc implements ruh {

    /* renamed from: a */
    public static final long f43686a = TimeUnit.DAYS.toSeconds(1);

    /* renamed from: b */
    static final String f43687b = String.format("CREATE TABLE IF NOT EXISTS %s (%s TEXT PRIMARY KEY NOT NULL, %s TEXT NOT NULL, %s INTEGER NOT NULL, %s INTEGER NOT NULL, %s INTEGER NOT NULL, %s INTEGER NOT NULL, %s INTEGER NOT NULL);", "crash_count", "crash_hash", "stack_trace", "count", "start_time", "latest_tme", "latest_error_dialog_time", "latest_notification_time");

    /* renamed from: a */
    static rud m34461a(Cursor cursor, String str) {
        if (cursor != null) {
            return new rud(str, cursor.getString(cursor.getColumnIndexOrThrow("stack_trace")), cursor.getLong(cursor.getColumnIndexOrThrow("count")), cursor.getLong(cursor.getColumnIndexOrThrow("start_time")), cursor.getLong(cursor.getColumnIndexOrThrow("latest_tme")), cursor.getLong(cursor.getColumnIndexOrThrow("latest_error_dialog_time")), cursor.getLong(cursor.getColumnIndexOrThrow("latest_notification_time")));
        }
        return null;
    }

    /* renamed from: b */
    public final void mo25171b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("crash_count", "latest_tme < ?", new String[]{Long.toString(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - f43686a)});
    }

    /* renamed from: c */
    public final void mo25172c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS crash_count");
        mo25170a(sQLiteDatabase);
    }

    /* renamed from: d */
    public final void mo25173d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS crash_count");
        mo25170a(sQLiteDatabase);
    }

    /* renamed from: a */
    public final void mo25170a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f43687b);
    }
}
