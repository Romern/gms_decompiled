package p000;

/* renamed from: bfne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfne {

    /* renamed from: a */
    public final Object f114467a;

    /* renamed from: b */
    public final Object f114468b;

    public bfne(Object obj, Object obj2) {
        this.f114467a = obj;
        this.f114468b = obj2;
    }

    /* renamed from: a */
    public static bfne m97311a(Object obj, Object obj2) {
        return new bfne(obj, obj2);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bfne) {
            try {
                bfne bfne = (bfne) obj;
                Object obj2 = this.f114467a;
                if (obj2 != null) {
                    z = obj2.equals(bfne.f114467a);
                }
                Object obj3 = this.f114468b;
                return obj3 != null ? obj3.equals(bfne.f114468b) & z : z;
            } catch (ClassCastException e) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f114467a;
        int i = 17;
        if (obj != null) {
            i = (obj.hashCode() + 31) * 17;
        }
        Object obj2 = this.f114468b;
        return obj2 != null ? i * (obj2.hashCode() + 31) : i;
    }
}
