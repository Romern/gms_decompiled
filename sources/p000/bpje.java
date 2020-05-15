package p000;

/* renamed from: bpje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpje extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final bpje f137845k;

    /* renamed from: l */
    private static volatile bxxk f137846l;

    /* renamed from: a */
    public int f137847a;

    /* renamed from: b */
    public String f137848b = "";

    /* renamed from: c */
    public String f137849c = "";

    /* renamed from: d */
    public int f137850d;

    /* renamed from: e */
    public String f137851e = "";

    /* renamed from: f */
    public String f137852f = "";

    /* renamed from: g */
    public String f137853g = "";

    /* renamed from: h */
    public String f137854h = "";

    /* renamed from: i */
    public String f137855i = "";

    /* renamed from: j */
    public int f137856j = -1;

    static {
        bpje bpje = new bpje();
        f137845k = bpje;
        GeneratedMessageLite.m124024a(bpje.class, bpje);
    }

    private bpje() {
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
            return GeneratedMessageLite.m124022a(f137845k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tင\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new bpje();
        } else {
            if (i2 == 4) {
                return new bxvd(f137845k);
            }
            if (i2 == 5) {
                return f137845k;
            }
            bxxk bxxk = f137846l;
            if (bxxk == null) {
                synchronized (bpje.class) {
                    bxxk = f137846l;
                    if (bxxk == null) {
                        bxxk = new bxve(f137845k);
                        f137846l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
