package p000;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: bfku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfku {

    /* renamed from: e */
    public static final bfku f114314e = new bfku();

    /* renamed from: a */
    public final int f114315a;

    /* renamed from: b */
    public final int f114316b;

    /* renamed from: c */
    public final long[] f114317c;

    /* renamed from: d */
    public final float[][] f114318d;

    private bfku() {
        this.f114317c = new long[0];
        this.f114318d = (float[][]) Array.newInstance(float.class, 0, 0);
        this.f114315a = 0;
        this.f114316b = 0;
    }

    /* renamed from: a */
    public final float mo61854a(int i, int i2) {
        return this.f114318d[i2][mo61859b(i)];
    }

    /* renamed from: b */
    public final int mo61859b(int i) {
        if (i >= 0 && i < this.f114316b) {
            return this.f114315a + i;
        }
        int i2 = this.f114316b;
        StringBuilder sb = new StringBuilder(67);
        sb.append("Try to access index at ");
        sb.append(i);
        sb.append(", the total length is ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public bfku(long[] jArr, float[][] fArr) {
        this(jArr, fArr, 0, jArr.length);
    }

    /* renamed from: a */
    public final int mo61855a() {
        return this.f114318d.length;
    }

    /* renamed from: b */
    public final bfku mo61860b(int i, int i2) {
        if (i2 == 0) {
            return f114314e;
        }
        return new bfku(this.f114317c, this.f114318d, mo61859b(i), i2);
    }

    private bfku(long[] jArr, float[][] fArr, int i, int i2) {
        int length;
        if (jArr == null || fArr == null) {
            throw new IllegalArgumentException("timestampNanos or value is null.");
        } else if (fArr.length != 0 && jArr.length != fArr[0].length) {
            throw new IllegalArgumentException("Lengths of timestampNanos and values are not equal.");
        } else if (i < 0 || i >= (length = jArr.length) || i2 <= 0 || i + i2 > length) {
            int length2 = jArr.length;
            StringBuilder sb = new StringBuilder(77);
            sb.append("Internal array length=");
            sb.append(length2);
            sb.append(", startIndex=");
            sb.append(i);
            sb.append(", length=");
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        } else {
            this.f114317c = jArr;
            this.f114318d = fArr;
            this.f114315a = i;
            this.f114316b = i2;
        }
    }

    /* renamed from: a */
    public final int mo61856a(long j) {
        int i = this.f114316b;
        if (i == 0) {
            return -1;
        }
        long[] jArr = this.f114317c;
        int i2 = this.f114315a;
        int binarySearch = Arrays.binarySearch(jArr, i2, i + i2, j);
        int i3 = this.f114315a;
        return binarySearch >= 0 ? binarySearch - i3 : binarySearch + i3;
    }

    /* renamed from: a */
    public final long mo61857a(int i) {
        return this.f114317c[mo61859b(i)];
    }

    /* renamed from: a */
    public final bfku mo61858a(long j, long j2, long j3, long j4) {
        int i;
        int i2;
        if (j >= 0) {
            i = mo61856a(j);
            if (i < 0 && ((-i) - 2 < 0 || j - mo61857a(i) > j2)) {
                i++;
            }
        } else {
            i = 0;
        }
        if (j3 < 0) {
            i2 = this.f114316b - 1;
        } else {
            i2 = mo61856a(j3);
            if (i2 < 0 && ((-i2) - 1 >= this.f114316b || mo61857a(i2) - j3 > j4)) {
                i2--;
            }
        }
        return i <= i2 ? mo61860b(i, (i2 - i) + 1) : f114314e;
    }
}
