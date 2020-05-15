package p000;

/* renamed from: amvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amvb extends amvc {

    /* renamed from: a */
    public final String f75985a;

    /* renamed from: b */
    public final String f75986b;

    public amvb(String str, String str2) {
        if (str != null) {
            this.f75985a = str;
            if (str2 != null) {
                this.f75986b = str2;
                return;
            }
            throw new NullPointerException("Null groupsFeed");
        }
        throw new NullPointerException("Null contactsFeed");
    }

    /* renamed from: a */
    public final String mo41366a() {
        return this.f75985a;
    }

    /* renamed from: b */
    public final String mo41367b() {
        return this.f75986b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amvc) {
            amvc amvc = (amvc) obj;
            return this.f75985a.equals(amvc.mo41366a()) && this.f75986b.equals(amvc.mo41367b());
        }
    }

    public final int hashCode() {
        return ((this.f75985a.hashCode() ^ 1000003) * 1000003) ^ this.f75986b.hashCode();
    }

    public final String toString() {
        String str = this.f75985a;
        String str2 = this.f75986b;
        StringBuilder sb = new StringBuilder(str.length() + 33 + str2.length());
        sb.append("Feeds{contactsFeed=");
        sb.append(str);
        sb.append(", groupsFeed=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
