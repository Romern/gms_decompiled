package p000;

/* renamed from: bfpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfpi {

    /* renamed from: a */
    private final Object[] f114781a;

    /* renamed from: b */
    private int f114782b = 0;

    /* renamed from: c */
    private final Object f114783c;

    /* renamed from: d */
    private Object f114784d;

    /* renamed from: e */
    private int f114785e;

    public bfpi(int i, Object obj) {
        this.f114781a = new Object[i];
        this.f114783c = obj;
        this.f114784d = obj;
        this.f114785e = i;
    }

    /* renamed from: a */
    public final int mo62094a(Object obj) {
        if (bxbl.m122538a(obj, this.f114784d)) {
            return this.f114785e;
        }
        int i = 0;
        while (true) {
            int i2 = this.f114782b;
            if (i >= i2) {
                Object[] objArr = this.f114781a;
                int length = objArr.length;
                if (i2 == length) {
                    return length;
                }
                objArr[i2] = obj;
                this.f114784d = obj;
                this.f114785e = i2;
                this.f114782b = i2 + 1;
                return i2;
            } else if (i != this.f114785e && bxbl.m122538a(obj, this.f114781a[i])) {
                return i;
            } else {
                i++;
            }
        }
    }

    /* renamed from: a */
    public final Object mo62095a(int i) {
        Object[] objArr = this.f114781a;
        return i == objArr.length ? this.f114783c : objArr[i];
    }

    /* renamed from: a */
    public final void mo62096a() {
        for (int i = 0; i < this.f114782b; i++) {
            this.f114781a[i] = null;
        }
        this.f114782b = 0;
        this.f114784d = this.f114783c;
        this.f114785e = this.f114781a.length;
    }
}
