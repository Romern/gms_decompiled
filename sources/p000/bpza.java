package p000;

/* renamed from: bpza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpza extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bpza f139971f;

    /* renamed from: g */
    private static volatile bxxk f139972g;

    /* renamed from: a */
    public int f139973a;

    /* renamed from: b */
    public bxwc f139974b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f139975c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f139976d = bxxn.f165040b;

    /* renamed from: e */
    public long f139977e;

    static {
        bpza bpza = new bpza();
        f139971f = bpza;
        GeneratedMessageLite.m124024a(bpza.class, bpza);
    }

    private bpza() {
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
            return GeneratedMessageLite.m124022a(f139971f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဂ\u0000", new Object[]{"a", "b", bpyy.class, "c", bpyx.class, "d", bpyw.class, "e"});
        } else if (i2 == 3) {
            return new bpza();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (int[]) null);
            }
            if (i2 == 5) {
                return f139971f;
            }
            bxxk bxxk = f139972g;
            if (bxxk == null) {
                synchronized (bpza.class) {
                    bxxk = f139972g;
                    if (bxxk == null) {
                        bxxk = new bxve(f139971f);
                        f139972g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
