package p000;

/* renamed from: bwpn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwpn extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bwpn f160575e;

    /* renamed from: g */
    private static volatile bxxk f160576g;

    /* renamed from: a */
    public int f160577a;

    /* renamed from: b */
    public String f160578b = "";

    /* renamed from: c */
    public long f160579c;

    /* renamed from: d */
    public int f160580d;

    /* renamed from: f */
    private int f160581f;

    static {
        bwpn bwpn = new bwpn();
        f160575e = bwpn;
        bxvk.m124024a(bwpn.class, bwpn);
    }

    private bwpn() {
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
            return bxvk.m124022a(f160575e, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002င\u0000\u0003ဈ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"f", "a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bwpn();
        } else {
            if (i2 == 4) {
                return new bxvd(f160575e);
            }
            if (i2 == 5) {
                return f160575e;
            }
            bxxk bxxk = f160576g;
            if (bxxk == null) {
                synchronized (bwpn.class) {
                    bxxk = f160576g;
                    if (bxxk == null) {
                        bxxk = new bxve(f160575e);
                        f160576g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
