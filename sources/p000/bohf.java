package p000;

/* renamed from: bohf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bohf extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bohf f133058h;

    /* renamed from: i */
    private static volatile bxxk f133059i;

    /* renamed from: a */
    public int f133060a;

    /* renamed from: b */
    public boolean f133061b;

    /* renamed from: c */
    public boolean f133062c;

    /* renamed from: d */
    public boolean f133063d;

    /* renamed from: e */
    public boolean f133064e;

    /* renamed from: f */
    public boolean f133065f;

    /* renamed from: g */
    public boolean f133066g;

    static {
        bohf bohf = new bohf();
        f133058h = bohf;
        GeneratedMessageLite.m124024a(bohf.class, bohf);
    }

    private bohf() {
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
            return GeneratedMessageLite.m124022a(f133058h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0007ဇ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bohf();
        } else {
            if (i2 == 4) {
                return new bxvd(f133058h);
            }
            if (i2 == 5) {
                return f133058h;
            }
            bxxk bxxk = f133059i;
            if (bxxk == null) {
                synchronized (bohf.class) {
                    bxxk = f133059i;
                    if (bxxk == null) {
                        bxxk = new bxve(f133058h);
                        f133059i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
