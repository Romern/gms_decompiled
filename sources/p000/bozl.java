package p000;

/* renamed from: bozl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bozl extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bozl f135386f;

    /* renamed from: g */
    private static volatile bxxk f135387g;

    /* renamed from: a */
    public int f135388a;

    /* renamed from: b */
    public int f135389b;

    /* renamed from: c */
    public int f135390c;

    /* renamed from: d */
    public String f135391d = "";

    /* renamed from: e */
    public int f135392e;

    static {
        bozl bozl = new bozl();
        f135386f = bozl;
        GeneratedMessageLite.m124024a(bozl.class, bozl);
    }

    private bozl() {
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
            return GeneratedMessageLite.m124022a(f135386f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", bozj.f135384a, "c", bozk.f135385a, "d", "e", bozh.f135383a});
        } else if (i2 == 3) {
            return new bozl();
        } else {
            if (i2 == 4) {
                return new bxvd(f135386f);
            }
            if (i2 == 5) {
                return f135386f;
            }
            bxxk bxxk = f135387g;
            if (bxxk == null) {
                synchronized (bozl.class) {
                    bxxk = f135387g;
                    if (bxxk == null) {
                        bxxk = new bxve(f135386f);
                        f135387g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
