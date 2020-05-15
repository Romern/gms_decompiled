package p000;

/* renamed from: bcoc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bcoc extends bcub {

    /* renamed from: a */
    public final bmxv f104603a;

    /* renamed from: b */
    public final bmxv f104604b;

    /* renamed from: c */
    public final bmxv f104605c;

    /* renamed from: d */
    private final String f104606d;

    public bcoc(String str, bmxv bmxv, bmxv bmxv2, bmxv bmxv3) {
        if (str != null) {
            this.f104606d = str;
            if (bmxv != null) {
                this.f104603a = bmxv;
                if (bmxv2 != null) {
                    this.f104604b = bmxv2;
                    if (bmxv3 != null) {
                        this.f104605c = bmxv3;
                        return;
                    }
                    throw new NullPointerException("Null formattedTextSpans");
                }
                throw new NullPointerException("Null lineStyles");
            }
            throw new NullPointerException("Null predefinedStyle");
        }
        throw new NullPointerException("Null rawText");
    }

    /* renamed from: a */
    public final String mo57038a() {
        return this.f104606d;
    }

    /* renamed from: b */
    public final bmxv mo57039b() {
        return this.f104603a;
    }

    /* renamed from: c */
    public final bmxv mo57040c() {
        return this.f104604b;
    }

    /* renamed from: d */
    public final bmxv mo57041d() {
        return this.f104605c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcub) {
            bcub bcub = (bcub) obj;
            return this.f104606d.equals(bcub.mo57038a()) && this.f104603a.equals(bcub.mo57039b()) && this.f104604b.equals(bcub.mo57040c()) && this.f104605c.equals(bcub.mo57041d());
        }
    }

    public final int hashCode() {
        return ((((((this.f104606d.hashCode() ^ 1000003) * 1000003) ^ this.f104603a.hashCode()) * 1000003) ^ this.f104604b.hashCode()) * 1000003) ^ this.f104605c.hashCode();
    }

    public final String toString() {
        String str = this.f104606d;
        String valueOf = String.valueOf(this.f104603a);
        String valueOf2 = String.valueOf(this.f104604b);
        String valueOf3 = String.valueOf(this.f104605c);
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 75 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("FormattedLine{rawText=");
        sb.append(str);
        sb.append(", predefinedStyle=");
        sb.append(valueOf);
        sb.append(", lineStyles=");
        sb.append(valueOf2);
        sb.append(", formattedTextSpans=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
