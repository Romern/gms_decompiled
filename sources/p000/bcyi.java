package p000;

/* renamed from: bcyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcyi extends bcyl {

    /* renamed from: a */
    private final bczo f105122a;

    /* renamed from: a */
    public final bdac mo57665a() {
        return bdac.RICH_CARD_BUTTONS;
    }

    /* renamed from: e */
    public final bczo mo57681e() {
        return this.f105122a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bdaa) {
            bdaa bdaa = (bdaa) obj;
            if (bdac.RICH_CARD_BUTTONS != bdaa.mo57665a() || !this.f105122a.equals(bdaa.mo57681e())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f105122a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105122a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("Element{richCardButtons=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcyi(bczo bczo) {
        this.f105122a = bczo;
    }
}
