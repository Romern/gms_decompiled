package p000;

/* renamed from: bzmb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzmb extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzmb f170600c;

    /* renamed from: d */
    private static volatile bxxk f170601d;

    /* renamed from: a */
    public int f170602a;

    /* renamed from: b */
    public bzmq f170603b;

    static {
        bzmb bzmb = new bzmb();
        f170600c = bzmb;
        bxvk.m124024a(bzmb.class, bzmb);
    }

    private bzmb() {
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
            return bxvk.m124022a(f170600c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzmb();
        } else {
            if (i2 == 4) {
                return new bxvd(f170600c);
            }
            if (i2 == 5) {
                return f170600c;
            }
            bxxk bxxk = f170601d;
            if (bxxk == null) {
                synchronized (bzmb.class) {
                    bxxk = f170601d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170600c);
                        f170601d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
