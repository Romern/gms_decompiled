package p000;

/* renamed from: canm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class canm {

    /* renamed from: a */
    public final int f175377a;

    /* renamed from: b */
    public final int f175378b;

    /* renamed from: c */
    public final int f175379c;

    /* renamed from: d */
    public final int[] f175380d;

    public canm(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f175377a = i;
        this.f175378b = i2;
        int i3 = (i + 31) >> 5;
        this.f175379c = i3;
        this.f175380d = new int[(i3 * i2)];
    }

    /* renamed from: a */
    public final boolean mo74689a(int i, int i2) {
        return ((this.f175380d[(i2 * this.f175379c) + (i >> 5)] >>> (i & 31)) & 1) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof canm) {
            canm canm = (canm) obj;
            if (this.f175377a == canm.f175377a && this.f175378b == canm.f175378b && this.f175379c == canm.f175379c && this.f175380d.length == canm.f175380d.length) {
                int i = 0;
                while (true) {
                    int[] iArr = this.f175380d;
                    if (i >= iArr.length) {
                        return true;
                    }
                    if (iArr[i] != canm.f175380d[i]) {
                        return false;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f175377a;
        int i2 = (((((i * 31) + i) * 31) + this.f175378b) * 31) + this.f175379c;
        for (int i3 : this.f175380d) {
            i2 = (i2 * 31) + i3;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.f175378b * (this.f175377a + 1));
        for (int i = 0; i < this.f175378b; i++) {
            for (int i2 = 0; i2 < this.f175377a; i2++) {
                sb.append(!mo74689a(i2, i) ? "  " : "X ");
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
