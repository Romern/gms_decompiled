package p000;

/* renamed from: blim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blim extends bxvk implements bxxd {

    /* renamed from: d */
    public static final blim f126629d;

    /* renamed from: e */
    private static volatile bxxk f126630e;

    /* renamed from: a */
    public int f126631a;

    /* renamed from: b */
    public blil f126632b;

    /* renamed from: c */
    public blik f126633c;

    static {
        blim blim = new blim();
        f126629d = blim;
        bxvk.m124024a(blim.class, blim);
    }

    private blim() {
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
            return bxvk.m124022a(f126629d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new blim();
        } else {
            if (i2 == 4) {
                return new bxvd(f126629d);
            }
            if (i2 == 5) {
                return f126629d;
            }
            bxxk bxxk = f126630e;
            if (bxxk == null) {
                synchronized (blim.class) {
                    bxxk = f126630e;
                    if (bxxk == null) {
                        bxxk = new bxve(f126629d);
                        f126630e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
