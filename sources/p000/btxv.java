package p000;

/* renamed from: btxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btxv extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final btxv f152863d;

    /* renamed from: e */
    private static volatile bxxk f152864e;

    /* renamed from: a */
    public int f152865a;

    /* renamed from: b */
    public int f152866b;

    /* renamed from: c */
    public bxwc f152867c = bxxn.f165040b;

    static {
        btxv btxv = new btxv();
        f152863d = btxv;
        GeneratedMessageLite.m124024a(btxv.class, btxv);
    }

    private btxv() {
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
            return GeneratedMessageLite.m124022a(f152863d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"a", "b", btxw.f152868a, "c", btyb.class});
        } else if (i2 == 3) {
            return new btxv();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (float[][][]) null);
            }
            if (i2 == 5) {
                return f152863d;
            }
            bxxk bxxk = f152864e;
            if (bxxk == null) {
                synchronized (btxv.class) {
                    bxxk = f152864e;
                    if (bxxk == null) {
                        bxxk = new bxve(f152863d);
                        f152864e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
