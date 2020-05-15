package p000;

import java.util.Arrays;

/* renamed from: bcyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcyo extends bczc {

    /* renamed from: a */
    private final byte[] f105129a;

    /* renamed from: b */
    private final bcsz f105130b;

    /* renamed from: c */
    private final String f105131c;

    /* renamed from: d */
    private final bcov f105132d;

    public bcyo(byte[] bArr, bcsz bcsz, String str, bcov bcov) {
        this.f105129a = bArr;
        this.f105130b = bcsz;
        this.f105131c = str;
        this.f105132d = bcov;
    }

    @Deprecated
    /* renamed from: a */
    public final byte[] mo57703a() {
        return this.f105129a;
    }

    /* renamed from: b */
    public final bcsz mo57704b() {
        return this.f105130b;
    }

    /* renamed from: c */
    public final String mo57705c() {
        return this.f105131c;
    }

    /* renamed from: d */
    public final bcov mo57706d() {
        return this.f105132d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bczc)) {
            return false;
        }
        bczc bczc = (bczc) obj;
        return Arrays.equals(this.f105129a, bczc instanceof bcyo ? ((bcyo) bczc).f105129a : bczc.mo57703a()) && this.f105130b.equals(bczc.mo57704b()) && this.f105131c.equals(bczc.mo57705c()) && this.f105132d.equals(bczc.mo57706d());
    }

    public final int hashCode() {
        return ((((((Arrays.hashCode(this.f105129a) ^ 1000003) * 1000003) ^ this.f105130b.hashCode()) * 1000003) ^ this.f105131c.hashCode()) * 1000003) ^ this.f105132d.hashCode();
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f105129a);
        String valueOf = String.valueOf(this.f105130b);
        String str = this.f105131c;
        String valueOf2 = String.valueOf(this.f105132d);
        int length = String.valueOf(arrays).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 64 + length2 + String.valueOf(str).length() + String.valueOf(valueOf2).length());
        sb.append("VerticalLayoutButton{icon=");
        sb.append(arrays);
        sb.append(", lighterIcon=");
        sb.append(valueOf);
        sb.append(", displayText=");
        sb.append(str);
        sb.append(", action=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
