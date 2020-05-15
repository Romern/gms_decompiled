package p000;

import java.util.Arrays;

/* renamed from: bcrq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcrq extends bcsz {

    /* renamed from: a */
    private final byte[] f104733a;

    /* renamed from: b */
    private final int f104734b;

    /* renamed from: c */
    private final int f104735c;

    /* renamed from: d */
    private final bmxv f104736d;

    /* renamed from: e */
    private final String f104737e;

    public bcrq(byte[] bArr, int i, int i2, bmxv bmxv, String str) {
        this.f104733a = bArr;
        this.f104734b = i;
        this.f104735c = i2;
        this.f104736d = bmxv;
        this.f104737e = str;
    }

    /* renamed from: a */
    public final byte[] mo57340a() {
        return this.f104733a;
    }

    /* renamed from: b */
    public final int mo57341b() {
        return this.f104734b;
    }

    /* renamed from: c */
    public final int mo57342c() {
        return this.f104735c;
    }

    /* renamed from: d */
    public final bmxv mo57343d() {
        return this.f104736d;
    }

    /* renamed from: e */
    public final String mo57344e() {
        return this.f104737e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bcsz)) {
            return false;
        }
        bcsz bcsz = (bcsz) obj;
        return Arrays.equals(this.f104733a, bcsz instanceof bcrq ? ((bcrq) bcsz).f104733a : bcsz.mo57340a()) && this.f104734b == bcsz.mo57341b() && this.f104735c == bcsz.mo57342c() && this.f104736d.equals(bcsz.mo57343d()) && this.f104737e.equals(bcsz.mo57344e());
    }

    public final int hashCode() {
        return ((((((((Arrays.hashCode(this.f104733a) ^ 1000003) * 1000003) ^ this.f104734b) * 1000003) ^ this.f104735c) * 1000003) ^ this.f104736d.hashCode()) * 1000003) ^ this.f104737e.hashCode();
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f104733a);
        int i = this.f104734b;
        int i2 = this.f104735c;
        String valueOf = String.valueOf(this.f104736d);
        String str = this.f104737e;
        int length = String.valueOf(arrays).length();
        StringBuilder sb = new StringBuilder(length + 87 + String.valueOf(valueOf).length() + String.valueOf(str).length());
        sb.append("LighterIcon{icon=");
        sb.append(arrays);
        sb.append(", width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append(", color=");
        sb.append(valueOf);
        sb.append(", talkBackDescription=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
