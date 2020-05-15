package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: adso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adso {
    /* renamed from: a */
    public static Cursor m51104a(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, String[] strArr2) {
        return sQLiteDatabase.query(str, strArr, str2, strArr2, null, null, null, null);
    }

    /* renamed from: a */
    static Set m51105a(SQLiteDatabase sQLiteDatabase, String str) {
        if (!ceqm.m137880k()) {
            return bnon.f131923a;
        }
        Cursor a = m51104a(sQLiteDatabase, "contact_annotation", new String[]{"contact_name"}, "phone_number=?", new String[]{str});
        if (a == null) {
            try {
                adnt.m50871b("Got null cursor in getContactNames()");
                return bnon.f131923a;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            HashSet hashSet = new HashSet();
            while (a.moveToNext()) {
                String a2 = sra.m36063a(a, 0, "");
                if (!TextUtils.isEmpty(a2)) {
                    hashSet.add(a2);
                }
            }
            a.close();
            return hashSet;
        }
        throw th;
    }
}
