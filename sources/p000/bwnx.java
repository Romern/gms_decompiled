package p000;

/* renamed from: bwnx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwnx extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bwnx f160410b;

    /* renamed from: d */
    private static volatile bxxk f160411d;

    /* renamed from: a */
    public String f160412a = "";

    /* renamed from: c */
    private int f160413c;

    static {
        bwnx bwnx = new bwnx();
        f160410b = bwnx;
        bxvk.m124024a(bwnx.class, bwnx);
    }

    private bwnx() {
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
            return bxvk.m124022a(f160410b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bwnx();
        } else {
            if (i2 == 4) {
                return new bxvd(f160410b);
            }
            if (i2 == 5) {
                return f160410b;
            }
            bxxk bxxk = f160411d;
            if (bxxk == null) {
                synchronized (bwnx.class) {
                    bxxk = f160411d;
                    if (bxxk == null) {
                        bxxk = new bxve(f160410b);
                        f160411d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
