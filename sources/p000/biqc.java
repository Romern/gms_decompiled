package p000;

/* renamed from: biqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biqc extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final biqc f121249b;

    /* renamed from: e */
    private static volatile bxxk f121250e;

    /* renamed from: a */
    public int f121251a;

    /* renamed from: c */
    private int f121252c;

    /* renamed from: d */
    private byte f121253d = 2;

    static {
        biqc biqc = new biqc();
        f121249b = biqc;
        GeneratedMessageLite.m124024a(biqc.class, biqc);
    }

    private biqc() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121253d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121253d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121249b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔄ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new biqc();
        } else {
            if (i2 == 4) {
                return new bxvd(f121249b);
            }
            if (i2 == 5) {
                return f121249b;
            }
            bxxk bxxk = f121250e;
            if (bxxk == null) {
                synchronized (biqc.class) {
                    bxxk = f121250e;
                    if (bxxk == null) {
                        bxxk = new bxve(f121249b);
                        f121250e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
