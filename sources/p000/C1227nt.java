package p000;

/* renamed from: nt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1227nt {

    /* renamed from: a */
    public Object[] f26763a;

    /* renamed from: b */
    public int f26764b;

    /* renamed from: c */
    public int f26765c;

    /* renamed from: d */
    private int f26766d;

    public C1227nt() {
        this(8);
    }

    /* renamed from: a */
    public final int mo15529a() {
        return (this.f26766d - this.f26764b) & this.f26765c;
    }

    /* renamed from: b */
    public final void mo15532b() {
        int i = this.f26764b;
        if (i != this.f26766d) {
            Object[] objArr = this.f26763a;
            Object obj = objArr[i];
            objArr[i] = null;
            this.f26764b = (i + 1) & this.f26765c;
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public C1227nt(int i) {
        if (Integer.bitCount(i) != 1) {
            int highestOneBit = Integer.highestOneBit(i - 1);
            i = highestOneBit + highestOneBit;
        }
        this.f26765c = i - 1;
        this.f26763a = new Object[i];
    }

    /* renamed from: a */
    public final Object mo15530a(int i) {
        if (i < 0 || i >= mo15529a()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f26763a[this.f26765c & (this.f26764b + i)];
    }

    /* renamed from: a */
    public final void mo15531a(Object obj) {
        Object[] objArr = this.f26763a;
        int i = this.f26766d;
        objArr[i] = obj;
        int i2 = this.f26765c & (i + 1);
        this.f26766d = i2;
        int i3 = this.f26764b;
        if (i2 == i3) {
            int length = objArr.length;
            int i4 = length - i3;
            int i5 = length + length;
            if (i5 >= 0) {
                Object[] objArr2 = new Object[i5];
                System.arraycopy(objArr, i3, objArr2, 0, i4);
                System.arraycopy(this.f26763a, 0, objArr2, i4, this.f26764b);
                this.f26763a = objArr2;
                this.f26764b = 0;
                this.f26766d = length;
                this.f26765c = i5 - 1;
                return;
            }
            throw new RuntimeException("Max array capacity exceeded");
        }
    }
}
