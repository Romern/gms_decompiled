package p000;

/* renamed from: adiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adiv extends bxvk implements bxxd {

    /* renamed from: c */
    public static final adiv f61845c;

    /* renamed from: d */
    private static volatile bxxk f61846d;

    /* renamed from: a */
    public int f61847a = 0;

    /* renamed from: b */
    public Object f61848b;

    static {
        adiv adiv = new adiv();
        f61845c = adiv;
        bxvk.m124024a(adiv.class, adiv);
    }

    private adiv() {
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
            return bxvk.m124022a(f61845c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u0002Ȼ\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new adiv();
        } else {
            if (i2 == 4) {
                return new bxvd(f61845c);
            }
            if (i2 == 5) {
                return f61845c;
            }
            bxxk bxxk = f61846d;
            if (bxxk == null) {
                synchronized (adiv.class) {
                    bxxk = f61846d;
                    if (bxxk == null) {
                        bxxk = new bxve(f61845c);
                        f61846d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
