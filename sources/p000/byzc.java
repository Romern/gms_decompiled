package p000;

/* renamed from: byzc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byzc extends bxvk implements bxxd {

    /* renamed from: c */
    public static final byzc f169055c;

    /* renamed from: d */
    private static volatile bxxk f169056d;

    /* renamed from: a */
    public int f169057a;

    /* renamed from: b */
    public String f169058b = "";

    static {
        byzc byzc = new byzc();
        f169055c = byzc;
        bxvk.m124024a(byzc.class, byzc);
    }

    private byzc() {
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
            return bxvk.m124022a(f169055c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new byzc();
        } else {
            if (i2 == 4) {
                return new bxvd(f169055c);
            }
            if (i2 == 5) {
                return f169055c;
            }
            bxxk bxxk = f169056d;
            if (bxxk == null) {
                synchronized (byzc.class) {
                    bxxk = f169056d;
                    if (bxxk == null) {
                        bxxk = new bxve(f169055c);
                        f169056d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
