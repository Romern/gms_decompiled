package p000;

/* renamed from: bzqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzqk extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bzqk f171015g;

    /* renamed from: h */
    private static volatile bxxk f171016h;

    /* renamed from: a */
    public int f171017a;

    /* renamed from: b */
    public String f171018b = "";

    /* renamed from: c */
    public String f171019c = "";

    /* renamed from: d */
    public boolean f171020d;

    /* renamed from: e */
    public boolean f171021e;

    /* renamed from: f */
    public boolean f171022f;

    static {
        bzqk bzqk = new bzqk();
        f171015g = bzqk;
        GeneratedMessageLite.m124024a(bzqk.class, bzqk);
    }

    private bzqk() {
        bxwq bxwq = bxwq.f165002b;
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
            return GeneratedMessageLite.m124022a(f171015g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\bဇ\u0006", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bzqk();
        } else {
            if (i2 == 4) {
                return new bxvd(f171015g);
            }
            if (i2 == 5) {
                return f171015g;
            }
            bxxk bxxk = f171016h;
            if (bxxk == null) {
                synchronized (bzqk.class) {
                    bxxk = f171016h;
                    if (bxxk == null) {
                        bxxk = new bxve(f171015g);
                        f171016h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
