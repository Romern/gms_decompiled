package p000;

/* renamed from: bkky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkky extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bkky f124670c;

    /* renamed from: d */
    private static volatile bxxk f124671d;

    /* renamed from: a */
    public int f124672a = 0;

    /* renamed from: b */
    public Object f124673b;

    static {
        bkky bkky = new bkky();
        f124670c = bkky;
        bxvk.m124024a(bkky.class, bkky);
    }

    private bkky() {
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
            return bxvk.m124022a(f124670c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", bybw.class});
        } else if (i2 == 3) {
            return new bkky();
        } else {
            if (i2 == 4) {
                return new bxvd(f124670c);
            }
            if (i2 == 5) {
                return f124670c;
            }
            bxxk bxxk = f124671d;
            if (bxxk == null) {
                synchronized (bkky.class) {
                    bxxk = f124671d;
                    if (bxxk == null) {
                        bxxk = new bxve(f124670c);
                        f124671d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
