package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.provider.ContactsContract;
import android.util.Pair;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: apah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apah implements bmzi {

    /* renamed from: a */
    private final Context f83994a;

    /* renamed from: b */
    private apan f83995b;

    /* renamed from: c */
    private final apal f83996c;

    public apah(Context context, apal apal) {
        this.f83994a = context;
        this.f83996c = apal;
    }

    /* renamed from: c */
    private final apan m69940c() {
        if (this.f83995b == null) {
            this.f83995b = new apao(new apay(this.f83994a.getContentResolver()));
        }
        return this.f83995b;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aoza.a(boolean, long):btfi[]
     arg types: [int, long]
     candidates:
      aoza.a(java.lang.String, java.lang.String[]):android.database.Cursor
      aoza.a(boolean, long):btfi[] */
    /* renamed from: b */
    public final aozn mo6606a() {
        bmxv bmxv;
        List list;
        Cursor cursor;
        String str;
        String str2 = "romanesco-contacts-grpc-full-upload-timestamp";
        if (this.f83996c.f84034e) {
            SharedPreferences a = aozj.m69902a(this.f83994a);
            if (this.f83996c.f84035f && cgjk.m145709b()) {
                str = "romanesco-contacts-grpc-incremental-upload-timestamp";
            } else {
                str = "romanesco-contacts-logger-incremental-upload-timestamp";
            }
            long j = a.getLong(str, 0);
            if (!this.f83996c.f84035f || !cgjk.m145709b()) {
                str2 = "romanesco-contacts-logger-full-upload-timestamp";
            }
            long j2 = a.getLong(str2, 0);
            aoyh aoyh = apaj.f84014e;
            new Object[1][0] = Long.valueOf(j2);
            new Object[1][0] = Long.valueOf(j);
            if (cgij.m145555m()) {
                try {
                    aoza aoza = new aoza(this.f83994a);
                    btfi[] a2 = aoza.mo47028a(false, j);
                    btel btel = (btel) btem.f148532c.mo74144da();
                    btel.mo70754a(Arrays.asList(a2));
                    bmxv = bmxv.m108566b(new aozn(((btem) btel.mo74062i()).f148534a, aoza.mo47027a(j), aoza.mo47029b(), !cgij.m145552j() ? new btfe[0] : aoza.mo47031c()));
                } catch (aoyu | aoyv | InterruptedException e) {
                    aoyh aoyh2 = apaj.f84014e;
                    String valueOf = String.valueOf(e.getMessage());
                    aoyh2.mo46985d(valueOf.length() == 0 ? new String("Failed query from ReadContactHelper: + ") : "Failed query from ReadContactHelper: + ".concat(valueOf));
                    bmxv = bmvz.f131120a;
                }
            } else {
                aozn a3 = m69940c().mo47059a(this.f83994a.getResources(), j, j2);
                if (a3 == null) {
                    bmxv = bmvz.f131120a;
                } else {
                    if (cgij.m145552j()) {
                        try {
                            a3.f83953e = new aoza(this.f83994a).mo47031c();
                        } catch (aoyu | aoyv | InterruptedException e2) {
                            aoyh aoyh3 = apaj.f84014e;
                            String valueOf2 = String.valueOf(e2.getMessage());
                            aoyh3.mo46985d(valueOf2.length() == 0 ? new String("Failed query from ReadContactHelper.readGroupInfo: + ") : "Failed query from ReadContactHelper.readGroupInfo: + ".concat(valueOf2));
                        }
                    }
                    bmxv = bmxv.m108566b(a3);
                }
            }
        } else {
            SharedPreferences a4 = aozj.m69902a(this.f83994a);
            if (!this.f83996c.f84035f || !cgjk.m145709b()) {
                str2 = "romanesco-contacts-logger-full-upload-timestamp";
            }
            long j3 = a4.getLong(str2, 0);
            aoyh aoyh4 = apaj.f84014e;
            StringBuilder sb = new StringBuilder(50);
            sb.append("Last full upload time stamp : ");
            sb.append(j3);
            sb.toString();
            if (cgij.m145555m()) {
                try {
                    aoza aoza2 = new aoza(this.f83994a);
                    btem a5 = aoza2.mo47026a(false);
                    if (j3 == 0) {
                        j3 = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(cgij.m145556n());
                    }
                    bmxv = bmxv.m108566b(new aozn(a5.f148534a, aoza2.mo47027a(j3), aoza2.mo47029b(), !cgij.m145552j() ? new btfe[0] : aoza2.mo47031c()));
                } catch (aoyu | aoyv | InterruptedException e3) {
                    aoyh aoyh5 = apaj.f84014e;
                    String valueOf3 = String.valueOf(e3.getMessage());
                    aoyh5.mo46985d(valueOf3.length() == 0 ? new String("Failed query from ReadContactHelper: + ") : "Failed query from ReadContactHelper: + ".concat(valueOf3));
                    bmxv = bmvz.f131120a;
                }
            } else {
                aozn a6 = m69940c().mo47059a(this.f83994a.getResources(), 0, j3);
                if (!(a6 == null || (list = a6.f83949a) == null || list.isEmpty())) {
                    List list2 = a6.f83949a;
                    try {
                        cursor = this.f83994a.getContentResolver().query(ContactsContract.Data.CONTENT_URI, apaj.f84015f, null, null, "times_contacted DESC LIMIT 1000");
                    } catch (SQLiteException e4) {
                        if (cgjy.m145760g()) {
                            apaj.f84014e.mo46980a(e4, "CP2 query exception.");
                            cursor = null;
                        } else {
                            apaj.f84014e.mo46987e("CP2 query exception.", e4);
                            cursor = null;
                        }
                    }
                    if (cursor == null) {
                        apaj.f84014e.mo46983c("CP2 query failed.");
                    } else {
                        HashMap hashMap = new HashMap();
                        while (cursor.moveToNext()) {
                            hashMap.put(Long.valueOf(cursor.getLong(cursor.getColumnIndex("contact_id"))), Pair.create(Long.valueOf(cursor.getLong(cursor.getColumnIndex("times_contacted"))), Long.valueOf(cursor.getLong(cursor.getColumnIndex("last_time_contacted")))));
                        }
                        cursor.close();
                        int size = list2.size();
                        for (int i = 0; i < size; i++) {
                            apbc apbc = (apbc) list2.get(i);
                            Pair pair = (Pair) hashMap.get(Long.valueOf(apbc.f84086a));
                            if (pair == null) {
                                apaj.f84014e.mo46982b("Could not get TimesContacted for contact = %d", Long.valueOf(apbc.f84086a));
                            } else {
                                apbc.f84091f = (double) ((Long) pair.first).longValue();
                                apbc.f84092g = ((Long) pair.first).longValue();
                                apbc.f84093h = ((Long) pair.second).longValue();
                                Object[] objArr = {pair.first, pair.second, apbc.f84087b, Long.valueOf(apbc.f84086a)};
                            }
                        }
                    }
                }
                if (a6 == null) {
                    bmxv = bmvz.f131120a;
                } else {
                    if (cgij.m145552j()) {
                        try {
                            a6.f83953e = new aoza(this.f83994a).mo47031c();
                        } catch (aoyu | aoyv | InterruptedException e5) {
                            aoyh aoyh6 = apaj.f84014e;
                            String valueOf4 = String.valueOf(e5.getMessage());
                            aoyh6.mo46985d(valueOf4.length() == 0 ? new String("Failed query from ReadContactHelper.readGroupInfo: + ") : "Failed query from ReadContactHelper.readGroupInfo: + ".concat(valueOf4));
                        }
                    }
                    bmxv = bmxv.m108566b(a6);
                }
            }
        }
        if (bmxv.mo66813a()) {
            return (aozn) bmxv.mo66814b();
        }
        return null;
    }
}
