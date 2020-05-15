package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: sms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1592sms extends srp {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS radio_activity (_id INTEGER PRIMARY KEY, event_time_ms INTEGER, network_type INTEGER)");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS radio_activity");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS radio_activity (_id INTEGER PRIMARY KEY, event_time_ms INTEGER, network_type INTEGER)");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public C1592sms(Context context) {
        super(context, "wradio.db", "wradio.db", 1);
    }
}
