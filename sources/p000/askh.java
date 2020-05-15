package p000;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: askh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class askh implements askr {
    /* renamed from: a */
    public final void mo49213a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE Wallets ADD COLUMN device_info_sent int default 0");
        sQLiteDatabase.execSQL("UPDATE Wallets SET device_info_sent = 1 WHERE wallet_id IS NOT NULL");
    }
}
