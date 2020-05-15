package p000;

/* renamed from: bmvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmvu extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bmvu f131104h;

    /* renamed from: i */
    private static volatile bxxk f131105i;

    /* renamed from: a */
    public int f131106a;

    /* renamed from: b */
    public bmvt f131107b;

    /* renamed from: c */
    public String f131108c = "";

    /* renamed from: d */
    public String f131109d = "";

    /* renamed from: e */
    public bmvh f131110e;

    /* renamed from: f */
    public bmva f131111f;

    /* renamed from: g */
    public String f131112g = "";

    static {
        bmvu bmvu = new bmvu();
        f131104h = bmvu;
        GeneratedMessageLite.m124024a(bmvu.class, bmvu);
    }

    private bmvu() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f131104h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဈ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bmvu();
        } else {
            if (i2 == 4) {
                return new bxvd(f131104h);
            }
            if (i2 == 5) {
                return f131104h;
            }
            bxxk bxxk = f131105i;
            if (bxxk == null) {
                synchronized (bmvu.class) {
                    bxxk = f131105i;
                    if (bxxk == null) {
                        bxxk = new bxve(f131104h);
                        f131105i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
