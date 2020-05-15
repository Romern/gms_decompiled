package p000;

/* renamed from: blyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blyb extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final blyb f128189c;

    /* renamed from: d */
    private static volatile bxxk f128190d;

    /* renamed from: a */
    public int f128191a = 0;

    /* renamed from: b */
    public Object f128192b;

    static {
        blyb blyb = new blyb();
        f128189c = blyb;
        GeneratedMessageLite.m124024a(blyb.class, blyb);
    }

    private blyb() {
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
            return GeneratedMessageLite.m124022a(f128189c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ြ\u0000", new Object[]{"b", "a", blya.class});
        } else if (i2 == 3) {
            return new blyb();
        } else {
            if (i2 == 4) {
                return new bxvd(f128189c);
            }
            if (i2 == 5) {
                return f128189c;
            }
            bxxk bxxk = f128190d;
            if (bxxk == null) {
                synchronized (blyb.class) {
                    bxxk = f128190d;
                    if (bxxk == null) {
                        bxxk = new bxve(f128189c);
                        f128190d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
