package p000;

/* renamed from: cboa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cboa extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cboa f177788b;

    /* renamed from: c */
    private static volatile bxxk f177789c;

    /* renamed from: a */
    public String f177790a = "";

    static {
        cboa cboa = new cboa();
        f177788b = cboa;
        bxvk.m124024a(cboa.class, cboa);
    }

    private cboa() {
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
            return bxvk.m124022a(f177788b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cboa();
        } else {
            if (i2 == 4) {
                return new bxvd(f177788b);
            }
            if (i2 == 5) {
                return f177788b;
            }
            bxxk bxxk = f177789c;
            if (bxxk == null) {
                synchronized (cboa.class) {
                    bxxk = f177789c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177788b);
                        f177789c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
