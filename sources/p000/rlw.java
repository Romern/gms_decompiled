package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* renamed from: rlw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rlw implements rnu {

    /* renamed from: a */
    final /* synthetic */ rly f43251a;

    public rlw(rly rly) {
        this.f43251a = rly;
    }

    /* renamed from: a */
    public final void mo24873a(int i) {
        Lock lock;
        ConnectionResult connectionResult;
        this.f43251a.f43259g.lock();
        try {
            rly rly = this.f43251a;
            if (rly.f43258f || (connectionResult = rly.f43257e) == null || !connectionResult.mo17671b()) {
                rly rly2 = this.f43251a;
                rly2.f43258f = false;
                rly2.mo24879a(i);
                lock = this.f43251a.f43259g;
            } else {
                rly rly3 = this.f43251a;
                rly3.f43258f = true;
                rly3.f43254b.mo7244a(i);
                lock = this.f43251a.f43259g;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.f43251a.f43259g.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo24874a(Bundle bundle) {
        this.f43251a.f43259g.lock();
        try {
            rly rly = this.f43251a;
            Bundle bundle2 = rly.f43255c;
            if (bundle2 == null) {
                rly.f43255c = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            this.f43251a.f43256d = ConnectionResult.f30063a;
            this.f43251a.mo24889h();
        } finally {
            this.f43251a.f43259g.unlock();
        }
    }

    /* renamed from: a */
    public final void mo24875a(ConnectionResult connectionResult) {
        this.f43251a.f43259g.lock();
        try {
            rly rly = this.f43251a;
            rly.f43256d = connectionResult;
            rly.mo24889h();
        } finally {
            this.f43251a.f43259g.unlock();
        }
    }
}
