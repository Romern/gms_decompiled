package p000;

/* renamed from: cazj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cazj implements cijl {

    /* renamed from: a */
    private static final Object f176447a = new Object();

    /* renamed from: b */
    private volatile cijl f176448b;

    /* renamed from: c */
    private volatile Object f176449c = f176447a;

    private cazj(cijl cijl) {
        this.f176448b = cijl;
    }

    /* renamed from: a */
    public static cijl m127604a(cijl cijl) {
        if ((cijl instanceof cazj) || (cijl instanceof cayx)) {
            return cijl;
        }
        cazf.m127594a(cijl);
        return new cazj(cijl);
    }

    /* renamed from: a */
    public final Object mo6445a() {
        Object obj = this.f176449c;
        if (obj != f176447a) {
            return obj;
        }
        cijl cijl = this.f176448b;
        if (cijl == null) {
            return this.f176449c;
        }
        Object a = cijl.mo6445a();
        this.f176449c = a;
        this.f176448b = null;
        return a;
    }
}
