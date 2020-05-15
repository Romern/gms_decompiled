package p000;

/* renamed from: bxac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxac extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxac f161673d;

    /* renamed from: e */
    public static final bxvj f161674e;

    /* renamed from: g */
    private static volatile bxxk f161675g;

    /* renamed from: a */
    public bxvw f161676a = bxwq.f165002b;

    /* renamed from: b */
    public long f161677b;

    /* renamed from: c */
    public String f161678c = "";

    /* renamed from: f */
    private int f161679f;

    static {
        bxac bxac = new bxac();
        f161673d = bxac;
        bxvk.m124024a(bxac.class, bxac);
        bwny bwny = bwny.f160414k;
        bxac bxac2 = f161673d;
        f161674e = bxvk.m124006a(bwny, bxac2, bxac2, 223344551, bxzf.MESSAGE);
    }

    private bxac() {
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
            return bxvk.m124022a(f161673d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0014\u0002ဂ\u0000\u0003ဈ\u0001", new Object[]{"f", "a", "b", "c"});
        } else if (i2 == 3) {
            return new bxac();
        } else {
            if (i2 == 4) {
                return new bxvd(f161673d);
            }
            if (i2 == 5) {
                return f161673d;
            }
            bxxk bxxk = f161675g;
            if (bxxk == null) {
                synchronized (bxac.class) {
                    bxxk = f161675g;
                    if (bxxk == null) {
                        bxxk = new bxve(f161673d);
                        f161675g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
