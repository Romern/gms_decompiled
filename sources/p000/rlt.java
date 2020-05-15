package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: rlt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rlt implements rjz, rka {

    /* renamed from: a */
    public final rjo f43247a;

    /* renamed from: b */
    public rlu f43248b;

    /* renamed from: c */
    private final boolean f43249c;

    public rlt(rjo rjo, boolean z) {
        this.f43247a = rjo;
        this.f43249c = z;
    }

    /* renamed from: a */
    private final void m33940a() {
        sdo.m34966a(this.f43248b, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        m33940a();
        this.f43248b.mo7257g(bundle);
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        m33940a();
        this.f43248b.mo7244a(i);
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        m33940a();
        rlu rlu = this.f43248b;
        rjo rjo = this.f43247a;
        boolean z = this.f43249c;
        rnb rnb = (rnb) rlu;
        rnb.f43347a.lock();
        try {
            ((rnb) rlu).f43356j.mo24896a(connectionResult, rjo, z);
        } finally {
            rnb.f43347a.unlock();
        }
    }
}
