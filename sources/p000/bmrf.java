package p000;

/* renamed from: bmrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmrf extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bmrf f130474i;

    /* renamed from: k */
    private static volatile bxxk f130475k;

    /* renamed from: a */
    public int f130476a;

    /* renamed from: b */
    public bmbr f130477b;

    /* renamed from: c */
    public bxwc f130478c = bxxn.f165040b;

    /* renamed from: d */
    public bmet f130479d;

    /* renamed from: e */
    public bmdb f130480e;

    /* renamed from: f */
    public int f130481f;

    /* renamed from: g */
    public bmkw f130482g;

    /* renamed from: h */
    public bmjt f130483h;

    /* renamed from: j */
    private byte f130484j = 2;

    static {
        bmrf bmrf = new bmrf();
        f130474i = bmrf;
        GeneratedMessageLite.m124024a(bmrf.class, bmrf);
    }

    private bmrf() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f130484j);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f130484j = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f130474i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0006\u001b\u0007ဌ\u0003\bᐉ\u0004\tဉ\u0005", new Object[]{"a", "b", "d", "e", "c", bmqw.class, "f", bmrd.f130473a, "g", "h"});
        } else if (i2 == 3) {
            return new bmrf();
        } else {
            if (i2 == 4) {
                return new bxvd(f130474i);
            }
            if (i2 == 5) {
                return f130474i;
            }
            bxxk bxxk = f130475k;
            if (bxxk == null) {
                synchronized (bmrf.class) {
                    bxxk = f130475k;
                    if (bxxk == null) {
                        bxxk = new bxve(f130474i);
                        f130475k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
