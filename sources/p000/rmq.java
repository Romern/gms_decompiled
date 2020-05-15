package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: rmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rmq implements rjz, rka {

    /* renamed from: a */
    final /* synthetic */ rms f43294a;

    public rmq(rms rms) {
        this.f43294a = rms;
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        rms rms = this.f43294a;
        rms.f43300e.mo47937a(new rmp(rms));
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        this.f43294a.f43297b.lock();
        try {
            if (this.f43294a.mo24905a(connectionResult)) {
                this.f43294a.mo24911f();
                this.f43294a.mo24910e();
            } else {
                this.f43294a.mo24906b(connectionResult);
            }
        } finally {
            this.f43294a.f43297b.unlock();
        }
    }
}
