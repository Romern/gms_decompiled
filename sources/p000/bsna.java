package p000;

/* renamed from: bsna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsna extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bsna f146214c;

    /* renamed from: d */
    private static volatile bxxk f146215d;

    /* renamed from: a */
    public int f146216a;

    /* renamed from: b */
    public bsnb f146217b;

    static {
        bsna bsna = new bsna();
        f146214c = bsna;
        GeneratedMessageLite.m124024a(bsna.class, bsna);
    }

    private bsna() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f146214c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bsna();
        } else {
            if (i2 == 4) {
                return new bxvd(f146214c);
            }
            if (i2 == 5) {
                return f146214c;
            }
            bxxk bxxk = f146215d;
            if (bxxk == null) {
                synchronized (bsna.class) {
                    bxxk = f146215d;
                    if (bxxk == null) {
                        bxxk = new bxve(f146214c);
                        f146215d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
