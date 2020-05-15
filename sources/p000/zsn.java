package p000;

import android.content.Context;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: zsn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zsn {

    /* renamed from: a */
    public static final srn f55817a = zvt.m46581a();

    /* renamed from: b */
    public static final bnic f55818b = bnic.m109489a("com.google.sensor.events");

    /* renamed from: c */
    public final sqv f55819c;

    /* renamed from: d */
    public final Context f55820d;

    /* renamed from: e */
    public final String f55821e;

    public zsn(sqv sqv, Context context, String str) {
        this.f55819c = sqv;
        this.f55820d = context;
        this.f55821e = str;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:20:0x00ce */
    /* JADX WARN: Type inference failed for: r4v16, assign insn: PHI: (r4v16 ?) = (r4v6 java.util.Iterator), (r4v26 ?) binds: [B:5:0x009a, B:20:0x00ce] */
    /* JADX WARN: Type inference failed for: r4v26, assign insn: PHI: (r4v26 ?) = (r4v28 ?), (r4v29 ?) binds: [B:19:0x00c9, B:18:0x00c6] */
    /* JADX WARN: Type inference failed for: r4v28, assign insn: 0x00cb: MOVE  (r4v28 ? I:?[OBJECT, ARRAY]) = (r3v13 java.lang.String) */
    /* JADX WARN: Type inference failed for: r4v29, assign insn: 0x00c6: MOVE  (r4v29 ? I:?[OBJECT, ARRAY]) = (r3v13 java.lang.String) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    public final boolean mo31441a(ztu ztu, zsg zsg, ytp ytp, int i, int i2) {
        String str;
        Iterator it;
        Map map;
        int i3;
        int i4;
        yqi yqi;
        caae caae;
        caae caae2;
        long j;
        ztu ztu2 = ztu;
        ytp ytp2 = ytp;
        zrf.m46035a(this.f55820d, this.f55821e).edit().putInt("num_attempts", i2 + 1).commit();
        ytq a = ytp2.mo30767a(this.f55820d);
        a.mo30762a(this.f55821e);
        a.mo30755a(411);
        a.mo30765d(2);
        a.mo30754a();
        long a2 = this.f55819c.mo20505a();
        String str2 = "zsn";
        try {
            bnsl bnsl = (bnsl) f55817a.mo68390d();
            bnsl.mo68432a(str2, "a", 85, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Removing existing levelDb files.");
            zsg.mo31429b();
            bnsl bnsl2 = (bnsl) f55817a.mo68390d();
            bnsl2.mo68432a(str2, "a", 89, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Migrating recent datapoints to levelDb.");
            long nanos = TimeUnit.MILLISECONDS.toNanos(this.f55819c.mo20505a()) - TimeUnit.HOURS.toNanos((long) i);
            Set h = ztu.mo31388h();
            Map k = ztu.mo31391k();
            yfy yfy = new yfy();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = h.iterator();
            while (it.hasNext()) {
                try {
                    caae caae3 = (caae) it.next();
                    bnic bnic = f55818b;
                    Iterator it3 = it;
                    caah caah = caae3.f172330f;
                    if (caah == null) {
                        caah = caah.f172333d;
                    }
                    if (!bnic.contains(caah.f172336b)) {
                        bnic bnic2 = zre.f55742a;
                        caah caah2 = caae3.f172330f;
                        if (caah2 == null) {
                            caah2 = caah.f172333d;
                        }
                        if (!bnic2.contains(caah2.f172336b)) {
                            it = str2;
                            j = nanos;
                        } else {
                            it = str2;
                            j = 0;
                        }
                        try {
                            yhd a3 = yhe.m44086a();
                            a3.mo30492b(j);
                            a3.mo30491a(Long.MAX_VALUE);
                            yfy.mo30453a(caae3, a3.mo30490a());
                            str2 = it;
                            it2 = it3;
                        } catch (IOException e) {
                            e = e;
                            ytp2 = ytp;
                            str = it;
                            try {
                                ytq a4 = ytp2.mo30767a(this.f55820d);
                                a4.mo30762a(this.f55821e);
                                a4.mo30755a(412);
                                a4.mo30765d(10);
                                a4.mo30754a();
                                bnsl bnsl3 = (bnsl) f55817a.mo68387b();
                                bnsl3.mo68437a(e);
                                bnsl3.mo68432a(str, "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl3.mo68405a("Error migrating recent datapoints to levelDb.");
                                zsg.close();
                                return false;
                            } catch (Throwable th) {
                                zsg.close();
                                throw th;
                            }
                        }
                    } else {
                        it2 = it3;
                    }
                } catch (IOException e2) {
                    e = e2;
                    ytp2 = ytp;
                    str = str2;
                    ytq a42 = ytp2.mo30767a(this.f55820d);
                    a42.mo30762a(this.f55821e);
                    a42.mo30755a(412);
                    a42.mo30765d(10);
                    a42.mo30754a();
                    bnsl bnsl32 = (bnsl) f55817a.mo68387b();
                    bnsl32.mo68437a(e);
                    bnsl32.mo68432a(str, "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl32.mo68405a("Error migrating recent datapoints to levelDb.");
                    zsg.close();
                    return false;
                }
            }
            String str3 = str2;
            bnre i5 = ztu2.mo31362a(yfy.mo30452a()).listIterator();
            int i6 = 0;
            int i7 = 0;
            while (i5.hasNext()) {
                cadp cadp = (cadp) i5.next();
                cadp.f172714c.size();
                caae caae4 = cadp.f172713b;
                if (caae4 == null) {
                    caae caae5 = caae.f172323i;
                }
                bnre bnre = i5;
                bxwc bxwc = cadp.f172714c;
                if (caae4 == null) {
                    caae4 = caae.f172323i;
                }
                String str4 = str3;
                try {
                    zsg.mo31422a(bxwc, caae4);
                    int size = i6 + cadp.f172714c.size();
                    int i8 = i7 + 1;
                    bnic bnic3 = zre.f55742a;
                    caae caae6 = cadp.f172713b;
                    if (caae6 == null) {
                        caae6 = caae.f172323i;
                    }
                    caah caah3 = caae6.f172330f;
                    if (caah3 == null) {
                        caah3 = caah.f172333d;
                    }
                    if (!bnic3.contains(caah3.f172336b)) {
                        caae caae7 = cadp.f172713b;
                        if (caae7 == null) {
                            caae7 = caae.f172323i;
                        }
                        yqi yqi2 = (yqi) k.get(caae7);
                        if (yqi2 != null) {
                            i4 = size;
                            caae caae8 = cadp.f172713b;
                            if (caae8 != null) {
                                caae = caae8;
                            } else {
                                caae = caae.f172323i;
                            }
                            i3 = i8;
                            map = k;
                            yqi = new yqi(caae, yqi2.f54391b, Math.max(nanos, yqi2.f54392c), yqi2.f54393d);
                        } else if (cadp.f172714c.size() != 0) {
                            caae caae9 = cadp.f172713b;
                            if (caae9 != null) {
                                caae2 = caae9;
                            } else {
                                caae2 = caae.f172323i;
                            }
                            i4 = size;
                            yqi = new yqi(caae2, -1, ((cadn) cadp.f172714c.get(0)).f172702b, null);
                            map = k;
                            i3 = i8;
                        } else {
                            i4 = size;
                            map = k;
                            i3 = i8;
                        }
                        arrayList.add(yqi);
                    } else {
                        i4 = size;
                        map = k;
                        i3 = i8;
                    }
                    i5 = bnre;
                    i6 = i4;
                    str3 = str4;
                    i7 = i3;
                    k = map;
                } catch (IOException e3) {
                    e = e3;
                    ytp2 = ytp;
                    str = str4;
                    ytq a422 = ytp2.mo30767a(this.f55820d);
                    a422.mo30762a(this.f55821e);
                    a422.mo30755a(412);
                    a422.mo30765d(10);
                    a422.mo30754a();
                    bnsl bnsl322 = (bnsl) f55817a.mo68387b();
                    bnsl322.mo68437a(e);
                    bnsl322.mo68432a(str, "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl322.mo68405a("Error migrating recent datapoints to levelDb.");
                    zsg.close();
                    return false;
                }
            }
            String str5 = str3;
            ztu2.mo31386b((List) arrayList);
            zsg.close();
            long a5 = this.f55819c.mo20505a() - a2;
            bnsl bnsl4 = (bnsl) f55817a.mo68390d();
            bnsl4.mo68432a(str5, "a", 184, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68415a("Time to migrate datasource datapoints from sqlite to leveldb: %d", a5);
            ytq a6 = ytp.mo30767a(this.f55820d);
            a6.mo30762a(this.f55821e);
            a6.mo30755a(412);
            a6.mo30765d(2);
            a6.mo30756a(a5);
            a6.mo30763b(i6);
            a6.mo30764c(i7);
            a6.mo30754a();
            zrf.m46035a(this.f55820d, this.f55821e).edit().putBoolean("is_migratedv2", true).commit();
            return true;
        } catch (IOException e4) {
            e = e4;
            str = str2;
            ytq a4222 = ytp2.mo30767a(this.f55820d);
            a4222.mo30762a(this.f55821e);
            a4222.mo30755a(412);
            a4222.mo30765d(10);
            a4222.mo30754a();
            bnsl bnsl3222 = (bnsl) f55817a.mo68387b();
            bnsl3222.mo68437a(e);
            bnsl3222.mo68432a(str, "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3222.mo68405a("Error migrating recent datapoints to levelDb.");
            zsg.close();
            return false;
        }
    }
}
