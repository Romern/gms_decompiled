package p000;

/* renamed from: bzbz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzbz extends bxvg implements bxvh {

    /* renamed from: c */
    public static final bzbz f169283c;

    /* renamed from: e */
    private static volatile bxxk f169284e;

    /* renamed from: a */
    public int f169285a;

    /* renamed from: b */
    public bzca f169286b;

    /* renamed from: d */
    private byte f169287d = 2;

    static {
        bzbz bzbz = new bzbz();
        f169283c = bzbz;
        GeneratedMessageLite.m124024a(bzbz.class, bzbz);
    }

    private bzbz() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169287d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169287d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f169283c, "\u0001\u0001\u0000\u0001\t\t\u0001\u0000\u0000\u0001\tᐉ\u0002", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzbz();
        } else {
            if (i2 == 4) {
                return new bxvf(f169283c);
            }
            if (i2 == 5) {
                return f169283c;
            }
            bxxk bxxk = f169284e;
            if (bxxk == null) {
                synchronized (bzbz.class) {
                    bxxk = f169284e;
                    if (bxxk == null) {
                        bxxk = new bxve(f169283c);
                        f169284e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
