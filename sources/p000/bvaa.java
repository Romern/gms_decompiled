package p000;

/* renamed from: bvaa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvaa extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvaa f155448d;

    /* renamed from: e */
    private static volatile bxxk f155449e;

    /* renamed from: a */
    public int f155450a;

    /* renamed from: b */
    public String f155451b = "";

    /* renamed from: c */
    public int f155452c;

    static {
        bvaa bvaa = new bvaa();
        f155448d = bvaa;
        GeneratedMessageLite.m124024a(bvaa.class, bvaa);
    }

    private bvaa() {
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
            return GeneratedMessageLite.m124022a(f155448d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", bvac.m120826b()});
        } else if (i2 == 3) {
            return new bvaa();
        } else {
            if (i2 == 4) {
                return new bxvd(f155448d);
            }
            if (i2 == 5) {
                return f155448d;
            }
            bxxk bxxk = f155449e;
            if (bxxk == null) {
                synchronized (bvaa.class) {
                    bxxk = f155449e;
                    if (bxxk == null) {
                        bxxk = new bxve(f155448d);
                        f155449e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
