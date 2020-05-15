package p000;

/* renamed from: bsic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsic extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bsic f144661b;

    /* renamed from: c */
    private static volatile bxxk f144662c;

    /* renamed from: a */
    public String f144663a = "";

    static {
        bsic bsic = new bsic();
        f144661b = bsic;
        bxvk.m124024a(bsic.class, bsic);
    }

    private bsic() {
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
            return bxvk.m124022a(f144661b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bsic();
        } else {
            if (i2 == 4) {
                return new bxvd(f144661b);
            }
            if (i2 == 5) {
                return f144661b;
            }
            bxxk bxxk = f144662c;
            if (bxxk == null) {
                synchronized (bsic.class) {
                    bxxk = f144662c;
                    if (bxxk == null) {
                        bxxk = new bxve(f144661b);
                        f144662c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
