package p000;

/* renamed from: bzcj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzcj extends bxvg implements bxvh {

    /* renamed from: h */
    public static final bzcj f169336h;

    /* renamed from: j */
    private static volatile bxxk f169337j;

    /* renamed from: a */
    public int f169338a;

    /* renamed from: b */
    public bzcl f169339b;

    /* renamed from: c */
    public bzcd f169340c;

    /* renamed from: d */
    public bzcf f169341d;

    /* renamed from: e */
    public bzcn f169342e;

    /* renamed from: f */
    public bzch f169343f;

    /* renamed from: g */
    public bzcb f169344g;

    /* renamed from: i */
    private byte f169345i = 2;

    static {
        bzcj bzcj = new bzcj();
        f169336h = bzcj;
        bxvk.m124024a(bzcj.class, bzcj);
    }

    private bzcj() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169345i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169345i = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f169336h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bzcj();
        } else {
            if (i2 == 4) {
                return new bxvf(f169336h);
            }
            if (i2 == 5) {
                return f169336h;
            }
            bxxk bxxk = f169337j;
            if (bxxk == null) {
                synchronized (bzcj.class) {
                    bxxk = f169337j;
                    if (bxxk == null) {
                        bxxk = new bxve(f169336h);
                        f169337j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
