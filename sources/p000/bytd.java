package p000;

/* renamed from: bytd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bytd extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bytd f167658d;

    /* renamed from: f */
    private static volatile bxxk f167659f;

    /* renamed from: a */
    public int f167660a;

    /* renamed from: b */
    public bytc f167661b;

    /* renamed from: c */
    public bxtx f167662c = bxtx.f164797b;

    /* renamed from: e */
    private byte f167663e = 2;

    static {
        bytd bytd = new bytd();
        f167658d = bytd;
        bxvk.m124024a(bytd.class, bytd);
    }

    private bytd() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f167663e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f167663e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f167658d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔉ\u0000\u0002ᔊ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bytd();
        } else {
            if (i2 == 4) {
                return new bxvd(f167658d);
            }
            if (i2 == 5) {
                return f167658d;
            }
            bxxk bxxk = f167659f;
            if (bxxk == null) {
                synchronized (bytd.class) {
                    bxxk = f167659f;
                    if (bxxk == null) {
                        bxxk = new bxve(f167658d);
                        f167659f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
