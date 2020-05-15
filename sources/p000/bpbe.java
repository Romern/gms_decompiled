package p000;

/* renamed from: bpbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpbe extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bpbe f135585e;

    /* renamed from: f */
    private static volatile bxxk f135586f;

    /* renamed from: a */
    public int f135587a;

    /* renamed from: b */
    public int f135588b;

    /* renamed from: c */
    public int f135589c;

    /* renamed from: d */
    public int f135590d;

    static {
        bpbe bpbe = new bpbe();
        f135585e = bpbe;
        GeneratedMessageLite.m124024a(bpbe.class, bpbe);
    }

    private bpbe() {
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
            return GeneratedMessageLite.m124022a(f135585e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", bpbc.f135584a, "d"});
        } else if (i2 == 3) {
            return new bpbe();
        } else {
            if (i2 == 4) {
                return new bxvd(f135585e);
            }
            if (i2 == 5) {
                return f135585e;
            }
            bxxk bxxk = f135586f;
            if (bxxk == null) {
                synchronized (bpbe.class) {
                    bxxk = f135586f;
                    if (bxxk == null) {
                        bxxk = new bxve(f135585e);
                        f135586f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
