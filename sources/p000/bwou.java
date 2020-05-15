package p000;

/* renamed from: bwou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwou extends bxvg implements bxvh {

    /* renamed from: e */
    public static final bwou f160492e;

    /* renamed from: g */
    private static volatile bxxk f160493g;

    /* renamed from: a */
    public int f160494a;

    /* renamed from: b */
    public bxvw f160495b = bxwq.f165002b;

    /* renamed from: c */
    public int f160496c;

    /* renamed from: d */
    public int f160497d;

    /* renamed from: f */
    private byte f160498f = 2;

    static {
        bwou bwou = new bwou();
        f160492e = bwou;
        bxvk.m124024a(bwou.class, bwou);
    }

    private bwou() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160498f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f160498f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f160492e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0014\u0002င\u0000\u0003င\u0001", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bwou();
        } else {
            if (i2 == 4) {
                return new bxvf(f160492e);
            }
            if (i2 == 5) {
                return f160492e;
            }
            bxxk bxxk = f160493g;
            if (bxxk == null) {
                synchronized (bwou.class) {
                    bxxk = f160493g;
                    if (bxxk == null) {
                        bxxk = new bxve(f160492e);
                        f160493g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
