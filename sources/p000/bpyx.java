package p000;

/* renamed from: bpyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpyx extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bpyx f139955e;

    /* renamed from: f */
    private static volatile bxxk f139956f;

    /* renamed from: a */
    public int f139957a;

    /* renamed from: b */
    public bpyz f139958b;

    /* renamed from: c */
    public long f139959c;

    /* renamed from: d */
    public long f139960d;

    static {
        bpyx bpyx = new bpyx();
        f139955e = bpyx;
        GeneratedMessageLite.m124024a(bpyx.class, bpyx);
    }

    private bpyx() {
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
            return GeneratedMessageLite.m124022a(f139955e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bpyx();
        } else {
            if (i2 == 4) {
                return new bxvd(f139955e);
            }
            if (i2 == 5) {
                return f139955e;
            }
            bxxk bxxk = f139956f;
            if (bxxk == null) {
                synchronized (bpyx.class) {
                    bxxk = f139956f;
                    if (bxxk == null) {
                        bxxk = new bxve(f139955e);
                        f139956f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
