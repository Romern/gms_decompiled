package p000;

/* renamed from: caey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caey extends bxvk implements bxxd {

    /* renamed from: e */
    public static final caey f172871e;

    /* renamed from: f */
    private static volatile bxxk f172872f;

    /* renamed from: a */
    public int f172873a;

    /* renamed from: b */
    public int f172874b = 0;

    /* renamed from: c */
    public Object f172875c;

    /* renamed from: d */
    public int f172876d;

    static {
        caey caey = new caey();
        f172871e = caey;
        bxvk.m124024a(caey.class, caey);
    }

    private caey() {
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
            return bxvk.m124022a(f172871e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ျ\u0000\u0002ဿ\u0000\u0003ဋ\u0002", new Object[]{"c", "b", "a", caex.m126563b(), "d"});
        } else if (i2 == 3) {
            return new caey();
        } else {
            if (i2 == 4) {
                return new bxvd(f172871e);
            }
            if (i2 == 5) {
                return f172871e;
            }
            bxxk bxxk = f172872f;
            if (bxxk == null) {
                synchronized (caey.class) {
                    bxxk = f172872f;
                    if (bxxk == null) {
                        bxxk = new bxve(f172871e);
                        f172872f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
