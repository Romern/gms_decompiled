package p000;

/* renamed from: yoi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yoi extends yol {

    /* renamed from: a */
    public final String f54270a;

    /* renamed from: b */
    public final String f54271b;

    public yoi(String str, String str2) {
        if (str != null) {
            this.f54270a = str;
            if (str2 != null) {
                this.f54271b = str2;
                return;
            }
            throw new NullPointerException("Null streamName");
        }
        throw new NullPointerException("Null packageName");
    }

    /* renamed from: a */
    public final String mo30641a() {
        return this.f54270a;
    }

    /* renamed from: b */
    public final String mo30642b() {
        return this.f54271b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yol) {
            yol yol = (yol) obj;
            return this.f54270a.equals(yol.mo30641a()) && this.f54271b.equals(yol.mo30642b());
        }
    }

    public final int hashCode() {
        return ((this.f54270a.hashCode() ^ 1000003) * 1000003) ^ this.f54271b.hashCode();
    }

    public final String toString() {
        String str = this.f54270a;
        String str2 = this.f54271b;
        StringBuilder sb = new StringBuilder(str.length() + 51 + str2.length());
        sb.append("PackageNameAndStreamName{packageName=");
        sb.append(str);
        sb.append(", streamName=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
