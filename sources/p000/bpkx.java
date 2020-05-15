package p000;

/* renamed from: bpkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpkx extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bpkx f138024f;

    /* renamed from: h */
    private static volatile bxxk f138025h;

    /* renamed from: a */
    public int f138026a;

    /* renamed from: b */
    public int f138027b = 1;

    /* renamed from: c */
    public bpky f138028c;

    /* renamed from: d */
    public bpkz f138029d;

    /* renamed from: e */
    public buna f138030e;

    /* renamed from: g */
    private byte f138031g = 2;

    static {
        bpkx bpkx = new bpkx();
        f138024f = bpkx;
        GeneratedMessageLite.m124024a(bpkx.class, bpkx);
    }

    private bpkx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f138031g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f138031g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f138024f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003", new Object[]{"a", "b", bpkw.f138023a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new bpkx();
        } else {
            if (i2 == 4) {
                return new bxvd(f138024f);
            }
            if (i2 == 5) {
                return f138024f;
            }
            bxxk bxxk = f138025h;
            if (bxxk == null) {
                synchronized (bpkx.class) {
                    bxxk = f138025h;
                    if (bxxk == null) {
                        bxxk = new bxve(f138024f);
                        f138025h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
