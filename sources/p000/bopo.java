package p000;

/* renamed from: bopo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bopo extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bopo f134154d;

    /* renamed from: e */
    private static volatile bxxk f134155e;

    /* renamed from: a */
    public int f134156a;

    /* renamed from: b */
    public String f134157b = "";

    /* renamed from: c */
    public boolean f134158c;

    static {
        bopo bopo = new bopo();
        f134154d = bopo;
        GeneratedMessageLite.m124024a(bopo.class, bopo);
    }

    private bopo() {
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
            return GeneratedMessageLite.m124022a(f134154d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\u0007", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bopo();
        } else {
            if (i2 == 4) {
                return new bxvd(f134154d);
            }
            if (i2 == 5) {
                return f134154d;
            }
            bxxk bxxk = f134155e;
            if (bxxk == null) {
                synchronized (bopo.class) {
                    bxxk = f134155e;
                    if (bxxk == null) {
                        bxxk = new bxve(f134154d);
                        f134155e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
