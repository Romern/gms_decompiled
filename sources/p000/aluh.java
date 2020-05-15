package p000;

import java.util.Arrays;

/* renamed from: aluh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aluh {

    /* renamed from: a */
    public final String f74300a;

    /* renamed from: b */
    public final String f74301b;

    /* renamed from: c */
    public final byte[] f74302c;

    private aluh(String str, byte[] bArr, String str2) {
        if (str2 == null || bArr == null) {
            this.f74300a = str;
            this.f74301b = str2;
            this.f74302c = bArr;
            return;
        }
        throw new IllegalArgumentException("Cannot set both stringData and binaryData");
    }

    /* renamed from: a */
    public static aluh m61891a(String str, String str2) {
        return new aluh(str, null, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aluh aluh = (aluh) obj;
            return bmxi.m108538a(this.f74300a, aluh.f74300a) && bmxi.m108538a(this.f74301b, aluh.f74301b) && Arrays.equals(this.f74302c, aluh.f74302c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f74300a, this.f74301b, Integer.valueOf(Arrays.hashCode(this.f74302c))});
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66880a();
        a.mo66885a("name", this.f74300a);
        a.mo66885a("stringData", this.f74301b);
        a.mo66885a("binaryData", this.f74302c);
        return a.toString();
    }

    /* renamed from: a */
    public static aluh m61892a(String str, byte[] bArr) {
        return new aluh(str, bArr, null);
    }
}
