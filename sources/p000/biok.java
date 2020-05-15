package p000;

/* renamed from: biok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biok extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final biok f121053b;

    /* renamed from: d */
    private static volatile bxxk f121054d;

    /* renamed from: a */
    public bxwc f121055a = bxxn.f165040b;

    /* renamed from: c */
    private byte f121056c = 2;

    static {
        biok biok = new biok();
        f121053b = biok;
        GeneratedMessageLite.m124024a(biok.class, biok);
    }

    private biok() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121056c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121056c = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121053b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", bioj.class});
        } else if (i2 == 3) {
            return new biok();
        } else {
            if (i2 == 4) {
                return new bxvd(f121053b);
            }
            if (i2 == 5) {
                return f121053b;
            }
            bxxk bxxk = f121054d;
            if (bxxk == null) {
                synchronized (biok.class) {
                    bxxk = f121054d;
                    if (bxxk == null) {
                        bxxk = new bxve(f121053b);
                        f121054d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
