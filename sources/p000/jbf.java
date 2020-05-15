package p000;

/* renamed from: jbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jbf extends bxvk implements bxxd {

    /* renamed from: e */
    public static final jbf f22084e;

    /* renamed from: f */
    private static volatile bxxk f22085f;

    /* renamed from: a */
    public bxtx f22086a = bxtx.f164797b;

    /* renamed from: b */
    public bxtx f22087b = bxtx.f164797b;

    /* renamed from: c */
    public bxww f22088c = bxww.f165013b;

    /* renamed from: d */
    public int f22089d;

    static {
        jbf jbf = new jbf();
        f22084e = jbf;
        bxvk.m124024a(jbf.class, jbf);
    }

    private jbf() {
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
            return bxvk.m124022a(f22084e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\n\u0002\n\u00032\u0004\u0004", new Object[]{"a", "b", "c", jbe.f22083a, "d"});
        } else if (i2 == 3) {
            return new jbf();
        } else {
            if (i2 == 4) {
                return new bxvd(f22084e);
            }
            if (i2 == 5) {
                return f22084e;
            }
            bxxk bxxk = f22085f;
            if (bxxk == null) {
                synchronized (jbf.class) {
                    bxxk = f22085f;
                    if (bxxk == null) {
                        bxxk = new bxve(f22084e);
                        f22085f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
