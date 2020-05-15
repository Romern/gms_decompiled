package p000;

/* renamed from: btde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btde extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final btde f148384e;

    /* renamed from: g */
    private static volatile bxxk f148385g;

    /* renamed from: a */
    public int f148386a;

    /* renamed from: b */
    public String f148387b = "";

    /* renamed from: c */
    public bted f148388c;

    /* renamed from: d */
    public btea f148389d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f148390f;

    static {
        btde btde = new btde();
        f148384e = btde;
        GeneratedMessageLite.m124024a(btde.class, btde);
    }

    private btde() {
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
            return GeneratedMessageLite.m124022a(f148384e, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\t\u0004\u0007\u0005\t", new Object[]{"a", "b", "c", "f", "d"});
        } else if (i2 == 3) {
            return new btde();
        } else {
            if (i2 == 4) {
                return new bxvd(f148384e);
            }
            if (i2 == 5) {
                return f148384e;
            }
            bxxk bxxk = f148385g;
            if (bxxk == null) {
                synchronized (btde.class) {
                    bxxk = f148385g;
                    if (bxxk == null) {
                        bxxk = new bxve(f148384e);
                        f148385g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
