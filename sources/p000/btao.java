package p000;

/* renamed from: btao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btao extends bxvk implements bxxd {

    /* renamed from: i */
    public static final btao f148017i;

    /* renamed from: j */
    private static volatile bxxk f148018j;

    /* renamed from: a */
    public String f148019a = "";

    /* renamed from: b */
    public String f148020b = "";

    /* renamed from: c */
    public String f148021c = "";

    /* renamed from: d */
    public String f148022d = "";

    /* renamed from: e */
    public long f148023e;

    /* renamed from: f */
    public String f148024f = "";

    /* renamed from: g */
    public long f148025g;

    /* renamed from: h */
    public int f148026h;

    static {
        btao btao = new btao();
        f148017i = btao;
        bxvk.m124024a(btao.class, btao);
    }

    private btao() {
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
            return bxvk.m124022a(f148017i, "\u0000\b\u0000\u0000\u0003\f\b\u0000\u0000\u0000\u0003Ȉ\u0004Ȉ\u0005\u0002\u0007Ȉ\bȈ\nȈ\u000b\u0002\f\u0004", new Object[]{"a", "b", "e", "c", "d", "f", "g", "h"});
        } else if (i2 == 3) {
            return new btao();
        } else {
            if (i2 == 4) {
                return new bxvd(f148017i);
            }
            if (i2 == 5) {
                return f148017i;
            }
            bxxk bxxk = f148018j;
            if (bxxk == null) {
                synchronized (btao.class) {
                    bxxk = f148018j;
                    if (bxxk == null) {
                        bxxk = new bxve(f148017i);
                        f148018j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
