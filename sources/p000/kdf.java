package p000;

import java.util.Arrays;

/* renamed from: kdf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kdf {

    /* renamed from: a */
    public final String f23866a;

    /* renamed from: b */
    public final String f23867b;

    /* renamed from: c */
    public final String f23868c;

    /* renamed from: d */
    public final String f23869d;

    /* renamed from: e */
    public final String f23870e;

    public kdf(String str, String str2, String str3, String str4, String str5) {
        this.f23866a = str;
        this.f23867b = str2;
        this.f23868c = str3;
        this.f23869d = str4;
        this.f23870e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kdf) {
            return bmxi.m108538a(this.f23866a, ((kdf) obj).f23866a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23866a});
    }

    public final String toString() {
        String str = this.f23866a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 27);
        sb.append("PhoneNumber2{e164Number='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }
}
