package p000;

/* renamed from: bmpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmpl extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bmpl f130314g;

    /* renamed from: h */
    private static volatile bxxk f130315h;

    /* renamed from: a */
    public int f130316a;

    /* renamed from: b */
    public bxwc f130317b = bxxn.f165040b;

    /* renamed from: c */
    public String f130318c = "";

    /* renamed from: d */
    public String f130319d = "";

    /* renamed from: e */
    public int f130320e;

    /* renamed from: f */
    public int f130321f;

    static {
        bmpl bmpl = new bmpl();
        f130314g = bmpl;
        bxvk.m124024a(bmpl.class, bmpl);
    }

    private bmpl() {
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
            return bxvk.m124022a(f130314g, "\u0001\u0005\u0000\u0001\u0001\u000e\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဌ\u0002\u000eဌ\u0003", new Object[]{"a", "b", bmpk.class, "c", "d", "e", bmpi.f130297a, "f", bmad.f128435a});
        } else if (i2 == 3) {
            return new bmpl();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (float[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f130314g;
            }
            bxxk bxxk = f130315h;
            if (bxxk == null) {
                synchronized (bmpl.class) {
                    bxxk = f130315h;
                    if (bxxk == null) {
                        bxxk = new bxve(f130314g);
                        f130315h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
