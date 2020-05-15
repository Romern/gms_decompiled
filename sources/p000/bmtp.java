package p000;

/* renamed from: bmtp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmtp extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bmtp f130893f;

    /* renamed from: g */
    private static volatile bxxk f130894g;

    /* renamed from: a */
    public String f130895a = "";

    /* renamed from: b */
    public bmth f130896b;

    /* renamed from: c */
    public String f130897c = "";

    /* renamed from: d */
    public bmti f130898d;

    /* renamed from: e */
    public String f130899e = "";

    static {
        bmtp bmtp = new bmtp();
        f130893f = bmtp;
        GeneratedMessageLite.m124024a(bmtp.class, bmtp);
    }

    private bmtp() {
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
            return GeneratedMessageLite.m124022a(f130893f, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001\b\u0002\t\u0003\b\u0004\t\u0006\b", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bmtp();
        } else {
            if (i2 == 4) {
                return new bxvd(f130893f);
            }
            if (i2 == 5) {
                return f130893f;
            }
            bxxk bxxk = f130894g;
            if (bxxk == null) {
                synchronized (bmtp.class) {
                    bxxk = f130894g;
                    if (bxxk == null) {
                        bxxk = new bxve(f130893f);
                        f130894g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
