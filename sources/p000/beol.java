package p000;

/* renamed from: beol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beol {

    /* renamed from: a */
    public final String f111935a;

    /* renamed from: b */
    public final Class f111936b;

    public beol(String str, Class cls) {
        bmxy.m108581a(str);
        this.f111935a = str;
        bmxy.m108581a(cls);
        this.f111936b = cls;
    }

    /* renamed from: a */
    public static beol m95355a(String str) {
        return new beol(str, String.class);
    }

    /* renamed from: b */
    public static beol m95356b(String str) {
        return new beol(str, Integer.class);
    }

    /* renamed from: c */
    public static beol m95357c(String str) {
        return new beol(str, Boolean.class);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof beol) {
            beol beol = (beol) obj;
            return this.f111936b == beol.f111936b && this.f111935a.equals(beol.f111935a);
        }
    }

    public final int hashCode() {
        return this.f111935a.hashCode();
    }

    public final String toString() {
        return String.format("(%s, %s)", this.f111935a, this.f111936b);
    }
}
