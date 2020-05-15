package p000;

/* renamed from: jfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jfc extends bxvk implements bxxd {

    /* renamed from: e */
    public static final jfc f22341e;

    /* renamed from: g */
    private static volatile bxxk f22342g;

    /* renamed from: a */
    public String f22343a = "";

    /* renamed from: b */
    public int f22344b;

    /* renamed from: c */
    public String f22345c = "";

    /* renamed from: d */
    public bxwc f22346d = bxxn.f165040b;

    /* renamed from: f */
    private int f22347f;

    static {
        jfc jfc = new jfc();
        f22341e = jfc;
        bxvk.m124024a(jfc.class, jfc);
    }

    private jfc() {
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
            return bxvk.m124022a(f22341e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004\u001b", new Object[]{"f", "a", "b", jfa.f22340a, "c", "d", jeu.class});
        } else if (i2 == 3) {
            return new jfc();
        } else {
            if (i2 == 4) {
                return new bxvd(f22341e);
            }
            if (i2 == 5) {
                return f22341e;
            }
            bxxk bxxk = f22342g;
            if (bxxk == null) {
                synchronized (jfc.class) {
                    bxxk = f22342g;
                    if (bxxk == null) {
                        bxxk = new bxve(f22341e);
                        f22342g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
