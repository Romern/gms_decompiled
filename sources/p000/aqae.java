package p000;

/* renamed from: aqae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqae extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final aqae f85359e;

    /* renamed from: g */
    private static volatile bxxk f85360g;

    /* renamed from: a */
    public int f85361a;

    /* renamed from: b */
    public String f85362b = "";

    /* renamed from: c */
    public int f85363c;

    /* renamed from: d */
    public String f85364d = "";

    /* renamed from: f */
    private boolean f85365f;

    static {
        aqae aqae = new aqae();
        f85359e = aqae;
        GeneratedMessageLite.m124024a(aqae.class, aqae);
    }

    private aqae() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m71248a(aqae aqae) {
        aqae.f85361a |= 8;
        aqae.f85365f = true;
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
            return GeneratedMessageLite.m124022a(f85359e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", "f"});
        } else if (i2 == 3) {
            return new aqae();
        } else {
            if (i2 == 4) {
                return new bxvd(f85359e);
            }
            if (i2 == 5) {
                return f85359e;
            }
            bxxk bxxk = f85360g;
            if (bxxk == null) {
                synchronized (aqae.class) {
                    bxxk = f85360g;
                    if (bxxk == null) {
                        bxxk = new bxve(f85359e);
                        f85360g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
