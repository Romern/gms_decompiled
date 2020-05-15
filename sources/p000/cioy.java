package p000;

/* renamed from: cioy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cioy extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cioy f191163c;

    /* renamed from: d */
    private static volatile bxxk f191164d;

    /* renamed from: a */
    public cioz f191165a;

    /* renamed from: b */
    public String f191166b = "";

    static {
        cioy cioy = new cioy();
        f191163c = cioy;
        GeneratedMessageLite.m124024a(cioy.class, cioy);
    }

    private cioy() {
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
            return GeneratedMessageLite.m124022a(f191163c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cioy();
        } else {
            if (i2 == 4) {
                return new bxvd(f191163c);
            }
            if (i2 == 5) {
                return f191163c;
            }
            bxxk bxxk = f191164d;
            if (bxxk == null) {
                synchronized (cioy.class) {
                    bxxk = f191164d;
                    if (bxxk == null) {
                        bxxk = new bxve(f191163c);
                        f191164d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
