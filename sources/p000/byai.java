package p000;

/* renamed from: byai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byai extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byai f165264d;

    /* renamed from: e */
    private static volatile bxxk f165265e;

    /* renamed from: a */
    public int f165266a;

    /* renamed from: b */
    public bwgv f165267b;

    /* renamed from: c */
    public blzf f165268c;

    static {
        byai byai = new byai();
        f165264d = byai;
        GeneratedMessageLite.m124024a(byai.class, byai);
    }

    private byai() {
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
            return GeneratedMessageLite.m124022a(f165264d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byai();
        } else {
            if (i2 == 4) {
                return new bxvd(f165264d);
            }
            if (i2 == 5) {
                return f165264d;
            }
            bxxk bxxk = f165265e;
            if (bxxk == null) {
                synchronized (byai.class) {
                    bxxk = f165265e;
                    if (bxxk == null) {
                        bxxk = new bxve(f165264d);
                        f165265e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
