package p000;

/* renamed from: bodw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bodw extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bodw f132744e;

    /* renamed from: f */
    private static volatile bxxk f132745f;

    /* renamed from: a */
    public int f132746a;

    /* renamed from: b */
    public int f132747b = 1;

    /* renamed from: c */
    public int f132748c = 1;

    /* renamed from: d */
    public int f132749d;

    static {
        bodw bodw = new bodw();
        f132744e = bodw;
        bxvk.m124024a(bodw.class, bodw);
    }

    private bodw() {
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
            return bxvk.m124022a(f132744e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"a", "b", bodu.f132742a, "c", bodv.f132743a, "d"});
        } else if (i2 == 3) {
            return new bodw();
        } else {
            if (i2 == 4) {
                return new bxvd(f132744e);
            }
            if (i2 == 5) {
                return f132744e;
            }
            bxxk bxxk = f132745f;
            if (bxxk == null) {
                synchronized (bodw.class) {
                    bxxk = f132745f;
                    if (bxxk == null) {
                        bxxk = new bxve(f132744e);
                        f132745f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
