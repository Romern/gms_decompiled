package p000;

/* renamed from: biue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biue extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final biue f121772k;

    /* renamed from: l */
    private static volatile bxxk f121773l;

    /* renamed from: a */
    public int f121774a;

    /* renamed from: b */
    public bxvt f121775b = bxvm.f164965b;

    /* renamed from: c */
    public int f121776c;

    /* renamed from: d */
    public int f121777d;

    /* renamed from: e */
    public String f121778e = "";

    /* renamed from: f */
    public int f121779f;

    /* renamed from: g */
    public String f121780g = "";

    /* renamed from: h */
    public String f121781h = "";

    /* renamed from: i */
    public boolean f121782i;

    /* renamed from: j */
    public boolean f121783j;

    static {
        biue biue = new biue();
        f121772k = biue;
        GeneratedMessageLite.m124024a(biue.class, biue);
    }

    private biue() {
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
            return GeneratedMessageLite.m124022a(f121772k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001\u0016\u0002င\u0000\u0003င\u0001\u0004ဈ\u0002\u0005င\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဇ\u0006\tဇ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new biue();
        } else {
            if (i2 == 4) {
                return new bxvd(f121772k);
            }
            if (i2 == 5) {
                return f121772k;
            }
            bxxk bxxk = f121773l;
            if (bxxk == null) {
                synchronized (biue.class) {
                    bxxk = f121773l;
                    if (bxxk == null) {
                        bxxk = new bxve(f121772k);
                        f121773l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
