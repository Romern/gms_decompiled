package p000;

/* renamed from: adig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adig extends bxvk implements bxxd {

    /* renamed from: g */
    public static final adig f61785g;

    /* renamed from: h */
    private static volatile bxxk f61786h;

    /* renamed from: a */
    public int f61787a = 0;

    /* renamed from: b */
    public Object f61788b;

    /* renamed from: c */
    public String f61789c = "";

    /* renamed from: d */
    public String f61790d = "";

    /* renamed from: e */
    public String f61791e = "";

    /* renamed from: f */
    public String f61792f = "";

    static {
        adig adig = new adig();
        f61785g = adig;
        bxvk.m124024a(adig.class, adig);
    }

    private adig() {
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
            return bxvk.m124022a(f61785g, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȼ\u0000\u0004Ȼ\u0000\u0005Ȼ\u0000\u0006Ȉ\u0007Ȉ\bȻ\u0000", new Object[]{"b", "a", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new adig();
        } else {
            if (i2 == 4) {
                return new bxvd(f61785g);
            }
            if (i2 == 5) {
                return f61785g;
            }
            bxxk bxxk = f61786h;
            if (bxxk == null) {
                synchronized (adig.class) {
                    bxxk = f61786h;
                    if (bxxk == null) {
                        bxxk = new bxve(f61785g);
                        f61786h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
