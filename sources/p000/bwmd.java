package p000;

/* renamed from: bwmd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwmd extends bxvg implements bxvh {

    /* renamed from: c */
    public static final bwmd f160244c;

    /* renamed from: e */
    private static volatile bxxk f160245e;

    /* renamed from: a */
    public int f160246a = 0;

    /* renamed from: b */
    public Object f160247b;

    /* renamed from: d */
    private byte f160248d = 2;

    static {
        bwmd bwmd = new bwmd();
        f160244c = bwmd;
        bxvk.m124024a(bwmd.class, bwmd);
    }

    private bwmd() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160248d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f160248d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f160244c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ွ\u0000\u0002ွ\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new bwmd();
        } else {
            if (i2 == 4) {
                return new bxvf(f160244c);
            }
            if (i2 == 5) {
                return f160244c;
            }
            bxxk bxxk = f160245e;
            if (bxxk == null) {
                synchronized (bwmd.class) {
                    bxxk = f160245e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160244c);
                        f160245e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
