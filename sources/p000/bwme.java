package p000;

/* renamed from: bwme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwme extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bwme f160249b;

    /* renamed from: d */
    private static volatile bxxk f160250d;

    /* renamed from: a */
    public int f160251a;

    /* renamed from: c */
    private boolean f160252c;

    static {
        bwme bwme = new bwme();
        f160249b = bwme;
        GeneratedMessageLite.m124024a(bwme.class, bwme);
    }

    private bwme() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f160249b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0000", new Object[]{"a", "c"});
        } else if (i2 == 3) {
            return new bwme();
        } else {
            if (i2 == 4) {
                return new bxvd(f160249b);
            }
            if (i2 == 5) {
                return f160249b;
            }
            bxxk bxxk = f160250d;
            if (bxxk == null) {
                synchronized (bwme.class) {
                    bxxk = f160250d;
                    if (bxxk == null) {
                        bxxk = new bxve(f160249b);
                        f160250d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
