package p000;

/* renamed from: byzb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byzb extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bxvu f169044g = new byyz();

    /* renamed from: j */
    public static final byzb f169045j;

    /* renamed from: k */
    private static volatile bxxk f169046k;

    /* renamed from: a */
    public int f169047a;

    /* renamed from: b */
    public boolean f169048b;

    /* renamed from: c */
    public int f169049c;

    /* renamed from: d */
    public bzaa f169050d;

    /* renamed from: e */
    public boolean f169051e;

    /* renamed from: f */
    public bxvt f169052f = bxvm.f164965b;

    /* renamed from: h */
    public String f169053h = "";

    /* renamed from: i */
    public int f169054i;

    static {
        byzb byzb = new byzb();
        f169045j = byzb;
        GeneratedMessageLite.m124024a(byzb.class, byzb);
    }

    private byzb() {
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
            return GeneratedMessageLite.m124022a(f169045j, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005\u001e\u0006ဈ\u0004\u0007ဌ\u0005", new Object[]{"a", "b", "c", bzbb.f169243a, "d", "e", "f", bzay.m125602b(), "h", "i", bzao.f169219a});
        } else if (i2 == 3) {
            return new byzb();
        } else {
            if (i2 == 4) {
                return new byza();
            }
            if (i2 == 5) {
                return f169045j;
            }
            bxxk bxxk = f169046k;
            if (bxxk == null) {
                synchronized (byzb.class) {
                    bxxk = f169046k;
                    if (bxxk == null) {
                        bxxk = new bxve(f169045j);
                        f169046k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
