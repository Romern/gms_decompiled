package p000;

import com.google.android.gms.common.Feature;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: mkz */
public final /* synthetic */ class mkz implements bmzi {

    /* renamed from: a */
    private final mle f33927a;

    /* renamed from: b */
    private final HandshakeData f33928b;

    public mkz(mle mle, HandshakeData handshakeData) {
        this.f33927a = mle;
        this.f33928b = handshakeData;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        mle mle = this.f33927a;
        HandshakeData handshakeData = this.f33928b;
        arsy arsy = mle.f33933b;
        roz b = rpa.m34196b();
        b.f43472a = new arst(handshakeData);
        b.f43473b = new Feature[]{aqwz.f87013a};
        return arsy.mo24732b(b.mo24977a());
    }
}
