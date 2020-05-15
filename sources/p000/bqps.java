package p000;

import java.security.interfaces.ECPublicKey;

/* renamed from: bqps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqps extends bqnq {
    public bqps(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo69296a(Object obj) {
        bqrr bqrr = (bqrr) obj;
        bqrp bqrp = bqrr.f141473b;
        if (bqrp == null) {
            bqrp = bqrp.f141460d;
        }
        bqrs bqrs = bqrp.f141462a;
        if (bqrs == null) {
            bqrs = bqrs.f141476d;
        }
        int b = bqrw.m113300b(bqrs.f141478a);
        int i = 1;
        if (b == 0) {
            b = 1;
        }
        ECPublicKey a = bqvm.m113478a(bqqb.m113229b(b), bqrr.f141474c.getKey(), bqrr.f141475d.getKey());
        bqrn bqrn = bqrp.f141463b;
        if (bqrn == null) {
            bqrn = bqrn.f141454b;
        }
        bqsf bqsf = bqrn.f141456a;
        if (bqsf == null) {
            bqsf = bqsf.f141514d;
        }
        bqqc bqqc = new bqqc(bqsf);
        byte[] k = bqrs.f141480c.getKey();
        int b2 = bqry.m113304b(bqrs.f141479b);
        if (b2 == 0) {
            b2 = 1;
        }
        String a2 = bqqb.m113227a(b2);
        int b3 = bqrh.m113283b(bqrp.f141464c);
        if (b3 != 0) {
            i = b3;
        }
        return new bquz(a, k, a2, bqqb.m113230c(i), bqqc);
    }
}
