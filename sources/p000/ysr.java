package p000;

/* renamed from: ysr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ysr extends ysi {

    /* renamed from: a */
    private final String f54556a;

    /* renamed from: b */
    private final String f54557b;

    public ysr(String str, String str2) {
        if (str != null) {
            this.f54556a = str;
            if (str2 != null) {
                this.f54557b = str2;
                return;
            }
            throw new NullPointerException("Null dataTypeName");
        }
        throw new NullPointerException("Null packageName");
    }

    /* renamed from: a */
    public final String mo30728a() {
        return this.f54556a;
    }

    /* renamed from: b */
    public final String mo30729b() {
        return this.f54557b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ysi) {
            ysi ysi = (ysi) obj;
            return this.f54556a.equals(ysi.mo30728a()) && this.f54557b.equals(ysi.mo30729b());
        }
    }

    public final int hashCode() {
        return ((this.f54556a.hashCode() ^ 1000003) * 1000003) ^ this.f54557b.hashCode();
    }

    public final String toString() {
        String str = this.f54556a;
        String str2 = this.f54557b;
        StringBuilder sb = new StringBuilder(str.length() + 38 + str2.length());
        sb.append("Exemption{packageName=");
        sb.append(str);
        sb.append(", dataTypeName=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
