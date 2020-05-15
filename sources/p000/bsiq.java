package p000;

/* renamed from: bsiq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsiq extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bsiq f144744a;

    /* renamed from: d */
    private static volatile bxxk f144745d;

    /* renamed from: b */
    private bxww f144746b = bxww.f165013b;

    /* renamed from: c */
    private byte f144747c = 2;

    static {
        bsiq bsiq = new bsiq();
        f144744a = bsiq;
        GeneratedMessageLite.m124024a(bsiq.class, bsiq);
    }

    private bsiq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f144747c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f144747c = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f144744a, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0001\u0000\u0000\u00032", new Object[]{"b", bsip.f144743a});
        } else if (i2 == 3) {
            return new bsiq();
        } else {
            if (i2 == 4) {
                return new bxvd(f144744a);
            }
            if (i2 == 5) {
                return f144744a;
            }
            bxxk bxxk = f144745d;
            if (bxxk == null) {
                synchronized (bsiq.class) {
                    bxxk = f144745d;
                    if (bxxk == null) {
                        bxxk = new bxve(f144744a);
                        f144745d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
