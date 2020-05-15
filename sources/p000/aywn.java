package p000;

/* renamed from: aywn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aywn {

    /* renamed from: a */
    public final bxuq f98632a;

    /* renamed from: b */
    public final Object f98633b;

    private aywn(bxuq bxuq, Object obj) {
        boolean z = false;
        if (bxuq.mo73900a() >= 100000000 && bxuq.mo73900a() < 200000000) {
            z = true;
        }
        bmxy.m108588a(z);
        this.f98632a = bxuq;
        this.f98633b = obj;
    }

    /* renamed from: a */
    public static aywn m84990a(bxuq bxuq, Object obj) {
        return new aywn(bxuq, obj);
    }
}
