package p000;

/* renamed from: bwzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwzw extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bwzw f161650e;

    /* renamed from: f */
    public static final bxvj f161651f;

    /* renamed from: h */
    private static volatile bxxk f161652h;

    /* renamed from: a */
    public String f161653a = "";

    /* renamed from: b */
    public boolean f161654b;

    /* renamed from: c */
    public String f161655c = "";

    /* renamed from: d */
    public bxvw f161656d = bxwq.f165002b;

    /* renamed from: g */
    private int f161657g;

    static {
        bwzw bwzw = new bwzw();
        f161650e = bwzw;
        bxvk.m124024a(bwzw.class, bwzw);
        bwny bwny = bwny.f160414k;
        bwzw bwzw2 = f161650e;
        f161651f = bxvk.m124006a(bwny, bwzw2, bwzw2, 223344550, bxzf.MESSAGE);
    }

    private bwzw() {
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
            return bxvk.m124022a(f161650e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u0014\u0004ဈ\u0002", new Object[]{"g", "a", "b", "d", "c"});
        } else if (i2 == 3) {
            return new bwzw();
        } else {
            if (i2 == 4) {
                return new bxvd(f161650e);
            }
            if (i2 == 5) {
                return f161650e;
            }
            bxxk bxxk = f161652h;
            if (bxxk == null) {
                synchronized (bwzw.class) {
                    bxxk = f161652h;
                    if (bxxk == null) {
                        bxxk = new bxve(f161650e);
                        f161652h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
