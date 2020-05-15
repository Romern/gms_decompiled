package p000;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: askq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class askq implements askr {
    /* renamed from: a */
    public final void mo49213a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE Wallets ADD COLUMN transaction_notification_migrated int default 0");
    }
}
