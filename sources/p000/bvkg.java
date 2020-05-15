package p000;

/* renamed from: bvkg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvkg extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvkg f156408c;

    /* renamed from: d */
    private static volatile bxxk f156409d;

    /* renamed from: a */
    public String f156410a = "";

    /* renamed from: b */
    public String f156411b = "";

    static {
        bvkg bvkg = new bvkg();
        f156408c = bvkg;
        bxvk.m124024a(bvkg.class, bvkg);
    }

    private bvkg() {
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
            return bxvk.m124022a(f156408c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvkg();
        } else {
            if (i2 == 4) {
                return new bxvd(f156408c);
            }
            if (i2 == 5) {
                return f156408c;
            }
            bxxk bxxk = f156409d;
            if (bxxk == null) {
                synchronized (bvkg.class) {
                    bxxk = f156409d;
                    if (bxxk == null) {
                        bxxk = new bxve(f156408c);
                        f156409d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
