package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.FlagOverride;
import com.google.android.gms.phenotype.FlagOverrides;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: angy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class angy extends angu {

    /* renamed from: a */
    private final angj f76834a;

    /* renamed from: b */
    private final angz f76835b;

    public angy(angj angj, String str, String str2, String str3, String str4) {
        super("DeleteFlagOverridesOperationCall", caif.DELETE_FLAG_OVERRIDE);
        sdo.m34959a(angj);
        this.f76834a = angj;
        this.f76835b = new angz(str2, str3, str4, str);
    }

    /* renamed from: a */
    public final cahp mo41825a() {
        angz angz = this.f76835b;
        caho caho = (caho) cahp.f174572m.mo74144da();
        String str = angz.f76836a;
        if (str != null) {
            if (caho.f164950c) {
                caho.mo74035c();
                caho.f164950c = false;
            }
            cahp cahp = (cahp) caho.f164949b;
            str.getClass();
            cahp.f174574a |= 1;
            cahp.f174575b = str;
        }
        return (cahp) caho.mo74062i();
    }

    /* renamed from: b */
    public final void mo41827b(Context context) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /* renamed from: d */
    public final List mo41831d() {
        return this.f76835b.f76837b;
    }

    /* renamed from: b */
    public final void mo41828b(Context context, anfw anfw) {
        Cursor query;
        cahq a;
        String str;
        String str2;
        angz angz = this.f76835b;
        ArrayList arrayList = new ArrayList();
        HashSet<String> hashSet = new HashSet();
        SQLiteDatabase writableDatabase = anfw.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            angz.f76836a = angb.m64192a(angz.f76836a, angz.f76840e);
            query = writableDatabase.query("FlagOverrides", anhp.f76889a, "committed = 0", null, null, null, null);
            String[] strArr = {null, null, null};
            while (query.moveToNext()) {
                String string = query.getString(7);
                String string2 = query.getString(8);
                String string3 = query.getString(1);
                String str3 = angz.f76836a;
                if ((str3 == null || str3.equals(string)) && (((str = angz.f76838c) == null || str.equals(string2)) && ((str2 = angz.f76839d) == null || str2.equals(string3) || anhp.m64420a(angz.f76839d, string3)))) {
                    FlagOverride flagOverride = new FlagOverride(string, string2, anhe.m64382a(query), false);
                    arrayList.add(flagOverride);
                    hashSet.add(flagOverride.f82108a);
                    strArr[0] = string;
                    strArr[1] = string2;
                    strArr[2] = string3;
                    writableDatabase.delete("FlagOverrides", "packageName = ? AND user = ? AND name = ? AND committed = 0", strArr);
                }
            }
            if (query != null) {
                query.close();
            }
            for (String str4 : hashSet) {
                anfm.m64162b(writableDatabase, str4);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            for (String str5 : hashSet) {
                String b = anfu.m64173b(writableDatabase, str5);
                if (!(b == null || (a = angc.m64195a(context, str5, b, 9, true)) == null)) {
                    angz.f76837b.add(a);
                }
            }
            this.f76834a.mo41789a(Status.f30107a, new FlagOverrides(arrayList));
            angf.m64199a(context).mo41781a(this.f76835b.f76836a);
            return;
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f76834a.mo41789a(status, (FlagOverrides) null);
    }
}
