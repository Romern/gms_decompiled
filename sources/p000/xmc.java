package p000;

import java.util.Arrays;

/* renamed from: xmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xmc implements xlp {

    /* renamed from: a */
    private final String f52720a;

    /* renamed from: b */
    private final byte[] f52721b;

    public xmc(String str, byte[] bArr) {
        bmxy.m108581a(str);
        this.f52720a = str;
        this.f52721b = (byte[]) bmxy.m108581a(bArr);
    }

    /* renamed from: a */
    public final bypx mo29915a() {
        return bypx.m125084a(new bypt(bypx.m125085a("ver"), bypx.m125085a(this.f52720a)), new bypt(bypx.m125085a("response"), bypx.m125082a(this.f52721b)));
    }

    /* renamed from: b */
    public final String mo29916b() {
        return "android-safetynet";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xmc) {
            xmc xmc = (xmc) obj;
            if (!bmxi.m108538a(this.f52720a, xmc.f52720a) || !Arrays.equals(this.f52721b, xmc.f52721b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52720a, Integer.valueOf(Arrays.hashCode(this.f52721b))});
    }
}
