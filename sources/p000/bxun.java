package p000;

/* renamed from: bxun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxun extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxun f164861c;

    /* renamed from: d */
    private static volatile bxxk f164862d;

    /* renamed from: a */
    public long f164863a;

    /* renamed from: b */
    public int f164864b;

    static {
        bxun bxun = new bxun();
        f164861c = bxun;
        bxvk.m124024a(bxun.class, bxun);
    }

    private bxun() {
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
            return bxvk.m124022a(f164861c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bxun();
        } else {
            if (i2 == 4) {
                return new bxvd(f164861c);
            }
            if (i2 == 5) {
                return f164861c;
            }
            bxxk bxxk = f164862d;
            if (bxxk == null) {
                synchronized (bxun.class) {
                    bxxk = f164862d;
                    if (bxxk == null) {
                        bxxk = new bxve(f164861c);
                        f164862d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
