package p000;

/* renamed from: dmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dmo extends bxvk implements bxxd {

    /* renamed from: f */
    public static final dmo f13572f;

    /* renamed from: g */
    private static volatile bxxk f13573g;

    /* renamed from: a */
    public int f13574a;

    /* renamed from: b */
    public String f13575b = "";

    /* renamed from: c */
    public int f13576c;

    /* renamed from: d */
    public bxwc f13577d = bxxn.f165040b;

    /* renamed from: e */
    public int f13578e = -1;

    static {
        dmo dmo = new dmo();
        f13572f = dmo;
        bxvk.m124024a(dmo.class, dmo);
    }

    private dmo() {
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
            return bxvk.m124022a(f13572f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003\u001a\u0004င\u0002", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new dmo();
        } else {
            if (i2 == 4) {
                return new bxvd(f13572f);
            }
            if (i2 == 5) {
                return f13572f;
            }
            bxxk bxxk = f13573g;
            if (bxxk == null) {
                synchronized (dmo.class) {
                    bxxk = f13573g;
                    if (bxxk == null) {
                        bxxk = new bxve(f13572f);
                        f13573g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
