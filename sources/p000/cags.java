package p000;

/* renamed from: cags */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cags extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cags f174499b;

    /* renamed from: c */
    private static volatile bxxk f174500c;

    /* renamed from: a */
    public bxwc f174501a = bxxn.f165040b;

    static {
        cags cags = new cags();
        f174499b = cags;
        bxvk.m124024a(cags.class, cags);
    }

    private cags() {
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
            return bxvk.m124022a(f174499b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cags();
        } else {
            if (i2 == 4) {
                return new bxvd(f174499b);
            }
            if (i2 == 5) {
                return f174499b;
            }
            bxxk bxxk = f174500c;
            if (bxxk == null) {
                synchronized (cags.class) {
                    bxxk = f174500c;
                    if (bxxk == null) {
                        bxxk = new bxve(f174499b);
                        f174500c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
