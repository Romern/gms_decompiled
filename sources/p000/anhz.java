package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;

/* renamed from: anhz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anhz extends angu {

    /* renamed from: a */
    private final angj f76915a;

    /* renamed from: b */
    private final String f76916b;

    /* renamed from: c */
    private final ania f76917c;

    public anhz(angj angj, String str, byte[] bArr, String str2) {
        super("SetAppSpecificPropertiesOperationCall", caif.SET_APP_SPECIFIC_PROPERTIES);
        sdo.m34959a(angj);
        this.f76915a = angj;
        this.f76916b = str;
        this.f76917c = new ania(str, bArr, str2);
    }

    /* renamed from: a */
    public final cahp mo41825a() {
        ania ania = this.f76917c;
        caho caho = (caho) cahp.f174572m.mo74144da();
        String str = ania.f76918a;
        int i = 0;
        if (caho.f164950c) {
            caho.mo74035c();
            caho.f164950c = false;
        }
        cahp cahp = (cahp) caho.f164949b;
        str.getClass();
        int i2 = cahp.f174574a | 1;
        cahp.f174574a = i2;
        cahp.f174575b = str;
        if (ania.f76921d == 1) {
            i = 16;
        }
        cahp.f174574a = i2 | 64;
        cahp.f174583j = i;
        return (cahp) caho.mo74062i();
    }

    /* renamed from: b */
    public final void mo41827b(Context context) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /* renamed from: b */
    public final void mo41828b(Context context, anfw anfw) {
        Cursor query;
        ania ania = this.f76917c;
        SQLiteDatabase writableDatabase = anfw.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            ania.f76918a = angb.m64192a(ania.f76918a, ania.f76919b);
            query = writableDatabase.query("Packages", new String[]{"dynamicParams"}, "packageName = ? AND androidPackageName = ?", new String[]{ania.f76918a, ania.f76919b}, null, null, null);
            if (query.moveToFirst()) {
                if (!Arrays.equals(ania.f76920c, query.getBlob(0))) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("dynamicParams", ania.f76920c);
                    if (writableDatabase.updateWithOnConflict("Packages", contentValues, "packageName = ?", new String[]{ania.f76918a}, 5) >= 0) {
                        writableDatabase.setTransactionSuccessful();
                        ania.f76921d = 1;
                    } else {
                        throw new SQLiteException(String.valueOf(ania.f76918a).concat(" failed to update dynamic params."));
                    }
                } else {
                    ania.f76921d = 2;
                }
                if (query != null) {
                    query.close();
                }
                writableDatabase.endTransaction();
                if (ania.f76921d == 1 && anhs.m64428a(this.f76916b, 17)) {
                    anij.m64478a(context, 17, this.f76916b);
                }
                this.f76915a.mo41793c(Status.f30107a);
                return;
            }
            throw new anfy(29503);
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f76915a.mo41793c(status);
    }
}
