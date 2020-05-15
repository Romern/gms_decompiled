package p000;

/* renamed from: brbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brbi extends bxvk implements bxxd {

    /* renamed from: e */
    public static final brbi f142262e;

    /* renamed from: f */
    private static volatile bxxk f142263f;

    /* renamed from: a */
    public int f142264a;

    /* renamed from: b */
    public brak f142265b;

    /* renamed from: c */
    public brcd f142266c;

    /* renamed from: d */
    public braq f142267d;

    static {
        brbi brbi = new brbi();
        f142262e = brbi;
        bxvk.m124024a(brbi.class, brbi);
    }

    private brbi() {
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
            return bxvk.m124022a(f142262e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new brbi();
        } else {
            if (i2 == 4) {
                return new bxvd(f142262e);
            }
            if (i2 == 5) {
                return f142262e;
            }
            bxxk bxxk = f142263f;
            if (bxxk == null) {
                synchronized (brbi.class) {
                    bxxk = f142263f;
                    if (bxxk == null) {
                        bxxk = new bxve(f142262e);
                        f142263f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
