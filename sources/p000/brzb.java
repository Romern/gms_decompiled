package p000;

/* renamed from: brzb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brzb extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final brzb f143707d;

    /* renamed from: e */
    private static volatile bxxk f143708e;

    /* renamed from: a */
    public int f143709a;

    /* renamed from: b */
    public brzc f143710b;

    /* renamed from: c */
    public brzf f143711c;

    static {
        brzb brzb = new brzb();
        f143707d = brzb;
        GeneratedMessageLite.m124024a(brzb.class, brzb);
    }

    private brzb() {
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
            return GeneratedMessageLite.m124022a(f143707d, "\u0001\u0002\u0000\u0001\u0002\u0006\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0006ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new brzb();
        } else {
            if (i2 == 4) {
                return new bxvd(f143707d);
            }
            if (i2 == 5) {
                return f143707d;
            }
            bxxk bxxk = f143708e;
            if (bxxk == null) {
                synchronized (brzb.class) {
                    bxxk = f143708e;
                    if (bxxk == null) {
                        bxxk = new bxve(f143707d);
                        f143708e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
