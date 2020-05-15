package p000;

/* renamed from: bwvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwvw extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bwvw f161184h;

    /* renamed from: i */
    public static final bxvj f161185i;

    /* renamed from: j */
    private static volatile bxxk f161186j;

    /* renamed from: a */
    public int f161187a;

    /* renamed from: b */
    public int f161188b = 0;

    /* renamed from: c */
    public Object f161189c;

    /* renamed from: d */
    public String f161190d = "";

    /* renamed from: e */
    public String f161191e = "";

    /* renamed from: f */
    public bxwc f161192f = bxxn.f165040b;

    /* renamed from: g */
    public boolean f161193g;

    static {
        bwvw bwvw = new bwvw();
        f161184h = bwvw;
        GeneratedMessageLite.m124024a(bwvw.class, bwvw);
        bwny bwny = bwny.f160414k;
        bwvw bwvw2 = f161184h;
        f161185i = GeneratedMessageLite.m124006a(bwny, bwvw2, bwvw2, 232060280, bxzf.MESSAGE);
    }

    private bwvw() {
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
            return GeneratedMessageLite.m124022a(f161184h, "\u0001\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ျ\u0000\u0002ဈ\u0002\u0003ျ\u0000\u0005ဈ\u0003\u0006\u001b\u0007ဇ\u0004", new Object[]{"c", "b", "a", "d", "e", "f", bwvv.class, "g"});
        } else if (i2 == 3) {
            return new bwvw();
        } else {
            if (i2 == 4) {
                return new bxvd(f161184h);
            }
            if (i2 == 5) {
                return f161184h;
            }
            bxxk bxxk = f161186j;
            if (bxxk == null) {
                synchronized (bwvw.class) {
                    bxxk = f161186j;
                    if (bxxk == null) {
                        bxxk = new bxve(f161184h);
                        f161186j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
