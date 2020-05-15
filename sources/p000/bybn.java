package p000;

/* renamed from: bybn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bybn extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bybn f165523b;

    /* renamed from: d */
    private static volatile bxxk f165524d;

    /* renamed from: a */
    public bxwc f165525a = bxxn.f165040b;

    /* renamed from: c */
    private byte f165526c = 2;

    static {
        bybn bybn = new bybn();
        f165523b = bybn;
        bxvk.m124024a(bybn.class, bybn);
    }

    private bybn() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f165526c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f165526c = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f165523b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", bybo.class});
        } else if (i2 == 3) {
            return new bybn();
        } else {
            if (i2 == 4) {
                return new bybm();
            }
            if (i2 == 5) {
                return f165523b;
            }
            bxxk bxxk = f165524d;
            if (bxxk == null) {
                synchronized (bybn.class) {
                    bxxk = f165524d;
                    if (bxxk == null) {
                        bxxk = new bxve(f165523b);
                        f165524d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
