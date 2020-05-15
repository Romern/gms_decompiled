package p000;

import android.content.ContentValues;
import android.content.res.Resources;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: alra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alra implements alqz {

    /* renamed from: a */
    private final alqm f74146a;

    static {
        int i = alpz.f74048a;
    }

    public alra(alqm alqm) {
        this.f74146a = alqm;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final alqp mo40665a(Resources resources, long j, long j2) {
        Pair pair;
        Resources resources2 = resources;
        long j3 = j;
        amig.m62939a();
        HashSet hashSet = new HashSet();
        long j4 = 0;
        if (j3 <= 0) {
            String valueOf = String.valueOf(Integer.valueOf((int) cgbe.f186279a.mo6606a().mo83458l()));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("times_contacted DESC LIMIT ");
            sb.append(valueOf);
            pair = this.f74146a.mo40653a(resources2, "", sb.toString());
            if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83470x()).booleanValue()) {
                this.f74146a.mo40654a(j2 == 0 ? System.currentTimeMillis() - TimeUnit.DAYS.toMillis((long) Integer.valueOf((int) cgbe.f186279a.mo6606a().mo83469w()).intValue()) : j2, hashSet);
            }
        } else {
            String valueOf2 = String.valueOf(Integer.valueOf((int) cgbe.f186279a.mo6606a().mo83304ah()));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 12);
            sb2.append(" DESC LIMIT ");
            sb2.append(valueOf2);
            String sb3 = sb2.toString();
            alqm alqm = this.f74146a;
            String valueOf3 = String.valueOf(sb3);
            String str = valueOf3.length() == 0 ? new String("contact_last_updated_timestamp") : "contact_last_updated_timestamp".concat(valueOf3);
            sdo.m34970a(true);
            StringBuilder sb4 = new StringBuilder(51);
            sb4.append("contact_last_updated_timestamp>");
            sb4.append(j3);
            pair = alqm.mo40653a(resources2, sb4.toString(), str);
            if (!Boolean.valueOf(cgbe.f186279a.mo6606a().mo83303ag()).booleanValue()) {
                this.f74146a.mo40654a(j3, hashSet);
            } else {
                String valueOf4 = String.valueOf(Integer.valueOf((int) cgbe.f186279a.mo6606a().mo83302af()));
                StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf4).length() + 12);
                sb5.append(" DESC LIMIT ");
                sb5.append(valueOf4);
                String sb6 = sb5.toString();
                alqm alqm2 = this.f74146a;
                String valueOf5 = String.valueOf(sb6);
                alqm2.mo40655a(j3, hashSet, valueOf5.length() == 0 ? new String("contact_deleted_timestamp") : "contact_deleted_timestamp".concat(valueOf5));
            }
        }
        alqb alqb = (alqb) pair.first;
        ArrayList arrayList = new ArrayList();
        while (alqb.hasNext()) {
            try {
                alqa alqa = (alqa) alqb.next();
                ContentValues contentValues = alqa.f74049a;
                if (alqd.m61509a(contentValues) == j4) {
                    j4 = 0;
                } else if (contentValues.get("lookup_key") == null) {
                    j4 = 0;
                } else if (contentValues.get("display_name") != null) {
                    long a = alqd.m61509a(contentValues);
                    ContentValues contentValues2 = alqa.f74049a;
                    alre alre = new alre(contentValues2.getAsLong("contact_id").longValue(), contentValues2.getAsString("display_name"));
                    alre.f74163i.add(contentValues2.getAsString("nickname"));
                    alre.f74160f = (double) contentValues2.getAsInteger("score").intValue();
                    ContentValues contentValues3 = alqa.f74050b;
                    alre.f74161g = contentValues3.getAsLong("TIMES_CONTACTED").longValue();
                    alre.f74162h = contentValues3.getAsLong("LAST_TIME_CONTACTED").longValue();
                    ArrayList arrayList2 = new ArrayList();
                    for (ContentValues contentValues4 : alqa.f74051c.values()) {
                        arrayList2.add(new alqo(contentValues4.getAsString("email"), contentValues4.getAsString("label")));
                    }
                    alre.f74158d.clear();
                    alre.f74158d.addAll(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    for (ContentValues contentValues5 : alqa.f74052d.values()) {
                        arrayList3.add(new alqo(contentValues5.getAsString("phone"), contentValues5.getAsString("label")));
                    }
                    alre.f74157c.clear();
                    alre.f74157c.addAll(arrayList3);
                    ArrayList arrayList4 = new ArrayList();
                    for (ContentValues contentValues6 : alqa.f74053e.values()) {
                        arrayList4.add(new alqo(contentValues6.getAsString("postal"), contentValues6.getAsString("label")));
                    }
                    alre.f74159e.clear();
                    alre.f74159e.addAll(arrayList4);
                    arrayList.add(alre);
                    hashSet.remove(Long.valueOf(a));
                    j4 = 0;
                } else {
                    j4 = 0;
                }
            } catch (Throwable th) {
                alqb.mo40640a();
                throw th;
            }
        }
        alqb.mo40640a();
        if (alqb.mo40641b()) {
            return new alqp(arrayList, hashSet);
        }
        return null;
    }
}
