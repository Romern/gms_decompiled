package p000;

/* renamed from: qus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qus extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final qus f42187j;

    /* renamed from: k */
    private static volatile bxxk f42188k;

    /* renamed from: a */
    public int f42189a;

    /* renamed from: b */
    public String f42190b = "";

    /* renamed from: c */
    public String f42191c = "";

    /* renamed from: d */
    public int f42192d;

    /* renamed from: e */
    public String f42193e = "";

    /* renamed from: f */
    public int f42194f;

    /* renamed from: g */
    public int f42195g;

    /* renamed from: h */
    public String f42196h = "";

    /* renamed from: i */
    public String f42197i = "";

    static {
        qus qus = new qus();
        f42187j = qus;
        GeneratedMessageLite.m124024a(qus.class, qus);
    }

    private qus() {
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
            return GeneratedMessageLite.m124022a(f42187j, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006င\u0005\u0007င\u0006\bဈ\u0007\fဈ\u000b", new Object[]{"a", "b", "c", "d", quq.f42186a, "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new qus();
        } else {
            if (i2 == 4) {
                return new bxvd(f42187j);
            }
            if (i2 == 5) {
                return f42187j;
            }
            bxxk bxxk = f42188k;
            if (bxxk == null) {
                synchronized (qus.class) {
                    bxxk = f42188k;
                    if (bxxk == null) {
                        bxxk = new bxve(f42187j);
                        f42188k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
