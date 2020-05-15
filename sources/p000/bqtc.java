package p000;

import java.security.interfaces.ECPrivateKey;

/* renamed from: bqtc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqtc extends bqnq {
    public bqtc(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo69296a(Object obj) {
        bqrk bqrk = (bqrk) obj;
        bqrl bqrl = bqrk.f141446b;
        if (bqrl == null) {
            bqrl = bqrl.f141448e;
        }
        bqrj bqrj = bqrl.f141451b;
        if (bqrj == null) {
            bqrj = bqrj.f141438d;
        }
        int b = bqrw.m113300b(bqrj.f141441b);
        int i = 1;
        if (b == 0) {
            b = 1;
        }
        ECPrivateKey a = bqvm.m113477a(bqua.m113410b(b), bqrk.f141447c.mo73780k());
        bqrl bqrl2 = bqrk.f141446b;
        if (bqrl2 == null) {
            bqrl2 = bqrl.f141448e;
        }
        bqrj bqrj2 = bqrl2.f141451b;
        if (bqrj2 == null) {
            bqrj2 = bqrj.f141438d;
        }
        int b2 = bqry.m113304b(bqrj2.f141440a);
        if (b2 == 0) {
            b2 = 1;
        }
        int a2 = bqua.m113406a(b2);
        bqrl bqrl3 = bqrk.f141446b;
        if (bqrl3 == null) {
            bqrl3 = bqrl.f141448e;
        }
        bqrj bqrj3 = bqrl3.f141451b;
        if (bqrj3 == null) {
            bqrj3 = bqrj.f141438d;
        }
        int b3 = bqrm.m113289b(bqrj3.f141442c);
        if (b3 != 0) {
            i = b3;
        }
        return new bquv(a, a2, bqua.m113411c(i));
    }
}
