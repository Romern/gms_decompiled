package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* renamed from: mam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mam implements bqfp {

    /* renamed from: a */
    final /* synthetic */ mao f33347a;

    /* renamed from: b */
    private final int f33348b;

    public mam(mao mao, int i) {
        this.f33347a = mao;
        this.f33348b = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Void voidR = (Void) obj;
        synchronized (this.f33347a) {
            mao.f33349a.mo25414c("Successfully switched from %s to %s", mao.m24769a(this.f33347a.f33351b), mao.m24769a(this.f33348b));
            mao mao = this.f33347a;
            mao.f33351b = this.f33348b;
            mao.f33355g = null;
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        synchronized (this.f33347a) {
            if (th instanceof TimeoutException) {
                mao.f33349a.mo25417e("Timeout after %d ms switching from %s to %s", th, Long.valueOf(cckw.m130272j()), mao.m24769a(this.f33347a.f33351b), mao.m24769a(this.f33348b));
            } else if (th instanceof CancellationException) {
                mao.f33349a.mo25417e("Cancellation switching from %s to %s", th, mao.m24769a(this.f33347a.f33351b), mao.m24769a(this.f33348b));
            } else {
                mao.f33349a.mo25417e("Error while switching from %s to %s", th, mao.m24769a(this.f33347a.f33351b), mao.m24769a(this.f33348b));
            }
            mao mao = this.f33347a;
            mao.f33352c = mao.f33351b;
            mao.f33355g = null;
        }
    }
}
