package p000;

/* renamed from: bpwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpwh extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bpwh f139486f;

    /* renamed from: g */
    private static volatile bxxk f139487g;

    /* renamed from: a */
    public int f139488a;

    /* renamed from: b */
    public boolean f139489b;

    /* renamed from: c */
    public boolean f139490c;

    /* renamed from: d */
    public boolean f139491d;

    /* renamed from: e */
    public boolean f139492e;

    static {
        bpwh bpwh = new bpwh();
        f139486f = bpwh;
        GeneratedMessageLite.m124024a(bpwh.class, bpwh);
    }

    private bpwh() {
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
            return GeneratedMessageLite.m124022a(f139486f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bpwh();
        } else {
            if (i2 == 4) {
                return new bxvd(f139486f);
            }
            if (i2 == 5) {
                return f139486f;
            }
            bxxk bxxk = f139487g;
            if (bxxk == null) {
                synchronized (bpwh.class) {
                    bxxk = f139487g;
                    if (bxxk == null) {
                        bxxk = new bxve(f139486f);
                        f139487g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
