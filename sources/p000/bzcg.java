package p000;

/* renamed from: bzcg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzcg extends bxvg implements bxvh {

    /* renamed from: c */
    public static final bzcg f169317c;

    /* renamed from: f */
    private static volatile bxxk f169318f;

    /* renamed from: a */
    public int f169319a;

    /* renamed from: b */
    public bxwc f169320b = bxxn.f165040b;

    /* renamed from: d */
    private int f169321d;

    /* renamed from: e */
    private byte f169322e = 2;

    static {
        bzcg bzcg = new bzcg();
        f169317c = bzcg;
        GeneratedMessageLite.m124024a(bzcg.class, bzcg);
    }

    private bzcg() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169322e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169322e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f169317c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0003\u001b", new Object[]{"d", "a", bxbf.m122515b(), "b", byzt.class});
        } else if (i2 == 3) {
            return new bzcg();
        } else {
            if (i2 == 4) {
                return new bxvf(f169317c);
            }
            if (i2 == 5) {
                return f169317c;
            }
            bxxk bxxk = f169318f;
            if (bxxk == null) {
                synchronized (bzcg.class) {
                    bxxk = f169318f;
                    if (bxxk == null) {
                        bxxk = new bxve(f169317c);
                        f169318f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
