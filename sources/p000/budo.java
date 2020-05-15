package p000;

/* renamed from: budo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class budo extends bxvk implements bxxd {

    /* renamed from: e */
    public static final budo f153492e;

    /* renamed from: f */
    private static volatile bxxk f153493f;

    /* renamed from: a */
    public int f153494a;

    /* renamed from: b */
    public int f153495b = 0;

    /* renamed from: c */
    public Object f153496c;

    /* renamed from: d */
    public long f153497d;

    static {
        budo budo = new budo();
        f153492e = budo;
        bxvk.m124024a(budo.class, budo);
    }

    private budo() {
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
            return bxvk.m124022a(f153492e, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဃ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000", new Object[]{"c", "b", "a", "d", budi.class, budm.class, budl.class, budn.class, budh.class});
        } else if (i2 == 3) {
            return new budo();
        } else {
            if (i2 == 4) {
                return new bxvd(f153492e);
            }
            if (i2 == 5) {
                return f153492e;
            }
            bxxk bxxk = f153493f;
            if (bxxk == null) {
                synchronized (budo.class) {
                    bxxk = f153493f;
                    if (bxxk == null) {
                        bxxk = new bxve(f153492e);
                        f153493f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
