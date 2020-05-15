package p000;

/* renamed from: bwmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwmo extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bwmo f160296a;

    /* renamed from: b */
    public static final bxvj f160297b;

    /* renamed from: c */
    private static volatile bxxk f160298c;

    static {
        bwmo bwmo = new bwmo();
        f160296a = bwmo;
        bxvk.m124024a(bwmo.class, bwmo);
        bwny bwny = bwny.f160414k;
        bwmo bwmo2 = f160296a;
        f160297b = bxvk.m124006a(bwny, bwmo2, bwmo2, 260216776, bxzf.MESSAGE);
    }

    private bwmo() {
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
            return bxvk.m124022a(f160296a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bwmo();
        }
        if (i2 == 4) {
            return new bxvd(f160296a);
        }
        if (i2 == 5) {
            return f160296a;
        }
        bxxk bxxk = f160298c;
        if (bxxk == null) {
            synchronized (bwmo.class) {
                bxxk = f160298c;
                if (bxxk == null) {
                    bxxk = new bxve(f160296a);
                    f160298c = bxxk;
                }
            }
        }
        return bxxk;
    }
}
