package p000;

/* renamed from: bplp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bplp extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bplp f138118i;

    /* renamed from: j */
    private static volatile bxxk f138119j;

    /* renamed from: a */
    public int f138120a;

    /* renamed from: b */
    public bxvw f138121b = bxwq.f165002b;

    /* renamed from: c */
    public bxvw f138122c = bxwq.f165002b;

    /* renamed from: d */
    public bxvw f138123d = bxwq.f165002b;

    /* renamed from: e */
    public bxvw f138124e = bxwq.f165002b;

    /* renamed from: f */
    public int f138125f;

    /* renamed from: g */
    public int f138126g;

    /* renamed from: h */
    public int f138127h;

    static {
        bplp bplp = new bplp();
        f138118i = bplp;
        bxvk.m124024a(bplp.class, bplp);
    }

    private bplp() {
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
            return bxvk.m124022a(f138118i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0004\u0000\u0001\u0014\u0002\u0014\u0004\u0014\u0005\u0014\u0006င\u0000\u0007ဌ\u0001\bဌ\u0002", new Object[]{"a", "b", "c", "d", "e", "f", "g", bplo.f138117a, "h", bpln.f138116a});
        } else if (i2 == 3) {
            return new bplp();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (int[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f138118i;
            }
            bxxk bxxk = f138119j;
            if (bxxk == null) {
                synchronized (bplp.class) {
                    bxxk = f138119j;
                    if (bxxk == null) {
                        bxxk = new bxve(f138118i);
                        f138119j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
