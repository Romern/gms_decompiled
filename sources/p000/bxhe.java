package p000;

/* renamed from: bxhe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxhe extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bxhe f163350h;

    /* renamed from: i */
    private static volatile bxxk f163351i;

    /* renamed from: a */
    public int f163352a;

    /* renamed from: b */
    public bxwc f163353b = bxxn.f165040b;

    /* renamed from: c */
    public bxhl f163354c;

    /* renamed from: d */
    public bxhi f163355d;

    /* renamed from: e */
    public bxwc f163356e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f163357f = bxxn.f165040b;

    /* renamed from: g */
    public bxwc f163358g = bxxn.f165040b;

    static {
        bxhe bxhe = new bxhe();
        f163350h = bxhe;
        GeneratedMessageLite.m124024a(bxhe.class, bxhe);
    }

    private bxhe() {
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
            return GeneratedMessageLite.m124022a(f163350h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0004\u0000\u0001\u001b\u0002ဉ\u0000\u0005ဉ\u0002\u0006\u001b\u0007\u001b\b\u001b", new Object[]{"a", "b", bxhk.class, "c", "d", "e", bxhd.class, "f", tnt.class, "g", bxhf.class});
        } else if (i2 == 3) {
            return new bxhe();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (int[][][]) null);
            }
            if (i2 == 5) {
                return f163350h;
            }
            bxxk bxxk = f163351i;
            if (bxxk == null) {
                synchronized (bxhe.class) {
                    bxxk = f163351i;
                    if (bxxk == null) {
                        bxxk = new bxve(f163350h);
                        f163351i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
