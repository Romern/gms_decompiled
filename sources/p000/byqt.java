package p000;

/* renamed from: byqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byqt extends bxvk implements bxxd {

    /* renamed from: c */
    public static final byqt f167420c;

    /* renamed from: d */
    private static volatile bxxk f167421d;

    /* renamed from: a */
    public int f167422a;

    /* renamed from: b */
    public String f167423b = "";

    static {
        byqt byqt = new byqt();
        f167420c = byqt;
        bxvk.m124024a(byqt.class, byqt);
    }

    private byqt() {
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
            return bxvk.m124022a(f167420c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new byqt();
        } else {
            if (i2 == 4) {
                return new bxvd(f167420c);
            }
            if (i2 == 5) {
                return f167420c;
            }
            bxxk bxxk = f167421d;
            if (bxxk == null) {
                synchronized (byqt.class) {
                    bxxk = f167421d;
                    if (bxxk == null) {
                        bxxk = new bxve(f167420c);
                        f167421d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
