package p000;

/* renamed from: bwtg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwtg extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bwtg f160954e;

    /* renamed from: f */
    private static volatile bxxk f160955f;

    /* renamed from: a */
    public int f160956a;

    /* renamed from: b */
    public int f160957b;

    /* renamed from: c */
    public int f160958c;

    /* renamed from: d */
    public boolean f160959d;

    static {
        bwtg bwtg = new bwtg();
        f160954e = bwtg;
        GeneratedMessageLite.m124024a(bwtg.class, bwtg);
    }

    private bwtg() {
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
            return GeneratedMessageLite.m124022a(f160954e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bwtg();
        } else {
            if (i2 == 4) {
                return new bxvd(f160954e);
            }
            if (i2 == 5) {
                return f160954e;
            }
            bxxk bxxk = f160955f;
            if (bxxk == null) {
                synchronized (bwtg.class) {
                    bxxk = f160955f;
                    if (bxxk == null) {
                        bxxk = new bxve(f160954e);
                        f160955f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
