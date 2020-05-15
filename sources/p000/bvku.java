package p000;

/* renamed from: bvku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvku extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvku f156466c;

    /* renamed from: d */
    private static volatile bxxk f156467d;

    /* renamed from: a */
    public String f156468a = "";

    /* renamed from: b */
    public String f156469b = "";

    static {
        bvku bvku = new bvku();
        f156466c = bvku;
        bxvk.m124024a(bvku.class, bvku);
    }

    private bvku() {
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
            return bxvk.m124022a(f156466c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvku();
        } else {
            if (i2 == 4) {
                return new bxvd(f156466c);
            }
            if (i2 == 5) {
                return f156466c;
            }
            bxxk bxxk = f156467d;
            if (bxxk == null) {
                synchronized (bvku.class) {
                    bxxk = f156467d;
                    if (bxxk == null) {
                        bxxk = new bxve(f156466c);
                        f156467d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
