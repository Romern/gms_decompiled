package p000;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: askj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class askj implements askr {
    /* renamed from: a */
    public final void mo49213a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS PaymentCardOverrides (account_id text not null, environment text not null, client_token_id text not null, priority int, priority_override_realtime_min int , priority_override_realtime_max int);");
    }
}
