package p000;

/* renamed from: bvzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvzu extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvzu f158579d;

    /* renamed from: e */
    private static volatile bxxk f158580e;

    /* renamed from: a */
    public int f158581a;

    /* renamed from: b */
    public int f158582b;

    /* renamed from: c */
    public int f158583c = 1;

    static {
        bvzu bvzu = new bvzu();
        f158579d = bvzu;
        GeneratedMessageLite.m124024a(bvzu.class, bvzu);
    }

    private bvzu() {
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
            return GeneratedMessageLite.m124022a(f158579d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", bvzs.f158577a, "c", bvzt.f158578a});
        } else if (i2 == 3) {
            return new bvzu();
        } else {
            if (i2 == 4) {
                return new bxvd(f158579d);
            }
            if (i2 == 5) {
                return f158579d;
            }
            bxxk bxxk = f158580e;
            if (bxxk == null) {
                synchronized (bvzu.class) {
                    bxxk = f158580e;
                    if (bxxk == null) {
                        bxxk = new bxve(f158579d);
                        f158580e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
