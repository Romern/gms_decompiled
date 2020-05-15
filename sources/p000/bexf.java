package p000;

import java.io.Serializable;

/* renamed from: bexf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bexf implements Serializable {

    /* renamed from: a */
    private final float[] f112891a;

    /* renamed from: b */
    private int f112892b = 0;

    /* renamed from: c */
    private boolean f112893c = false;

    /* renamed from: d */
    private float f112894d;

    public bexf(int i) {
        this.f112891a = new float[i];
    }

    /* renamed from: a */
    public final float mo61219a(int i) {
        int length = this.f112891a.length;
        if (mo61220a() == 0) {
            throw new IndexOutOfBoundsException("Array is empty.");
        } else if (i >= mo61220a()) {
            int a = mo61220a();
            StringBuilder sb = new StringBuilder(61);
            sb.append("Index of ");
            sb.append(i);
            sb.append(" is larger than array size of ");
            sb.append(a);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (!this.f112893c) {
            return this.f112891a[i];
        } else {
            int i2 = i + this.f112892b;
            if (i2 >= length) {
                i2 -= length;
            }
            return this.f112891a[i2];
        }
    }

    /* renamed from: a */
    public final int mo61220a() {
        return this.f112893c ? this.f112891a.length : this.f112892b;
    }

    /* renamed from: b */
    public final void mo61222b(float f) {
        int i;
        int i2;
        if (mo61220a() != 0) {
            float[] fArr = this.f112891a;
            if (this.f112893c && (i2 = this.f112892b) > 0) {
                i = i2 - 1;
            } else {
                i = mo61220a() - 1;
            }
            fArr[i] = f;
            return;
        }
        throw new IndexOutOfBoundsException("Array is empty.");
    }

    /* renamed from: c */
    public final float mo61224c() {
        int i;
        int i2;
        if (mo61220a() != 0) {
            float[] fArr = this.f112891a;
            if (this.f112893c && (i2 = this.f112892b) > 0) {
                i = i2 - 1;
            } else {
                i = mo61220a() - 1;
            }
            return fArr[i];
        }
        throw new IndexOutOfBoundsException("Array is empty.");
    }

    /* renamed from: b */
    public final float[] mo61223b() {
        if (mo61220a() <= 1) {
            return new float[0];
        }
        int a = mo61220a() - 1;
        float[] fArr = new float[a];
        int i = this.f112892b;
        int a2 = mo61220a();
        int length = this.f112891a.length;
        int i2 = ((i - a2) + length) % length;
        for (int i3 = 0; i3 < a; i3++) {
            float[] fArr2 = this.f112891a;
            int i4 = i2 + i3;
            int length2 = fArr2.length;
            fArr[i3] = fArr2[(i4 + 1) % length2] - fArr2[i4 % length2];
        }
        return fArr;
    }

    /* renamed from: a */
    public final void mo61221a(float f) {
        if (this.f112893c) {
            this.f112894d -= this.f112891a[this.f112892b];
        }
        float[] fArr = this.f112891a;
        int i = this.f112892b;
        fArr[i] = f;
        this.f112894d += f;
        if (i == fArr.length - 1) {
            this.f112892b = 0;
            this.f112893c = true;
            return;
        }
        this.f112892b = i + 1;
    }
}
