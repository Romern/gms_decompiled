package p000;

/* renamed from: bixf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bixf extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bixf f122179e;

    /* renamed from: f */
    private static volatile bxxk f122180f;

    /* renamed from: a */
    public int f122181a;

    /* renamed from: b */
    public String f122182b = "";

    /* renamed from: c */
    public int f122183c;

    /* renamed from: d */
    public int f122184d = 1;

    static {
        bixf bixf = new bixf();
        f122179e = bixf;
        GeneratedMessageLite.m124024a(bixf.class, bixf);
    }

    private bixf() {
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
            return GeneratedMessageLite.m124022a(f122179e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", biwx.f122146a});
        } else if (i2 == 3) {
            return new bixf();
        } else {
            if (i2 == 4) {
                return new bxvd(f122179e);
            }
            if (i2 == 5) {
                return f122179e;
            }
            bxxk bxxk = f122180f;
            if (bxxk == null) {
                synchronized (bixf.class) {
                    bxxk = f122180f;
                    if (bxxk == null) {
                        bxxk = new bxve(f122179e);
                        f122180f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
