package p000;

/* renamed from: bcrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcrp extends bcsx {

    /* renamed from: a */
    private final bctn f104731a;

    /* renamed from: b */
    private final String f104732b;

    public bcrp(bctn bctn, String str) {
        this.f104731a = bctn;
        this.f104732b = str;
    }

    /* renamed from: a */
    public final bctn mo57335a() {
        return this.f104731a;
    }

    /* renamed from: b */
    public final String mo57336b() {
        return this.f104732b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcsx) {
            bcsx bcsx = (bcsx) obj;
            return this.f104731a.equals(bcsx.mo57335a()) && this.f104732b.equals(bcsx.mo57336b());
        }
    }

    public final int hashCode() {
        return ((this.f104731a.hashCode() ^ 1000003) * 1000003) ^ this.f104732b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104731a);
        String str = this.f104732b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39 + String.valueOf(str).length());
        sb.append("CustomizedWebView{webViewHeader=");
        sb.append(valueOf);
        sb.append(", url=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
