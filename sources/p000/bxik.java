package p000;

/* renamed from: bxik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxik extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxik f163530b;

    /* renamed from: c */
    private static volatile bxxk f163531c;

    /* renamed from: a */
    public bxwc f163532a = bxxn.f165040b;

    static {
        bxik bxik = new bxik();
        f163530b = bxik;
        GeneratedMessageLite.m124024a(bxik.class, bxik);
    }

    private bxik() {
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
            return GeneratedMessageLite.m124022a(f163530b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", bxiq.class});
        } else if (i2 == 3) {
            return new bxik();
        } else {
            if (i2 == 4) {
                return new bxij();
            }
            if (i2 == 5) {
                return f163530b;
            }
            bxxk bxxk = f163531c;
            if (bxxk == null) {
                synchronized (bxik.class) {
                    bxxk = f163531c;
                    if (bxxk == null) {
                        bxxk = new bxve(f163530b);
                        f163531c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
