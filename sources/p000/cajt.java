package p000;

/* renamed from: cajt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cajt extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final cajt f174864g;

    /* renamed from: h */
    private static volatile bxxk f174865h;

    /* renamed from: a */
    public int f174866a;

    /* renamed from: b */
    public boolean f174867b;

    /* renamed from: c */
    public String f174868c = "";

    /* renamed from: d */
    public int f174869d;

    /* renamed from: e */
    public int f174870e;

    /* renamed from: f */
    public String f174871f = "";

    static {
        cajt cajt = new cajt();
        f174864g = cajt;
        GeneratedMessageLite.m124024a(cajt.class, cajt);
    }

    private cajt() {
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
            return GeneratedMessageLite.m124022a(f174864g, "\u0001\u0005\u0000\u0001\u0003\u0007\u0005\u0000\u0000\u0000\u0003ဇ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006င\u0005\u0007ဈ\u0006", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new cajt();
        } else {
            if (i2 == 4) {
                return new bxvd(f174864g);
            }
            if (i2 == 5) {
                return f174864g;
            }
            bxxk bxxk = f174865h;
            if (bxxk == null) {
                synchronized (cajt.class) {
                    bxxk = f174865h;
                    if (bxxk == null) {
                        bxxk = new bxve(f174864g);
                        f174865h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
