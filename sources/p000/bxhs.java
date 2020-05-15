package p000;

/* renamed from: bxhs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxhs extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bxhs f163461g;

    /* renamed from: h */
    private static volatile bxxk f163462h;

    /* renamed from: a */
    public int f163463a;

    /* renamed from: b */
    public String f163464b = "";

    /* renamed from: c */
    public String f163465c = "";

    /* renamed from: d */
    public int f163466d;

    /* renamed from: e */
    public String f163467e = "";

    /* renamed from: f */
    public int f163468f;

    static {
        bxhs bxhs = new bxhs();
        f163461g = bxhs;
        GeneratedMessageLite.m124024a(bxhs.class, bxhs);
    }

    private bxhs() {
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
            return GeneratedMessageLite.m124022a(f163461g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", bxit.f163566a, "e", "f"});
        } else if (i2 == 3) {
            return new bxhs();
        } else {
            if (i2 == 4) {
                return new bxvd(f163461g);
            }
            if (i2 == 5) {
                return f163461g;
            }
            bxxk bxxk = f163462h;
            if (bxxk == null) {
                synchronized (bxhs.class) {
                    bxxk = f163462h;
                    if (bxxk == null) {
                        bxxk = new bxve(f163461g);
                        f163462h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
