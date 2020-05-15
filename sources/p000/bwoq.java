package p000;

/* renamed from: bwoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwoq extends bxvg implements bxvh {

    /* renamed from: d */
    public static final bwoq f160480d;

    /* renamed from: f */
    private static volatile bxxk f160481f;

    /* renamed from: a */
    public int f160482a;

    /* renamed from: b */
    public bxvw f160483b = bxwq.f165002b;

    /* renamed from: c */
    public int f160484c;

    /* renamed from: e */
    private byte f160485e = 2;

    static {
        bwoq bwoq = new bwoq();
        f160480d = bwoq;
        bxvk.m124024a(bwoq.class, bwoq);
    }

    private bwoq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160485e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f160485e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f160480d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0014\u0002င\u0000", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwoq();
        } else {
            if (i2 == 4) {
                return new bxvf(f160480d);
            }
            if (i2 == 5) {
                return f160480d;
            }
            bxxk bxxk = f160481f;
            if (bxxk == null) {
                synchronized (bwoq.class) {
                    bxxk = f160481f;
                    if (bxxk == null) {
                        bxxk = new bxve(f160480d);
                        f160481f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
