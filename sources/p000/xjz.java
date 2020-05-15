package p000;

import java.util.Arrays;
import java.util.List;

/* renamed from: xjz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xjz implements xjx {

    /* renamed from: a */
    public final xka f52482a;

    /* renamed from: b */
    public final byte[] f52483b;

    /* renamed from: c */
    private final String f52484c;

    private xjz(xka xka, String str, byte[] bArr) {
        bmxy.m108581a(xka);
        this.f52482a = xka;
        bmxy.m108581a(str);
        this.f52484c = str;
        this.f52483b = (byte[]) bmxy.m108581a(bArr);
    }

    /* renamed from: a */
    public static xjz m43073a(String str) {
        boolean z;
        List c = bmyx.m108640a('.').mo66921b(3).mo66925c((CharSequence) str);
        if (c.size() == 3) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "Invalid credential identifier.");
        try {
            return new xjz(xka.m43078a(Byte.parseByte((String) c.get(0))), (String) c.get(2), boan.f132470d.mo68796b((CharSequence) c.get(1)));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Key type is not a decimal byte value.", e);
        }
    }

    /* renamed from: a */
    public final xka mo29847a() {
        return this.f52482a;
    }

    /* renamed from: b */
    public final String mo29848b() {
        return bmxr.m108543a('.').mo66875a(Byte.valueOf(this.f52482a.f52489d), boan.f132470d.mo68794a(this.f52483b), this.f52484c);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof xjz) && mo29848b().equals(((xjx) obj).mo29848b());
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo29848b()});
    }

    public final String toString() {
        return mo29848b();
    }

    /* renamed from: a */
    public static xjz m43074a(String str, xkb xkb) {
        return m43075a(xkb.mo29856b(), str, xkb.mo29855a());
    }

    /* renamed from: a */
    public static xjz m43075a(xka xka, String str, byte[] bArr) {
        return new xjz(xka, str, bArr);
    }
}
