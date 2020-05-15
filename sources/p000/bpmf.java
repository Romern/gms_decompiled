package p000;

/* renamed from: bpmf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpmf extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bpmf f138239f;

    /* renamed from: g */
    private static volatile bxxk f138240g;

    /* renamed from: a */
    public int f138241a;

    /* renamed from: b */
    public int f138242b;

    /* renamed from: c */
    public int f138243c;

    /* renamed from: d */
    public long f138244d;

    /* renamed from: e */
    public long f138245e;

    static {
        bpmf bpmf = new bpmf();
        f138239f = bpmf;
        GeneratedMessageLite.m124024a(bpmf.class, bpmf);
    }

    private bpmf() {
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
            return GeneratedMessageLite.m124022a(f138239f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bpmf();
        } else {
            if (i2 == 4) {
                return new bxvd(f138239f);
            }
            if (i2 == 5) {
                return f138239f;
            }
            bxxk bxxk = f138240g;
            if (bxxk == null) {
                synchronized (bpmf.class) {
                    bxxk = f138240g;
                    if (bxxk == null) {
                        bxxk = new bxve(f138239f);
                        f138240g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
