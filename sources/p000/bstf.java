package p000;

/* renamed from: bstf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bstf extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bstf f146999c;

    /* renamed from: d */
    private static volatile bxxk f147000d;

    /* renamed from: a */
    public String f147001a = "";

    /* renamed from: b */
    public int f147002b;

    static {
        bstf bstf = new bstf();
        f146999c = bstf;
        bxvk.m124024a(bstf.class, bstf);
    }

    private bstf() {
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
            return bxvk.m124022a(f146999c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bstf();
        } else {
            if (i2 == 4) {
                return new bxvd(f146999c);
            }
            if (i2 == 5) {
                return f146999c;
            }
            bxxk bxxk = f147000d;
            if (bxxk == null) {
                synchronized (bstf.class) {
                    bxxk = f147000d;
                    if (bxxk == null) {
                        bxxk = new bxve(f146999c);
                        f147000d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
