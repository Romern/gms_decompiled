package p000;

/* renamed from: anam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anam extends anao {

    /* renamed from: a */
    private final bngx f76492a;

    /* renamed from: b */
    private final String f76493b;

    /* renamed from: c */
    private final boolean f76494c;

    public anam(bngx bngx, String str, boolean z) {
        if (bngx != null) {
            this.f76492a = bngx;
            if (str != null) {
                this.f76493b = str;
                this.f76494c = z;
                return;
            }
            throw new NullPointerException("Null token");
        }
        throw new NullPointerException("Null dataItems");
    }

    /* renamed from: a */
    public final bngx mo41596a() {
        return this.f76492a;
    }

    /* renamed from: b */
    public final String mo41597b() {
        return this.f76493b;
    }

    /* renamed from: c */
    public final boolean mo41598c() {
        return this.f76494c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anao) {
            anao anao = (anao) obj;
            return bnkn.m109669a(this.f76492a, anao.mo41596a()) && this.f76493b.equals(anao.mo41597b()) && this.f76494c == anao.mo41598c();
        }
    }

    public final int hashCode() {
        return ((((this.f76492a.hashCode() ^ 1000003) * 1000003) ^ this.f76493b.hashCode()) * 1000003) ^ (!this.f76494c ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f76492a);
        String str = this.f76493b;
        boolean z = this.f76494c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42 + str.length());
        sb.append("Page{dataItems=");
        sb.append(valueOf);
        sb.append(", token=");
        sb.append(str);
        sb.append(", isLastPage=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
