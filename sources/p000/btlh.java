package p000;

/* renamed from: btlh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btlh extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btlh f149366e;

    /* renamed from: f */
    private static volatile bxxk f149367f;

    /* renamed from: a */
    public int f149368a = 0;

    /* renamed from: b */
    public Object f149369b;

    /* renamed from: c */
    public btlf f149370c;

    /* renamed from: d */
    public bxtx f149371d = bxtx.f164797b;

    static {
        btlh btlh = new btlh();
        f149366e = btlh;
        bxvk.m124024a(btlh.class, btlh);
    }

    private btlh() {
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
            return bxvk.m124022a(f149366e, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002\t\u0003\n", new Object[]{"b", "a", btlg.class, "c", "d"});
        } else if (i2 == 3) {
            return new btlh();
        } else {
            if (i2 == 4) {
                return new bxvd(f149366e);
            }
            if (i2 == 5) {
                return f149366e;
            }
            bxxk bxxk = f149367f;
            if (bxxk == null) {
                synchronized (btlh.class) {
                    bxxk = f149367f;
                    if (bxxk == null) {
                        bxxk = new bxve(f149366e);
                        f149367f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
