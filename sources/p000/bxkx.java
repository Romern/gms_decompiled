package p000;

/* renamed from: bxkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxkx extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bxkx f163810f;

    /* renamed from: g */
    private static volatile bxxk f163811g;

    /* renamed from: a */
    public int f163812a;

    /* renamed from: b */
    public int f163813b;

    /* renamed from: c */
    public int f163814c;

    /* renamed from: d */
    public int f163815d;

    /* renamed from: e */
    public int f163816e;

    static {
        bxkx bxkx = new bxkx();
        f163810f = bxkx;
        bxvk.m124024a(bxkx.class, bxkx);
    }

    private bxkx() {
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
            return bxvk.m124022a(f163810f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", "e", bxli.f163851a});
        } else if (i2 == 3) {
            return new bxkx();
        } else {
            if (i2 == 4) {
                return new bxvd(f163810f);
            }
            if (i2 == 5) {
                return f163810f;
            }
            bxxk bxxk = f163811g;
            if (bxxk == null) {
                synchronized (bxkx.class) {
                    bxxk = f163811g;
                    if (bxxk == null) {
                        bxxk = new bxve(f163810f);
                        f163811g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
