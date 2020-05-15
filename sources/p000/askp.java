package p000;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: askp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class askp implements askr {
    /* renamed from: a */
    public final void mo49213a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("PaymentBundles", "bundle_type=?", new String[]{"amex_bundle"});
    }
}
