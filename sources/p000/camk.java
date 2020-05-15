package p000;

/* renamed from: camk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class camk extends bxvk implements bxxd {

    /* renamed from: d */
    public static final camk f175296d;

    /* renamed from: e */
    private static volatile bxxk f175297e;

    /* renamed from: a */
    public String f175298a = "";

    /* renamed from: b */
    public int f175299b;

    /* renamed from: c */
    public String f175300c = "";

    static {
        camk camk = new camk();
        f175296d = camk;
        bxvk.m124024a(camk.class, camk);
    }

    private camk() {
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
            return bxvk.m124022a(f175296d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new camk();
        } else {
            if (i2 == 4) {
                return new bxvd(f175296d);
            }
            if (i2 == 5) {
                return f175296d;
            }
            bxxk bxxk = f175297e;
            if (bxxk == null) {
                synchronized (camk.class) {
                    bxxk = f175297e;
                    if (bxxk == null) {
                        bxxk = new bxve(f175296d);
                        f175297e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
