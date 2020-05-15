package p000;

/* renamed from: bwgw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwgw extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bwgw f159292f;

    /* renamed from: g */
    private static volatile bxxk f159293g;

    /* renamed from: a */
    public int f159294a;

    /* renamed from: b */
    public String f159295b = "";

    /* renamed from: c */
    public String f159296c = "";

    /* renamed from: d */
    public String f159297d = "";

    /* renamed from: e */
    public String f159298e = "";

    static {
        bwgw bwgw = new bwgw();
        f159292f = bwgw;
        GeneratedMessageLite.m124024a(bwgw.class, bwgw);
    }

    private bwgw() {
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
            return GeneratedMessageLite.m124022a(f159292f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဈ\u0003\u0004ဈ\u0001", new Object[]{"a", "b", "d", "e", "c"});
        } else if (i2 == 3) {
            return new bwgw();
        } else {
            if (i2 == 4) {
                return new bxvd(f159292f);
            }
            if (i2 == 5) {
                return f159292f;
            }
            bxxk bxxk = f159293g;
            if (bxxk == null) {
                synchronized (bwgw.class) {
                    bxxk = f159293g;
                    if (bxxk == null) {
                        bxxk = new bxve(f159292f);
                        f159293g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
