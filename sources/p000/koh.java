package p000;

/* renamed from: koh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class koh extends kol {

    /* renamed from: a */
    public final String f24572a;

    /* renamed from: b */
    public final bngx f24573b;

    public koh(String str, bngx bngx) {
        if (str != null) {
            this.f24572a = str;
            if (bngx != null) {
                this.f24573b = bngx;
                return;
            }
            throw new NullPointerException("Null attributes");
        }
        throw new NullPointerException("Null tag");
    }

    /* renamed from: a */
    public final String mo14739a() {
        return this.f24572a;
    }

    /* renamed from: b */
    public final bngx mo14740b() {
        return this.f24573b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kol) {
            kol kol = (kol) obj;
            return this.f24572a.equals(kol.mo14739a()) && bnkn.m109669a(this.f24573b, kol.mo14740b());
        }
    }

    public final int hashCode() {
        return ((this.f24572a.hashCode() ^ 1000003) * 1000003) ^ this.f24573b.hashCode();
    }

    public final String toString() {
        String str = this.f24572a;
        String valueOf = String.valueOf(this.f24573b);
        StringBuilder sb = new StringBuilder(str.length() + 27 + String.valueOf(valueOf).length());
        sb.append("HtmlInfo{tag=");
        sb.append(str);
        sb.append(", attributes=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
