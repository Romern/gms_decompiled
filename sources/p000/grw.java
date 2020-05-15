package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: grw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class grw extends srp {
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public grw(Context context) {
        super(context, "otp_counters.db", "otp_counters.db", 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE otp_counters (otp_secret_hash STRING NOT NULL PRIMARY KEY, account_name STRING NOT NULL, counter INTEGER NOT NULL, otp_secret_creation_time_millis INTEGER NOT NULL, creation_time_millis INTEGER NOT NULL, modification_time_millis INTEGER NOT NULL )");
    }
}
