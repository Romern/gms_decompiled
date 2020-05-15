package p000;

/* renamed from: bnry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnry {

    /* renamed from: a */
    private final bnsc f132053a;

    /* renamed from: b */
    private final String f132054b;

    public bnry(bnsc bnsc, String str) {
        bnuy.m110474a(bnsc, "log site");
        this.f132053a = bnsc;
        bnuy.m110474a(str, "log site key");
        this.f132054b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bnry) {
            bnry bnry = (bnry) obj;
            if (!this.f132053a.equals(bnry.f132053a) || !this.f132054b.equals(bnry.f132054b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f132053a.hashCode() ^ this.f132054b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f132053a);
        String str = this.f132054b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46 + str.length());
        sb.append("SpecializedLogSiteKey{ logSite=");
        sb.append(valueOf);
        sb.append(", extraKey='");
        sb.append(str);
        sb.append("' }");
        return sb.toString();
    }
}
