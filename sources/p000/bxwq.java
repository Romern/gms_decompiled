package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: bxwq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxwq extends bxtc implements RandomAccess, bxvw, bxxl {

    /* renamed from: b */
    public static final bxwq f165002b;

    /* renamed from: c */
    private long[] f165003c;

    /* renamed from: d */
    private int f165004d;

    static {
        bxwq bxwq = new bxwq(new long[0], 0);
        f165002b = bxwq;
        bxwq.mo73671b();
    }

    public bxwq() {
        this(new long[10], 0);
    }

    /* renamed from: d */
    private final void m124122d(int i) {
        if (i < 0 || i >= this.f165004d) {
            throw new IndexOutOfBoundsException(m124123e(i));
        }
    }

    /* renamed from: e */
    private final String m124123e(int i) {
        int i2 = this.f165004d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final long mo74160a(int i) {
        m124122d(i);
        return this.f165003c[i];
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo73672c();
        if (i < 0 || i > (i2 = this.f165004d)) {
            throw new IndexOutOfBoundsException(m124123e(i));
        }
        long[] jArr = this.f165003c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f165003c, i, jArr2, i + 1, this.f165004d - i);
            this.f165003c = jArr2;
        }
        this.f165003c[i] = longValue;
        this.f165004d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo73672c();
        bxwd.m124083a(collection);
        if (!(collection instanceof bxwq)) {
            return super.addAll(collection);
        }
        bxwq bxwq = (bxwq) collection;
        int i = bxwq.f165004d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f165004d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f165003c;
            if (i3 > jArr.length) {
                this.f165003c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(bxwq.f165003c, 0, this.f165003c, this.f165004d, bxwq.f165004d);
            this.f165004d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final bxvw mo73731c(int i) {
        if (i >= this.f165004d) {
            return new bxwq(Arrays.copyOf(this.f165003c, i), this.f165004d);
        }
        throw new IllegalArgumentException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxwq)) {
            return super.equals(obj);
        }
        bxwq bxwq = (bxwq) obj;
        if (this.f165004d != bxwq.f165004d) {
            return false;
        }
        long[] jArr = bxwq.f165003c;
        for (int i = 0; i < this.f165004d; i++) {
            if (this.f165003c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f165004d; i2++) {
            i = (i * 31) + bxwd.m124079a(this.f165003c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int i = this.f165004d;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f165003c[i2] == longValue) {
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
            long[] jArr = this.f165003c;
            System.arraycopy(jArr, i2, jArr, i, this.f165004d - i2);
            this.f165004d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo73672c();
        m124122d(i);
        long[] jArr = this.f165003c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f165004d;
    }

    private bxwq(long[] jArr, int i) {
        this.f165003c = jArr;
        this.f165004d = i;
    }

    /* renamed from: a */
    public final void mo74161a(long j) {
        mo73672c();
        int i = this.f165004d;
        long[] jArr = this.f165003c;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f165003c = jArr2;
        }
        long[] jArr3 = this.f165003c;
        int i2 = this.f165004d;
        this.f165004d = i2 + 1;
        jArr3[i2] = j;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Long.valueOf(mo74160a(i));
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo73672c();
        m124122d(i);
        long[] jArr = this.f165003c;
        long j = jArr[i];
        int i2 = this.f165004d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f165004d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final boolean remove(Object obj) {
        mo73672c();
        for (int i = 0; i < this.f165004d; i++) {
            if (obj.equals(Long.valueOf(this.f165003c[i]))) {
                long[] jArr = this.f165003c;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f165004d - i) - 1);
                this.f165004d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo74161a(((Long) obj).longValue());
        return true;
    }
}
