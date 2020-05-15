package p000;

/* renamed from: bay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bay {

    /* renamed from: a */
    public Object f2818a;

    /* renamed from: b */
    public Object f2819b;

    /* renamed from: a */
    private static boolean m2616a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1240of) {
            C1240of ofVar = (C1240of) obj;
            if (!m2616a(ofVar.f26798a, this.f2818a) || !m2616a(ofVar.f26799b, this.f2819b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f2818a;
        int i = 0;
        int hashCode = obj != null ? obj.hashCode() : 0;
        Object obj2 = this.f2819b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "Pair{" + String.valueOf(this.f2818a) + " " + String.valueOf(this.f2819b) + "}";
    }
}
