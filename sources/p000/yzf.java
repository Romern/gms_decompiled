package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: yzf */
final /* synthetic */ class yzf implements yzl {

    /* renamed from: a */
    private final yzp f54843a;

    public yzf(yzp yzp) {
        this.f54843a = yzp;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [zry, zre], assign insn: 0x036b: CONSTRUCTOR  (r0v14 ? I:zry) = (r5v0 ztu), (r13v0 zsg) call: zry.<init>(ztu, zsg):void type: CONSTRUCTOR */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0370  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final Object mo30865a(String str) {
        zsm zsm;
        zsm zsm2;
        String str2;
        yzp yzp;
        yzp yzp2;
        String str3;
        ytp ytp;
        int i;
        String str4;
        String str5;
        Map map;
        int i2;
        yqi yqi;
        caae caae;
        caae caae2;
        ytp ytp2;
        long j;
        String str6 = str;
        yzp yzp3 = this.f54843a;
        yzp.m45080m("Can't init Fitness Store in main thread");
        ztl b = yzp3.mo30875b(str6);
        if (cdzd.f182003a.mo6606a().mo78541H()) {
            zsm = zsm.m46221a(yzp3.f54857c, yzp3.f54858d, (int) cdzd.m135481j(), cdzd.m135480i(), (int) cdzd.m135482k(), (int) cdzd.m135478g(), (int) cdzd.m135479h(), yzp3.mo30889j(), yzp3.mo30874b(), srb.f45012a);
        } else {
            zsm = null;
        }
        ztu ztu = new ztu(b, srb.f45012a, zvn.m46574a(yzp3.f54857c));
        String str7 = "is_migratedv2";
        boolean z = false;
        if (cdzg.f182074a.mo6606a().mo78604a()) {
            boolean z2 = zrf.m46035a(yzp3.f54857c, str6).getBoolean(str7, false);
            int i3 = zrf.m46035a(yzp3.f54857c, str6).getInt("num_attempts", 0);
            int f = (int) cdzv.f182107a.mo6606a().mo78637f();
            zsg zsg = new zsg(yzp3.f54857c, str6, yzp3.mo30887i());
            if (z2) {
                zsm2 = zsm;
                str2 = str6;
                yzp = yzp3;
            } else if (f <= 0) {
                zsm2 = zsm;
                str2 = str6;
                yzp = yzp3;
                z = false;
            } else if (i3 < ((int) cdzv.f182107a.mo6606a().mo78636e())) {
                zsn zsn = new zsn(srb.f45012a, yzp3.f54857c, str6);
                ytp i4 = yzp3.mo30887i();
                zrf.m46035a(zsn.f55820d, zsn.f55821e).edit().putInt("num_attempts", i3 + 1).commit();
                ytq a = i4.mo30767a(zsn.f55820d);
                a.mo30762a(zsn.f55821e);
                a.mo30755a(411);
                a.mo30765d(2);
                a.mo30754a();
                long a2 = zsn.f55819c.mo20505a();
                String str8 = "zsn";
                String str9 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                try {
                    bnsl bnsl = (bnsl) zsn.f55817a.mo68390d();
                    bnsl.mo68432a(str8, "a", 85, str9);
                    bnsl.mo68405a("Removing existing levelDb files.");
                    zsg.mo31429b();
                    bnsl bnsl2 = (bnsl) zsn.f55817a.mo68390d();
                    bnsl2.mo68432a(str8, "a", 89, str9);
                    bnsl2.mo68405a("Migrating recent datapoints to levelDb.");
                    yzp yzp4 = yzp3;
                    zsm2 = zsm;
                    try {
                        long nanos = TimeUnit.MILLISECONDS.toNanos(zsn.f55819c.mo20505a()) - TimeUnit.HOURS.toNanos((long) f);
                        Set h = ztu.mo31388h();
                        Map k = ztu.mo31391k();
                        yfy yfy = new yfy();
                        ArrayList arrayList = new ArrayList();
                        Iterator it = h.iterator();
                        while (it.hasNext()) {
                            Iterator it2 = it;
                            caae caae3 = (caae) it.next();
                            yzp2 = yzp4;
                            try {
                                bnic bnic = zsn.f55818b;
                                String str10 = str7;
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
                                        j = nanos;
                                    } else {
                                        j = 0;
                                    }
                                    ytp2 = i4;
                                    try {
                                        yhd a3 = yhe.m44086a();
                                        a3.mo30492b(j);
                                        a3.mo30491a(Long.MAX_VALUE);
                                        yfy.mo30453a(caae3, a3.mo30490a());
                                        yzp4 = yzp2;
                                        it = it2;
                                        str7 = str10;
                                        i4 = ytp2;
                                    } catch (IOException e) {
                                        e = e;
                                        str3 = str8;
                                        ytp = ytp2;
                                        try {
                                            ytq a4 = ytp.mo30767a(zsn.f55820d);
                                            a4.mo30762a(zsn.f55821e);
                                            a4.mo30755a(412);
                                            a4.mo30765d(10);
                                            a4.mo30754a();
                                            bnsl bnsl3 = (bnsl) zsn.f55817a.mo68387b();
                                            bnsl3.mo68437a(e);
                                            bnsl3.mo68432a(str3, "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER, str9);
                                            bnsl3.mo68405a("Error migrating recent datapoints to levelDb.");
                                            zsg.close();
                                            str2 = str;
                                            yzp = yzp2;
                                            z = false;
                                            ? zry = new zry(ztu, zsg);
                                            if (z) {
                                            }
                                            ztu = zry;
                                            return zua.m46422a(new zsj(ztu, str2, zsm2));
                                        } catch (Throwable th) {
                                            zsg.close();
                                            throw th;
                                        }
                                    }
                                } else {
                                    ytp2 = i4;
                                    yzp4 = yzp2;
                                    it = it2;
                                    str7 = str10;
                                }
                            } catch (IOException e2) {
                                e = e2;
                                str3 = str8;
                                ytp = i4;
                                ytq a42 = ytp.mo30767a(zsn.f55820d);
                                a42.mo30762a(zsn.f55821e);
                                a42.mo30755a(412);
                                a42.mo30765d(10);
                                a42.mo30754a();
                                bnsl bnsl32 = (bnsl) zsn.f55817a.mo68387b();
                                bnsl32.mo68437a(e);
                                bnsl32.mo68432a(str3, "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER, str9);
                                bnsl32.mo68405a("Error migrating recent datapoints to levelDb.");
                                zsg.close();
                                str2 = str;
                                yzp = yzp2;
                                z = false;
                                ? zry2 = new zry(ztu, zsg);
                                if (z) {
                                }
                                ztu = zry2;
                                return zua.m46422a(new zsj(ztu, str2, zsm2));
                            }
                        }
                        String str11 = str7;
                        yzp2 = yzp4;
                        ytp ytp3 = i4;
                        bnre i5 = ztu.mo31362a(yfy.mo30452a()).listIterator();
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
                                    map = k;
                                    i = size;
                                    caae caae8 = cadp.f172713b;
                                    if (caae8 != null) {
                                        caae = caae8;
                                    } else {
                                        caae = caae.f172323i;
                                    }
                                    i2 = i8;
                                    str4 = str9;
                                    str5 = str8;
                                    try {
                                        yqi = new yqi(caae, yqi2.f54391b, Math.max(nanos, yqi2.f54392c), yqi2.f54393d);
                                    } catch (IOException e3) {
                                        e = e3;
                                        ytp = ytp3;
                                        str3 = str5;
                                        str9 = str4;
                                        ytq a422 = ytp.mo30767a(zsn.f55820d);
                                        a422.mo30762a(zsn.f55821e);
                                        a422.mo30755a(412);
                                        a422.mo30765d(10);
                                        a422.mo30754a();
                                        bnsl bnsl322 = (bnsl) zsn.f55817a.mo68387b();
                                        bnsl322.mo68437a(e);
                                        bnsl322.mo68432a(str3, "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER, str9);
                                        bnsl322.mo68405a("Error migrating recent datapoints to levelDb.");
                                        zsg.close();
                                        str2 = str;
                                        yzp = yzp2;
                                        z = false;
                                        ? zry22 = new zry(ztu, zsg);
                                        if (z) {
                                        }
                                        ztu = zry22;
                                        return zua.m46422a(new zsj(ztu, str2, zsm2));
                                    }
                                } else if (cadp.f172714c.size() != 0) {
                                    caae caae9 = cadp.f172713b;
                                    if (caae9 != null) {
                                        caae2 = caae9;
                                    } else {
                                        caae2 = caae.f172323i;
                                    }
                                    map = k;
                                    i = size;
                                    yqi = new yqi(caae2, -1, ((cadn) cadp.f172714c.get(0)).f172702b, null);
                                    i2 = i8;
                                    str4 = str9;
                                    str5 = str8;
                                } else {
                                    map = k;
                                    i = size;
                                    i2 = i8;
                                    str4 = str9;
                                    str5 = str8;
                                }
                                arrayList.add(yqi);
                            } else {
                                map = k;
                                i = size;
                                i2 = i8;
                                str4 = str9;
                                str5 = str8;
                            }
                            i7 = i2;
                            k = map;
                            i5 = bnre;
                            str8 = str5;
                            str9 = str4;
                            i6 = i;
                        }
                        String str12 = str9;
                        String str13 = str8;
                        ztu.mo31386b((List) arrayList);
                        zsg.close();
                        long a5 = zsn.f55819c.mo20505a() - a2;
                        bnsl bnsl4 = (bnsl) zsn.f55817a.mo68390d();
                        bnsl4.mo68432a(str13, "a", 184, str12);
                        bnsl4.mo68415a("Time to migrate datasource datapoints from sqlite to leveldb: %d", a5);
                        ytq a6 = ytp3.mo30767a(zsn.f55820d);
                        a6.mo30762a(zsn.f55821e);
                        a6.mo30755a(412);
                        a6.mo30765d(2);
                        a6.mo30756a(a5);
                        a6.mo30763b(i6);
                        a6.mo30764c(i7);
                        a6.mo30754a();
                        zrf.m46035a(zsn.f55820d, zsn.f55821e).edit().putBoolean(str11, true).commit();
                        str2 = str;
                        yzp = yzp2;
                        z = false;
                    } catch (IOException e4) {
                        e = e4;
                        yzp2 = yzp4;
                        str3 = str8;
                        ytp = i4;
                        ytq a4222 = ytp.mo30767a(zsn.f55820d);
                        a4222.mo30762a(zsn.f55821e);
                        a4222.mo30755a(412);
                        a4222.mo30765d(10);
                        a4222.mo30754a();
                        bnsl bnsl3222 = (bnsl) zsn.f55817a.mo68387b();
                        bnsl3222.mo68437a(e);
                        bnsl3222.mo68432a(str3, "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER, str9);
                        bnsl3222.mo68405a("Error migrating recent datapoints to levelDb.");
                        zsg.close();
                        str2 = str;
                        yzp = yzp2;
                        z = false;
                        ? zry222 = new zry(ztu, zsg);
                        if (z) {
                        }
                        ztu = zry222;
                        return zua.m46422a(new zsj(ztu, str2, zsm2));
                    }
                } catch (IOException e5) {
                    e = e5;
                    yzp2 = yzp3;
                    zsm2 = zsm;
                    str3 = str8;
                    ytp = i4;
                    ytq a42222 = ytp.mo30767a(zsn.f55820d);
                    a42222.mo30762a(zsn.f55821e);
                    a42222.mo30755a(412);
                    a42222.mo30765d(10);
                    a42222.mo30754a();
                    bnsl bnsl32222 = (bnsl) zsn.f55817a.mo68387b();
                    bnsl32222.mo68437a(e);
                    bnsl32222.mo68432a(str3, "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER, str9);
                    bnsl32222.mo68405a("Error migrating recent datapoints to levelDb.");
                    zsg.close();
                    str2 = str;
                    yzp = yzp2;
                    z = false;
                    ? zry2222 = new zry(ztu, zsg);
                    if (z) {
                    }
                    ztu = zry2222;
                    return zua.m46422a(new zsj(ztu, str2, zsm2));
                }
            } else {
                zsm2 = zsm;
                yzp = yzp3;
                str2 = str;
                zrf.m46035a(yzp.f54857c, str2).edit().putBoolean(str7, true).commit();
                z = true;
            }
            ? zry22222 = new zry(ztu, zsg);
            if (z) {
                zry22222.mo31379g();
                zuw.m46537c(yzp.f54857c, str2);
            }
            ztu = zry22222;
        } else {
            zsm2 = zsm;
            str2 = str6;
            zrf.m46035a(yzp3.f54857c, str2).edit().putBoolean(str7, false).commit();
        }
        return zua.m46422a(new zsj(ztu, str2, zsm2));
    }
}
