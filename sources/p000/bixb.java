package p000;

/* renamed from: bixb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bixb extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bixb f122154e;

    /* renamed from: g */
    private static volatile bxxk f122155g;

    /* renamed from: a */
    public String f122156a = "";

    /* renamed from: b */
    public String f122157b = "";

    /* renamed from: c */
    public String f122158c = "";

    /* renamed from: d */
    public int f122159d;

    /* renamed from: f */
    private int f122160f;

    static {
        bixb bixb = new bixb();
        f122154e = bixb;
        GeneratedMessageLite.m124024a(bixb.class, bixb);
    }

    private bixb() {
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
            return GeneratedMessageLite.m124022a(f122154e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003", new Object[]{"f", "a", "b", "c", "d", bixd.m102926b()});
        } else if (i2 == 3) {
            return new bixb();
        } else {
            if (i2 == 4) {
                return new bxvd(f122154e);
            }
            if (i2 == 5) {
                return f122154e;
            }
            bxxk bxxk = f122155g;
            if (bxxk == null) {
                synchronized (bixb.class) {
                    bxxk = f122155g;
                    if (bxxk == null) {
                        bxxk = new bxve(f122154e);
                        f122155g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
