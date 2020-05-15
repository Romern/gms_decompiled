package p000;

/* renamed from: cipa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cipa extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cipa f191171c;

    /* renamed from: d */
    private static volatile bxxk f191172d;

    /* renamed from: a */
    public int f191173a;

    /* renamed from: b */
    public String f191174b = "";

    static {
        cipa cipa = new cipa();
        f191171c = cipa;
        bxvk.m124024a(cipa.class, cipa);
    }

    private cipa() {
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
            return bxvk.m124022a(f191171c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cipa();
        } else {
            if (i2 == 4) {
                return new bxvd(f191171c);
            }
            if (i2 == 5) {
                return f191171c;
            }
            bxxk bxxk = f191172d;
            if (bxxk == null) {
                synchronized (cipa.class) {
                    bxxk = f191172d;
                    if (bxxk == null) {
                        bxxk = new bxve(f191171c);
                        f191172d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
