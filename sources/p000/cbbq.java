package p000;

/* renamed from: cbbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbbq extends bxvk implements bxxd {

    /* renamed from: h */
    public static final cbbq f176602h;

    /* renamed from: i */
    private static volatile bxxk f176603i;

    /* renamed from: a */
    public int f176604a = 0;

    /* renamed from: b */
    public Object f176605b;

    /* renamed from: c */
    public String f176606c = "";

    /* renamed from: d */
    public int f176607d;

    /* renamed from: e */
    public bxtx f176608e = bxtx.f164797b;

    /* renamed from: f */
    public String f176609f = "";

    /* renamed from: g */
    public int f176610g;

    static {
        cbbq cbbq = new cbbq();
        f176602h = cbbq;
        bxvk.m124024a(cbbq.class, cbbq);
    }

    private cbbq() {
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
            return bxvk.m124022a(f176602h, "\u0000\u0007\u0001\u0000\u00013\u0007\u0000\u0000\u0000\u0001Ȉ\u0005\u0004\u0006\n\u0007Ȉ\b\f2<\u00003Ȼ\u0000", new Object[]{"b", "a", "c", "d", "e", "f", "g", cbmf.class});
        } else if (i2 == 3) {
            return new cbbq();
        } else {
            if (i2 == 4) {
                return new bxvd(f176602h);
            }
            if (i2 == 5) {
                return f176602h;
            }
            bxxk bxxk = f176603i;
            if (bxxk == null) {
                synchronized (cbbq.class) {
                    bxxk = f176603i;
                    if (bxxk == null) {
                        bxxk = new bxve(f176602h);
                        f176603i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
