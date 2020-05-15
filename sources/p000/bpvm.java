package p000;

/* renamed from: bpvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpvm extends bxvk implements bxxd {

    /* renamed from: l */
    public static final bpvm f139376l;

    /* renamed from: m */
    private static volatile bxxk f139377m;

    /* renamed from: a */
    public int f139378a;

    /* renamed from: b */
    public long f139379b;

    /* renamed from: c */
    public String f139380c = "";

    /* renamed from: d */
    public int f139381d;

    /* renamed from: e */
    public float f139382e;

    /* renamed from: f */
    public int f139383f;

    /* renamed from: g */
    public int f139384g;

    /* renamed from: h */
    public long f139385h;

    /* renamed from: i */
    public boolean f139386i;

    /* renamed from: j */
    public boolean f139387j;

    /* renamed from: k */
    public boolean f139388k;

    static {
        bpvm bpvm = new bpvm();
        f139376l = bpvm;
        bxvk.m124024a(bpvm.class, bpvm);
    }

    private bpvm() {
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
            return bxvk.m124022a(f139376l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ခ\u0003\u0005င\u0004\u0006င\u0005\u0007ဂ\u0006\bဇ\u0007\tဇ\b\nဇ\t", new Object[]{"a", "b", "c", "d", bpvl.f139375a, "e", "f", "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new bpvm();
        } else {
            if (i2 == 4) {
                return new bxvd(f139376l);
            }
            if (i2 == 5) {
                return f139376l;
            }
            bxxk bxxk = f139377m;
            if (bxxk == null) {
                synchronized (bpvm.class) {
                    bxxk = f139377m;
                    if (bxxk == null) {
                        bxxk = new bxve(f139376l);
                        f139377m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
