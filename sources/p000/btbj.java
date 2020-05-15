package p000;

/* renamed from: btbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btbj extends bxvk implements bxxd {

    /* renamed from: i */
    public static final btbj f148135i;

    /* renamed from: j */
    private static volatile bxxk f148136j;

    /* renamed from: a */
    public String f148137a = "";

    /* renamed from: b */
    public String f148138b = "";

    /* renamed from: c */
    public String f148139c = "";

    /* renamed from: d */
    public btbb f148140d;

    /* renamed from: e */
    public long f148141e;

    /* renamed from: f */
    public bszw f148142f;

    /* renamed from: g */
    public long f148143g;

    /* renamed from: h */
    public int f148144h;

    static {
        btbj btbj = new btbj();
        f148135i = btbj;
        bxvk.m124024a(btbj.class, btbj);
    }

    private btbj() {
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
            return bxvk.m124022a(f148135i, "\u0000\b\u0000\u0000\u0001\r\b\u0000\u0000\u0000\u0001Ȉ\u0003Ȉ\u0004Ȉ\u0005\t\u0006\u0002\n\t\f\u0002\r\u0004", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new btbj();
        } else {
            if (i2 == 4) {
                return new bxvd(f148135i);
            }
            if (i2 == 5) {
                return f148135i;
            }
            bxxk bxxk = f148136j;
            if (bxxk == null) {
                synchronized (btbj.class) {
                    bxxk = f148136j;
                    if (bxxk == null) {
                        bxxk = new bxve(f148135i);
                        f148136j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
