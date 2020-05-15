package p000;

/* renamed from: cbmd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbmd extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbmd f177603c;

    /* renamed from: d */
    private static volatile bxxk f177604d;

    /* renamed from: a */
    public String f177605a = "";

    /* renamed from: b */
    public int f177606b;

    static {
        cbmd cbmd = new cbmd();
        f177603c = cbmd;
        bxvk.m124024a(cbmd.class, cbmd);
    }

    private cbmd() {
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
            return bxvk.m124022a(f177603c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbmd();
        } else {
            if (i2 == 4) {
                return new bxvd(f177603c);
            }
            if (i2 == 5) {
                return f177603c;
            }
            bxxk bxxk = f177604d;
            if (bxxk == null) {
                synchronized (cbmd.class) {
                    bxxk = f177604d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177603c);
                        f177604d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
