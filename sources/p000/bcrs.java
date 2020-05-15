package p000;

/* renamed from: bcrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcrs extends bctd {

    /* renamed from: a */
    private final int f104741a;

    /* renamed from: b */
    private final int f104742b;

    public bcrs(int i, int i2) {
        this.f104741a = i;
        this.f104742b = i2;
    }

    /* renamed from: a */
    public final int mo57354a() {
        return this.f104741a;
    }

    /* renamed from: b */
    public final int mo57355b() {
        return this.f104742b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bctd) {
            bctd bctd = (bctd) obj;
            return this.f104741a == bctd.mo57354a() && this.f104742b == bctd.mo57355b();
        }
    }

    public final int hashCode() {
        return ((this.f104741a ^ 1000003) * 1000003) ^ this.f104742b;
    }

    public final String toString() {
        int i = this.f104741a;
        int i2 = this.f104742b;
        StringBuilder sb = new StringBuilder(73);
        sb.append("LighterUiConfigurations{badge=");
        sb.append(i);
        sb.append(", profileLabelStyle=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
