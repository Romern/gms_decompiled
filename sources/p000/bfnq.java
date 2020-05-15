package p000;

/* renamed from: bfnq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfnq {

    /* renamed from: a */
    public final Object f114500a;

    /* renamed from: b */
    public final Object f114501b;

    /* renamed from: c */
    public final Object f114502c;

    public bfnq(Object obj, Object obj2, Object obj3) {
        this.f114500a = obj;
        this.f114501b = obj2;
        this.f114502c = obj3;
    }

    /* renamed from: a */
    public static bfnq m97344a(Object obj, Object obj2, Object obj3) {
        return new bfnq(obj, obj2, obj3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bfnq) {
            bfnq bfnq = (bfnq) obj;
            return m97345a(this.f114500a, bfnq.f114500a) && m97345a(this.f114501b, bfnq.f114501b) && m97345a(this.f114502c, bfnq.f114502c);
        }
    }

    public final int hashCode() {
        Object obj = this.f114500a;
        int i = 0;
        int hashCode = ((obj != null ? obj.hashCode() : 0) + 527) * 31;
        Object obj2 = this.f114501b;
        int hashCode2 = (hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object obj3 = this.f114502c;
        if (obj3 != null) {
            i = obj3.hashCode();
        }
        return hashCode2 + i;
    }

    /* renamed from: a */
    private static boolean m97345a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
