package p000;

/* renamed from: budy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class budy extends bxvk implements bxxd {

    /* renamed from: e */
    public static final budy f153551e;

    /* renamed from: g */
    private static volatile bxxk f153552g;

    /* renamed from: a */
    public float f153553a;

    /* renamed from: b */
    public float f153554b;

    /* renamed from: c */
    public float f153555c;

    /* renamed from: d */
    public float f153556d;

    /* renamed from: f */
    private int f153557f;

    static {
        budy budy = new budy();
        f153551e = budy;
        bxvk.m124024a(budy.class, budy);
    }

    private budy() {
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
            return bxvk.m124022a(f153551e, "\u0001\u0004\u0000\u0001\u0001\u0010\u0004\u0000\u0000\u0000\u0001ခ\u0000\u000bခ\u0002\fခ\u0003\u0010ခ\u0001", new Object[]{"f", "a", "c", "d", "b"});
        } else if (i2 == 3) {
            return new budy();
        } else {
            if (i2 == 4) {
                return new bxvd(f153551e);
            }
            if (i2 == 5) {
                return f153551e;
            }
            bxxk bxxk = f153552g;
            if (bxxk == null) {
                synchronized (budy.class) {
                    bxxk = f153552g;
                    if (bxxk == null) {
                        bxxk = new bxve(f153551e);
                        f153552g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
