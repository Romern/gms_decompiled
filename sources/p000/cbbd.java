package p000;

/* renamed from: cbbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbbd extends bxvk implements bxxd {

    /* renamed from: l */
    public static final cbbd f176530l;

    /* renamed from: m */
    private static volatile bxxk f176531m;

    /* renamed from: a */
    public int f176532a;

    /* renamed from: b */
    public boolean f176533b;

    /* renamed from: c */
    public boolean f176534c;

    /* renamed from: d */
    public long f176535d;

    /* renamed from: e */
    public long f176536e;

    /* renamed from: f */
    public int f176537f;

    /* renamed from: g */
    public String f176538g = "";

    /* renamed from: h */
    public int f176539h;

    /* renamed from: i */
    public int f176540i;

    /* renamed from: j */
    public int f176541j;

    /* renamed from: k */
    public String f176542k = "";

    static {
        cbbd cbbd = new cbbd();
        f176530l = cbbd;
        bxvk.m124024a(cbbd.class, cbbd);
    }

    private cbbd() {
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
            return bxvk.m124022a(f176530l, "\u0000\u000b\u0000\u0000\u0001\f\u000b\u0000\u0000\u0000\u0001\u0004\u0002\u0007\u0003\u0007\u0004\u0002\u0005\u0002\u0006\u0004\bȈ\t\u0004\n\u0004\u000b\u0004\fȈ", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new cbbd();
        } else {
            if (i2 == 4) {
                return new bxvd(f176530l);
            }
            if (i2 == 5) {
                return f176530l;
            }
            bxxk bxxk = f176531m;
            if (bxxk == null) {
                synchronized (cbbd.class) {
                    bxxk = f176531m;
                    if (bxxk == null) {
                        bxxk = new bxve(f176530l);
                        f176531m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
