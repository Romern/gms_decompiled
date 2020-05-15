package p000;

/* renamed from: adhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adhb extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final adhb f61644j;

    /* renamed from: k */
    private static volatile bxxk f61645k;

    /* renamed from: a */
    public String f61646a = "";

    /* renamed from: b */
    public String f61647b = "";

    /* renamed from: c */
    public int f61648c;

    /* renamed from: d */
    public bxwc f61649d = bxxn.f165040b;

    /* renamed from: e */
    public int f61650e;

    /* renamed from: f */
    public String f61651f = "";

    /* renamed from: g */
    public int f61652g;

    /* renamed from: h */
    public String f61653h = "";

    /* renamed from: i */
    public bxvl f61654i;

    static {
        adhb adhb = new adhb();
        f61644j = adhb;
        GeneratedMessageLite.m124024a(adhb.class, adhb);
    }

    private adhb() {
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
            return GeneratedMessageLite.m124022a(f61644j, "\u0000\t\u0000\u0000\u0001\u000b\t\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b\u0005\u0004\u0006Ȉ\u0007\u0004\bȈ\t\t\u000bȈ", new Object[]{"a", "c", "d", adhf.class, "e", "f", "g", "h", "i", "b"});
        } else if (i2 == 3) {
            return new adhb();
        } else {
            if (i2 == 4) {
                return new bxvd(f61644j);
            }
            if (i2 == 5) {
                return f61644j;
            }
            bxxk bxxk = f61645k;
            if (bxxk == null) {
                synchronized (adhb.class) {
                    bxxk = f61645k;
                    if (bxxk == null) {
                        bxxk = new bxve(f61644j);
                        f61645k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
