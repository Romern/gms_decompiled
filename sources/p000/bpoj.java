package p000;

/* renamed from: bpoj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpoj extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bpoj f138532f;

    /* renamed from: g */
    private static volatile bxxk f138533g;

    /* renamed from: a */
    public int f138534a;

    /* renamed from: b */
    public int f138535b;

    /* renamed from: c */
    public int f138536c;

    /* renamed from: d */
    public int f138537d;

    /* renamed from: e */
    public boolean f138538e;

    static {
        bpoj bpoj = new bpoj();
        f138532f = bpoj;
        GeneratedMessageLite.m124024a(bpoj.class, bpoj);
    }

    private bpoj() {
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
            return GeneratedMessageLite.m124022a(f138532f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bpoj();
        } else {
            if (i2 == 4) {
                return new bxvd(f138532f);
            }
            if (i2 == 5) {
                return f138532f;
            }
            bxxk bxxk = f138533g;
            if (bxxk == null) {
                synchronized (bpoj.class) {
                    bxxk = f138533g;
                    if (bxxk == null) {
                        bxxk = new bxve(f138532f);
                        f138533g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
