package p000;

/* renamed from: budh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class budh extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final budh f153466e;

    /* renamed from: f */
    private static volatile bxxk f153467f;

    /* renamed from: a */
    public int f153468a;

    /* renamed from: b */
    public bucz f153469b;

    /* renamed from: c */
    public bucx f153470c;

    /* renamed from: d */
    public budr f153471d;

    static {
        budh budh = new budh();
        f153466e = budh;
        GeneratedMessageLite.m124024a(budh.class, budh);
    }

    private budh() {
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
            return GeneratedMessageLite.m124022a(f153466e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new budh();
        } else {
            if (i2 == 4) {
                return new bxvd(f153466e);
            }
            if (i2 == 5) {
                return f153466e;
            }
            bxxk bxxk = f153467f;
            if (bxxk == null) {
                synchronized (budh.class) {
                    bxxk = f153467f;
                    if (bxxk == null) {
                        bxxk = new bxve(f153466e);
                        f153467f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
