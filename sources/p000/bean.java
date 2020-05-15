package p000;

/* renamed from: bean */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bean extends Exception {

    /* renamed from: a */
    public final int f106746a;

    /* renamed from: b */
    private final String f106747b;

    public bean(int i, String str) {
        super(str);
        this.f106747b = str;
        this.f106746a = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Error type: ");
        int i = this.f106746a;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "TOO_LONG" : "TOO_SHORT_NSN" : "TOO_SHORT_AFTER_IDD" : "NOT_A_NUMBER" : "INVALID_COUNTRY_CODE"));
        sb.append(". ");
        sb.append(this.f106747b);
        return sb.toString();
    }
}
