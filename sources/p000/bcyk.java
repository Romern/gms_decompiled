package p000;

/* renamed from: bcyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcyk extends bcyl {

    /* renamed from: a */
    private final bczu f105124a;

    /* renamed from: a */
    public final bdac mo57665a() {
        return bdac.STATUS_BADGE;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bdaa) {
            bdaa bdaa = (bdaa) obj;
            if (bdac.STATUS_BADGE != bdaa.mo57665a() || !this.f105124a.equals(bdaa.mo57690g())) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final bczu mo57690g() {
        return this.f105124a;
    }

    public final int hashCode() {
        return this.f105124a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105124a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("Element{statusBadge=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcyk(bczu bczu) {
        this.f105124a = bczu;
    }
}
