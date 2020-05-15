package p000;

/* renamed from: call */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1706call extends bxvk implements bxxd {

    /* renamed from: e */
    public static final C1706call f175148e;

    /* renamed from: f */
    private static volatile bxxk f175149f;

    /* renamed from: a */
    public int f175150a;

    /* renamed from: b */
    public calo f175151b;

    /* renamed from: c */
    public bxvt f175152c = bxvm.f164965b;

    /* renamed from: d */
    public int f175153d;

    static {
        C1706call call = new C1706call();
        f175148e = call;
        bxvk.m124024a(C1706call.class, call);
    }

    private C1706call() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return bxvk.m124022a(f175148e, "\u0001\u0003\u0000\u0001\u0001\u000f\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001e\u000fင\u0001", new Object[]{"a", "b", "c", bymk.m124956b(), "d"});
        } else if (i2 == 3) {
            return new C1706call();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (float[]) null);
            }
            if (i2 == 5) {
                return f175148e;
            }
            bxxk bxxk = f175149f;
            if (bxxk == null) {
                synchronized (C1706call.class) {
                    bxxk = f175149f;
                    if (bxxk == null) {
                        bxxk = new bxve(f175148e);
                        f175149f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
