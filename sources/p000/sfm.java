package p000;

/* renamed from: sfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sfm extends bxvk implements bxxd {

    /* renamed from: c */
    public static final sfm f44125c;

    /* renamed from: e */
    private static volatile bxxk f44126e;

    /* renamed from: a */
    public sfn f44127a;

    /* renamed from: b */
    public String f44128b = "";

    /* renamed from: d */
    private int f44129d;

    static {
        sfm sfm = new sfm();
        f44125c = sfm;
        bxvk.m124024a(sfm.class, sfm);
    }

    private sfm() {
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
            return bxvk.m124022a(f44125c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new sfm();
        } else {
            if (i2 == 4) {
                return new bxvd(f44125c);
            }
            if (i2 == 5) {
                return f44125c;
            }
            bxxk bxxk = f44126e;
            if (bxxk == null) {
                synchronized (sfm.class) {
                    bxxk = f44126e;
                    if (bxxk == null) {
                        bxxk = new bxve(f44125c);
                        f44126e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
