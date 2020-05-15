package p000;

/* renamed from: boxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boxj extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final boxj f135256c;

    /* renamed from: d */
    private static volatile bxxk f135257d;

    /* renamed from: a */
    public int f135258a;

    /* renamed from: b */
    public int f135259b;

    static {
        boxj boxj = new boxj();
        f135256c = boxj;
        GeneratedMessageLite.m124024a(boxj.class, boxj);
    }

    private boxj() {
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
            return GeneratedMessageLite.m124022a(f135256c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", boxi.f135255a});
        } else if (i2 == 3) {
            return new boxj();
        } else {
            if (i2 == 4) {
                return new bxvd(f135256c);
            }
            if (i2 == 5) {
                return f135256c;
            }
            bxxk bxxk = f135257d;
            if (bxxk == null) {
                synchronized (boxj.class) {
                    bxxk = f135257d;
                    if (bxxk == null) {
                        bxxk = new bxve(f135256c);
                        f135257d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
