package p000;

/* renamed from: abuv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abuv extends bxvk implements bxxd {

    /* renamed from: f */
    public static final abuv f58483f;

    /* renamed from: h */
    private static volatile bxxk f58484h;

    /* renamed from: a */
    public int f58485a;

    /* renamed from: b */
    public int f58486b;

    /* renamed from: c */
    public int f58487c;

    /* renamed from: d */
    public long f58488d;

    /* renamed from: e */
    public long f58489e;

    /* renamed from: g */
    private int f58490g;

    static {
        abuv abuv = new abuv();
        f58483f = abuv;
        bxvk.m124024a(abuv.class, abuv);
    }

    private abuv() {
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
            return bxvk.m124022a(f58483f, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001င\u0000\u0003ဋ\u0001\u0004ဋ\u0002\u0005ဃ\u0003\u0006ဃ\u0004", new Object[]{"g", "a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new abuv();
        } else {
            if (i2 == 4) {
                return new bxvd(f58483f);
            }
            if (i2 == 5) {
                return f58483f;
            }
            bxxk bxxk = f58484h;
            if (bxxk == null) {
                synchronized (abuv.class) {
                    bxxk = f58484h;
                    if (bxxk == null) {
                        bxxk = new bxve(f58483f);
                        f58484h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
