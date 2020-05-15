package p000;

import com.google.android.gms.audiomodem.Encoding;
import java.util.Arrays;

/* renamed from: geo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class geo {

    /* renamed from: a */
    public final gcv f18059a;

    /* renamed from: b */
    public final Encoding f18060b;

    /* renamed from: c */
    public final int f18061c;

    /* renamed from: d */
    public final byte[] f18062d;

    /* renamed from: e */
    public final int f18063e;

    /* renamed from: f */
    public int f18064f = 0;

    public geo(gcv gcv, Encoding encoding, int i, byte[] bArr, int i2) {
        this.f18059a = gcv;
        this.f18060b = encoding;
        this.f18061c = i;
        this.f18062d = bArr;
        this.f18063e = i2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof geo)) {
            geo geo = (geo) obj;
            if (!sdg.m34949a(this.f18059a, geo.f18059a) || !sdg.m34949a(this.f18060b, geo.f18060b) || this.f18061c != geo.f18061c || !Arrays.equals(this.f18062d, geo.f18062d) || this.f18063e != geo.f18063e) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18059a, this.f18060b, Integer.valueOf(this.f18061c), this.f18062d, Integer.valueOf(this.f18063e)});
    }
}
