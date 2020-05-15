package p000;

/* renamed from: bwqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwqt extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bwqt f160721b;

    /* renamed from: c */
    public static final bxvj f160722c;

    /* renamed from: e */
    private static volatile bxxk f160723e;

    /* renamed from: a */
    public bxwc f160724a = bxxn.f165040b;

    /* renamed from: d */
    private byte f160725d = 2;

    static {
        bwqt bwqt = new bwqt();
        f160721b = bwqt;
        bxvk.m124024a(bwqt.class, bwqt);
        bwny bwny = bwny.f160414k;
        bwqt bwqt2 = f160721b;
        f160722c = bxvk.m124006a(bwny, bwqt2, bwqt2, 233780159, bxzf.MESSAGE);
    }

    private bwqt() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160725d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f160725d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f160721b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", bwoq.class});
        } else if (i2 == 3) {
            return new bwqt();
        } else {
            if (i2 == 4) {
                return new bxvd(f160721b);
            }
            if (i2 == 5) {
                return f160721b;
            }
            bxxk bxxk = f160723e;
            if (bxxk == null) {
                synchronized (bwqt.class) {
                    bxxk = f160723e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160721b);
                        f160723e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
