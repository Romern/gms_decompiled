package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* renamed from: eed */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eed extends dwm {

    /* renamed from: a */
    public final eea f14768a;

    /* renamed from: b */
    public final String f14769b = "default";

    /* renamed from: c */
    private final Context f14770c;

    /* renamed from: a */
    public static String m10214a(String str, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('_');
        for (String str2 : strArr) {
            sb.append(str2);
            sb.append('_');
        }
        sb.append("index");
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo10034b(doh doh) {
        this.f14768a.mo10026a(eea.m10203b(1, doh.f13690b));
        File databasePath = this.f14770c.getDatabasePath(eea.m10204c(1, doh.f13690b));
        if (databasePath.exists()) {
            databasePath.delete();
        }
        dwq.m9681y().mo9336c(doh);
    }

    public eed(Context context) {
        this.f14770c = context;
        this.f14768a = new eea(context);
    }

    /* renamed from: a */
    public static void m10215a(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String[] strArr2) {
        eeq.m10251b();
        eeo eeo = new eeo(str);
        for (int i = 0; i < strArr.length; i++) {
            String str2 = strArr[i];
            String str3 = strArr2[i];
            if (eeo.f14787b) {
                eeo.f14786a.append(",");
            } else {
                eeo.f14787b = true;
            }
            StringBuilder sb = eeo.f14786a;
            sb.append(str2);
            sb.append(" ");
            sb.append(str3);
        }
        eeo.f14786a.append(");");
        sQLiteDatabase.execSQL(eeo.f14786a.toString());
    }

    /* renamed from: a */
    public static void m10216a(SQLiteDatabase sQLiteDatabase, String str, String[][] strArr) {
        for (String[] strArr2 : strArr) {
            String a = m10214a(str, strArr2);
            eeq.m10251b();
            een een = new een(str, a);
            for (String str2 : strArr2) {
                if (een.f14785b) {
                    een.f14784a.append(',');
                }
                een.f14785b = true;
                een.f14784a.append(str2);
            }
            een.f14784a.append(')');
            sQLiteDatabase.execSQL(een.f14784a.toString());
        }
    }

    /* renamed from: a */
    public final SQLiteDatabase mo10032a() {
        return this.f14768a.mo10023a(2, this.f14769b).getWritableDatabase();
    }

    /* renamed from: a */
    public final SQLiteDatabase mo10033a(doh doh) {
        dwq.m9681y().mo9332a(doh);
        return this.f14768a.mo10024a(doh).getWritableDatabase();
    }
}
