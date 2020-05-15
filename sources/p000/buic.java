package p000;

/* renamed from: buic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buic extends bxvk implements bxxd {

    /* renamed from: c */
    public static final buic f153922c;

    /* renamed from: e */
    private static volatile bxxk f153923e;

    /* renamed from: a */
    public long f153924a;

    /* renamed from: b */
    public int f153925b;

    /* renamed from: d */
    private int f153926d;

    static {
        buic buic = new buic();
        f153922c = buic;
        bxvk.m124024a(buic.class, buic);
    }

    private buic() {
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
            return bxvk.m124022a(f153922c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဏ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new buic();
        } else {
            if (i2 == 4) {
                return new bxvd(f153922c);
            }
            if (i2 == 5) {
                return f153922c;
            }
            bxxk bxxk = f153923e;
            if (bxxk == null) {
                synchronized (buic.class) {
                    bxxk = f153923e;
                    if (bxxk == null) {
                        bxxk = new bxve(f153922c);
                        f153923e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
