package p000;

/* renamed from: bpoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpoq extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bpoq f138561f;

    /* renamed from: g */
    private static volatile bxxk f138562g;

    /* renamed from: a */
    public int f138563a;

    /* renamed from: b */
    public int f138564b;

    /* renamed from: c */
    public boolean f138565c;

    /* renamed from: d */
    public boolean f138566d;

    /* renamed from: e */
    public boolean f138567e;

    static {
        bpoq bpoq = new bpoq();
        f138561f = bpoq;
        GeneratedMessageLite.m124024a(bpoq.class, bpoq);
    }

    private bpoq() {
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
            return GeneratedMessageLite.m124022a(f138561f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bpoq();
        } else {
            if (i2 == 4) {
                return new bxvd(f138561f);
            }
            if (i2 == 5) {
                return f138561f;
            }
            bxxk bxxk = f138562g;
            if (bxxk == null) {
                synchronized (bpoq.class) {
                    bxxk = f138562g;
                    if (bxxk == null) {
                        bxxk = new bxve(f138561f);
                        f138562g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
