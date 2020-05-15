package p000;

/* renamed from: bwjh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwjh extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bwjh f159775f;

    /* renamed from: g */
    private static volatile bxxk f159776g;

    /* renamed from: a */
    public int f159777a;

    /* renamed from: b */
    public bxwc f159778b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f159779c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f159780d = bxxn.f165040b;

    /* renamed from: e */
    public bxtx f159781e = bxtx.f164797b;

    static {
        bwjh bwjh = new bwjh();
        f159775f = bwjh;
        bxvk.m124024a(bwjh.class, bwjh);
    }

    private bwjh() {
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
            return bxvk.m124022a(f159775f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003ည\u0000\u0004\u001b", new Object[]{"a", "b", bmed.class, "c", bmkv.class, "e", "d", bmfe.class});
        } else if (i2 == 3) {
            return new bwjh();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (boolean[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f159775f;
            }
            bxxk bxxk = f159776g;
            if (bxxk == null) {
                synchronized (bwjh.class) {
                    bxxk = f159776g;
                    if (bxxk == null) {
                        bxxk = new bxve(f159775f);
                        f159776g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
