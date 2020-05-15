package p000;

import java.util.concurrent.CountDownLatch;

/* renamed from: sht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sht extends chqr {

    /* renamed from: a */
    public chuv f44501a;

    /* renamed from: b */
    public Object f44502b;

    /* renamed from: c */
    public final CountDownLatch f44503c = new CountDownLatch(1);

    /* renamed from: a */
    public final void mo25569a(chtr chtr) {
    }

    /* renamed from: a */
    public final void mo25570a(chuv chuv, chtr chtr) {
        if (chuv == null) {
            this.f44501a = chuv.f189228o.mo85687a("Null status returned for unary call");
        } else {
            if (chuv.mo85689a() && this.f44502b == null) {
                chuv = chuv.f189228o.mo85687a("No value received for unary call");
            }
            this.f44501a = chuv;
        }
        this.f44503c.countDown();
    }

    /* renamed from: a */
    public final void mo25571a(Object obj) {
        if (this.f44502b == null) {
            this.f44502b = obj;
            return;
        }
        throw chuv.f189228o.mo85687a("More than one value received for unary call").mo85691b();
    }
}
