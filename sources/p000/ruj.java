package p000;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.TimeUnit;

/* renamed from: ruj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ruj implements ruh {

    /* renamed from: a */
    static final String f43701a = String.format("CREATE TABLE IF NOT EXISTS %s (%s TEXT NOT NULL PRIMARY KEY, %s INTEGER NOT NULL);", "event_tracker", "tag", "expiration_time");

    /* renamed from: a */
    public final void mo25170a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f43701a);
    }

    /* renamed from: b */
    public final void mo25171b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("event_tracker", "expiration_time < ?", new String[]{Long.toString(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()))});
    }

    /* renamed from: c */
    public final void mo25172c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_tracker");
        mo25170a(sQLiteDatabase);
    }

    /* renamed from: d */
    public final void mo25173d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_tracker");
        mo25170a(sQLiteDatabase);
    }
}
