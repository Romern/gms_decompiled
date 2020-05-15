package p000;

import com.google.android.gms.audiomodem.AdsrParams;
import com.google.android.gms.audiomodem.DtmfEncoding;
import com.google.android.gms.audiomodem.Encoding;

/* renamed from: gdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gdq {

    /* renamed from: a */
    public float f17972a = 44100.0f;

    /* renamed from: b */
    public int f17973b = 16;

    /* renamed from: c */
    public int f17974c = 50;

    /* renamed from: d */
    public int f17975d = 2;

    /* renamed from: e */
    public AdsrParams f17976e = DtmfEncoding.f9872b;

    /* renamed from: f */
    private int f17977f = 6;

    /* renamed from: g */
    private int f17978g = 1;

    /* renamed from: h */
    private final float[] f17979h = DtmfEncoding.f9871a;

    /* renamed from: a */
    public final Encoding mo11696a() {
        boolean z;
        boolean z2 = false;
        if (this.f17976e.mo7313a() <= ((long) this.f17974c)) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "Sum of ADSR window components must not be more than windowDurationMillis");
        if (this.f17979h.length > this.f17975d) {
            z2 = true;
        }
        sdo.m34975b(z2, "Number of tone frequencies must be greater than number of frequencies per symbol");
        return new Encoding(1, null, new DtmfEncoding(this.f17977f, Encoding.m6246a(this.f17978g), this.f17972a, this.f17973b, this.f17974c, this.f17975d, Encoding.m6247b(this.f17978g), this.f17976e, this.f17979h));
    }

    /* renamed from: b */
    public final void mo11698b(int i) {
        sdo.m34975b(i > 0, "tokenLengthBytes must be greater than zero");
        this.f17977f = i;
    }

    /* renamed from: a */
    public final void mo11697a(int i) {
        sdo.m34975b(true, "Not a valid ErrorControlScheme");
        this.f17978g = i;
    }
}
