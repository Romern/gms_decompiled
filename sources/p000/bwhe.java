package p000;

/* renamed from: bwhe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwhe extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwhe f159496c;

    /* renamed from: d */
    private static volatile bxxk f159497d;

    /* renamed from: a */
    public int f159498a;

    /* renamed from: b */
    public bmks f159499b;

    static {
        bwhe bwhe = new bwhe();
        f159496c = bwhe;
        bxvk.m124024a(bwhe.class, bwhe);
    }

    private bwhe() {
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
            return bxvk.m124022a(f159496c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwhe();
        } else {
            if (i2 == 4) {
                return new bxvd(f159496c);
            }
            if (i2 == 5) {
                return f159496c;
            }
            bxxk bxxk = f159497d;
            if (bxxk == null) {
                synchronized (bwhe.class) {
                    bxxk = f159497d;
                    if (bxxk == null) {
                        bxxk = new bxve(f159496c);
                        f159497d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
