package p000;

/* renamed from: btqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btqy extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btqy f150053b;

    /* renamed from: c */
    private static volatile bxxk f150054c;

    /* renamed from: a */
    public bxwc f150055a = bxxn.f165040b;

    static {
        btqy btqy = new btqy();
        f150053b = btqy;
        bxvk.m124024a(btqy.class, btqy);
    }

    private btqy() {
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
            return bxvk.m124022a(f150053b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", btqx.class});
        } else if (i2 == 3) {
            return new btqy();
        } else {
            if (i2 == 4) {
                return new bxvd(f150053b);
            }
            if (i2 == 5) {
                return f150053b;
            }
            bxxk bxxk = f150054c;
            if (bxxk == null) {
                synchronized (btqy.class) {
                    bxxk = f150054c;
                    if (bxxk == null) {
                        bxxk = new bxve(f150053b);
                        f150054c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
