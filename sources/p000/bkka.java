package p000;

/* renamed from: bkka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkka extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bkka f124488e;

    /* renamed from: f */
    private static volatile bxxk f124489f;

    /* renamed from: a */
    public int f124490a;

    /* renamed from: b */
    public String f124491b = "";

    /* renamed from: c */
    public String f124492c = "";

    /* renamed from: d */
    public String f124493d;

    static {
        bkka bkka = new bkka();
        f124488e = bkka;
        bxvk.m124024a(bkka.class, bkka);
    }

    private bkka() {
        bxxn bxxn = bxxn.f165040b;
        this.f124493d = "";
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
            return bxvk.m124022a(f124488e, "\u0001\u0003\u0000\u0001\u0001\u000f\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u000fဈ\r", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bkka();
        } else {
            if (i2 == 4) {
                return new bxvd(f124488e);
            }
            if (i2 == 5) {
                return f124488e;
            }
            bxxk bxxk = f124489f;
            if (bxxk == null) {
                synchronized (bkka.class) {
                    bxxk = f124489f;
                    if (bxxk == null) {
                        bxxk = new bxve(f124488e);
                        f124489f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
