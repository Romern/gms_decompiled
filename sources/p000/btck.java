package p000;

/* renamed from: btck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btck extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btck f148280d;

    /* renamed from: e */
    private static volatile bxxk f148281e;

    /* renamed from: a */
    public bxwc f148282a = bxxn.f165040b;

    /* renamed from: b */
    public btea f148283b;

    /* renamed from: c */
    public bzkb f148284c;

    static {
        btck btck = new btck();
        f148280d = btck;
        bxvk.m124024a(btck.class, btck);
    }

    private btck() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f148280d, "\u0000\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0001\u0000\u0002Ț\u0003\t\u0004\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btck();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (int[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f148280d;
            }
            bxxk bxxk = f148281e;
            if (bxxk == null) {
                synchronized (btck.class) {
                    bxxk = f148281e;
                    if (bxxk == null) {
                        bxxk = new bxve(f148280d);
                        f148281e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
