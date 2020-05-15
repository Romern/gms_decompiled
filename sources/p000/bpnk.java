package p000;

/* renamed from: bpnk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpnk extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bpnk f138412g;

    /* renamed from: h */
    private static volatile bxxk f138413h;

    /* renamed from: a */
    public int f138414a;

    /* renamed from: b */
    public int f138415b;

    /* renamed from: c */
    public int f138416c;

    /* renamed from: d */
    public int f138417d;

    /* renamed from: e */
    public int f138418e;

    /* renamed from: f */
    public int f138419f;

    static {
        bpnk bpnk = new bpnk();
        f138412g = bpnk;
        GeneratedMessageLite.m124024a(bpnk.class, bpnk);
    }

    private bpnk() {
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
            return GeneratedMessageLite.m124022a(f138412g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဏ\u0001\u0003ဏ\u0002\u0004င\u0003\u0005ဏ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bpnk();
        } else {
            if (i2 == 4) {
                return new bxvd(f138412g);
            }
            if (i2 == 5) {
                return f138412g;
            }
            bxxk bxxk = f138413h;
            if (bxxk == null) {
                synchronized (bpnk.class) {
                    bxxk = f138413h;
                    if (bxxk == null) {
                        bxxk = new bxve(f138412g);
                        f138413h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
