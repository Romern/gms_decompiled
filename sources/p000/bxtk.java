package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: bxtk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxtk extends bxtc implements RandomAccess, bxvn, bxxl {

    /* renamed from: b */
    public static final bxtk f164779b;

    /* renamed from: c */
    private boolean[] f164780c;

    /* renamed from: d */
    private int f164781d;

    static {
        bxtk bxtk = new bxtk(new boolean[0], 0);
        f164779b = bxtk;
        bxtk.mo73671b();
    }

    public bxtk() {
        this(new boolean[10], 0);
    }

    /* renamed from: d */
    private final void m123215d(int i) {
        if (i < 0 || i >= this.f164781d) {
            throw new IndexOutOfBoundsException(m123216e(i));
        }
    }

    /* renamed from: e */
    private final String m123216e(int i) {
        int i2 = this.f164781d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final bxvn mo73731c(int i) {
        if (i >= this.f164781d) {
            return new bxtk(Arrays.copyOf(this.f164780c, i), this.f164781d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo73672c();
        if (i < 0 || i > (i2 = this.f164781d)) {
            throw new IndexOutOfBoundsException(m123216e(i));
        }
        boolean[] zArr = this.f164780c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f164780c, i, zArr2, i + 1, this.f164781d - i);
            this.f164780c = zArr2;
        }
        this.f164780c[i] = booleanValue;
        this.f164781d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo73672c();
        bxwd.m124083a(collection);
        if (!(collection instanceof bxtk)) {
            return super.addAll(collection);
        }
        bxtk bxtk = (bxtk) collection;
        int i = bxtk.f164781d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f164781d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f164780c;
            if (i3 > zArr.length) {
                this.f164780c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(bxtk.f164780c, 0, this.f164780c, this.f164781d, bxtk.f164781d);
            this.f164781d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final boolean mo73730b(int i) {
        m123215d(i);
        return this.f164780c[i];
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxtk)) {
            return super.equals(obj);
        }
        bxtk bxtk = (bxtk) obj;
        if (this.f164781d != bxtk.f164781d) {
            return false;
        }
        boolean[] zArr = bxtk.f164780c;
        for (int i = 0; i < this.f164781d; i++) {
            if (this.f164780c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f164781d; i2++) {
            i = (i * 31) + bxwd.m124080a(this.f164780c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int i = this.f164781d;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f164780c[i2] == booleanValue) {
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
            boolean[] zArr = this.f164780c;
            System.arraycopy(zArr, i2, zArr, i, this.f164781d - i2);
            this.f164781d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo73672c();
        m123215d(i);
        boolean[] zArr = this.f164780c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f164781d;
    }

    private bxtk(boolean[] zArr, int i) {
        this.f164780c = zArr;
        this.f164781d = i;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Boolean.valueOf(mo73730b(i));
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo73672c();
        m123215d(i);
        boolean[] zArr = this.f164780c;
        boolean z = zArr[i];
        int i2 = this.f164781d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f164781d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* renamed from: a */
    public final void mo73729a(boolean z) {
        mo73672c();
        int i = this.f164781d;
        boolean[] zArr = this.f164780c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f164780c = zArr2;
        }
        boolean[] zArr3 = this.f164780c;
        int i2 = this.f164781d;
        this.f164781d = i2 + 1;
        zArr3[i2] = z;
    }

    public final boolean remove(Object obj) {
        mo73672c();
        for (int i = 0; i < this.f164781d; i++) {
            if (obj.equals(Boolean.valueOf(this.f164780c[i]))) {
                boolean[] zArr = this.f164780c;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f164781d - i) - 1);
                this.f164781d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo73729a(((Boolean) obj).booleanValue());
        return true;
    }
}
