package p000;

/* renamed from: btsc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btsc extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btsc f150179d;

    /* renamed from: e */
    private static volatile bxxk f150180e;

    /* renamed from: a */
    public int f150181a;

    /* renamed from: b */
    public btsb f150182b;

    /* renamed from: c */
    public btsb f150183c;

    static {
        btsc btsc = new btsc();
        f150179d = btsc;
        bxvk.m124024a(btsc.class, btsc);
    }

    private btsc() {
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
            return bxvk.m124022a(f150179d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btsc();
        } else {
            if (i2 == 4) {
                return new bxvd(f150179d);
            }
            if (i2 == 5) {
                return f150179d;
            }
            bxxk bxxk = f150180e;
            if (bxxk == null) {
                synchronized (btsc.class) {
                    bxxk = f150180e;
                    if (bxxk == null) {
                        bxxk = new bxve(f150179d);
                        f150180e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
