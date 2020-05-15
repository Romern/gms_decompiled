package p000;

/* renamed from: cixf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cixf {

    /* renamed from: a */
    public final Object f191669a;

    /* renamed from: b */
    public final Object f191670b;

    public cixf(Object obj, Object obj2) {
        this.f191669a = obj;
        this.f191670b = obj2;
    }

    /* renamed from: a */
    private static final boolean m151111a(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cixf)) {
            return false;
        }
        cixf cixf = (cixf) obj;
        return m151111a(cixf.f191669a, this.f191669a) && m151111a(cixf.f191670b, this.f191670b);
    }

    public final int hashCode() {
        return this.f191669a.hashCode() ^ this.f191670b.hashCode();
    }
}
