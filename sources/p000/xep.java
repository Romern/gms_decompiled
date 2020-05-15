package p000;

import java.util.concurrent.TimeoutException;

/* renamed from: xep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class xep implements bqfp {

    /* renamed from: b */
    final /* synthetic */ xeq f52077b;

    public xep(xeq xeq) {
        this.f52077b = xeq;
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        int i;
        if (!(th instanceof TimeoutException)) {
            i = adbe.m50109a(th).f61236a;
        } else {
            i = 34005;
        }
        this.f52077b.mo29688a(i);
        this.f52077b.mo29689a(xej.m42772c());
    }
}
