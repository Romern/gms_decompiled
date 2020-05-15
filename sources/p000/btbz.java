package p000;

/* renamed from: btbz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btbz extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btbz f148238b;

    /* renamed from: d */
    private static volatile bxxk f148239d;

    /* renamed from: a */
    public btec f148240a;

    /* renamed from: c */
    private byte f148241c = 2;

    static {
        btbz btbz = new btbz();
        f148238b = btbz;
        bxvk.m124024a(btbz.class, btbz);
    }

    private btbz() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f148241c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f148241c = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f148238b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btbz();
        } else {
            if (i2 == 4) {
                return new bxvd(f148238b);
            }
            if (i2 == 5) {
                return f148238b;
            }
            bxxk bxxk = f148239d;
            if (bxxk == null) {
                synchronized (btbz.class) {
                    bxxk = f148239d;
                    if (bxxk == null) {
                        bxxk = new bxve(f148238b);
                        f148239d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
