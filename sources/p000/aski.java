package p000;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: aski */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aski implements askr {
    /* renamed from: a */
    public final void mo49213a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE PaymentCards ADD COLUMN last_tap_timestamp int default 0");
    }
}
