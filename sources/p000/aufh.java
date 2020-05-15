package p000;

/* renamed from: aufh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aufh extends bxvk implements bxxd {

    /* renamed from: c */
    public static final aufh f91678c;

    /* renamed from: e */
    private static volatile bxxk f91679e;

    /* renamed from: a */
    public int f91680a;

    /* renamed from: b */
    public bsam f91681b;

    /* renamed from: d */
    private byte f91682d = 2;

    static {
        aufh aufh = new aufh();
        f91678c = aufh;
        bxvk.m124024a(aufh.class, aufh);
    }

    private aufh() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f91682d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f91682d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f91678c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new aufh();
        } else {
            if (i2 == 4) {
                return new bxvd(f91678c);
            }
            if (i2 == 5) {
                return f91678c;
            }
            bxxk bxxk = f91679e;
            if (bxxk == null) {
                synchronized (aufh.class) {
                    bxxk = f91679e;
                    if (bxxk == null) {
                        bxxk = new bxve(f91678c);
                        f91679e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
