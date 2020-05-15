package p000;

/* renamed from: btyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btyf extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final btyf f152896e;

    /* renamed from: f */
    private static volatile bxxk f152897f;

    /* renamed from: a */
    public int f152898a;

    /* renamed from: b */
    public long f152899b;

    /* renamed from: c */
    public int f152900c;

    /* renamed from: d */
    public float f152901d;

    static {
        btyf btyf = new btyf();
        f152896e = btyf;
        GeneratedMessageLite.m124024a(btyf.class, btyf);
    }

    private btyf() {
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
            return GeneratedMessageLite.m124022a(f152896e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဋ\u0001\u0003ခ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btyf();
        } else {
            if (i2 == 4) {
                return new bxvd(f152896e);
            }
            if (i2 == 5) {
                return f152896e;
            }
            bxxk bxxk = f152897f;
            if (bxxk == null) {
                synchronized (btyf.class) {
                    bxxk = f152897f;
                    if (bxxk == null) {
                        bxxk = new bxve(f152896e);
                        f152897f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
