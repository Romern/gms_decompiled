package p000;

/* renamed from: bptr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bptr extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bptr f139165g;

    /* renamed from: h */
    private static volatile bxxk f139166h;

    /* renamed from: a */
    public int f139167a;

    /* renamed from: b */
    public int f139168b;

    /* renamed from: c */
    public int f139169c;

    /* renamed from: d */
    public bxwc f139170d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f139171e = bxxn.f165040b;

    /* renamed from: f */
    public int f139172f;

    static {
        bptr bptr = new bptr();
        f139165g = bptr;
        bxvk.m124024a(bptr.class, bptr);
    }

    private bptr() {
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
            return bxvk.m124022a(f139165g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\u001b\u0004\u001b\u0005ဌ\u0002", new Object[]{"a", "b", bpfn.m111877b(), "c", bpfo.f137426a, "d", bptc.class, "e", bptc.class, "f", bpes.m111844b()});
        } else if (i2 == 3) {
            return new bptr();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (short[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f139165g;
            }
            bxxk bxxk = f139166h;
            if (bxxk == null) {
                synchronized (bptr.class) {
                    bxxk = f139166h;
                    if (bxxk == null) {
                        bxxk = new bxve(f139165g);
                        f139166h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
