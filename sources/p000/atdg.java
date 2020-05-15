package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.felicanetworks.sdu.ErrorInfo;
import java.util.Iterator;
import java.util.Set;

/* renamed from: atdg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atdg {

    /* renamed from: a */
    public static final srn f90116a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public static SQLiteDatabase m75596a(Context context) {
        return asko.m74292a(context).mo49214a();
    }

    /* renamed from: a */
    public static String[] m75598a(String str, askf askf) {
        return new String[]{str, askf.f89123a, askf.f89125c};
    }

    /* renamed from: a */
    public static bydc m75597a(byte[] bArr) {
        try {
            return (bydc) GeneratedMessageLite.m124016a(bydc.f165756b, bArr, bxus.m123744c());
        } catch (bxwf e) {
            bnsl bnsl = (bnsl) f90116a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atdg", "a", 168, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error parsing SupportedAids");
            return bydc.f165756b;
        }
    }

    /* renamed from: a */
    public final boolean mo49835a(askf askf, String str, Set set) {
        if (!set.isEmpty()) {
            SQLiteDatabase a = m75596a(askf.f89126d);
            a.beginTransaction();
            try {
                bydb bydb = (bydb) bydc.f165756b.mo74144da();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (str2.isEmpty()) {
                        bnsl bnsl = (bnsl) f90116a.mo68387b();
                        bnsl.mo68432a("atdg", "a", 115, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("Received empty AID value.");
                        return false;
                    }
                    bydb.mo74346a(str2);
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("supported_aids", ((bydc) bydb.mo74062i()).serializeToBytes());
                a.update("PaymentBundles", contentValues, "bundle_id = ? AND account_id = ? AND environment = ?", m75598a(str, askf));
                a.setTransactionSuccessful();
                a.endTransaction();
                return true;
            } finally {
                a.endTransaction();
            }
        } else {
            bnsl bnsl2 = (bnsl) f90116a.mo68387b();
            bnsl2.mo68432a("atdg", "a", (int) ErrorInfo.TYPE_SDU_MEMORY_FULL, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Received empty set of AIDs.");
            return false;
        }
    }
}
