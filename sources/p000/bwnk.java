package p000;

/* renamed from: bwnk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwnk extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwnk f160367c;

    /* renamed from: d */
    public static final bxvj f160368d;

    /* renamed from: e */
    private static volatile bxxk f160369e;

    /* renamed from: a */
    public int f160370a;

    /* renamed from: b */
    public long f160371b;

    static {
        bwnk bwnk = new bwnk();
        f160367c = bwnk;
        bxvk.m124024a(bwnk.class, bwnk);
        bwny bwny = bwny.f160414k;
        bwnk bwnk2 = f160367c;
        f160368d = bxvk.m124006a(bwny, bwnk2, bwnk2, 228971052, bxzf.MESSAGE);
    }

    private bwnk() {
        bxwq bxwq = bxwq.f165002b;
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
            return bxvk.m124022a(f160367c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwnk();
        } else {
            if (i2 == 4) {
                return new bxvd(f160367c);
            }
            if (i2 == 5) {
                return f160367c;
            }
            bxxk bxxk = f160369e;
            if (bxxk == null) {
                synchronized (bwnk.class) {
                    bxxk = f160369e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160367c);
                        f160369e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
