package p000;

import java.util.Arrays;

/* renamed from: xmd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xmd implements xlp {

    /* renamed from: a */
    private final byte[] f52722a;

    /* renamed from: b */
    private final byte[] f52723b;

    public xmd(byte[] bArr, byte[] bArr2) {
        this.f52722a = (byte[]) bmxy.m108581a(bArr);
        this.f52723b = (byte[]) bmxy.m108581a(bArr2);
    }

    /* renamed from: a */
    public final bypx mo29915a() {
        return bypx.m125084a(new bypt(bypx.m125085a("x5c"), bypx.m125080a(bypx.m125082a(this.f52722a))), new bypt(bypx.m125085a("sig"), bypx.m125082a(this.f52723b)));
    }

    /* renamed from: b */
    public final String mo29916b() {
        return "fido-u2f";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xmd) {
            xmd xmd = (xmd) obj;
            if (!Arrays.equals(this.f52722a, xmd.f52722a) || !Arrays.equals(this.f52723b, xmd.f52723b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f52722a)), Integer.valueOf(Arrays.hashCode(this.f52723b))});
    }
}
