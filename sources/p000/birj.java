package p000;

/* renamed from: birj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class birj extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final birj f121419c;

    /* renamed from: e */
    private static volatile bxxk f121420e;

    /* renamed from: a */
    public int f121421a;

    /* renamed from: b */
    public int f121422b;

    /* renamed from: d */
    private byte f121423d = 2;

    static {
        birj birj = new birj();
        f121419c = birj;
        GeneratedMessageLite.m124024a(birj.class, birj);
    }

    private birj() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121423d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121423d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121419c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔌ\u0000", new Object[]{"a", "b", birh.f121418a});
        } else if (i2 == 3) {
            return new birj();
        } else {
            if (i2 == 4) {
                return new bxvd(f121419c);
            }
            if (i2 == 5) {
                return f121419c;
            }
            bxxk bxxk = f121420e;
            if (bxxk == null) {
                synchronized (birj.class) {
                    bxxk = f121420e;
                    if (bxxk == null) {
                        bxxk = new bxve(f121419c);
                        f121420e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
