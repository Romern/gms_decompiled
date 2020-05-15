package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverride;
import com.google.android.gms.phenotype.FlagOverrides;
import java.util.ArrayList;

/* renamed from: anho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anho extends angu {

    /* renamed from: a */
    private final angj f76887a;

    /* renamed from: b */
    private final anhp f76888b;

    public anho(angj angj, String str, String str2, String str3, String str4) {
        super("ListFlagOverridesOperationCall", caif.LIST_FLAG_OVERRIDE);
        sdo.m34959a(angj);
        this.f76887a = angj;
        this.f76888b = new anhp(str2, str3, str4, str);
    }

    /* renamed from: a */
    public final cahp mo41825a() {
        anhp anhp = this.f76888b;
        caho caho = (caho) cahp.f174572m.mo74144da();
        String str = anhp.f76890b;
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

    /* renamed from: b */
    public final void mo41828b(Context context, anfw anfw) {
        Cursor query;
        String str;
        String str2;
        anhp anhp = this.f76888b;
        SQLiteDatabase writableDatabase = anfw.getWritableDatabase();
        anfw.m64180a(writableDatabase);
        ArrayList arrayList = new ArrayList();
        try {
            query = writableDatabase.query("FlagOverrides", anhp.f76889a, null, null, null, null, null);
            anhp.f76890b = angb.m64192a(anhp.f76890b, anhp.f76893e);
            while (query.moveToNext()) {
                String string = query.getString(7);
                String string2 = query.getString(8);
                boolean z = true;
                String string3 = query.getString(1);
                String str3 = anhp.f76890b;
                if ((str3 == null || str3.equals(string)) && (((str = anhp.f76891c) == null || str.equals(string2)) && ((str2 = anhp.f76892d) == null || str2.equals(string3) || anhp.m64420a(anhp.f76892d, string3)))) {
                    Flag a = anhe.m64382a(query);
                    if (query.getInt(9) == 0) {
                        z = false;
                    }
                    arrayList.add(new FlagOverride(string, string2, a, z));
                }
            }
            writableDatabase.setTransactionSuccessful();
            if (query != null) {
                query.close();
            }
            writableDatabase.endTransaction();
            this.f76887a.mo41789a(Status.f30107a, new FlagOverrides(arrayList));
            return;
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f76887a.mo41789a(status, (FlagOverrides) null);
    }
}
