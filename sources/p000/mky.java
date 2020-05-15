package p000;

import com.google.android.gms.common.Feature;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: mky */
public final /* synthetic */ class mky implements bmzi {

    /* renamed from: a */
    private final mle f33925a;

    /* renamed from: b */
    private final HandshakeData f33926b;

    public mky(mle mle, HandshakeData handshakeData) {
        this.f33925a = mle;
        this.f33926b = handshakeData;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        mle mle = this.f33925a;
        HandshakeData handshakeData = this.f33926b;
        arsy arsy = mle.f33933b;
        roz b = rpa.m34196b();
        b.f43472a = new arss(handshakeData);
        b.f43473b = new Feature[]{aqwz.f87013a};
        return arsy.mo24732b(b.mo24977a());
    }
}
