package p000;

/* renamed from: ajnq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajnq extends bxvk implements bxxd {

    /* renamed from: i */
    public static final ajnq f70996i;

    /* renamed from: j */
    private static volatile bxxk f70997j;

    /* renamed from: a */
    public int f70998a;

    /* renamed from: b */
    public bxtx f70999b = bxtx.f164797b;

    /* renamed from: c */
    public bxtx f71000c = bxtx.f164797b;

    /* renamed from: d */
    public bxtx f71001d = bxtx.f164797b;

    /* renamed from: e */
    public long f71002e;

    /* renamed from: f */
    public long f71003f;

    /* renamed from: g */
    public bxtx f71004g = bxtx.f164797b;

    /* renamed from: h */
    public bxtx f71005h = bxtx.f164797b;

    static {
        ajnq ajnq = new ajnq();
        f70996i = ajnq;
        bxvk.m124024a(ajnq.class, ajnq);
    }

    private ajnq() {
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
            return bxvk.m124022a(f70996i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ည\u0005\u0007ည\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new ajnq();
        } else {
            if (i2 == 4) {
                return new bxvd(f70996i);
            }
            if (i2 == 5) {
                return f70996i;
            }
            bxxk bxxk = f70997j;
            if (bxxk == null) {
                synchronized (ajnq.class) {
                    bxxk = f70997j;
                    if (bxxk == null) {
                        bxxk = new bxve(f70996i);
                        f70997j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
