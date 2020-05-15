package p000;

/* renamed from: aqbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqbb extends bxvk implements bxxd {

    /* renamed from: e */
    public static final aqbb f85524e;

    /* renamed from: f */
    private static volatile bxxk f85525f;

    /* renamed from: a */
    public int f85526a;

    /* renamed from: b */
    public String f85527b = "";

    /* renamed from: c */
    public bxtx f85528c = bxtx.f164797b;

    /* renamed from: d */
    public int f85529d;

    static {
        aqbb aqbb = new aqbb();
        f85524e = aqbb;
        bxvk.m124024a(aqbb.class, aqbb);
    }

    private aqbb() {
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
            return bxvk.m124022a(f85524e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new aqbb();
        } else {
            if (i2 == 4) {
                return new bxvd(f85524e);
            }
            if (i2 == 5) {
                return f85524e;
            }
            bxxk bxxk = f85525f;
            if (bxxk == null) {
                synchronized (aqbb.class) {
                    bxxk = f85525f;
                    if (bxxk == null) {
                        bxxk = new bxve(f85524e);
                        f85525f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
