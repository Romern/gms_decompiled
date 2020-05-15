package p000;

/* renamed from: bvpg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvpg extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bvpg f157286f;

    /* renamed from: g */
    private static volatile bxxk f157287g;

    /* renamed from: a */
    public int f157288a;

    /* renamed from: b */
    public String f157289b = "";

    /* renamed from: c */
    public String f157290c = "";

    /* renamed from: d */
    public bxwc f157291d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f157292e = bxxn.f165040b;

    static {
        bvpg bvpg = new bvpg();
        f157286f = bvpg;
        bxvk.m124024a(bvpg.class, bvpg);
    }

    private bvpg() {
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
            return bxvk.m124022a(f157286f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0004\u001b", new Object[]{"a", "b", "c", "d", bvph.class, "e", bvph.class});
        } else if (i2 == 3) {
            return new bvpg();
        } else {
            if (i2 == 4) {
                return new bxvd(f157286f);
            }
            if (i2 == 5) {
                return f157286f;
            }
            bxxk bxxk = f157287g;
            if (bxxk == null) {
                synchronized (bvpg.class) {
                    bxxk = f157287g;
                    if (bxxk == null) {
                        bxxk = new bxve(f157286f);
                        f157287g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
