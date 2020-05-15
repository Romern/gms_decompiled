package p000;

/* renamed from: blte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blte extends bxvk implements bxxd {

    /* renamed from: d */
    public static final blte f127676d;

    /* renamed from: f */
    private static volatile bxxk f127677f;

    /* renamed from: a */
    public blth f127678a;

    /* renamed from: b */
    public String f127679b = "";

    /* renamed from: c */
    public boolean f127680c;

    /* renamed from: e */
    private int f127681e;

    static {
        blte blte = new blte();
        f127676d = blte;
        bxvk.m124024a(blte.class, blte);
    }

    private blte() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f127676d, "\u0001\u0003\u0000\u0001\u0001\u000e\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဈ\u0003\u000eဇ\u0006", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new blte();
        } else {
            if (i2 == 4) {
                return new bxvd(f127676d);
            }
            if (i2 == 5) {
                return f127676d;
            }
            bxxk bxxk = f127677f;
            if (bxxk == null) {
                synchronized (blte.class) {
                    bxxk = f127677f;
                    if (bxxk == null) {
                        bxxk = new bxve(f127676d);
                        f127677f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
