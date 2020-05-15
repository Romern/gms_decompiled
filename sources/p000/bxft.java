package p000;

/* renamed from: bxft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxft extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bxft f163184h;

    /* renamed from: i */
    public static final bxvj f163185i;

    /* renamed from: j */
    private static volatile bxxk f163186j;

    /* renamed from: a */
    public int f163187a;

    /* renamed from: b */
    public int f163188b;

    /* renamed from: c */
    public int f163189c;

    /* renamed from: d */
    public int f163190d;

    /* renamed from: e */
    public int f163191e;

    /* renamed from: f */
    public int f163192f;

    /* renamed from: g */
    public int f163193g;

    static {
        bxft bxft = new bxft();
        f163184h = bxft;
        GeneratedMessageLite.m124024a(bxft.class, bxft);
        bxcf bxcf = bxcf.f162779a;
        bxft bxft2 = f163184h;
        f163185i = GeneratedMessageLite.m124006a(bxcf, bxft2, bxft2, 91925232, bxzf.MESSAGE);
    }

    private bxft() {
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
            return GeneratedMessageLite.m124022a(f163184h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဌ\u0005", new Object[]{"a", "b", bxfl.f163180a, "c", bxfh.f163178a, "d", bxfj.f163179a, "e", bxfn.f163181a, "f", bxfp.f163182a, "g", bxfr.f163183a});
        } else if (i2 == 3) {
            return new bxft();
        } else {
            if (i2 == 4) {
                return new bxvd(f163184h);
            }
            if (i2 == 5) {
                return f163184h;
            }
            bxxk bxxk = f163186j;
            if (bxxk == null) {
                synchronized (bxft.class) {
                    bxxk = f163186j;
                    if (bxxk == null) {
                        bxxk = new bxve(f163184h);
                        f163186j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
