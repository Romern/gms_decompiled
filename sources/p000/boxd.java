package p000;

/* renamed from: boxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boxd extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final boxd f135227c;

    /* renamed from: d */
    private static volatile bxxk f135228d;

    /* renamed from: a */
    public int f135229a;

    /* renamed from: b */
    public int f135230b;

    static {
        boxd boxd = new boxd();
        f135227c = boxd;
        GeneratedMessageLite.m124024a(boxd.class, boxd);
    }

    private boxd() {
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
            return GeneratedMessageLite.m124022a(f135227c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", boxc.f135226a});
        } else if (i2 == 3) {
            return new boxd();
        } else {
            if (i2 == 4) {
                return new bxvd(f135227c);
            }
            if (i2 == 5) {
                return f135227c;
            }
            bxxk bxxk = f135228d;
            if (bxxk == null) {
                synchronized (boxd.class) {
                    bxxk = f135228d;
                    if (bxxk == null) {
                        bxxk = new bxve(f135227c);
                        f135228d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
