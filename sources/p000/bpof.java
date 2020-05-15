package p000;

/* renamed from: bpof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpof extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final bpof f138495k;

    /* renamed from: l */
    private static volatile bxxk f138496l;

    /* renamed from: a */
    public int f138497a;

    /* renamed from: b */
    public int f138498b;

    /* renamed from: c */
    public int f138499c;

    /* renamed from: d */
    public int f138500d;

    /* renamed from: e */
    public boolean f138501e;

    /* renamed from: f */
    public boolean f138502f;

    /* renamed from: g */
    public int f138503g;

    /* renamed from: h */
    public bxwc f138504h = bxxn.f165040b;

    /* renamed from: i */
    public int f138505i;

    /* renamed from: j */
    public int f138506j;

    static {
        bpof bpof = new bpof();
        f138495k = bpof;
        GeneratedMessageLite.m124024a(bpof.class, bpof);
    }

    private bpof() {
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
            return GeneratedMessageLite.m124022a(f138495k, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0007င\u0006\t\u001b\u000bဌ\t\fင\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", bpoe.class, "i", bpnq.f138436a, "j"});
        } else if (i2 == 3) {
            return new bpof();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (char[][][]) null);
            }
            if (i2 == 5) {
                return f138495k;
            }
            bxxk bxxk = f138496l;
            if (bxxk == null) {
                synchronized (bpof.class) {
                    bxxk = f138496l;
                    if (bxxk == null) {
                        bxxk = new bxve(f138495k);
                        f138496l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
