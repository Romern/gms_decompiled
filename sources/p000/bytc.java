package p000;

/* renamed from: bytc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bytc extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bytc f167647i;

    /* renamed from: k */
    private static volatile bxxk f167648k;

    /* renamed from: a */
    public int f167649a;

    /* renamed from: b */
    public int f167650b = 1;

    /* renamed from: c */
    public int f167651c = 1;

    /* renamed from: d */
    public bxtx f167652d = bxtx.f164797b;

    /* renamed from: e */
    public bxtx f167653e = bxtx.f164797b;

    /* renamed from: f */
    public bxtx f167654f = bxtx.f164797b;

    /* renamed from: g */
    public bxtx f167655g = bxtx.f164797b;

    /* renamed from: h */
    public int f167656h;

    /* renamed from: j */
    private byte f167657j = 2;

    static {
        bytc bytc = new bytc();
        f167647i = bytc;
        bxvk.m124024a(bytc.class, bytc);
    }

    private bytc() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f167657j);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f167657j = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f167647i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001ᔌ\u0000\u0002ᔌ\u0001\u0003ည\u0002\u0004ည\u0003\u0005ည\u0004\u0006ည\u0005\u0007ဋ\u0006", new Object[]{"a", "b", bytj.f167677a, "c", bysz.f167638a, "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bytc();
        } else {
            if (i2 == 4) {
                return new bxvd(f167647i);
            }
            if (i2 == 5) {
                return f167647i;
            }
            bxxk bxxk = f167648k;
            if (bxxk == null) {
                synchronized (bytc.class) {
                    bxxk = f167648k;
                    if (bxxk == null) {
                        bxxk = new bxve(f167647i);
                        f167648k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
