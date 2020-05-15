package p000;

import java.util.Arrays;

/* renamed from: xlo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xlo {

    /* renamed from: a */
    private final byte[] f52674a;

    /* renamed from: b */
    private final String f52675b;

    /* renamed from: c */
    private final byte[] f52676c;

    public xlo(byte[] bArr, String str, byte[] bArr2) {
        this.f52674a = (byte[]) bmxy.m108581a(bArr);
        bmxy.m108581a(str);
        this.f52675b = str;
        this.f52676c = (byte[]) bmxy.m108581a(bArr2);
    }

    /* renamed from: a */
    public final byte[] mo29912a() {
        return bypx.m125084a(new bypt(bypx.m125085a("fmt"), bypx.m125085a(this.f52675b)), new bypt(bypx.m125085a("attStmt"), bypx.m125087b(this.f52676c)), new bypt(bypx.m125085a("authData"), bypx.m125082a(this.f52674a))).mo74444c();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xlo) {
            xlo xlo = (xlo) obj;
            if (!Arrays.equals(this.f52674a, xlo.f52674a) || !this.f52675b.equals(xlo.f52675b) || !Arrays.equals(this.f52676c, xlo.f52676c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f52674a)), this.f52675b, Integer.valueOf(Arrays.hashCode(this.f52676c))});
    }
}
