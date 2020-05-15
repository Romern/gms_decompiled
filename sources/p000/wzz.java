package p000;

/* renamed from: wzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wzz extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final wzz f51670e;

    /* renamed from: f */
    private static volatile bxxk f51671f;

    /* renamed from: a */
    public int f51672a;

    /* renamed from: b */
    public int f51673b;

    /* renamed from: c */
    public int f51674c;

    /* renamed from: d */
    public int f51675d;

    static {
        wzz wzz = new wzz();
        f51670e = wzz;
        GeneratedMessageLite.m124024a(wzz.class, wzz);
    }

    private wzz() {
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
            return GeneratedMessageLite.m124022a(f51670e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", xal.f51789a, "d", xan.m42568b()});
        } else if (i2 == 3) {
            return new wzz();
        } else {
            if (i2 == 4) {
                return new bxvd(f51670e);
            }
            if (i2 == 5) {
                return f51670e;
            }
            bxxk bxxk = f51671f;
            if (bxxk == null) {
                synchronized (wzz.class) {
                    bxxk = f51671f;
                    if (bxxk == null) {
                        bxxk = new bxve(f51670e);
                        f51671f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
