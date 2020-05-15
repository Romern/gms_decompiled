package p000;

/* renamed from: bpcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpcc extends bxvk implements bxxd {

    /* renamed from: k */
    public static final bpcc f135704k;

    /* renamed from: l */
    private static volatile bxxk f135705l;

    /* renamed from: a */
    public int f135706a;

    /* renamed from: b */
    public String f135707b = "";

    /* renamed from: c */
    public String f135708c = "";

    /* renamed from: d */
    public long f135709d;

    /* renamed from: e */
    public long f135710e;

    /* renamed from: f */
    public int f135711f;

    /* renamed from: g */
    public int f135712g;

    /* renamed from: h */
    public int f135713h;

    /* renamed from: i */
    public int f135714i;

    /* renamed from: j */
    public int f135715j;

    static {
        bpcc bpcc = new bpcc();
        f135704k = bpcc;
        bxvk.m124024a(bpcc.class, bpcc);
    }

    private bpcc() {
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
            return bxvk.m124022a(f135704k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\tဋ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new bpcc();
        } else {
            if (i2 == 4) {
                return new bxvd(f135704k);
            }
            if (i2 == 5) {
                return f135704k;
            }
            bxxk bxxk = f135705l;
            if (bxxk == null) {
                synchronized (bpcc.class) {
                    bxxk = f135705l;
                    if (bxxk == null) {
                        bxxk = new bxve(f135704k);
                        f135705l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
