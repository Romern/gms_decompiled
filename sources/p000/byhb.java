package p000;

/* renamed from: byhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byhb extends bxvk implements bxxd {

    /* renamed from: b */
    public static final byhb f166421b;

    /* renamed from: c */
    private static volatile bxxk f166422c;

    /* renamed from: a */
    public bxwc f166423a = bxxn.f165040b;

    static {
        byhb byhb = new byhb();
        f166421b = byhb;
        bxvk.m124024a(byhb.class, byhb);
    }

    private byhb() {
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
            return bxvk.m124022a(f166421b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", byha.class});
        } else if (i2 == 3) {
            return new byhb();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (boolean[]) null);
            }
            if (i2 == 5) {
                return f166421b;
            }
            bxxk bxxk = f166422c;
            if (bxxk == null) {
                synchronized (byhb.class) {
                    bxxk = f166422c;
                    if (bxxk == null) {
                        bxxk = new bxve(f166421b);
                        f166422c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
