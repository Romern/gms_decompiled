package p000;

/* renamed from: bycb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bycb extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bycb f165622e;

    /* renamed from: f */
    private static volatile bxxk f165623f;

    /* renamed from: a */
    public int f165624a;

    /* renamed from: b */
    public int f165625b;

    /* renamed from: c */
    public String f165626c = "";

    /* renamed from: d */
    public String f165627d = "";

    static {
        bycb bycb = new bycb();
        f165622e = bycb;
        GeneratedMessageLite.m124024a(bycb.class, bycb);
    }

    private bycb() {
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
            return GeneratedMessageLite.m124022a(f165622e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", byca.f165621a, "c", "d"});
        } else if (i2 == 3) {
            return new bycb();
        } else {
            if (i2 == 4) {
                return new bxvd(f165622e);
            }
            if (i2 == 5) {
                return f165622e;
            }
            bxxk bxxk = f165623f;
            if (bxxk == null) {
                synchronized (bycb.class) {
                    bxxk = f165623f;
                    if (bxxk == null) {
                        bxxk = new bxve(f165622e);
                        f165623f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
