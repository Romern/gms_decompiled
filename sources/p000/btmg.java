package p000;

/* renamed from: btmg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btmg extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btmg f149482b;

    /* renamed from: c */
    private static volatile bxxk f149483c;

    /* renamed from: a */
    public int f149484a;

    static {
        btmg btmg = new btmg();
        f149482b = btmg;
        GeneratedMessageLite.m124024a(btmg.class, btmg);
    }

    private btmg() {
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
            return GeneratedMessageLite.m124022a(f149482b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btmg();
        } else {
            if (i2 == 4) {
                return new bxvd(f149482b);
            }
            if (i2 == 5) {
                return f149482b;
            }
            bxxk bxxk = f149483c;
            if (bxxk == null) {
                synchronized (btmg.class) {
                    bxxk = f149483c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149482b);
                        f149483c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
