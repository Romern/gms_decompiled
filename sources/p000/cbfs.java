package p000;

/* renamed from: cbfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbfs extends bxvk implements bxxd {

    /* renamed from: h */
    public static final cbfs f176960h;

    /* renamed from: i */
    private static volatile bxxk f176961i;

    /* renamed from: a */
    public String f176962a = "";

    /* renamed from: b */
    public cbdj f176963b;

    /* renamed from: c */
    public bzrt f176964c;

    /* renamed from: d */
    public bzrt f176965d;

    /* renamed from: e */
    public bzrt f176966e;

    /* renamed from: f */
    public boolean f176967f;

    /* renamed from: g */
    public cbdr f176968g;

    static {
        cbfs cbfs = new cbfs();
        f176960h = cbfs;
        bxvk.m124024a(cbfs.class, cbfs);
    }

    private cbfs() {
        bxtx bxtx = bxtx.f164797b;
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
            return bxvk.m124022a(f176960h, "\u0000\u0007\u0000\u0000\u0001\n\u0007\u0000\u0000\u0000\u0001Ȉ\u0003\t\u0004\t\u0005\t\u0007\t\t\u0007\n\t", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new cbfs();
        } else {
            if (i2 == 4) {
                return new bxvd(f176960h);
            }
            if (i2 == 5) {
                return f176960h;
            }
            bxxk bxxk = f176961i;
            if (bxxk == null) {
                synchronized (cbfs.class) {
                    bxxk = f176961i;
                    if (bxxk == null) {
                        bxxk = new bxve(f176960h);
                        f176961i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
