package p000;

/* renamed from: bwqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwqy extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bwqy f160737b;

    /* renamed from: d */
    private static volatile bxxk f160738d;

    /* renamed from: a */
    public String f160739a = "";

    /* renamed from: c */
    private int f160740c;

    static {
        bwqy bwqy = new bwqy();
        f160737b = bwqy;
        bxvk.m124024a(bwqy.class, bwqy);
    }

    private bwqy() {
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
            return bxvk.m124022a(f160737b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bwqy();
        } else {
            if (i2 == 4) {
                return new bxvd(f160737b);
            }
            if (i2 == 5) {
                return f160737b;
            }
            bxxk bxxk = f160738d;
            if (bxxk == null) {
                synchronized (bwqy.class) {
                    bxxk = f160738d;
                    if (bxxk == null) {
                        bxxk = new bxve(f160737b);
                        f160738d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
