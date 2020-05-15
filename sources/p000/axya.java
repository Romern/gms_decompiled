package p000;

/* renamed from: axya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axya {

    /* renamed from: a */
    public final ayex f96744a;

    /* renamed from: b */
    public final String f96745b;

    /* renamed from: c */
    private final String f96746c;

    public axya(ayex ayex, String str, String str2) {
        this.f96744a = ayex;
        this.f96745b = str;
        this.f96746c = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ayex ayex = this.f96744a;
        if (ayex != null) {
            sb.append(ayex.f97414m);
        }
        if (!bmxx.m108577a(this.f96745b)) {
            if (sb.length() > 0) {
                sb.append(":");
            }
            sb.append(this.f96745b);
        }
        if (!bmxx.m108577a(this.f96746c)) {
            if (sb.length() > 0) {
                sb.append(":");
            }
            sb.append(this.f96746c);
        }
        return sb.toString();
    }

    public axya(String str) {
        this(null, null, str);
    }
}
