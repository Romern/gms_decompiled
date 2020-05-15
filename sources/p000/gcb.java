package p000;

import com.google.android.gms.audiomodem.AdsrParams;

/* renamed from: gcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gcb {

    /* renamed from: a */
    public long f17871a = 8;

    /* renamed from: b */
    public long f17872b = 0;

    /* renamed from: c */
    public long f17873c = 0;

    /* renamed from: d */
    public long f17874d = 40;

    /* renamed from: e */
    public float f17875e = 1.0f;

    /* renamed from: a */
    public final AdsrParams mo11635a() {
        boolean z;
        AdsrParams adsrParams = new AdsrParams(this.f17871a, this.f17872b, this.f17873c, this.f17874d, this.f17875e);
        if (adsrParams.mo7313a() > 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "Sum of all ADSR window components must be greater than zero");
        return adsrParams;
    }
}
