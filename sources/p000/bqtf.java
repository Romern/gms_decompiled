package p000;

import java.security.interfaces.ECPublicKey;

/* renamed from: bqtf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqtf extends bqnq {
    public bqtf(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo69296a(Object obj) {
        bqrl bqrl = (bqrl) obj;
        bqrj bqrj = bqrl.f141451b;
        if (bqrj == null) {
            bqrj = bqrj.f141438d;
        }
        int b = bqrw.m113300b(bqrj.f141441b);
        int i = 1;
        if (b == 0) {
            b = 1;
        }
        ECPublicKey a = bqvm.m113478a(bqua.m113410b(b), bqrl.f141452c.mo73780k(), bqrl.f141453d.mo73780k());
        bqrj bqrj2 = bqrl.f141451b;
        if (bqrj2 == null) {
            bqrj2 = bqrj.f141438d;
        }
        int b2 = bqry.m113304b(bqrj2.f141440a);
        if (b2 == 0) {
            b2 = 1;
        }
        int a2 = bqua.m113406a(b2);
        bqrj bqrj3 = bqrl.f141451b;
        if (bqrj3 == null) {
            bqrj3 = bqrj.f141438d;
        }
        int b3 = bqrm.m113289b(bqrj3.f141442c);
        if (b3 != 0) {
            i = b3;
        }
        bqua.m113411c(i);
        return new bquw(a, a2);
    }
}
