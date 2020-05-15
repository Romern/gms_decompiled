package p000;

/* renamed from: of */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1240of {

    /* renamed from: a */
    public final Object f26798a;

    /* renamed from: b */
    public final Object f26799b;

    public C1240of(Object obj, Object obj2) {
        this.f26798a = obj;
        this.f26799b = obj2;
    }

    /* renamed from: a */
    public static C1240of m19758a(Object obj, Object obj2) {
        return new C1240of(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1240of) {
            C1240of ofVar = (C1240of) obj;
            if (!C1239oe.m19757a(ofVar.f26798a, this.f26798a) || !C1239oe.m19757a(ofVar.f26799b, this.f26799b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f26798a;
        int i = 0;
        int hashCode = obj != null ? obj.hashCode() : 0;
        Object obj2 = this.f26799b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "Pair{" + String.valueOf(this.f26798a) + " " + String.valueOf(this.f26799b) + "}";
    }
}
