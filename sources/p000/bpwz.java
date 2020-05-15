package p000;

/* renamed from: bpwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpwz extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bpwz f139594g;

    /* renamed from: h */
    private static volatile bxxk f139595h;

    /* renamed from: a */
    public int f139596a;

    /* renamed from: b */
    public String f139597b = "";

    /* renamed from: c */
    public int f139598c;

    /* renamed from: d */
    public String f139599d = "";

    /* renamed from: e */
    public int f139600e;

    /* renamed from: f */
    public boolean f139601f;

    static {
        bpwz bpwz = new bpwz();
        f139594g = bpwz;
        bxvk.m124024a(bpwz.class, bpwz);
    }

    private bpwz() {
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
            return bxvk.m124022a(f139594g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bpwz();
        } else {
            if (i2 == 4) {
                return new bxvd(f139594g);
            }
            if (i2 == 5) {
                return f139594g;
            }
            bxxk bxxk = f139595h;
            if (bxxk == null) {
                synchronized (bpwz.class) {
                    bxxk = f139595h;
                    if (bxxk == null) {
                        bxxk = new bxve(f139594g);
                        f139595h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
