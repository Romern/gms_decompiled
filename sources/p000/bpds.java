package p000;

/* renamed from: bpds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpds extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bpds f136375d;

    /* renamed from: e */
    private static volatile bxxk f136376e;

    /* renamed from: a */
    public int f136377a;

    /* renamed from: b */
    public long f136378b;

    /* renamed from: c */
    public long f136379c;

    static {
        bpds bpds = new bpds();
        f136375d = bpds;
        GeneratedMessageLite.m124024a(bpds.class, bpds);
    }

    private bpds() {
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
            return GeneratedMessageLite.m124022a(f136375d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bpds();
        } else {
            if (i2 == 4) {
                return new bxvd(f136375d);
            }
            if (i2 == 5) {
                return f136375d;
            }
            bxxk bxxk = f136376e;
            if (bxxk == null) {
                synchronized (bpds.class) {
                    bxxk = f136376e;
                    if (bxxk == null) {
                        bxxk = new bxve(f136375d);
                        f136376e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
