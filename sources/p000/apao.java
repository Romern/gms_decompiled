package p000;

import android.content.ContentValues;
import android.content.res.Resources;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: apao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apao implements apan {

    /* renamed from: b */
    private static final boolean f84038b = true;

    /* renamed from: a */
    private final apay f84039a;

    static {
        aoyh.m69805a("ContactsLoggerHelper");
        int i = apaa.f83970a;
    }

    public apao(apay apay) {
        this.f84039a = apay;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final aozn mo47059a(Resources resources, long j, long j2) {
        Pair pair;
        Resources resources2 = resources;
        long j3 = j;
        HashSet hashSet = new HashSet();
        long j4 = 0;
        if (j3 <= 0) {
            long c = cgij.f186992a.mo6606a().mo83867c();
            StringBuilder sb = new StringBuilder(61);
            sb.append("starred DESC, times_contacted DESC LIMIT ");
            sb.append(c);
            pair = this.f84039a.mo47069a(resources2, "", sb.toString());
            if (cgij.f186992a.mo6606a().mo83886v() && f84038b) {
                this.f84039a.mo47070a(j2 == 0 ? System.currentTimeMillis() - TimeUnit.DAYS.toMillis(cgij.m145556n()) : j2, hashSet);
            }
        } else if (!f84038b) {
            return null;
        } else {
            long B = cgij.f186992a.mo6606a().mo83851B();
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(" DESC LIMIT ");
            sb2.append(B);
            String sb3 = sb2.toString();
            apay apay = this.f84039a;
            String valueOf = String.valueOf(sb3);
            String str = valueOf.length() == 0 ? new String("contact_last_updated_timestamp") : "contact_last_updated_timestamp".concat(valueOf);
            sdo.m34970a(apay.f84080b);
            StringBuilder sb4 = new StringBuilder(51);
            sb4.append("contact_last_updated_timestamp>");
            sb4.append(j3);
            pair = apay.mo47069a(resources2, sb4.toString(), str);
            if (cgij.f186992a.mo6606a().mo83850A()) {
                long z = cgij.f186992a.mo6606a().mo83890z();
                StringBuilder sb5 = new StringBuilder(32);
                sb5.append(" DESC LIMIT ");
                sb5.append(z);
                String sb6 = sb5.toString();
                apay apay2 = this.f84039a;
                String valueOf2 = String.valueOf(sb6);
                apay2.mo47071a(j3, hashSet, valueOf2.length() == 0 ? new String("contact_deleted_timestamp") : "contact_deleted_timestamp".concat(valueOf2));
            } else {
                this.f84039a.mo47070a(j3, hashSet);
            }
        }
        apac apac = (apac) pair.first;
        ArrayList arrayList = new ArrayList();
        while (apac.hasNext()) {
            try {
                apab apab = (apab) apac.next();
                ContentValues contentValues = apab.f83971a;
                if (apae.m69937a(contentValues) == j4) {
                    j4 = 0;
                } else if (contentValues.get("lookup_key") == null) {
                    j4 = 0;
                } else if (contentValues.get("display_name") != null) {
                    long a = apae.m69937a(contentValues);
                    ContentValues contentValues2 = apab.f83971a;
                    apbc apbc = new apbc(contentValues2.getAsLong("contact_id").longValue(), contentValues2.getAsString("display_name"));
                    apbc.f84094i.add(contentValues2.getAsString("nickname"));
                    apbc.f84091f = (double) contentValues2.getAsInteger("score").intValue();
                    if (!cgij.m145547e()) {
                        ContentValues contentValues3 = apab.f83972b;
                        apbc.f84092g = contentValues3.getAsLong("TIMES_CONTACTED").longValue();
                        apbc.f84093h = contentValues3.getAsLong("LAST_TIME_CONTACTED").longValue();
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (ContentValues contentValues4 : apab.f83973c.values()) {
                        arrayList2.add(new aozm(contentValues4.getAsString("email"), contentValues4.getAsString("label")));
                    }
                    apbc.f84089d.clear();
                    apbc.f84089d.addAll(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    for (ContentValues contentValues5 : apab.f83974d.values()) {
                        arrayList3.add(new aozm(contentValues5.getAsString("phone"), contentValues5.getAsString("label")));
                    }
                    apbc.f84088c.clear();
                    apbc.f84088c.addAll(arrayList3);
                    ArrayList arrayList4 = new ArrayList();
                    for (ContentValues contentValues6 : apab.f83975e.values()) {
                        arrayList4.add(new aozm(contentValues6.getAsString("postal"), contentValues6.getAsString("label")));
                    }
                    apbc.f84090e.clear();
                    apbc.f84090e.addAll(arrayList4);
                    arrayList.add(apbc);
                    hashSet.remove(Long.valueOf(a));
                    j4 = 0;
                } else {
                    j4 = 0;
                }
            } catch (Throwable th) {
                apac.mo47049a();
                throw th;
            }
        }
        apac.mo47049a();
        if (apac.mo47050b()) {
            return new aozn(arrayList, hashSet);
        }
        return null;
    }
}
