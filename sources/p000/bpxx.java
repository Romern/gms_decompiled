package p000;

/* renamed from: bpxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpxx extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bpxx f139799f;

    /* renamed from: g */
    private static volatile bxxk f139800g;

    /* renamed from: a */
    public int f139801a;

    /* renamed from: b */
    public String f139802b = "";

    /* renamed from: c */
    public int f139803c;

    /* renamed from: d */
    public int f139804d;

    /* renamed from: e */
    public String f139805e = "";

    static {
        bpxx bpxx = new bpxx();
        f139799f = bpxx;
        GeneratedMessageLite.m124024a(bpxx.class, bpxx);
    }

    private bpxx() {
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
            return GeneratedMessageLite.m124022a(f139799f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0004\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "e", "b", "c", bqah.f140123a, "d", bqag.f140122a});
        } else if (i2 == 3) {
            return new bpxx();
        } else {
            if (i2 == 4) {
                return new bxvd(f139799f);
            }
            if (i2 == 5) {
                return f139799f;
            }
            bxxk bxxk = f139800g;
            if (bxxk == null) {
                synchronized (bpxx.class) {
                    bxxk = f139800g;
                    if (bxxk == null) {
                        bxxk = new bxve(f139799f);
                        f139800g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
