package p000;

/* renamed from: khx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class khx extends kje {

    /* renamed from: a */
    private final String f24177a;

    /* renamed from: b */
    private final kdg f24178b;

    public khx(String str, kdg kdg) {
        if (str != null) {
            this.f24177a = str;
            this.f24178b = kdg;
            return;
        }
        throw new NullPointerException("Null alias");
    }

    /* renamed from: a */
    public final String mo14484a() {
        return this.f24177a;
    }

    /* renamed from: b */
    public final kdg mo14485b() {
        return this.f24178b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kje) {
            kje kje = (kje) obj;
            return this.f24177a.equals(kje.mo14484a()) && this.f24178b.equals(kje.mo14485b());
        }
    }

    public final int hashCode() {
        int hashCode = (this.f24177a.hashCode() ^ 1000003) * 1000003;
        kdg kdg = this.f24178b;
        int i = kdg.f164758ag;
        if (i == 0) {
            i = bxxm.f165037a.mo74228a(kdg).mo74216a(kdg);
            kdg.f164758ag = i;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f24177a;
        String valueOf = String.valueOf(this.f24178b);
        StringBuilder sb = new StringBuilder(str.length() + 39 + String.valueOf(valueOf).length());
        sb.append("AliasAndPostalAddress{alias=");
        sb.append(str);
        sb.append(", address=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
