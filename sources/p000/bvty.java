package p000;

/* renamed from: bvty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvty extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bvty f157634e;

    /* renamed from: f */
    private static volatile bxxk f157635f;

    /* renamed from: a */
    public int f157636a;

    /* renamed from: b */
    public String f157637b = "";

    /* renamed from: c */
    public bzrv f157638c;

    /* renamed from: d */
    public float f157639d;

    static {
        bvty bvty = new bvty();
        f157634e = bvty;
        bxvk.m124024a(bvty.class, bvty);
    }

    private bvty() {
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
            return bxvk.m124022a(f157634e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ခ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bvty();
        } else {
            if (i2 == 4) {
                return new bxvd(f157634e);
            }
            if (i2 == 5) {
                return f157634e;
            }
            bxxk bxxk = f157635f;
            if (bxxk == null) {
                synchronized (bvty.class) {
                    bxxk = f157635f;
                    if (bxxk == null) {
                        bxxk = new bxve(f157634e);
                        f157635f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
