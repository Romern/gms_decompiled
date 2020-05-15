package p000;

/* renamed from: bqqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqqy extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bqqy f141403c;

    /* renamed from: d */
    private static volatile bxxk f141404d;

    /* renamed from: a */
    public bqqz f141405a;

    /* renamed from: b */
    public int f141406b;

    static {
        bqqy bqqy = new bqqy();
        f141403c = bqqy;
        GeneratedMessageLite.m124024a(bqqy.class, bqqy);
    }

    private bqqy() {
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
            return GeneratedMessageLite.m124022a(f141403c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bqqy();
        } else {
            if (i2 == 4) {
                return new bxvd(f141403c);
            }
            if (i2 == 5) {
                return f141403c;
            }
            bxxk bxxk = f141404d;
            if (bxxk == null) {
                synchronized (bqqy.class) {
                    bxxk = f141404d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141403c);
                        f141404d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
