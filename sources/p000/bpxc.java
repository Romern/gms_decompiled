package p000;

/* renamed from: bpxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpxc extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bpxc f139651c;

    /* renamed from: d */
    private static volatile bxxk f139652d;

    /* renamed from: a */
    public int f139653a;

    /* renamed from: b */
    public String f139654b = "";

    static {
        bpxc bpxc = new bpxc();
        f139651c = bpxc;
        GeneratedMessageLite.m124024a(bpxc.class, bpxc);
    }

    private bpxc() {
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
            return GeneratedMessageLite.m124022a(f139651c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpxc();
        } else {
            if (i2 == 4) {
                return new bxvd(f139651c);
            }
            if (i2 == 5) {
                return f139651c;
            }
            bxxk bxxk = f139652d;
            if (bxxk == null) {
                synchronized (bpxc.class) {
                    bxxk = f139652d;
                    if (bxxk == null) {
                        bxxk = new bxve(f139651c);
                        f139652d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
