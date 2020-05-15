package p000;

import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: xzj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xzj implements Callable {

    /* renamed from: a */
    final /* synthetic */ xzp f53454a;

    public xzj(xzp xzp) {
        this.f53454a = xzp;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        if (!rfy.m33550g(this.f53454a.f53471m) || !cdve.m135097b()) {
            xzp xzp = this.f53454a;
            xay xay = xzp.f52307e;
            xwj xwj = xzp.f52305c;
            Set c = xzp.f52306d.mo30219a().mo18802c();
            xzp xzp2 = this.f53454a;
            return xay.mo29596a(xwj, c, xzp2.f53472n, xzp2.f52314l);
        }
        xzp.f53470o.mo25414c("Skipping appId validation", new Object[0]);
        return bmxv.m108566b(this.f53454a.f53472n.toString());
    }
}
