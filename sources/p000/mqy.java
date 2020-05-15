package p000;

/* renamed from: mqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mqy extends bxvk implements bxxd {

    /* renamed from: f */
    public static final mqy f34367f;

    /* renamed from: g */
    private static volatile bxxk f34368g;

    /* renamed from: a */
    public int f34369a;

    /* renamed from: b */
    public mrc f34370b;

    /* renamed from: c */
    public msw f34371c;

    /* renamed from: d */
    public int f34372d;

    /* renamed from: e */
    public mqu f34373e;

    static {
        mqy mqy = new mqy();
        f34367f = mqy;
        bxvk.m124024a(mqy.class, mqy);
    }

    private mqy() {
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
            return bxvk.m124022a(f34367f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0007ဉ\u0006", new Object[]{"a", "b", "c", "d", mqx.f34366a, "e"});
        } else if (i2 == 3) {
            return new mqy();
        } else {
            if (i2 == 4) {
                return new bxvd(f34367f);
            }
            if (i2 == 5) {
                return f34367f;
            }
            bxxk bxxk = f34368g;
            if (bxxk == null) {
                synchronized (mqy.class) {
                    bxxk = f34368g;
                    if (bxxk == null) {
                        bxxk = new bxve(f34367f);
                        f34368g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
