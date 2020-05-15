package p000;

/* renamed from: blpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blpa extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final blpa f127184d;

    /* renamed from: f */
    private static volatile bxxk f127185f;

    /* renamed from: a */
    public int f127186a;

    /* renamed from: b */
    public blrk f127187b;

    /* renamed from: c */
    public bxwc f127188c = bxxn.f165040b;

    /* renamed from: e */
    private byte f127189e = 2;

    static {
        blpa blpa = new blpa();
        f127184d = blpa;
        GeneratedMessageLite.m124024a(blpa.class, blpa);
    }

    private blpa() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127189e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127189e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f127184d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л", new Object[]{"a", "b", "c", bloz.class});
        } else if (i2 == 3) {
            return new blpa();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (int[]) null);
            }
            if (i2 == 5) {
                return f127184d;
            }
            bxxk bxxk = f127185f;
            if (bxxk == null) {
                synchronized (blpa.class) {
                    bxxk = f127185f;
                    if (bxxk == null) {
                        bxxk = new bxve(f127184d);
                        f127185f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
