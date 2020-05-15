package p000;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: askk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class askk implements askr {
    /* renamed from: a */
    public final void mo49213a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS QuickAccessWalletCards (account_id text not null, environment text not null, wallet_source int, card_id text not null, card_index int, available_timestamp int, expiration_timestamp int, card_image_filename text not null, wallet_card blob, PRIMARY KEY(account_id, environment, wallet_source, card_id))");
    }
}
