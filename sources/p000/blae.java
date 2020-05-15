package p000;

/* renamed from: blae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blae extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final blae f125745a;

    /* renamed from: e */
    private static volatile bxxk f125746e;

    /* renamed from: b */
    private int f125747b;

    /* renamed from: c */
    private int f125748c;

    /* renamed from: d */
    private byte f125749d = 2;

    static {
        blae blae = new blae();
        f125745a = blae;
        GeneratedMessageLite.m124024a(blae.class, blae);
    }

    private blae() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125749d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f125749d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f125745a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔌ\u0000", new Object[]{"b", "c", blga.f126417a});
        } else if (i2 == 3) {
            return new blae();
        } else {
            if (i2 == 4) {
                return new bxvd(f125745a);
            }
            if (i2 == 5) {
                return f125745a;
            }
            bxxk bxxk = f125746e;
            if (bxxk == null) {
                synchronized (blae.class) {
                    bxxk = f125746e;
                    if (bxxk == null) {
                        bxxk = new bxve(f125745a);
                        f125746e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
