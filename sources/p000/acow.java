package p000;

/* renamed from: acow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acow implements Comparable {

    /* renamed from: a */
    public String f60377a;

    /* renamed from: b */
    public String f60378b;

    /* renamed from: c */
    public String f60379c;

    /* renamed from: a */
    public final int compareTo(acow acow) {
        int compareTo = this.f60377a.compareTo(acow.f60377a);
        if (compareTo == 0) {
            String str = this.f60378b;
            String str2 = acow.f60378b;
            if (str != str2) {
                compareTo = str != null ? str2 != null ? str.compareTo((Object) str2) : 1 : -1;
            } else {
                compareTo = 0;
            }
            if (compareTo == 0) {
                return mo32970a().compareTo(acow.mo32970a());
            }
        }
        return compareTo;
    }

    /* renamed from: a */
    public final String mo32970a() {
        String str = this.f60379c;
        return str == null ? "none" : str;
    }
}
