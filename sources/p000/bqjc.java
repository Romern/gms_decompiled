package p000;

/* renamed from: bqjc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqjc extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bqjc f140926e;

    /* renamed from: f */
    private static volatile bxxk f140927f;

    /* renamed from: a */
    public int f140928a;

    /* renamed from: b */
    public String f140929b = "";

    /* renamed from: c */
    public int f140930c;

    /* renamed from: d */
    public bxwc f140931d = bxxn.f165040b;

    static {
        bqjc bqjc = new bqjc();
        f140926e = bqjc;
        bxvk.m124024a(bqjc.class, bqjc);
    }

    private bqjc() {
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
            return bxvk.m124022a(f140926e, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0001\u0000\u0004ဈ\u0000\u0005ဌ\u0001\u0006\u001b", new Object[]{"a", "b", "c", bqju.f140971a, "d", bqiw.class});
        } else if (i2 == 3) {
            return new bqjc();
        } else {
            if (i2 == 4) {
                return new bqjb();
            }
            if (i2 == 5) {
                return f140926e;
            }
            bxxk bxxk = f140927f;
            if (bxxk == null) {
                synchronized (bqjc.class) {
                    bxxk = f140927f;
                    if (bxxk == null) {
                        bxxk = new bxve(f140926e);
                        f140927f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
