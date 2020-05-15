package p000;

import java.util.Arrays;

/* renamed from: bcrv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcrv extends bcth {

    /* renamed from: a */
    private final String f104757a;

    /* renamed from: b */
    private final byte[] f104758b;

    public bcrv(String str, byte[] bArr) {
        this.f104757a = str;
        this.f104758b = bArr;
    }

    /* renamed from: a */
    public final String mo57379a() {
        return this.f104757a;
    }

    /* renamed from: b */
    public final byte[] mo57380b() {
        return this.f104758b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcth) {
            bcth bcth = (bcth) obj;
            if (this.f104757a.equals(bcth.mo57379a())) {
                if (Arrays.equals(this.f104758b, bcth instanceof bcrv ? ((bcrv) bcth).f104758b : bcth.mo57380b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f104757a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f104758b);
    }

    public final String toString() {
        String str = this.f104757a;
        String arrays = Arrays.toString(this.f104758b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(arrays).length());
        sb.append("CustomMessage{type=");
        sb.append(str);
        sb.append(", content=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
