package p000;

import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: atcx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atcx {
    /* renamed from: a */
    public static SQLiteDatabase m75566a(Context context) {
        return asko.m74292a(context).mo49214a();
    }

    /* renamed from: a */
    public static void m75567a(askf askf, String str) {
        SQLiteDatabase a = m75566a(askf.f89126d);
        a.beginTransaction();
        try {
            a.delete("PaymentBundles", "bundle_id = ? AND account_id = ? AND environment = ?", new String[]{str, askf.f89123a, askf.f89125c});
            a.setTransactionSuccessful();
        } finally {
            a.endTransaction();
        }
    }

    /* renamed from: a */
    public static boolean m75568a(Context context, String str) {
        SQLiteDatabase a = m75566a(context);
        a.beginTransaction();
        boolean z = true;
        try {
            long queryNumEntries = DatabaseUtils.queryNumEntries(a, "PaymentBundles", "environment = ? AND bundle_state NOT IN ('new', 'deleted')", new String[]{str});
            a.setTransactionSuccessful();
            if (queryNumEntries <= 0) {
                z = false;
            }
            return z;
        } finally {
            a.endTransaction();
        }
    }
}
