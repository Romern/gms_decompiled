package p000;

import java.util.Arrays;

/* renamed from: xjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xjy implements xjx {

    /* renamed from: a */
    private final xka f52480a;

    /* renamed from: b */
    private final byte[] f52481b;

    private xjy(xka xka, byte[] bArr) {
        bmxy.m108581a(xka);
        this.f52480a = xka;
        this.f52481b = (byte[]) bmxy.m108581a(bArr);
    }

    /* renamed from: a */
    public static xjy m43070a(xkb xkb) {
        return new xjy(xkb.mo29856b(), xkb.mo29855a());
    }

    /* renamed from: a */
    public final xka mo29847a() {
        return this.f52480a;
    }

    /* renamed from: b */
    public final String mo29848b() {
        return boan.f132471e.mo68783a().mo68794a(this.f52481b);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof xjy) && mo29848b().equals(((xjx) obj).mo29848b());
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo29848b()});
    }

    public final String toString() {
        return mo29848b();
    }
}
