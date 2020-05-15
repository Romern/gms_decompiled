package p000;

/* renamed from: rob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rob {

    /* renamed from: a */
    private final Object f43426a;

    /* renamed from: b */
    private final String f43427b;

    public rob(Object obj, String str) {
        this.f43426a = obj;
        this.f43427b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rob) {
            rob rob = (rob) obj;
            return this.f43426a == rob.f43426a && this.f43427b.equals(rob.f43427b);
        }
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f43426a) * 31) + this.f43427b.hashCode();
    }
}
