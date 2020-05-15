package p000;

/* renamed from: bpob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpob extends bxvk implements bxxd {

    /* renamed from: j */
    public static final bpob f138459j;

    /* renamed from: k */
    private static volatile bxxk f138460k;

    /* renamed from: a */
    public int f138461a;

    /* renamed from: b */
    public int f138462b;

    /* renamed from: c */
    public int f138463c;

    /* renamed from: d */
    public int f138464d;

    /* renamed from: e */
    public int f138465e;

    /* renamed from: f */
    public int f138466f;

    /* renamed from: g */
    public boolean f138467g;

    /* renamed from: h */
    public int f138468h;

    /* renamed from: i */
    public int f138469i;

    static {
        bpob bpob = new bpob();
        f138459j = bpob;
        bxvk.m124024a(bpob.class, bpob);
    }

    private bpob() {
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
            return bxvk.m124022a(f138459j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဇ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", bpoa.f138458a, "i", bpnz.f138457a});
        } else if (i2 == 3) {
            return new bpob();
        } else {
            if (i2 == 4) {
                return new bxvd(f138459j);
            }
            if (i2 == 5) {
                return f138459j;
            }
            bxxk bxxk = f138460k;
            if (bxxk == null) {
                synchronized (bpob.class) {
                    bxxk = f138460k;
                    if (bxxk == null) {
                        bxxk = new bxve(f138459j);
                        f138460k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
