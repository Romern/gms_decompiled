package p000;

/* renamed from: kwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kwh extends bxvk implements bxxd {

    /* renamed from: c */
    public static final kwh f25261c;

    /* renamed from: d */
    private static volatile bxxk f25262d;

    /* renamed from: a */
    public kwq f25263a;

    /* renamed from: b */
    public long f25264b;

    static {
        kwh kwh = new kwh();
        f25261c = kwh;
        bxvk.m124024a(kwh.class, kwh);
    }

    private kwh() {
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
            return bxvk.m124022a(f25261c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0002", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new kwh();
        } else {
            if (i2 == 4) {
                return new bxvd(f25261c);
            }
            if (i2 == 5) {
                return f25261c;
            }
            bxxk bxxk = f25262d;
            if (bxxk == null) {
                synchronized (kwh.class) {
                    bxxk = f25262d;
                    if (bxxk == null) {
                        bxxk = new bxve(f25261c);
                        f25262d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
