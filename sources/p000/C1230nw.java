package p000;

/* renamed from: nw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1230nw implements Cloneable {

    /* renamed from: a */
    public static final Object f26770a = new Object();

    /* renamed from: b */
    public boolean f26771b;

    /* renamed from: c */
    public Object[] f26772c;

    /* renamed from: d */
    private long[] f26773d;

    /* renamed from: e */
    private int f26774e;

    public C1230nw() {
        this(10);
    }

    /* renamed from: d */
    private final void m19719d() {
        int i = this.f26774e;
        long[] jArr = this.f26773d;
        Object[] objArr = this.f26772c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f26770a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f26771b = false;
        this.f26774e = i2;
    }

    /* renamed from: a */
    public final long mo15533a(int i) {
        if (this.f26771b) {
            m19719d();
        }
        return this.f26773d[i];
    }

    /* renamed from: b */
    public final int mo15537b() {
        if (this.f26771b) {
            m19719d();
        }
        return this.f26774e;
    }

    /* renamed from: c */
    public final int mo15541c(long j) {
        if (this.f26771b) {
            m19719d();
        }
        return C1229nv.m19715a(this.f26773d, this.f26774e, j);
    }

    public final String toString() {
        if (mo15537b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f26774e * 28);
        sb.append('{');
        for (int i = 0; i < this.f26774e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo15533a(i));
            sb.append('=');
            Object b = mo15538b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C1230nw(int i) {
        this.f26771b = false;
        if (i != 0) {
            int b = C1229nv.m19717b(i);
            this.f26773d = new long[b];
            this.f26772c = new Object[b];
            return;
        }
        this.f26773d = C1229nv.f26768b;
        this.f26772c = C1229nv.f26769c;
    }

    /* renamed from: b */
    public final Object mo15538b(int i) {
        if (this.f26771b) {
            m19719d();
        }
        return this.f26772c[i];
    }

    /* renamed from: a */
    public final Object mo15534a(long j) {
        return mo15535a(j, null);
    }

    /* renamed from: c */
    public final void mo15542c() {
        int i = this.f26774e;
        Object[] objArr = this.f26772c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f26774e = 0;
        this.f26771b = false;
    }

    /* renamed from: d */
    public final boolean mo15544d(long j) {
        return mo15541c(j) >= 0;
    }

    /* renamed from: a */
    public final Object mo15535a(long j, Object obj) {
        int a = C1229nv.m19715a(this.f26773d, this.f26774e, j);
        if (a >= 0) {
            Object[] objArr = this.f26772c;
            if (objArr[a] != f26770a) {
                return objArr[a];
            }
        }
        return obj;
    }

    /* renamed from: b */
    public final void mo15539b(long j) {
        Object[] objArr;
        Object obj;
        int a = C1229nv.m19715a(this.f26773d, this.f26774e, j);
        if (a >= 0 && (objArr = this.f26772c)[a] != (obj = f26770a)) {
            objArr[a] = obj;
            this.f26771b = true;
        }
    }

    /* renamed from: b */
    public final void mo15540b(long j, Object obj) {
        int a = C1229nv.m19715a(this.f26773d, this.f26774e, j);
        if (a < 0) {
            int i = a ^ -1;
            if (i < this.f26774e) {
                Object[] objArr = this.f26772c;
                if (objArr[i] == f26770a) {
                    this.f26773d[i] = j;
                    objArr[i] = obj;
                    return;
                }
            }
            if (this.f26771b && this.f26774e >= this.f26773d.length) {
                m19719d();
                i = C1229nv.m19715a(this.f26773d, this.f26774e, j) ^ -1;
            }
            int i2 = this.f26774e;
            if (i2 >= this.f26773d.length) {
                int b = C1229nv.m19717b(i2 + 1);
                long[] jArr = new long[b];
                Object[] objArr2 = new Object[b];
                long[] jArr2 = this.f26773d;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr3 = this.f26772c;
                System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                this.f26773d = jArr;
                this.f26772c = objArr2;
            }
            int i3 = this.f26774e - i;
            if (i3 != 0) {
                long[] jArr3 = this.f26773d;
                int i4 = i + 1;
                System.arraycopy(jArr3, i, jArr3, i4, i3);
                Object[] objArr4 = this.f26772c;
                System.arraycopy(objArr4, i, objArr4, i4, this.f26774e - i);
            }
            this.f26773d[i] = j;
            this.f26772c[i] = obj;
            this.f26774e++;
            return;
        }
        this.f26772c[a] = obj;
    }

    /* renamed from: a */
    public final C1230nw clone() {
        try {
            C1230nw nwVar = (C1230nw) super.clone();
            nwVar.f26773d = (long[]) this.f26773d.clone();
            nwVar.f26772c = (Object[]) this.f26772c.clone();
            return nwVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
