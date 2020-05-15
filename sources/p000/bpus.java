package p000;

/* renamed from: bpus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpus extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bpus f139278e;

    /* renamed from: f */
    private static volatile bxxk f139279f;

    /* renamed from: a */
    public int f139280a;

    /* renamed from: b */
    public String f139281b = "";

    /* renamed from: c */
    public int f139282c;

    /* renamed from: d */
    public bpup f139283d;

    static {
        bpus bpus = new bpus();
        f139278e = bpus;
        GeneratedMessageLite.m124024a(bpus.class, bpus);
    }

    private bpus() {
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
            return GeneratedMessageLite.m124022a(f139278e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0005ဉ\u0004", new Object[]{"a", "b", "c", bpuq.f139277a, "d"});
        } else if (i2 == 3) {
            return new bpus();
        } else {
            if (i2 == 4) {
                return new bxvd(f139278e);
            }
            if (i2 == 5) {
                return f139278e;
            }
            bxxk bxxk = f139279f;
            if (bxxk == null) {
                synchronized (bpus.class) {
                    bxxk = f139279f;
                    if (bxxk == null) {
                        bxxk = new bxve(f139278e);
                        f139279f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
