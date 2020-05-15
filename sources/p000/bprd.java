package p000;

/* renamed from: bprd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bprd extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bprd f138822e;

    /* renamed from: f */
    private static volatile bxxk f138823f;

    /* renamed from: a */
    public int f138824a;

    /* renamed from: b */
    public int f138825b;

    /* renamed from: c */
    public long f138826c;

    /* renamed from: d */
    public int f138827d;

    static {
        bprd bprd = new bprd();
        f138822e = bprd;
        GeneratedMessageLite.m124024a(bprd.class, bprd);
    }

    private bprd() {
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
            return GeneratedMessageLite.m124022a(f138822e, "\u0001\u0003\u0000\u0001\u0001\b\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\bဌ\u0002", new Object[]{"a", "b", bprc.f138821a, "c", "d", bpor.f138568a});
        } else if (i2 == 3) {
            return new bprd();
        } else {
            if (i2 == 4) {
                return new bxvd(f138822e);
            }
            if (i2 == 5) {
                return f138822e;
            }
            bxxk bxxk = f138823f;
            if (bxxk == null) {
                synchronized (bprd.class) {
                    bxxk = f138823f;
                    if (bxxk == null) {
                        bxxk = new bxve(f138822e);
                        f138823f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
