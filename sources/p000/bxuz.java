package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: bxuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxuz extends bxtc implements RandomAccess, bxvs, bxxl {

    /* renamed from: b */
    public static final bxuz f164939b;

    /* renamed from: c */
    private float[] f164940c;

    /* renamed from: d */
    private int f164941d;

    static {
        bxuz bxuz = new bxuz(new float[0], 0);
        f164939b = bxuz;
        bxuz.mo73671b();
    }

    public bxuz() {
        this(new float[10], 0);
    }

    /* renamed from: d */
    private final void m123773d(int i) {
        if (i < 0 || i >= this.f164941d) {
            throw new IndexOutOfBoundsException(m123774e(i));
        }
    }

    /* renamed from: e */
    private final String m123774e(int i) {
        int i2 = this.f164941d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final bxvs mo73731c(int i) {
        if (i >= this.f164941d) {
            return new bxuz(Arrays.copyOf(this.f164940c, i), this.f164941d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo73672c();
        if (i < 0 || i > (i2 = this.f164941d)) {
            throw new IndexOutOfBoundsException(m123774e(i));
        }
        float[] fArr = this.f164940c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f164940c, i, fArr2, i + 1, this.f164941d - i);
            this.f164940c = fArr2;
        }
        this.f164940c[i] = floatValue;
        this.f164941d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo73672c();
        bxwd.m124083a(collection);
        if (!(collection instanceof bxuz)) {
            return super.addAll(collection);
        }
        bxuz bxuz = (bxuz) collection;
        int i = bxuz.f164941d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f164941d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f164940c;
            if (i3 > fArr.length) {
                this.f164940c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(bxuz.f164940c, 0, this.f164940c, this.f164941d, bxuz.f164941d);
            this.f164941d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final float mo73923b(int i) {
        m123773d(i);
        return this.f164940c[i];
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxuz)) {
            return super.equals(obj);
        }
        bxuz bxuz = (bxuz) obj;
        if (this.f164941d != bxuz.f164941d) {
            return false;
        }
        float[] fArr = bxuz.f164940c;
        for (int i = 0; i < this.f164941d; i++) {
            if (Float.floatToIntBits(this.f164940c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f164941d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f164940c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            int i = this.f164941d;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f164940c[i2] == floatValue) {
                    return i2;
                }
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo73672c();
        if (i2 >= i) {
            float[] fArr = this.f164940c;
            System.arraycopy(fArr, i2, fArr, i, this.f164941d - i2);
            this.f164941d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo73672c();
        m123773d(i);
        float[] fArr = this.f164940c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f164941d;
    }

    private bxuz(float[] fArr, int i) {
        this.f164940c = fArr;
        this.f164941d = i;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Float.valueOf(mo73923b(i));
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo73672c();
        m123773d(i);
        float[] fArr = this.f164940c;
        float f = fArr[i];
        int i2 = this.f164941d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f164941d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    /* renamed from: a */
    public final void mo73922a(float f) {
        mo73672c();
        int i = this.f164941d;
        float[] fArr = this.f164940c;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f164940c = fArr2;
        }
        float[] fArr3 = this.f164940c;
        int i2 = this.f164941d;
        this.f164941d = i2 + 1;
        fArr3[i2] = f;
    }

    public final boolean remove(Object obj) {
        mo73672c();
        for (int i = 0; i < this.f164941d; i++) {
            if (obj.equals(Float.valueOf(this.f164940c[i]))) {
                float[] fArr = this.f164940c;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f164941d - i) - 1);
                this.f164941d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo73922a(((Float) obj).floatValue());
        return true;
    }
}
