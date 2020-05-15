package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: asix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asix {
    /* renamed from: a */
    public static AccountInfo m74198a(Context context) {
        return m74201b(context, askc.m74272b());
    }

    /* renamed from: b */
    public static AccountInfo m74201b(Context context, String str) {
        String a = m74199a(context, str);
        if (a != null) {
            return m74202c(context, a);
        }
        return null;
    }

    /* renamed from: c */
    public static AccountInfo m74202c(Context context, String str) {
        String a = asjg.m74211a(context, str);
        if (a != null) {
            return new AccountInfo(str, a);
        }
        return null;
    }

    /* renamed from: d */
    public static List m74203d(Context context, String str) {
        SQLiteDatabase a = asko.m74292a(context).mo49214a();
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = a.rawQuery("SELECT account_id from Wallets WHERE wallet_id IS NOT NULL AND environment = ?;", new String[]{str});
        while (rawQuery.moveToNext()) {
            try {
                AccountInfo c = m74202c(context, rawQuery.getString(0));
                if (c != null) {
                    arrayList.add(c);
                }
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return arrayList;
        throw th;
    }

    /* renamed from: a */
    public static String m74199a(Context context, String str) {
        return atxr.m76516a(asko.m74292a(context).mo49214a(), "SELECT account_id from Wallets where is_active_wallet = 1 AND environment = ?;", str);
    }

    /* renamed from: a */
    public static String m74200a(askf askf) {
        return stm.m36300b(atxr.m76516a(asko.m74292a(askf.f89126d).mo49214a(), "SELECT wallet_id from Wallets WHERE account_id = ? AND environment = ?;", askf.f89123a, askf.f89125c));
    }
}
