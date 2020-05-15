package p000;

/* renamed from: bwrm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwrm extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bwrm f160778b;

    /* renamed from: d */
    private static volatile bxxk f160779d;

    /* renamed from: a */
    public bwpd f160780a;

    /* renamed from: c */
    private int f160781c;

    static {
        bwrm bwrm = new bwrm();
        f160778b = bwrm;
        GeneratedMessageLite.m124024a(bwrm.class, bwrm);
    }

    private bwrm() {
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
            return GeneratedMessageLite.m124022a(f160778b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bwrm();
        } else {
            if (i2 == 4) {
                return new bxvd(f160778b);
            }
            if (i2 == 5) {
                return f160778b;
            }
            bxxk bxxk = f160779d;
            if (bxxk == null) {
                synchronized (bwrm.class) {
                    bxxk = f160779d;
                    if (bxxk == null) {
                        bxxk = new bxve(f160778b);
                        f160779d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
