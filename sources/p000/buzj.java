package p000;

/* renamed from: buzj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buzj extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final buzj f155387c;

    /* renamed from: d */
    private static volatile bxxk f155388d;

    /* renamed from: a */
    public int f155389a;

    /* renamed from: b */
    public buzi f155390b;

    static {
        buzj buzj = new buzj();
        f155387c = buzj;
        GeneratedMessageLite.m124024a(buzj.class, buzj);
    }

    private buzj() {
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
            return GeneratedMessageLite.m124022a(f155387c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new buzj();
        } else {
            if (i2 == 4) {
                return new bxvd(f155387c);
            }
            if (i2 == 5) {
                return f155387c;
            }
            bxxk bxxk = f155388d;
            if (bxxk == null) {
                synchronized (buzj.class) {
                    bxxk = f155388d;
                    if (bxxk == null) {
                        bxxk = new bxve(f155387c);
                        f155388d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
