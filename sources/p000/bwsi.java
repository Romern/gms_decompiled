package p000;

/* renamed from: bwsi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwsi extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwsi f160863d;

    /* renamed from: e */
    private static volatile bxxk f160864e;

    /* renamed from: a */
    public int f160865a;

    /* renamed from: b */
    public String f160866b = "";

    /* renamed from: c */
    public String f160867c = "";

    static {
        bwsi bwsi = new bwsi();
        f160863d = bwsi;
        bxvk.m124024a(bwsi.class, bwsi);
    }

    private bwsi() {
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
            return bxvk.m124022a(f160863d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwsi();
        } else {
            if (i2 == 4) {
                return new bxvd(f160863d);
            }
            if (i2 == 5) {
                return f160863d;
            }
            bxxk bxxk = f160864e;
            if (bxxk == null) {
                synchronized (bwsi.class) {
                    bxxk = f160864e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160863d);
                        f160864e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
