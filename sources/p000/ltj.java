package p000;

/* renamed from: ltj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ltj extends bxvk implements bxxd {

    /* renamed from: d */
    public static final ltj f32941d;

    /* renamed from: f */
    private static volatile bxxk f32942f;

    /* renamed from: a */
    public String f32943a = "";

    /* renamed from: b */
    public bxwc f32944b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f32945c = bxxn.f165040b;

    /* renamed from: e */
    private int f32946e;

    static {
        ltj ltj = new ltj();
        f32941d = ltj;
        bxvk.m124024a(ltj.class, ltj);
    }

    private ltj() {
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
            return bxvk.m124022a(f32941d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new ltj();
        } else {
            if (i2 == 4) {
                return new bxvd(f32941d);
            }
            if (i2 == 5) {
                return f32941d;
            }
            bxxk bxxk = f32942f;
            if (bxxk == null) {
                synchronized (ltj.class) {
                    bxxk = f32942f;
                    if (bxxk == null) {
                        bxxk = new bxve(f32941d);
                        f32942f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
