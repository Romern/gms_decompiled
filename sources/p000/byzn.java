package p000;

/* renamed from: byzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byzn extends bxvk implements bxxd {

    /* renamed from: e */
    public static final byzn f169131e;

    /* renamed from: f */
    private static volatile bxxk f169132f;

    /* renamed from: a */
    public int f169133a;

    /* renamed from: b */
    public String f169134b = "";

    /* renamed from: c */
    public long f169135c;

    /* renamed from: d */
    public long f169136d;

    static {
        byzn byzn = new byzn();
        f169131e = byzn;
        bxvk.m124024a(byzn.class, byzn);
    }

    private byzn() {
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
            return bxvk.m124022a(f169131e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new byzn();
        } else {
            if (i2 == 4) {
                return new bxvd(f169131e);
            }
            if (i2 == 5) {
                return f169131e;
            }
            bxxk bxxk = f169132f;
            if (bxxk == null) {
                synchronized (byzn.class) {
                    bxxk = f169132f;
                    if (bxxk == null) {
                        bxxk = new bxve(f169131e);
                        f169132f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
