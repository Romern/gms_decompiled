package p000;

/* renamed from: blsj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blsj extends bxvk implements bxxd {

    /* renamed from: i */
    public static final blsj f127585i;

    /* renamed from: k */
    private static volatile bxxk f127586k;

    /* renamed from: a */
    public int f127587a;

    /* renamed from: b */
    public bxtx f127588b = bxtx.f164797b;

    /* renamed from: c */
    public bxtx f127589c = bxtx.f164797b;

    /* renamed from: d */
    public bxwc f127590d = bxxn.f165040b;

    /* renamed from: e */
    public int f127591e = 1;

    /* renamed from: f */
    public bxtx f127592f = bxtx.f164797b;

    /* renamed from: g */
    public int f127593g;

    /* renamed from: h */
    public bxtx f127594h = bxtx.f164797b;

    /* renamed from: j */
    private byte f127595j = 2;

    static {
        blsj blsj = new blsj();
        f127585i = blsj;
        bxvk.m124024a(blsj.class, blsj);
    }

    private blsj() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127595j);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127595j = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f127585i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0002\u0001ᔊ\u0000\u0002ᔊ\u0001\u0003\u001c\u0004ဌ\u0002\u0005ည\u0003\u0006ဌ\u0004\u0007ည\u0005", new Object[]{"a", "b", "c", "d", "e", blsn.f127604a, "f", "g", blsl.f127603a, "h"});
        } else if (i2 == 3) {
            return new blsj();
        } else {
            if (i2 == 4) {
                return new bxvd(f127585i);
            }
            if (i2 == 5) {
                return f127585i;
            }
            bxxk bxxk = f127586k;
            if (bxxk == null) {
                synchronized (blsj.class) {
                    bxxk = f127586k;
                    if (bxxk == null) {
                        bxxk = new bxve(f127585i);
                        f127586k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
