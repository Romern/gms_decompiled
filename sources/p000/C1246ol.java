package p000;

/* renamed from: ol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1246ol implements Cloneable {

    /* renamed from: e */
    private static final Object f26810e = new Object();

    /* renamed from: a */
    public boolean f26811a;

    /* renamed from: b */
    public int[] f26812b;

    /* renamed from: c */
    public Object[] f26813c;

    /* renamed from: d */
    public int f26814d;

    public C1246ol() {
        this(10);
    }

    /* renamed from: a */
    public final C1246ol clone() {
        try {
            C1246ol olVar = (C1246ol) super.clone();
            olVar.f26812b = (int[]) this.f26812b.clone();
            olVar.f26813c = (Object[]) this.f26813c.clone();
            return olVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public final int mo15638b(int i) {
        if (this.f26811a) {
            mo15639b();
        }
        return this.f26812b[i];
    }

    /* renamed from: c */
    public final int mo15640c() {
        if (this.f26811a) {
            mo15639b();
        }
        return this.f26814d;
    }

    /* renamed from: d */
    public final int mo15643d(int i) {
        if (this.f26811a) {
            mo15639b();
        }
        return C1229nv.m19714a(this.f26812b, this.f26814d, i);
    }

    /* renamed from: e */
    public final boolean mo15645e(int i) {
        return mo15643d(i) >= 0;
    }

    /* renamed from: f */
    public final Object mo15646f(int i) {
        int a = C1229nv.m19714a(this.f26812b, this.f26814d, i);
        if (a < 0) {
            return null;
        }
        Object[] objArr = this.f26813c;
        if (objArr[a] != f26810e) {
            return objArr[a];
        }
        return null;
    }

    public final String toString() {
        if (mo15640c() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f26814d * 28);
        sb.append('{');
        for (int i = 0; i < this.f26814d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo15638b(i));
            sb.append('=');
            Object c = mo15641c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C1246ol(int i) {
        this.f26811a = false;
        if (i != 0) {
            int a = C1229nv.m19713a(i);
            this.f26812b = new int[a];
            this.f26813c = new Object[a];
            return;
        }
        this.f26812b = C1229nv.f26767a;
        this.f26813c = C1229nv.f26769c;
    }

    /* renamed from: c */
    public final Object mo15641c(int i) {
        if (this.f26811a) {
            mo15639b();
        }
        return this.f26813c[i];
    }

    /* renamed from: a */
    public final void mo15636a(int i) {
        Object[] objArr;
        Object obj;
        int a = C1229nv.m19714a(this.f26812b, this.f26814d, i);
        if (a >= 0 && (objArr = this.f26813c)[a] != (obj = f26810e)) {
            objArr[a] = obj;
            this.f26811a = true;
        }
    }

    /* renamed from: b */
    public final void mo15639b() {
        int i = this.f26814d;
        int[] iArr = this.f26812b;
        Object[] objArr = this.f26813c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f26810e) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f26811a = false;
        this.f26814d = i2;
    }

    /* renamed from: d */
    public final void mo15644d() {
        int i = this.f26814d;
        Object[] objArr = this.f26813c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f26814d = 0;
        this.f26811a = false;
    }

    /* renamed from: a */
    public final void mo15637a(int i, Object obj) {
        int a = C1229nv.m19714a(this.f26812b, this.f26814d, i);
        if (a < 0) {
            int i2 = a ^ -1;
            if (i2 < this.f26814d) {
                Object[] objArr = this.f26813c;
                if (objArr[i2] == f26810e) {
                    this.f26812b[i2] = i;
                    objArr[i2] = obj;
                    return;
                }
            }
            if (this.f26811a && this.f26814d >= this.f26812b.length) {
                mo15639b();
                i2 = C1229nv.m19714a(this.f26812b, this.f26814d, i) ^ -1;
            }
            int i3 = this.f26814d;
            if (i3 >= this.f26812b.length) {
                int a2 = C1229nv.m19713a(i3 + 1);
                int[] iArr = new int[a2];
                Object[] objArr2 = new Object[a2];
                int[] iArr2 = this.f26812b;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr3 = this.f26813c;
                System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                this.f26812b = iArr;
                this.f26813c = objArr2;
            }
            int i4 = this.f26814d - i2;
            if (i4 != 0) {
                int[] iArr3 = this.f26812b;
                int i5 = i2 + 1;
                System.arraycopy(iArr3, i2, iArr3, i5, i4);
                Object[] objArr4 = this.f26813c;
                System.arraycopy(objArr4, i2, objArr4, i5, this.f26814d - i2);
            }
            this.f26812b[i2] = i;
            this.f26813c[i2] = obj;
            this.f26814d++;
            return;
        }
        this.f26813c[a] = obj;
    }
}
