package p000;

/* renamed from: bzes */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzes extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bzes f169712e;

    /* renamed from: f */
    public static final bxvj f169713f;

    /* renamed from: g */
    private static volatile bxxk f169714g;

    /* renamed from: a */
    public int f169715a;

    /* renamed from: b */
    public bzex f169716b;

    /* renamed from: c */
    public bzfx f169717c;

    /* renamed from: d */
    public bzgm f169718d;

    static {
        bzes bzes = new bzes();
        f169712e = bzes;
        GeneratedMessageLite.m124024a(bzes.class, bzes);
        blcc blcc = blcc.f125904a;
        bzes bzes2 = f169712e;
        f169713f = GeneratedMessageLite.m124006a(blcc, bzes2, bzes2, 84453462, bxzf.MESSAGE);
    }

    private bzes() {
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
            return GeneratedMessageLite.m124022a(f169712e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bzes();
        } else {
            if (i2 == 4) {
                return new bxvd(f169712e);
            }
            if (i2 == 5) {
                return f169712e;
            }
            bxxk bxxk = f169714g;
            if (bxxk == null) {
                synchronized (bzes.class) {
                    bxxk = f169714g;
                    if (bxxk == null) {
                        bxxk = new bxve(f169712e);
                        f169714g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
