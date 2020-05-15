package p000;

import java.util.Set;

/* renamed from: bcre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcre extends bcol {

    /* renamed from: a */
    private final bmxv f104688a;

    /* renamed from: b */
    private final Set f104689b;

    /* renamed from: c */
    private final bmxv f104690c;

    /* renamed from: d */
    private final String f104691d;

    public bcre(bmxv bmxv, Set set, bmxv bmxv2, String str) {
        this.f104688a = bmxv;
        this.f104689b = set;
        this.f104690c = bmxv2;
        this.f104691d = str;
    }

    /* renamed from: a */
    public final bmxv mo57069a() {
        return this.f104688a;
    }

    /* renamed from: b */
    public final Set mo57071b() {
        return this.f104689b;
    }

    /* renamed from: c */
    public final bmxv mo57072c() {
        return this.f104690c;
    }

    /* renamed from: d */
    public final String mo57073d() {
        return this.f104691d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcol) {
            bcol bcol = (bcol) obj;
            return this.f104688a.equals(bcol.mo57069a()) && this.f104689b.equals(bcol.mo57071b()) && this.f104690c.equals(bcol.mo57072c()) && this.f104691d.equals(bcol.mo57073d());
        }
    }

    public final int hashCode() {
        return ((((((this.f104688a.hashCode() ^ 1000003) * 1000003) ^ this.f104689b.hashCode()) * 1000003) ^ this.f104690c.hashCode()) * 1000003) ^ this.f104691d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104688a);
        String valueOf2 = String.valueOf(this.f104689b);
        String valueOf3 = String.valueOf(this.f104690c);
        String str = this.f104691d;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 67 + length2 + String.valueOf(valueOf3).length() + String.valueOf(str).length());
        sb.append("AccountUsers{gaiaEmail=");
        sb.append(valueOf);
        sb.append(", phoneNumbers=");
        sb.append(valueOf2);
        sb.append(", deviceId=");
        sb.append(valueOf3);
        sb.append(", tachyonAppName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
