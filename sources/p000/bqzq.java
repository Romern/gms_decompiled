package p000;

/* renamed from: bqzq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqzq extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bqzq f142077c;

    /* renamed from: d */
    private static volatile bxxk f142078d;

    /* renamed from: a */
    public int f142079a;

    /* renamed from: b */
    public bqzp f142080b;

    static {
        bqzq bqzq = new bqzq();
        f142077c = bqzq;
        GeneratedMessageLite.m124024a(bqzq.class, bqzq);
    }

    private bqzq() {
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
            return GeneratedMessageLite.m124022a(f142077c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bqzq();
        } else {
            if (i2 == 4) {
                return new bxvd(f142077c);
            }
            if (i2 == 5) {
                return f142077c;
            }
            bxxk bxxk = f142078d;
            if (bxxk == null) {
                synchronized (bqzq.class) {
                    bxxk = f142078d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142077c);
                        f142078d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
