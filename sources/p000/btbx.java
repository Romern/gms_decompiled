package p000;

/* renamed from: btbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btbx extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btbx f148227c;

    /* renamed from: e */
    private static volatile bxxk f148228e;

    /* renamed from: a */
    public bler f148229a;

    /* renamed from: b */
    public long f148230b;

    /* renamed from: d */
    private byte f148231d = 2;

    static {
        btbx btbx = new btbx();
        f148227c = btbx;
        bxvk.m124024a(btbx.class, btbx);
    }

    private btbx() {
        bxtx bxtx = bxtx.f164797b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f148231d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f148231d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f148227c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001Љ\u0002\u0003", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btbx();
        } else {
            if (i2 == 4) {
                return new bxvd(f148227c);
            }
            if (i2 == 5) {
                return f148227c;
            }
            bxxk bxxk = f148228e;
            if (bxxk == null) {
                synchronized (btbx.class) {
                    bxxk = f148228e;
                    if (bxxk == null) {
                        bxxk = new bxve(f148227c);
                        f148228e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
