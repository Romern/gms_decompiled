package p000;

/* renamed from: btew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btew extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btew f148584b;

    /* renamed from: d */
    private static volatile bxxk f148585d;

    /* renamed from: a */
    public btec f148586a;

    /* renamed from: c */
    private byte f148587c = 2;

    static {
        btew btew = new btew();
        f148584b = btew;
        bxvk.m124024a(btew.class, btew);
    }

    private btew() {
        bxxn bxxn = bxxn.f165040b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f148587c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f148587c = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f148584b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btew();
        } else {
            if (i2 == 4) {
                return new bxvd(f148584b);
            }
            if (i2 == 5) {
                return f148584b;
            }
            bxxk bxxk = f148585d;
            if (bxxk == null) {
                synchronized (btew.class) {
                    bxxk = f148585d;
                    if (bxxk == null) {
                        bxxk = new bxve(f148584b);
                        f148585d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
