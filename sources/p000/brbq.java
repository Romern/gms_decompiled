package p000;

/* renamed from: brbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brbq extends bxvk implements bxxd {

    /* renamed from: d */
    public static final brbq f142304d;

    /* renamed from: e */
    private static volatile bxxk f142305e;

    /* renamed from: a */
    public int f142306a;

    /* renamed from: b */
    public brak f142307b;

    /* renamed from: c */
    public String f142308c = "";

    static {
        brbq brbq = new brbq();
        f142304d = brbq;
        bxvk.m124024a(brbq.class, brbq);
    }

    private brbq() {
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
            return bxvk.m124022a(f142304d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new brbq();
        } else {
            if (i2 == 4) {
                return new bxvd(f142304d);
            }
            if (i2 == 5) {
                return f142304d;
            }
            bxxk bxxk = f142305e;
            if (bxxk == null) {
                synchronized (brbq.class) {
                    bxxk = f142305e;
                    if (bxxk == null) {
                        bxxk = new bxve(f142304d);
                        f142305e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
