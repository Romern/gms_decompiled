package p000;

/* renamed from: caiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caiu extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final caiu f174770d;

    /* renamed from: e */
    private static volatile bxxk f174771e;

    /* renamed from: a */
    public int f174772a;

    /* renamed from: b */
    public int f174773b;

    /* renamed from: c */
    public String f174774c = "";

    static {
        caiu caiu = new caiu();
        f174770d = caiu;
        GeneratedMessageLite.m124024a(caiu.class, caiu);
    }

    private caiu() {
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
            return GeneratedMessageLite.m124022a(f174770d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", cait.f174769a, "c"});
        } else if (i2 == 3) {
            return new caiu();
        } else {
            if (i2 == 4) {
                return new bxvd(f174770d);
            }
            if (i2 == 5) {
                return f174770d;
            }
            bxxk bxxk = f174771e;
            if (bxxk == null) {
                synchronized (caiu.class) {
                    bxxk = f174771e;
                    if (bxxk == null) {
                        bxxk = new bxve(f174770d);
                        f174771e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
