package p000;

/* renamed from: cbdh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbdh extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbdh f176732c;

    /* renamed from: d */
    private static volatile bxxk f176733d;

    /* renamed from: a */
    public cbec f176734a;

    /* renamed from: b */
    public String f176735b = "";

    static {
        cbdh cbdh = new cbdh();
        f176732c = cbdh;
        bxvk.m124024a(cbdh.class, cbdh);
    }

    private cbdh() {
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
            return bxvk.m124022a(f176732c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbdh();
        } else {
            if (i2 == 4) {
                return new bxvd(f176732c);
            }
            if (i2 == 5) {
                return f176732c;
            }
            bxxk bxxk = f176733d;
            if (bxxk == null) {
                synchronized (cbdh.class) {
                    bxxk = f176733d;
                    if (bxxk == null) {
                        bxxk = new bxve(f176732c);
                        f176733d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
