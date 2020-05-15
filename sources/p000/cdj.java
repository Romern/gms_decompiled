package p000;

/* renamed from: cdj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdj {

    /* renamed from: a */
    public static final cdi f6571a = new cdh();

    /* renamed from: b */
    public final Object f6572b;

    /* renamed from: c */
    public final cdi f6573c;

    /* renamed from: d */
    public final String f6574d;

    /* renamed from: e */
    public volatile byte[] f6575e;

    public cdj(String str, Object obj, cdi cdi) {
        crb.m7384a(str);
        this.f6574d = str;
        this.f6572b = obj;
        crb.m7382a(cdi);
        this.f6573c = cdi;
    }

    /* renamed from: a */
    public static cdj m3994a(String str, Object obj) {
        return new cdj(str, obj, f6571a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cdj) {
            return this.f6574d.equals(((cdj) obj).f6574d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6574d.hashCode();
    }

    public final String toString() {
        String str = this.f6574d;
        StringBuilder sb = new StringBuilder(str.length() + 14);
        sb.append("Option{key='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    /* renamed from: a */
    public static cdj m3995a(String str, Object obj, cdi cdi) {
        return new cdj(str, obj, cdi);
    }
}
