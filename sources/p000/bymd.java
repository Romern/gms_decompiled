package p000;

/* renamed from: bymd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bymd extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bymd f167004c;

    /* renamed from: e */
    private static volatile bxxk f167005e;

    /* renamed from: a */
    public boolean f167006a;

    /* renamed from: b */
    public boolean f167007b;

    /* renamed from: d */
    private int f167008d;

    static {
        bymd bymd = new bymd();
        f167004c = bymd;
        bxvk.m124024a(bymd.class, bymd);
    }

    private bymd() {
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
            return bxvk.m124022a(f167004c, "\u0001\u0002\u0000\u0001\u000f\u0010\u0002\u0000\u0000\u0000\u000fဇ\u0003\u0010ဇ\u0004", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bymd();
        } else {
            if (i2 == 4) {
                return new bxvd(f167004c);
            }
            if (i2 == 5) {
                return f167004c;
            }
            bxxk bxxk = f167005e;
            if (bxxk == null) {
                synchronized (bymd.class) {
                    bxxk = f167005e;
                    if (bxxk == null) {
                        bxxk = new bxve(f167004c);
                        f167005e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
