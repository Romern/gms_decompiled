package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: zth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zth {

    /* renamed from: a */
    public static final srn f55878a = zvt.m46581a();

    /* renamed from: b */
    public static final String f55879b = String.format("%s DS JOIN %s DST ON (DS.%s = DST.%s)", "DataSources", "DataSourceTypes", "_id", "data_source_id");

    /* renamed from: c */
    public final SQLiteDatabase f55880c;

    public zth(SQLiteDatabase sQLiteDatabase) {
        this.f55880c = sQLiteDatabase;
    }

    /* renamed from: a */
    private final caaq m46282a(long j) {
        int i;
        String format = String.format("%s = ?", "_id");
        String[] strArr = {Long.toString(j)};
        srn srn = ztl.f55885a;
        String str = "platform_type";
        String str2 = "type";
        String str3 = "uid";
        Cursor query = this.f55880c.query("Devices", new String[]{"make", "model", "version", "uid", "type", "platform_type"}, format, strArr, null, null, null, null);
        try {
            if (query.moveToFirst()) {
                bxvd da = caaq.f172356h.mo74144da();
                String c = ztl.m46303c(query, "make");
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                caaq caaq = (caaq) da.f164949b;
                c.getClass();
                caaq.f172358a |= 16;
                caaq.f172363f = c;
                String c2 = ztl.m46303c(query, "model");
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                caaq caaq2 = (caaq) da.f164949b;
                c2.getClass();
                caaq2.f172358a |= 8;
                caaq2.f172362e = c2;
                String c3 = ztl.m46303c(query, "version");
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                caaq caaq3 = (caaq) da.f164949b;
                c3.getClass();
                caaq3.f172358a |= 4;
                caaq3.f172361d = c3;
                String d = ztl.m46304d(query, str3);
                if (d != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    caaq caaq4 = (caaq) da.f164949b;
                    d.getClass();
                    caaq4.f172358a |= 1;
                    caaq4.f172359b = d;
                }
                int a = ztl.m46301a(query, str2);
                caap a2 = caap.m126421a(a);
                if (a2 == null) {
                    bnsl bnsl = (bnsl) f55878a.mo68387b();
                    bnsl.mo68432a("zth", "a", 235, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68409a("Invalid DeviceType [%d]", a);
                    a2 = caap.UNKNOWN;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                caaq caaq5 = (caaq) da.f164949b;
                caaq5.f172360c = a2.f172355h;
                caaq5.f172358a |= 2;
                int a3 = ztl.m46301a(query, str);
                int a4 = caan.m126419a(a3);
                if (a4 == 0) {
                    bnsl bnsl2 = (bnsl) f55878a.mo68387b();
                    bnsl2.mo68432a("zth", "a", 243, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68409a("Invalid PlatformType [%d]", a3);
                    i = 1;
                } else {
                    i = a4;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                caaq caaq6 = (caaq) da.f164949b;
                caaq6.f172364g = i - 1;
                caaq6.f172358a |= 32;
                return (caaq) da.mo74062i();
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }
}
