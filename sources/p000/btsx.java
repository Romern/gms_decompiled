package p000;

/* renamed from: btsx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btsx extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btsx f150300c;

    /* renamed from: d */
    private static volatile bxxk f150301d;

    /* renamed from: a */
    public int f150302a;

    /* renamed from: b */
    public bxtx f150303b = bxtx.f164797b;

    static {
        btsx btsx = new btsx();
        f150300c = btsx;
        bxvk.m124024a(btsx.class, btsx);
    }

    private btsx() {
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
            return bxvk.m124022a(f150300c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btsx();
        } else {
            if (i2 == 4) {
                return new bxvd(f150300c);
            }
            if (i2 == 5) {
                return f150300c;
            }
            bxxk bxxk = f150301d;
            if (bxxk == null) {
                synchronized (btsx.class) {
                    bxxk = f150301d;
                    if (bxxk == null) {
                        bxxk = new bxve(f150300c);
                        f150301d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
