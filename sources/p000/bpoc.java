package p000;

/* renamed from: bpoc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpoc extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bpoc f138470h;

    /* renamed from: i */
    private static volatile bxxk f138471i;

    /* renamed from: a */
    public int f138472a;

    /* renamed from: b */
    public int f138473b;

    /* renamed from: c */
    public int f138474c;

    /* renamed from: d */
    public int f138475d;

    /* renamed from: e */
    public int f138476e;

    /* renamed from: f */
    public int f138477f;

    /* renamed from: g */
    public int f138478g;

    static {
        bpoc bpoc = new bpoc();
        f138470h = bpoc;
        GeneratedMessageLite.m124024a(bpoc.class, bpoc);
    }

    private bpoc() {
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
            return GeneratedMessageLite.m124022a(f138470h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bpoc();
        } else {
            if (i2 == 4) {
                return new bxvd(f138470h);
            }
            if (i2 == 5) {
                return f138470h;
            }
            bxxk bxxk = f138471i;
            if (bxxk == null) {
                synchronized (bpoc.class) {
                    bxxk = f138471i;
                    if (bxxk == null) {
                        bxxk = new bxve(f138470h);
                        f138471i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
