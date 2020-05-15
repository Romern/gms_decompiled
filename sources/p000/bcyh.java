package p000;

/* renamed from: bcyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcyh extends bcyl {

    /* renamed from: a */
    private final bczh f105121a;

    /* renamed from: a */
    public final bdac mo57665a() {
        return bdac.IMAGE_ELEMENT;
    }

    /* renamed from: d */
    public final bczh mo57677d() {
        return this.f105121a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bdaa) {
            bdaa bdaa = (bdaa) obj;
            if (bdac.IMAGE_ELEMENT != bdaa.mo57665a() || !this.f105121a.equals(bdaa.mo57677d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f105121a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105121a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Element{imageElement=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcyh(bczh bczh) {
        this.f105121a = bczh;
    }
}
