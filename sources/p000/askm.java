package p000;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: askm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class askm implements askr {
    /* renamed from: a */
    public final void mo49213a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE PaymentBundles ADD COLUMN supported_aids blob");
    }
}
