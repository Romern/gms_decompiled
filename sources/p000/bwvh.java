package p000;

/* renamed from: bwvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwvh extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bwvh f161126e;

    /* renamed from: g */
    private static volatile bxxk f161127g;

    /* renamed from: a */
    public int f161128a;

    /* renamed from: b */
    public long f161129b;

    /* renamed from: c */
    public bxvw f161130c = bxwq.f165002b;

    /* renamed from: d */
    public bxvt f161131d = bxvm.f164965b;

    /* renamed from: f */
    private int f161132f;

    static {
        bwvh bwvh = new bwvh();
        f161126e = bwvh;
        GeneratedMessageLite.m124024a(bwvh.class, bwvh);
    }

    private bwvh() {
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
            return GeneratedMessageLite.m124022a(f161126e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001င\u0000\u0002ဂ\u0001\u0003%\u0004'", new Object[]{"f", "a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bwvh();
        } else {
            if (i2 == 4) {
                return new bxvd(f161126e);
            }
            if (i2 == 5) {
                return f161126e;
            }
            bxxk bxxk = f161127g;
            if (bxxk == null) {
                synchronized (bwvh.class) {
                    bxxk = f161127g;
                    if (bxxk == null) {
                        bxxk = new bxve(f161126e);
                        f161127g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
