package p000;

/* renamed from: bwvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwvk extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwvk f161134d;

    /* renamed from: e */
    public static final bxvj f161135e;

    /* renamed from: g */
    private static volatile bxxk f161136g;

    /* renamed from: a */
    public int f161137a = 0;

    /* renamed from: b */
    public Object f161138b;

    /* renamed from: c */
    public int f161139c;

    /* renamed from: f */
    private int f161140f;

    static {
        bwvk bwvk = new bwvk();
        f161134d = bwvk;
        bxvk.m124024a(bwvk.class, bwvk);
        bwoi bwoi = bwoi.f160451f;
        bwvk bwvk2 = f161134d;
        f161135e = bxvk.m124006a(bwoi, bwvk2, bwvk2, 243684601, bxzf.MESSAGE);
    }

    private bwvk() {
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
            return bxvk.m124022a(f161134d, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဵ\u0000", new Object[]{"b", "a", "f", "c", bwvi.f161133a});
        } else if (i2 == 3) {
            return new bwvk();
        } else {
            if (i2 == 4) {
                return new bxvd(f161134d);
            }
            if (i2 == 5) {
                return f161134d;
            }
            bxxk bxxk = f161136g;
            if (bxxk == null) {
                synchronized (bwvk.class) {
                    bxxk = f161136g;
                    if (bxxk == null) {
                        bxxk = new bxve(f161134d);
                        f161136g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
