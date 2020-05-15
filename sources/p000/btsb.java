package p000;

/* renamed from: btsb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btsb extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final btsb f150174d;

    /* renamed from: e */
    private static volatile bxxk f150175e;

    /* renamed from: a */
    public int f150176a;

    /* renamed from: b */
    public long f150177b;

    /* renamed from: c */
    public String f150178c = "";

    static {
        btsb btsb = new btsb();
        f150174d = btsb;
        GeneratedMessageLite.m124024a(btsb.class, btsb);
    }

    private btsb() {
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
            return GeneratedMessageLite.m124022a(f150174d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btsb();
        } else {
            if (i2 == 4) {
                return new bxvd(f150174d);
            }
            if (i2 == 5) {
                return f150174d;
            }
            bxxk bxxk = f150175e;
            if (bxxk == null) {
                synchronized (btsb.class) {
                    bxxk = f150175e;
                    if (bxxk == null) {
                        bxxk = new bxve(f150174d);
                        f150175e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
