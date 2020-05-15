package p000;

/* renamed from: byzm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byzm extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byzm f169125d;

    /* renamed from: f */
    private static volatile bxxk f169126f;

    /* renamed from: a */
    public int f169127a;

    /* renamed from: b */
    public int f169128b;

    /* renamed from: c */
    public double f169129c;

    /* renamed from: e */
    private bxcm f169130e;

    static {
        byzm byzm = new byzm();
        f169125d = byzm;
        GeneratedMessageLite.m124024a(byzm.class, byzm);
    }

    private byzm() {
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
            return GeneratedMessageLite.m124022a(f169125d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002က\u0001\u0003ဉ\u0002", new Object[]{"a", "b", bzav.f169234a, "c", "e"});
        } else if (i2 == 3) {
            return new byzm();
        } else {
            if (i2 == 4) {
                return new bxvd(f169125d);
            }
            if (i2 == 5) {
                return f169125d;
            }
            bxxk bxxk = f169126f;
            if (bxxk == null) {
                synchronized (byzm.class) {
                    bxxk = f169126f;
                    if (bxxk == null) {
                        bxxk = new bxve(f169125d);
                        f169126f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
