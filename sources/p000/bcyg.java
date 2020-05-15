package p000;

/* renamed from: bcyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcyg extends bcyl {

    /* renamed from: a */
    private final bczf f105120a;

    /* renamed from: a */
    public final bdac mo57665a() {
        return bdac.HORIZONTAL_LINE;
    }

    /* renamed from: c */
    public final bczf mo57673c() {
        return this.f105120a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bdaa) {
            bdaa bdaa = (bdaa) obj;
            if (bdac.HORIZONTAL_LINE != bdaa.mo57665a() || !this.f105120a.equals(bdaa.mo57673c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f105120a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105120a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("Element{horizontalLine=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcyg(bczf bczf) {
        this.f105120a = bczf;
    }
}
