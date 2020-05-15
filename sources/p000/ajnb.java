package p000;

/* renamed from: ajnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajnb extends bxvk implements bxxd {

    /* renamed from: b */
    public static final ajnb f70956b;

    /* renamed from: c */
    private static volatile bxxk f70957c;

    /* renamed from: a */
    public bxwc f70958a = bxxn.f165040b;

    static {
        ajnb ajnb = new ajnb();
        f70956b = ajnb;
        bxvk.m124024a(ajnb.class, ajnb);
    }

    private ajnb() {
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
            return bxvk.m124022a(f70956b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", ajnq.class});
        } else if (i2 == 3) {
            return new ajnb();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null);
            }
            if (i2 == 5) {
                return f70956b;
            }
            bxxk bxxk = f70957c;
            if (bxxk == null) {
                synchronized (ajnb.class) {
                    bxxk = f70957c;
                    if (bxxk == null) {
                        bxxk = new bxve(f70956b);
                        f70957c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
