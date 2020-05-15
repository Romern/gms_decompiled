package p000;

import java.util.concurrent.CancellationException;

/* renamed from: ascf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ascf implements bqfp {

    /* renamed from: a */
    final /* synthetic */ ascg f88690a;

    public ascf(ascg ascg) {
        this.f88690a = ascg;
    }

    /* renamed from: a */
    public final void mo6480a(Object obj) {
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        if (!(th instanceof CancellationException)) {
            this.f88690a.mo48248a(th.toString());
        }
    }
}
