package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aska */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aska {

    /* renamed from: a */
    private static final srn f89107a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public static List m74264a(Context context) {
        return m74266a((String) null, (String[]) null, (String) null, context);
    }

    /* renamed from: a */
    public static List m74265a(String str, Context context, String str2) {
        return m74266a("account_id=? AND environment=?", new String[]{str, str2}, "priority", context);
    }

    /* renamed from: a */
    private static List m74266a(String str, String[] strArr, String str2, Context context) {
        sdo.m34960a();
        SQLiteDatabase a = asko.m74292a(context).mo49214a();
        ArrayList arrayList = new ArrayList();
        a.beginTransaction();
        try {
            Cursor query = a.query("TapDoodleGroups", null, str, strArr, null, null, str2);
            while (query.moveToNext()) {
                try {
                    byte[] blob = query.getBlob(query.getColumnIndex("proto"));
                    arrayList.add((btpn) GeneratedMessageLite.m124016a(btpn.f149866e, blob, bxus.m123744c()));
                } catch (bxwf e) {
                    bnsl bnsl = (bnsl) f89107a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("aska", "a", 115, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Error parsing TapDoodle proto");
                } catch (Throwable th) {
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            a.setTransactionSuccessful();
            a.endTransaction();
            return arrayList;
        } catch (Throwable th2) {
            a.endTransaction();
            throw th2;
        }
    }

    /* renamed from: a */
    public static void m74267a(List list, String str, Context context, String str2) {
        sdo.m34960a();
        SQLiteDatabase a = asko.m74292a(context).mo49214a();
        a.beginTransaction();
        try {
            a.delete("TapDoodleGroups", "account_id=? AND environment=?", new String[]{str, str2});
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("doodle_group_id", ((btpn) list.get(i)).f149868a);
                contentValues.put("environment", str2);
                contentValues.put("account_id", str);
                contentValues.put("proto", ((btpn) list.get(i)).serializeToBytes());
                contentValues.put("priority", Integer.valueOf(i));
                if (a.insert("TapDoodleGroups", null, contentValues) == -1) {
                    bnsl bnsl = (bnsl) f89107a.mo68387b();
                    bnsl.mo68432a("aska", "a", 63, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Error inserting tap doodle group");
                }
            }
            a.setTransactionSuccessful();
        } finally {
            a.endTransaction();
        }
    }
}
