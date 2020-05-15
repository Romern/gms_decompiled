package p000;

/* renamed from: cbos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbos extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cbos f177855e;

    /* renamed from: f */
    private static volatile bxxk f177856f;

    /* renamed from: a */
    public String f177857a = "";

    /* renamed from: b */
    public String f177858b = "";

    /* renamed from: c */
    public String f177859c = "";

    /* renamed from: d */
    public String f177860d = "";

    static {
        cbos cbos = new cbos();
        f177855e = cbos;
        bxvk.m124024a(cbos.class, cbos);
    }

    private cbos() {
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
            return bxvk.m124022a(f177855e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cbos();
        } else {
            if (i2 == 4) {
                return new bxvd(f177855e);
            }
            if (i2 == 5) {
                return f177855e;
            }
            bxxk bxxk = f177856f;
            if (bxxk == null) {
                synchronized (cbos.class) {
                    bxxk = f177856f;
                    if (bxxk == null) {
                        bxxk = new bxve(f177855e);
                        f177856f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
