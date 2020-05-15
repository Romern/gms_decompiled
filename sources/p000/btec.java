package p000;

/* renamed from: btec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btec extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btec f148490c;

    /* renamed from: e */
    private static volatile bxxk f148491e;

    /* renamed from: a */
    public bler f148492a;

    /* renamed from: b */
    public bynx f148493b;

    /* renamed from: d */
    private byte f148494d = 2;

    static {
        btec btec = new btec();
        f148490c = btec;
        bxvk.m124024a(btec.class, btec);
    }

    private btec() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f148494d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f148494d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f148490c, "\u0000\u0002\u0000\u0000\u0003\u0005\u0002\u0000\u0000\u0001\u0003Љ\u0005\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btec();
        } else {
            if (i2 == 4) {
                return new bxvd(f148490c);
            }
            if (i2 == 5) {
                return f148490c;
            }
            bxxk bxxk = f148491e;
            if (bxxk == null) {
                synchronized (btec.class) {
                    bxxk = f148491e;
                    if (bxxk == null) {
                        bxxk = new bxve(f148490c);
                        f148491e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
