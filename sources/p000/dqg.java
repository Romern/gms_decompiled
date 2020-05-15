package p000;

import android.os.SystemClock;
import java.util.concurrent.Executor;

/* renamed from: dqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dqg implements dqb {

    /* renamed from: a */
    private final snr f13814a;

    public dqg(sns sns) {
        this.f13814a = new snr(sns);
    }

    /* renamed from: a */
    public final Executor mo9432a(dqx dqx) {
        return new dqe(this, dqx);
    }

    /* renamed from: a */
    public final void mo9433a(Runnable runnable) {
        this.f13814a.removeCallbacksAndMessages(runnable);
    }

    /* renamed from: a */
    public final void mo9434a(Runnable runnable, long j, dqx dqx) {
        this.f13814a.postAtTime(new dqf(runnable, dqx), runnable, SystemClock.uptimeMillis() + j);
    }

    /* renamed from: a */
    public final void mo9435a(Runnable runnable, dqx dqx) {
        this.f13814a.postAtTime(new dqf(runnable, dqx), runnable, SystemClock.uptimeMillis());
    }
}
