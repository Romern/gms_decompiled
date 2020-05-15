package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* renamed from: rlx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rlx implements rnu {

    /* renamed from: a */
    final /* synthetic */ rly f43252a;

    public rlx(rly rly) {
        this.f43252a = rly;
    }

    /* renamed from: a */
    public final void mo24873a(int i) {
        Lock lock;
        this.f43252a.f43259g.lock();
        try {
            rly rly = this.f43252a;
            if (!rly.f43258f) {
                rly.f43258f = true;
                rly.f43253a.mo7244a(i);
                lock = this.f43252a.f43259g;
            } else {
                rly.f43258f = false;
                rly.mo24879a(i);
                lock = this.f43252a.f43259g;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.f43252a.f43259g.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo24874a(Bundle bundle) {
        this.f43252a.f43259g.lock();
        try {
            this.f43252a.f43257e = ConnectionResult.f30063a;
            this.f43252a.mo24889h();
        } finally {
            this.f43252a.f43259g.unlock();
        }
    }

    /* renamed from: a */
    public final void mo24875a(ConnectionResult connectionResult) {
        this.f43252a.f43259g.lock();
        try {
            rly rly = this.f43252a;
            rly.f43257e = connectionResult;
            rly.mo24889h();
        } finally {
            this.f43252a.f43259g.unlock();
        }
    }
}
