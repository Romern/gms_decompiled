package p000;

import com.google.android.gms.audiomodem.DsssEncoding;
import com.google.android.gms.audiomodem.Encoding;

/* renamed from: gdp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gdp {

    /* renamed from: a */
    public boolean f17961a = true;

    /* renamed from: b */
    public int f17962b = 7;

    /* renamed from: c */
    public int f17963c = 0;

    /* renamed from: d */
    public float f17964d = 48000.0f;

    /* renamed from: e */
    public int f17965e = 16;

    /* renamed from: f */
    public float f17966f = 18500.0f;

    /* renamed from: g */
    public int f17967g = 4;

    /* renamed from: h */
    public int f17968h = 4;

    /* renamed from: i */
    public int f17969i = 4;

    /* renamed from: j */
    private int f17970j = 6;

    /* renamed from: k */
    private int f17971k = 1;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* renamed from: a */
    public final Encoding mo11693a() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (this.f17965e % this.f17969i == 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "upsamplingFactor must be divisible by basebandDecimationFactor");
        int i = this.f17962b;
        if (i == 5 || i == 6) {
            int i2 = this.f17963c;
            if (i2 >= 0 && i2 <= 2) {
                z2 = true;
                sdo.m34975b(z2, "codeNumber must be in the range [0, 3], unless numberOfTapsLfsr is 5 or 6,in which case it must be in [0, 2]");
                if (this.f17966f > this.f17964d / 2.0f) {
                }
                sdo.m34975b(z3, "desiredCarrierFrequency cannot exceed coderSampleRate / 2 (Nyquist rate)");
                return new Encoding(0, new DsssEncoding(this.f17970j, Encoding.m6246a(this.f17971k), this.f17961a, this.f17962b, this.f17963c, this.f17964d, this.f17965e, this.f17966f, this.f17967g, this.f17968h, this.f17969i, Encoding.m6247b(this.f17971k)), null);
            }
        } else {
            int i3 = this.f17963c;
            if (i3 >= 0 && i3 <= 3) {
                z2 = true;
                sdo.m34975b(z2, "codeNumber must be in the range [0, 3], unless numberOfTapsLfsr is 5 or 6,in which case it must be in [0, 2]");
                if (this.f17966f > this.f17964d / 2.0f) {
                    z3 = false;
                }
                sdo.m34975b(z3, "desiredCarrierFrequency cannot exceed coderSampleRate / 2 (Nyquist rate)");
                return new Encoding(0, new DsssEncoding(this.f17970j, Encoding.m6246a(this.f17971k), this.f17961a, this.f17962b, this.f17963c, this.f17964d, this.f17965e, this.f17966f, this.f17967g, this.f17968h, this.f17969i, Encoding.m6247b(this.f17971k)), null);
            }
        }
        z2 = false;
        sdo.m34975b(z2, "codeNumber must be in the range [0, 3], unless numberOfTapsLfsr is 5 or 6,in which case it must be in [0, 2]");
        if (this.f17966f > this.f17964d / 2.0f) {
        }
        sdo.m34975b(z3, "desiredCarrierFrequency cannot exceed coderSampleRate / 2 (Nyquist rate)");
        return new Encoding(0, new DsssEncoding(this.f17970j, Encoding.m6246a(this.f17971k), this.f17961a, this.f17962b, this.f17963c, this.f17964d, this.f17965e, this.f17966f, this.f17967g, this.f17968h, this.f17969i, Encoding.m6247b(this.f17971k)), null);
    }

    /* renamed from: b */
    public final void mo11695b(int i) {
        sdo.m34975b(i > 0, "tokenLengthBytes must be greater than zero");
        this.f17970j = i;
    }

    /* renamed from: a */
    public final void mo11694a(int i) {
        sdo.m34975b(true, "Not a valid ErrorControlScheme");
        this.f17971k = i;
    }
}
