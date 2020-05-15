package p000;

import java.lang.reflect.Array;
import java.util.concurrent.TimeUnit;

/* renamed from: bfkf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfkf {

    /* renamed from: a */
    public final int f114282a;

    /* renamed from: b */
    public int f114283b;

    /* renamed from: c */
    public int f114284c;

    /* renamed from: d */
    public long[] f114285d;

    /* renamed from: e */
    public float[][] f114286e;

    /* renamed from: f */
    private final long f114287f;

    /* renamed from: g */
    private final long f114288g;

    public bfkf(int i, int i2, int i3, int i4) {
        long j;
        this.f114282a = i;
        this.f114285d = new long[i2];
        int[] iArr = new int[2];
        iArr[1] = i2;
        iArr[0] = i;
        this.f114286e = (float[][]) Array.newInstance(float.class, iArr);
        long j2 = Long.MAX_VALUE;
        if (i3 != 0) {
            j = TimeUnit.NANOSECONDS.convert(1, TimeUnit.SECONDS) / ((long) i3);
        } else {
            j = Long.MAX_VALUE;
        }
        this.f114287f = j;
        this.f114288g = i4 != 0 ? TimeUnit.NANOSECONDS.convert(1, TimeUnit.SECONDS) / ((long) i4) : j2;
    }

    /* renamed from: b */
    private final int m97111b(int i) {
        if (i >= 0 && i < this.f114284c) {
            return (this.f114283b + i) % this.f114285d.length;
        }
        int i2 = this.f114284c;
        StringBuilder sb = new StringBuilder(56);
        sb.append("Index ");
        sb.append(i);
        sb.append(" out of bound. Current size=");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: a */
    public final float mo61826a(int i, int i2) {
        return this.f114286e[i2][m97111b(i)];
    }

    /* renamed from: a */
    public final boolean mo61831a() {
        return this.f114284c == 0;
    }

    /* renamed from: a */
    public final int mo61827a(long j) {
        if (mo61831a()) {
            return -1;
        }
        int i = 0;
        while (true) {
            int i2 = this.f114284c;
            if (i >= i2) {
                return i2 - 1;
            }
            if (mo61829a(i) <= j) {
                i++;
            } else if (i != 0) {
                return i - 1;
            } else {
                return -1;
            }
        }
    }

    /* renamed from: a */
    public final int mo61828a(long j, int i) {
        if (mo61831a()) {
            return -1;
        }
        if (i == -1) {
            return 0;
        }
        if (mo61829a(i) == j) {
            return i;
        }
        if (i != this.f114284c - 1) {
            return i + 1;
        }
        return -1;
    }

    /* renamed from: a */
    public final long mo61829a(int i) {
        return this.f114285d[m97111b(i)];
    }

    /* renamed from: a */
    public final void mo61830a(long j, float[] fArr) {
        if (!mo61831a()) {
            int i = -1;
            if (!mo61831a()) {
                i = ((this.f114283b + this.f114284c) - 1) % this.f114285d.length;
            }
            long j2 = j - this.f114285d[i];
            if (j2 > this.f114288g) {
                this.f114283b = 0;
                this.f114284c = 0;
            } else if (j2 < this.f114287f) {
                return;
            }
        }
        int i2 = this.f114283b;
        int i3 = this.f114284c;
        long[] jArr = this.f114285d;
        int length = (i2 + i3) % jArr.length;
        jArr[length] = j;
        for (int i4 = 0; i4 < this.f114282a; i4++) {
            this.f114286e[i4][length] = fArr[i4];
        }
        int i5 = this.f114284c;
        int length2 = this.f114285d.length;
        if (i5 == length2) {
            this.f114283b = (this.f114283b + 1) % length2;
        } else {
            this.f114284c = i5 + 1;
        }
    }
}
