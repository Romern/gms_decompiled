package p000;

/* renamed from: bfya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfya extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bfya f115644c;

    /* renamed from: d */
    private static volatile bxxk f115645d;

    /* renamed from: a */
    public boolean f115646a;

    /* renamed from: b */
    public int f115647b;

    static {
        bfya bfya = new bfya();
        f115644c = bfya;
        GeneratedMessageLite.m124024a(bfya.class, bfya);
    }

    private bfya() {
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
            return GeneratedMessageLite.m124022a(f115644c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\f", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bfya();
        } else {
            if (i2 == 4) {
                return new bxvd(f115644c);
            }
            if (i2 == 5) {
                return f115644c;
            }
            bxxk bxxk = f115645d;
            if (bxxk == null) {
                synchronized (bfya.class) {
                    bxxk = f115645d;
                    if (bxxk == null) {
                        bxxk = new bxve(f115644c);
                        f115645d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
