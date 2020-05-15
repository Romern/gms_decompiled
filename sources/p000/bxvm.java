package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: bxvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxvm extends bxtc implements RandomAccess, bxvt, bxxl {

    /* renamed from: b */
    public static final bxvm f164965b;

    /* renamed from: c */
    private int[] f164966c;

    /* renamed from: d */
    private int f164967d;

    static {
        bxvm bxvm = new bxvm(new int[0], 0);
        f164965b = bxvm;
        bxvm.mo73671b();
    }

    public bxvm() {
        this(new int[10], 0);
    }

    /* renamed from: e */
    private final void m124046e(int i) {
        if (i < 0 || i >= this.f164967d) {
            throw new IndexOutOfBoundsException(m124047f(i));
        }
    }

    /* renamed from: f */
    private final String m124047f(int i) {
        int i2 = this.f164967d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final int mo74149a(int i, int i2) {
        mo73672c();
        m124046e(i);
        int[] iArr = this.f164966c;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo73672c();
        if (i < 0 || i > (i2 = this.f164967d)) {
            throw new IndexOutOfBoundsException(m124047f(i));
        }
        int[] iArr = this.f164966c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f164966c, i, iArr2, i + 1, this.f164967d - i);
            this.f164966c = iArr2;
        }
        this.f164966c[i] = intValue;
        this.f164967d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo73672c();
        bxwd.m124083a(collection);
        if (!(collection instanceof bxvm)) {
            return super.addAll(collection);
        }
        bxvm bxvm = (bxvm) collection;
        int i = bxvm.f164967d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f164967d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f164966c;
            if (i3 > iArr.length) {
                this.f164966c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(bxvm.f164966c, 0, this.f164966c, this.f164967d, bxvm.f164967d);
            this.f164967d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final int mo74151b(int i) {
        m124046e(i);
        return this.f164966c[i];
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void mo74153d(int i) {
        mo73672c();
        int i2 = this.f164967d;
        int[] iArr = this.f164966c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f164966c = iArr2;
        }
        int[] iArr3 = this.f164966c;
        int i3 = this.f164967d;
        this.f164967d = i3 + 1;
        iArr3[i3] = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxvm)) {
            return super.equals(obj);
        }
        bxvm bxvm = (bxvm) obj;
        if (this.f164967d != bxvm.f164967d) {
            return false;
        }
        int[] iArr = bxvm.f164966c;
        for (int i = 0; i < this.f164967d; i++) {
            if (this.f164966c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f164967d; i2++) {
            i = (i * 31) + this.f164966c[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i = this.f164967d;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f164966c[i2] == intValue) {
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
            int[] iArr = this.f164966c;
            System.arraycopy(iArr, i2, iArr, i, this.f164967d - i2);
            this.f164967d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return Integer.valueOf(mo74149a(i, ((Integer) obj).intValue()));
    }

    public final int size() {
        return this.f164967d;
    }

    private bxvm(int[] iArr, int i) {
        this.f164966c = iArr;
        this.f164967d = i;
    }

    /* renamed from: a */
    public final bxvt mo73731c(int i) {
        if (i >= this.f164967d) {
            return new bxvm(Arrays.copyOf(this.f164966c, i), this.f164967d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Integer.valueOf(mo74151b(i));
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo73672c();
        m124046e(i);
        int[] iArr = this.f164966c;
        int i2 = iArr[i];
        int i3 = this.f164967d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f164967d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final boolean remove(Object obj) {
        mo73672c();
        for (int i = 0; i < this.f164967d; i++) {
            if (obj.equals(Integer.valueOf(this.f164966c[i]))) {
                int[] iArr = this.f164966c;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f164967d - i) - 1);
                this.f164967d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo74153d(((Integer) obj).intValue());
        return true;
    }
}
