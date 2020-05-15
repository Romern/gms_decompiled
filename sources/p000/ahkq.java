package p000;

import java.util.Arrays;

/* renamed from: ahkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahkq extends ahku {

    /* renamed from: a */
    private final String f67365a;

    /* renamed from: b */
    private final String f67366b;

    /* renamed from: c */
    private final byte[] f67367c;

    /* renamed from: d */
    private final bvif f67368d;

    public ahkq(String str, String str2, byte[] bArr, bvif bvif) {
        this.f67365a = str;
        this.f67366b = str2;
        this.f67367c = bArr;
        this.f67368d = bvif;
    }

    /* renamed from: a */
    public final String mo36677a() {
        return this.f67365a;
    }

    /* renamed from: b */
    public final String mo36678b() {
        return this.f67366b;
    }

    /* renamed from: c */
    public final byte[] mo36679c() {
        return this.f67367c;
    }

    /* renamed from: d */
    public final bvif mo36680d() {
        return this.f67368d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahku) {
            ahku ahku = (ahku) obj;
            if (this.f67365a.equals(ahku.mo36677a()) && this.f67366b.equals(ahku.mo36678b())) {
                return Arrays.equals(this.f67367c, ahku instanceof ahkq ? ((ahkq) ahku).f67367c : ahku.mo36679c()) && this.f67368d.equals(ahku.mo36680d());
            }
        }
    }

    public final int hashCode() {
        return ((((((this.f67365a.hashCode() ^ 1000003) * 1000003) ^ this.f67366b.hashCode()) * 1000003) ^ Arrays.hashCode(this.f67367c)) * 1000003) ^ this.f67368d.hashCode();
    }

    public final String toString() {
        String str = this.f67365a;
        String str2 = this.f67366b;
        String arrays = Arrays.toString(this.f67367c);
        String valueOf = String.valueOf(this.f67368d);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 65 + length2 + String.valueOf(arrays).length() + String.valueOf(valueOf).length());
        sb.append("EndpointMetadata{endpointId=");
        sb.append(str);
        sb.append(", serviceId=");
        sb.append(str2);
        sb.append(", endpointInfo=");
        sb.append(arrays);
        sb.append(", medium=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
