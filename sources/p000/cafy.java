package p000;

/* renamed from: cafy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cafy extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cafy f173056c;

    /* renamed from: d */
    private static volatile bxxk f173057d;

    /* renamed from: a */
    public int f173058a;

    /* renamed from: b */
    public boolean f173059b;

    static {
        cafy cafy = new cafy();
        f173056c = cafy;
        bxvk.m124024a(cafy.class, cafy);
    }

    private cafy() {
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
            return bxvk.m124022a(f173056c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဇ\u0002", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cafy();
        } else {
            if (i2 == 4) {
                return new bxvd(f173056c);
            }
            if (i2 == 5) {
                return f173056c;
            }
            bxxk bxxk = f173057d;
            if (bxxk == null) {
                synchronized (cafy.class) {
                    bxxk = f173057d;
                    if (bxxk == null) {
                        bxxk = new bxve(f173056c);
                        f173057d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
