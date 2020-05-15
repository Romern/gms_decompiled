package p000;

/* renamed from: bpei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpei extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bpei f137280g;

    /* renamed from: h */
    private static volatile bxxk f137281h;

    /* renamed from: a */
    public int f137282a;

    /* renamed from: b */
    public int f137283b;

    /* renamed from: c */
    public int f137284c;

    /* renamed from: d */
    public int f137285d;

    /* renamed from: e */
    public int f137286e;

    /* renamed from: f */
    public int f137287f;

    static {
        bpei bpei = new bpei();
        f137280g = bpei;
        GeneratedMessageLite.m124024a(bpei.class, bpei);
    }

    private bpei() {
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
            return GeneratedMessageLite.m124022a(f137280g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bpei();
        } else {
            if (i2 == 4) {
                return new bxvd(f137280g);
            }
            if (i2 == 5) {
                return f137280g;
            }
            bxxk bxxk = f137281h;
            if (bxxk == null) {
                synchronized (bpei.class) {
                    bxxk = f137281h;
                    if (bxxk == null) {
                        bxxk = new bxve(f137280g);
                        f137281h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
