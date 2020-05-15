package p000;

/* renamed from: bwru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwru extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bwru f160801b;

    /* renamed from: c */
    public static final bxvj f160802c;

    /* renamed from: d */
    private static volatile bxxk f160803d;

    /* renamed from: a */
    public bxvw f160804a = bxwq.f165002b;

    static {
        bwru bwru = new bwru();
        f160801b = bwru;
        bxvk.m124024a(bwru.class, bwru);
        bwny bwny = bwny.f160414k;
        bwru bwru2 = f160801b;
        f160802c = bxvk.m124006a(bwny, bwru2, bwru2, 264984587, bxzf.MESSAGE);
    }

    private bwru() {
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
            return bxvk.m124022a(f160801b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0014", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bwru();
        } else {
            if (i2 == 4) {
                return new bxvd(f160801b);
            }
            if (i2 == 5) {
                return f160801b;
            }
            bxxk bxxk = f160803d;
            if (bxxk == null) {
                synchronized (bwru.class) {
                    bxxk = f160803d;
                    if (bxxk == null) {
                        bxxk = new bxve(f160801b);
                        f160803d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
