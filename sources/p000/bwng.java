package p000;

/* renamed from: bwng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwng extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwng f160355c;

    /* renamed from: d */
    private static volatile bxxk f160356d;

    /* renamed from: a */
    public int f160357a = 0;

    /* renamed from: b */
    public Object f160358b;

    static {
        bwng bwng = new bwng();
        f160355c = bwng;
        bxvk.m124024a(bwng.class, bwng);
    }

    private bwng() {
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
            return bxvk.m124022a(f160355c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ျ\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new bwng();
        } else {
            if (i2 == 4) {
                return new bxvd(f160355c);
            }
            if (i2 == 5) {
                return f160355c;
            }
            bxxk bxxk = f160356d;
            if (bxxk == null) {
                synchronized (bwng.class) {
                    bxxk = f160356d;
                    if (bxxk == null) {
                        bxxk = new bxve(f160355c);
                        f160356d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
