package p000;

/* renamed from: aajw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aajw extends bxvk implements bxxd {

    /* renamed from: h */
    public static final aajw f28320h;

    /* renamed from: i */
    private static volatile bxxk f28321i;

    /* renamed from: a */
    public int f28322a;

    /* renamed from: b */
    public int f28323b;

    /* renamed from: c */
    public String f28324c = "";

    /* renamed from: d */
    public int f28325d;

    /* renamed from: e */
    public long f28326e;

    /* renamed from: f */
    public int f28327f;

    /* renamed from: g */
    public int f28328g;

    static {
        aajw aajw = new aajw();
        f28320h = aajw;
        bxvk.m124024a(aajw.class, aajw);
    }

    private aajw() {
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
            return bxvk.m124022a(f28320h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဂ\u0003\u0005င\u0004\u0006ဌ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g", aaju.f28319a});
        } else if (i2 == 3) {
            return new aajw();
        } else {
            if (i2 == 4) {
                return new bxvd(f28320h);
            }
            if (i2 == 5) {
                return f28320h;
            }
            bxxk bxxk = f28321i;
            if (bxxk == null) {
                synchronized (aajw.class) {
                    bxxk = f28321i;
                    if (bxxk == null) {
                        bxxk = new bxve(f28320h);
                        f28321i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
