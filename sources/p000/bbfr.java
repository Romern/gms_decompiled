package p000;

/* renamed from: bbfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bbfr extends bbfw {

    /* renamed from: a */
    private final bngx f102563a;

    public bbfr(bngx bngx) {
        this.f102563a = bngx;
    }

    /* renamed from: a */
    public final bngx mo56107a() {
        return this.f102563a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbfw) {
            return bnkn.m109669a(this.f102563a, ((bbfw) obj).mo56107a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f102563a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f102563a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("LookupResult{values=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
