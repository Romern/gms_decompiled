package p000;

/* renamed from: bsjh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsjh extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bsjh f144792b;

    /* renamed from: c */
    private static volatile bxxk f144793c;

    /* renamed from: a */
    public bxvs f144794a = bxuz.f164939b;

    static {
        bsjh bsjh = new bsjh();
        f144792b = bsjh;
        bxvk.m124024a(bsjh.class, bsjh);
    }

    private bsjh() {
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
            return bxvk.m124022a(f144792b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002$", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bsjh();
        } else {
            if (i2 == 4) {
                return new bxvd(f144792b);
            }
            if (i2 == 5) {
                return f144792b;
            }
            bxxk bxxk = f144793c;
            if (bxxk == null) {
                synchronized (bsjh.class) {
                    bxxk = f144793c;
                    if (bxxk == null) {
                        bxxk = new bxve(f144792b);
                        f144793c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
