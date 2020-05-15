package p000;

/* renamed from: bwrc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwrc extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bwrc f160746e;

    /* renamed from: g */
    private static volatile bxxk f160747g;

    /* renamed from: a */
    public int f160748a;

    /* renamed from: b */
    public int f160749b;

    /* renamed from: c */
    public bwmd f160750c;

    /* renamed from: d */
    public bwmc f160751d;

    /* renamed from: f */
    private byte f160752f = 2;

    static {
        bwrc bwrc = new bwrc();
        f160746e = bwrc;
        bxvk.m124024a(bwrc.class, bwrc);
    }

    private bwrc() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160752f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f160752f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f160746e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", bwra.f160745a, "c", "d"});
        } else if (i2 == 3) {
            return new bwrc();
        } else {
            if (i2 == 4) {
                return new bxvd(f160746e);
            }
            if (i2 == 5) {
                return f160746e;
            }
            bxxk bxxk = f160747g;
            if (bxxk == null) {
                synchronized (bwrc.class) {
                    bxxk = f160747g;
                    if (bxxk == null) {
                        bxxk = new bxve(f160746e);
                        f160747g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
