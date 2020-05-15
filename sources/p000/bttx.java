package p000;

/* renamed from: bttx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bttx extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bttx f150411j;

    /* renamed from: k */
    private static volatile bxxk f150412k;

    /* renamed from: a */
    public int f150413a;

    /* renamed from: b */
    public btsi f150414b;

    /* renamed from: c */
    public String f150415c = "";

    /* renamed from: d */
    public String f150416d = "";

    /* renamed from: e */
    public String f150417e = "";

    /* renamed from: f */
    public String f150418f = "";

    /* renamed from: g */
    public String f150419g = "";

    /* renamed from: h */
    public String f150420h = "";

    /* renamed from: i */
    public bzvu f150421i;

    static {
        bttx bttx = new bttx();
        f150411j = bttx;
        GeneratedMessageLite.m124024a(bttx.class, bttx);
    }

    private bttx() {
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
            return GeneratedMessageLite.m124022a(f150411j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဉ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bttx();
        } else {
            if (i2 == 4) {
                return new bxvd(f150411j);
            }
            if (i2 == 5) {
                return f150411j;
            }
            bxxk bxxk = f150412k;
            if (bxxk == null) {
                synchronized (bttx.class) {
                    bxxk = f150412k;
                    if (bxxk == null) {
                        bxxk = new bxve(f150411j);
                        f150412k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
