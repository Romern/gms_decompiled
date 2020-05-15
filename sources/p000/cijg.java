package p000;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: cijg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cijg extends cije implements RandomAccess, Cloneable, Serializable {
    private static final long serialVersionUID = -7046029254386353130L;

    /* renamed from: a */
    public transient long[] f190436a;

    /* renamed from: b */
    public int f190437b;

    public cijg() {
        this(16);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f190436a = new long[this.f190437b];
        for (int i = 0; i < this.f190437b; i++) {
            this.f190436a[i] = objectInputStream.readLong();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        for (int i = 0; i < this.f190437b; i++) {
            objectOutputStream.writeLong(this.f190436a[i]);
        }
    }

    /* renamed from: a */
    public final long mo86163a(int i) {
        if (i < this.f190437b) {
            return this.f190436a[i];
        }
        throw new IndexOutOfBoundsException("Index (" + i + ") is greater than or equal to list size (" + this.f190437b + ")");
    }

    /* renamed from: b */
    public final long mo86168b(int i) {
        int i2 = this.f190437b;
        if (i < i2) {
            long[] jArr = this.f190436a;
            long j = jArr[i];
            int i3 = i2 - 1;
            this.f190437b = i3;
            if (i != i3) {
                System.arraycopy(jArr, i + 1, jArr, i, i3 - i);
            }
            return j;
        }
        throw new IndexOutOfBoundsException("Index (" + i + ") is greater than or equal to list size (" + this.f190437b + ")");
    }

    /* renamed from: c */
    public final cijk mo86171c(int i) {
        mo86187d(i);
        return new cijf(this, i);
    }

    public final void clear() {
        this.f190437b = 0;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        cijg cijg = new cijg(this.f190437b);
        System.arraycopy(this.f190436a, 0, cijg.f190436a, 0, this.f190437b);
        cijg.f190437b = this.f190437b;
        return cijg;
    }

    /* renamed from: d */
    public final int mo86186d(long j) {
        for (int i = 0; i < this.f190437b; i++) {
            if (j == this.f190436a[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: e */
    public final int mo86188e(long j) {
        int i = this.f190437b;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return -1;
            }
            if (j == this.f190436a[i2]) {
                return i2;
            }
            i = i2;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* renamed from: h */
    public final void mo86200h(int i) {
        long[] jArr = this.f190436a;
        int i2 = this.f190437b;
        int length = jArr.length;
        if (i > length) {
            long j = (long) length;
            long[] jArr2 = new long[((int) Math.max(Math.min(j + j, 2147483639L), (long) i))];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            jArr = jArr2;
        }
        this.f190436a = jArr;
    }

    public final boolean isEmpty() {
        return this.f190437b == 0;
    }

    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    public final boolean removeAll(Collection collection) {
        int i;
        long[] jArr = this.f190436a;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f190437b;
            if (i2 >= i) {
                break;
            }
            if (!collection.contains(Long.valueOf(jArr[i2]))) {
                jArr[i3] = jArr[i2];
                i3++;
            }
            i2++;
        }
        if (i != i3) {
            z = true;
        }
        this.f190437b = i3;
        return z;
    }

    public final int size() {
        return this.f190437b;
    }

    public cijg(int i) {
        if (i >= 0) {
            this.f190436a = new long[i];
            return;
        }
        throw new IllegalArgumentException("Initial capacity (" + i + ") is negative");
    }

    /* renamed from: a */
    public final void mo86164a(int i, int i2) {
        int i3 = this.f190437b;
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Start index (" + i + ") is negative");
        } else if (i > i2) {
            throw new IllegalArgumentException("Start index (" + i + ") is greater than end index (" + i2 + ")");
        } else if (i2 <= i3) {
            long[] jArr = this.f190436a;
            System.arraycopy(jArr, i2, jArr, i, i3 - i2);
            this.f190437b -= i2 - i;
        } else {
            throw new ArrayIndexOutOfBoundsException("End index (" + i2 + ") is greater than array length (" + i3 + ")");
        }
    }

    /* renamed from: c */
    public final boolean mo86146c(long j) {
        int d = mo86186d(j);
        if (d == -1) {
            return false;
        }
        mo86168b(d);
        return true;
    }

    /* renamed from: b */
    public final long mo86169b(int i, long j) {
        if (i < this.f190437b) {
            long[] jArr = this.f190436a;
            long j2 = jArr[i];
            jArr[i] = j;
            return j2;
        }
        throw new IndexOutOfBoundsException("Index (" + i + ") is greater than or equal to list size (" + this.f190437b + ")");
    }

    /* renamed from: a */
    public final void mo86165a(int i, long j) {
        mo86187d(i);
        mo86200h(this.f190437b + 1);
        int i2 = this.f190437b;
        if (i != i2) {
            long[] jArr = this.f190436a;
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        }
        this.f190436a[i] = j;
        this.f190437b++;
    }

    /* renamed from: a */
    public final boolean mo86143a(long j) {
        mo86200h(this.f190437b + 1);
        long[] jArr = this.f190436a;
        int i = this.f190437b;
        this.f190437b = i + 1;
        jArr[i] = j;
        return true;
    }
}
