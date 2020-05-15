package p000;

/* renamed from: bytp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bytp extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bytp f167699d;

    /* renamed from: e */
    private static volatile bxxk f167700e;

    /* renamed from: a */
    public int f167701a;

    /* renamed from: b */
    public bytr f167702b;

    /* renamed from: c */
    public boolean f167703c;

    static {
        bytp bytp = new bytp();
        f167699d = bytp;
        bxvk.m124024a(bytp.class, bytp);
    }

    private bytp() {
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
            return bxvk.m124022a(f167699d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bytp();
        } else {
            if (i2 == 4) {
                return new bxvd(f167699d);
            }
            if (i2 == 5) {
                return f167699d;
            }
            bxxk bxxk = f167700e;
            if (bxxk == null) {
                synchronized (bytp.class) {
                    bxxk = f167700e;
                    if (bxxk == null) {
                        bxxk = new bxve(f167699d);
                        f167700e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
