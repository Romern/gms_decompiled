package p000;

/* renamed from: bcyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcyf extends bcyl {

    /* renamed from: a */
    private final bczd f105119a;

    /* renamed from: a */
    public final bdac mo57665a() {
        return bdac.HORIZONTAL_LAYOUT_BUTTONS;
    }

    /* renamed from: b */
    public final bczd mo57669b() {
        return this.f105119a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bdaa) {
            bdaa bdaa = (bdaa) obj;
            if (bdac.HORIZONTAL_LAYOUT_BUTTONS != bdaa.mo57665a() || !this.f105119a.equals(bdaa.mo57669b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f105119a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105119a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("Element{horizontalLayoutButtons=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcyf(bczd bczd) {
        this.f105119a = bczd;
    }
}
