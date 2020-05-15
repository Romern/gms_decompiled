package p000;

/* renamed from: bxot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxot extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxot f164207c;

    /* renamed from: d */
    private static volatile bxxk f164208d;

    /* renamed from: a */
    public int f164209a = 0;

    /* renamed from: b */
    public Object f164210b;

    static {
        bxot bxot = new bxot();
        f164207c = bxot;
        GeneratedMessageLite.m124024a(bxot.class, bxot);
    }

    private bxot() {
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
            return GeneratedMessageLite.m124022a(f164207c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", bxor.class, bxos.class, bxoq.class});
        } else if (i2 == 3) {
            return new bxot();
        } else {
            if (i2 == 4) {
                return new bxvd(f164207c);
            }
            if (i2 == 5) {
                return f164207c;
            }
            bxxk bxxk = f164208d;
            if (bxxk == null) {
                synchronized (bxot.class) {
                    bxxk = f164208d;
                    if (bxxk == null) {
                        bxxk = new bxve(f164207c);
                        f164208d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
