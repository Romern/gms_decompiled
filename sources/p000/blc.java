package p000;

/* renamed from: blc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blc extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final blc f5083g;

    /* renamed from: h */
    private static volatile bxxk f5084h;

    /* renamed from: a */
    public int f5085a;

    /* renamed from: b */
    public long f5086b;

    /* renamed from: c */
    public long f5087c;

    /* renamed from: d */
    public long f5088d;

    /* renamed from: e */
    public bkq f5089e;

    /* renamed from: f */
    public boolean f5090f = true;

    static {
        blc blc = new blc();
        f5083g = blc;
        GeneratedMessageLite.m124024a(blc.class, blc);
    }

    private blc() {
        bxwq bxwq = bxwq.f165002b;
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f5083g, "\u0001\u0005\u0000\u0001\u0001e\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0004ဂ\u0003dဉ\u000feဇ\u0010", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new blc();
        } else {
            if (i2 == 4) {
                return new bxvd(f5083g);
            }
            if (i2 == 5) {
                return f5083g;
            }
            bxxk bxxk = f5084h;
            if (bxxk == null) {
                synchronized (blc.class) {
                    bxxk = f5084h;
                    if (bxxk == null) {
                        bxxk = new bxve(f5083g);
                        f5084h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
