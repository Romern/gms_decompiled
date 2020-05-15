package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: asit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asit {

    /* renamed from: a */
    private static final srn f89056a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static boolean m74179a(long j, Context context, String str, SQLiteDatabase sQLiteDatabase) {
        if (j == 0) {
            bnsl bnsl = (bnsl) f89056a.mo68388c();
            bnsl.mo68432a("asit", "a", 34, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("AndroidId missing");
            return false;
        }
        sQLiteDatabase.beginTransaction();
        try {
            long a = asjm.m74239a(str, sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            if (!(a == 0 || j == a)) {
                bnsl bnsl2 = (bnsl) f89056a.mo68388c();
                bnsl2.mo68432a("asit", "a", 52, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("AndroidId has changed, wiping data");
                athu.m75913a(context);
                aeat.m51532a(context).mo33985a("com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService");
                asko.m74296c(asko.m74292a(context).mo49214a());
            }
            return true;
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }
}
