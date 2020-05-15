package p000;

/* renamed from: bwgk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwgk extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwgk f159212d;

    /* renamed from: e */
    private static volatile bxxk f159213e;

    /* renamed from: a */
    public int f159214a;

    /* renamed from: b */
    public bmaj f159215b;

    /* renamed from: c */
    public bwgh f159216c;

    static {
        bwgk bwgk = new bwgk();
        f159212d = bwgk;
        GeneratedMessageLite.m124024a(bwgk.class, bwgk);
    }

    private bwgk() {
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
            return GeneratedMessageLite.m124022a(f159212d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwgk();
        } else {
            if (i2 == 4) {
                return new bxvd(f159212d);
            }
            if (i2 == 5) {
                return f159212d;
            }
            bxxk bxxk = f159213e;
            if (bxxk == null) {
                synchronized (bwgk.class) {
                    bxxk = f159213e;
                    if (bxxk == null) {
                        bxxk = new bxve(f159212d);
                        f159213e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
