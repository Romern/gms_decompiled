package p000;

/* renamed from: biui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biui extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final biui f121791b;

    /* renamed from: d */
    private static volatile bxxk f121792d;

    /* renamed from: a */
    public bxwc f121793a = bxxn.f165040b;

    /* renamed from: c */
    private byte f121794c = 2;

    static {
        biui biui = new biui();
        f121791b = biui;
        GeneratedMessageLite.m124024a(biui.class, biui);
    }

    private biui() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121794c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121794c = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121791b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", biuh.class});
        } else if (i2 == 3) {
            return new biui();
        } else {
            if (i2 == 4) {
                return new bxvd(f121791b);
            }
            if (i2 == 5) {
                return f121791b;
            }
            bxxk bxxk = f121792d;
            if (bxxk == null) {
                synchronized (biui.class) {
                    bxxk = f121792d;
                    if (bxxk == null) {
                        bxxk = new bxve(f121791b);
                        f121792d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
