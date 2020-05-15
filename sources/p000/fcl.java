package p000;

/* renamed from: fcl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fcl extends fes {

    /* renamed from: a */
    private final String f16278a;

    /* renamed from: b */
    private final bswg f16279b;

    /* renamed from: c */
    private final bsxn f16280c;

    public fcl(String str, bswg bswg, bsxn bsxn) {
        if (str != null) {
            this.f16278a = str;
            this.f16279b = bswg;
            if (bsxn != null) {
                this.f16280c = bsxn;
                return;
            }
            throw new NullPointerException("Null resourceKey");
        }
        throw new NullPointerException("Null title");
    }

    /* renamed from: a */
    public final String mo10709a() {
        return this.f16278a;
    }

    /* renamed from: b */
    public final bswg mo10710b() {
        return this.f16279b;
    }

    /* renamed from: c */
    public final bsxn mo10711c() {
        return this.f16280c;
    }

    public final boolean equals(Object obj) {
        bswg bswg;
        if (obj == this) {
            return true;
        }
        if (obj instanceof fes) {
            fes fes = (fes) obj;
            return this.f16278a.equals(fes.mo10709a()) && ((bswg = this.f16279b) == null ? fes.mo10710b() == null : bswg.equals(fes.mo10710b())) && this.f16280c.equals(fes.mo10711c());
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f16278a.hashCode() ^ 1000003) * 1000003;
        bswg bswg = this.f16279b;
        if (bswg != null) {
            i = bswg.hashCode();
        } else {
            i = 0;
        }
        int i2 = (hashCode ^ i) * 1000003;
        bsxn bsxn = this.f16280c;
        int i3 = bsxn.f164758ag;
        if (i3 == 0) {
            i3 = bxxm.f165037a.mo74228a(bsxn).mo74216a(bsxn);
            bsxn.f164758ag = i3;
        }
        return i2 ^ i3;
    }

    public final String toString() {
        String str = this.f16278a;
        String valueOf = String.valueOf(this.f16279b);
        String valueOf2 = String.valueOf(this.f16280c);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 37 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("PageItem{title=");
        sb.append(str);
        sb.append(", icon=");
        sb.append(valueOf);
        sb.append(", resourceKey=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
