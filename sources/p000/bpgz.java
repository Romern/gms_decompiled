package p000;

/* renamed from: bpgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpgz extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bpgz f137612c;

    /* renamed from: d */
    private static volatile bxxk f137613d;

    /* renamed from: a */
    public int f137614a;

    /* renamed from: b */
    public long f137615b;

    static {
        bpgz bpgz = new bpgz();
        f137612c = bpgz;
        GeneratedMessageLite.m124024a(bpgz.class, bpgz);
    }

    private bpgz() {
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
            return GeneratedMessageLite.m124022a(f137612c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpgz();
        } else {
            if (i2 == 4) {
                return new bxvd(f137612c);
            }
            if (i2 == 5) {
                return f137612c;
            }
            bxxk bxxk = f137613d;
            if (bxxk == null) {
                synchronized (bpgz.class) {
                    bxxk = f137613d;
                    if (bxxk == null) {
                        bxxk = new bxve(f137612c);
                        f137613d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
