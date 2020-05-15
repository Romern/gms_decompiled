package p000;

/* renamed from: bcyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcyj extends bcyl {

    /* renamed from: a */
    private final bcuo f105123a;

    /* renamed from: a */
    public final bdac mo57665a() {
        return bdac.RICH_TEXT;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bdaa) {
            bdaa bdaa = (bdaa) obj;
            if (bdac.RICH_TEXT != bdaa.mo57665a() || !this.f105123a.equals(bdaa.mo57686f())) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final bcuo mo57686f() {
        return this.f105123a;
    }

    public final int hashCode() {
        return this.f105123a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105123a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("Element{richText=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcyj(bcuo bcuo) {
        this.f105123a = bcuo;
    }
}
