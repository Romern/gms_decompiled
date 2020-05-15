package p000;

/* renamed from: bpsk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpsk extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bpsk f138966h;

    /* renamed from: i */
    private static volatile bxxk f138967i;

    /* renamed from: a */
    public int f138968a;

    /* renamed from: b */
    public int f138969b = 0;

    /* renamed from: c */
    public Object f138970c;

    /* renamed from: d */
    public long f138971d;

    /* renamed from: e */
    public int f138972e;

    /* renamed from: f */
    public long f138973f;

    /* renamed from: g */
    public int f138974g;

    static {
        bpsk bpsk = new bpsk();
        f138966h = bpsk;
        GeneratedMessageLite.m124024a(bpsk.class, bpsk);
    }

    private bpsk() {
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
            return GeneratedMessageLite.m124022a(f138966h, "\u0001\n\u0001\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ဌ\u0001\u0003ဂ\u0003\u0004ဌ\u0004\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bဂ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000", new Object[]{"c", "b", "a", "e", bpsg.m112233b(), "f", "g", bpsh.f138958a, bpsi.class, bpsj.class, bpsl.class, "d", bpsm.class, bpsn.class, bpso.class});
        } else if (i2 == 3) {
            return new bpsk();
        } else {
            if (i2 == 4) {
                return new bxvd(f138966h);
            }
            if (i2 == 5) {
                return f138966h;
            }
            bxxk bxxk = f138967i;
            if (bxxk == null) {
                synchronized (bpsk.class) {
                    bxxk = f138967i;
                    if (bxxk == null) {
                        bxxk = new bxve(f138966h);
                        f138967i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
