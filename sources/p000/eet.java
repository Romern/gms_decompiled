package p000;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.felicanetworks.mfc.mfi.MfiClientException;

/* renamed from: eet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class eet {

    /* renamed from: a */
    public final SQLiteStatement f14798a;

    /* renamed from: b */
    public final SQLiteStatement f14799b;

    public eet(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder((int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED);
        sb.append("DELETE FROM feature WHERE type = ? AND account_id = ? AND _id NOT IN (SELECT _id FROM feature WHERE type = ? AND account_id = ? ORDER BY _id DESC LIMIT 1)");
        this.f14798a = sQLiteDatabase.compileStatement(sb.toString());
        StringBuilder sb2 = new StringBuilder(204);
        sb2.append("DELETE FROM feature WHERE type = ? AND (account_id IS NULL OR account_id = '') AND _id NOT IN (SELECT _id FROM feature WHERE type = ? AND (account_id IS NULL OR account_id = '') ORDER BY _id DESC LIMIT 1)");
        this.f14799b = sQLiteDatabase.compileStatement(sb2.toString());
    }
}
