package p000;

/* renamed from: btdm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btdm extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final btdm f148406e;

    /* renamed from: f */
    private static volatile bxxk f148407f;

    /* renamed from: a */
    public String f148408a = "";

    /* renamed from: b */
    public int f148409b;

    /* renamed from: c */
    public int f148410c;

    /* renamed from: d */
    public btcb f148411d;

    static {
        btdm btdm = new btdm();
        f148406e = btdm;
        GeneratedMessageLite.m124024a(btdm.class, btdm);
    }

    private btdm() {
        bxvm bxvm = bxvm.f164965b;
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
            return GeneratedMessageLite.m124022a(f148406e, "\u0000\u0004\u0000\u0000\u0001\t\u0004\u0000\u0000\u0000\u0001Ȉ\u0004\f\u0005\u0004\t\t", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btdm();
        } else {
            if (i2 == 4) {
                return new bxvd(f148406e);
            }
            if (i2 == 5) {
                return f148406e;
            }
            bxxk bxxk = f148407f;
            if (bxxk == null) {
                synchronized (btdm.class) {
                    bxxk = f148407f;
                    if (bxxk == null) {
                        bxxk = new bxve(f148406e);
                        f148407f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
