package p000;

/* renamed from: jhx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jhx extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final jhx f22521c;

    /* renamed from: e */
    private static volatile bxxk f22522e;

    /* renamed from: a */
    public int f22523a;

    /* renamed from: b */
    public String f22524b = "";

    /* renamed from: d */
    private int f22525d;

    static {
        jhx jhx = new jhx();
        f22521c = jhx;
        GeneratedMessageLite.m124024a(jhx.class, jhx);
    }

    private jhx() {
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
            return GeneratedMessageLite.m124022a(f22521c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"d", "a", jhv.f22520a, "b"});
        } else if (i2 == 3) {
            return new jhx();
        } else {
            if (i2 == 4) {
                return new bxvd(f22521c);
            }
            if (i2 == 5) {
                return f22521c;
            }
            bxxk bxxk = f22522e;
            if (bxxk == null) {
                synchronized (jhx.class) {
                    bxxk = f22522e;
                    if (bxxk == null) {
                        bxxk = new bxve(f22521c);
                        f22522e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
