package p000;

/* renamed from: byjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byjk extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final byjk f166662e;

    /* renamed from: f */
    private static volatile bxxk f166663f;

    /* renamed from: a */
    public int f166664a;

    /* renamed from: b */
    public boolean f166665b = true;

    /* renamed from: c */
    public boolean f166666c = true;

    /* renamed from: d */
    public bxun f166667d;

    static {
        byjk byjk = new byjk();
        f166662e = byjk;
        GeneratedMessageLite.m124024a(byjk.class, byjk);
    }

    private byjk() {
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
            return GeneratedMessageLite.m124022a(f166662e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new byjk();
        } else {
            if (i2 == 4) {
                return new bxvd(f166662e);
            }
            if (i2 == 5) {
                return f166662e;
            }
            bxxk bxxk = f166663f;
            if (bxxk == null) {
                synchronized (byjk.class) {
                    bxxk = f166663f;
                    if (bxxk == null) {
                        bxxk = new bxve(f166662e);
                        f166663f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
