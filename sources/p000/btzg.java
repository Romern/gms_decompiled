package p000;

/* renamed from: btzg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btzg extends bxvk implements bxxd {

    /* renamed from: g */
    public static final btzg f153106g;

    /* renamed from: h */
    private static volatile bxxk f153107h;

    /* renamed from: a */
    public int f153108a;

    /* renamed from: b */
    public int f153109b;

    /* renamed from: c */
    public String f153110c = "";

    /* renamed from: d */
    public bxwc f153111d = bxxn.f165040b;

    /* renamed from: e */
    public btzh f153112e;

    /* renamed from: f */
    public bxyk f153113f;

    static {
        btzg btzg = new btzg();
        f153106g = btzg;
        bxvk.m124024a(btzg.class, btzg);
    }

    private btzg() {
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
            return bxvk.m124022a(f153106g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", btzf.f153105a, "c", "d", btzh.class, "e", "f"});
        } else if (i2 == 3) {
            return new btzg();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (char[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f153106g;
            }
            bxxk bxxk = f153107h;
            if (bxxk == null) {
                synchronized (btzg.class) {
                    bxxk = f153107h;
                    if (bxxk == null) {
                        bxxk = new bxve(f153106g);
                        f153107h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
