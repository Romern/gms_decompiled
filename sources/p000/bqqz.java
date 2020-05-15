package p000;

/* renamed from: bqqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqqz extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bqqz f141407b;

    /* renamed from: c */
    private static volatile bxxk f141408c;

    /* renamed from: a */
    public int f141409a;

    static {
        bqqz bqqz = new bqqz();
        f141407b = bqqz;
        GeneratedMessageLite.m124024a(bqqz.class, bqqz);
    }

    private bqqz() {
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
            return GeneratedMessageLite.m124022a(f141407b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bqqz();
        } else {
            if (i2 == 4) {
                return new bxvd(f141407b);
            }
            if (i2 == 5) {
                return f141407b;
            }
            bxxk bxxk = f141408c;
            if (bxxk == null) {
                synchronized (bqqz.class) {
                    bxxk = f141408c;
                    if (bxxk == null) {
                        bxxk = new bxve(f141407b);
                        f141408c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
