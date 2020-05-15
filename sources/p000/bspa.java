package p000;

/* renamed from: bspa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bspa extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bspa f146461e;

    /* renamed from: f */
    private static volatile bxxk f146462f;

    /* renamed from: a */
    public int f146463a;

    /* renamed from: b */
    public int f146464b;

    /* renamed from: c */
    public int f146465c;

    /* renamed from: d */
    public int f146466d = -1;

    static {
        bspa bspa = new bspa();
        f146461e = bspa;
        GeneratedMessageLite.m124024a(bspa.class, bspa);
    }

    private bspa() {
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
            return GeneratedMessageLite.m124022a(f146461e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001င\u0000\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bspa();
        } else {
            if (i2 == 4) {
                return new bxvd(f146461e);
            }
            if (i2 == 5) {
                return f146461e;
            }
            bxxk bxxk = f146462f;
            if (bxxk == null) {
                synchronized (bspa.class) {
                    bxxk = f146462f;
                    if (bxxk == null) {
                        bxxk = new bxve(f146461e);
                        f146462f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
