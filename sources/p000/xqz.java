package p000;

import android.net.Uri;
import java.util.HashSet;
import java.util.concurrent.Callable;

/* renamed from: xqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xqz implements Callable {

    /* renamed from: a */
    final /* synthetic */ Uri f52955a;

    /* renamed from: b */
    final /* synthetic */ xrf f52956b;

    public xqz(xrf xrf, Uri uri) {
        this.f52956b = xrf;
        this.f52955a = uri;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        if (!rfy.m33550g(this.f52956b.f52975m) || !cdve.m135097b()) {
            xrf xrf = this.f52956b;
            xay xay = xrf.f52307e;
            xwj xwj = xrf.f52305c;
            HashSet a = bnpf.m110050a(this.f52955a);
            xrf xrf2 = this.f52956b;
            return xay.mo29596a(xwj, a, xrf2.f52976n, xrf2.f52314l);
        }
        xrf.f52973q.mo25414c("Skipping appId validation", new Object[0]);
        return bmxv.m108566b(this.f52956b.f52976n.toString());
    }
}
