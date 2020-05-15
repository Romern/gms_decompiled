package p000;

import java.util.Arrays;

/* renamed from: ciqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciqp extends cipx {

    /* renamed from: f */
    final transient byte[][] f191259f;

    /* renamed from: g */
    final transient int[] f191260g;

    public ciqp(cipu cipu, int i) {
        super(null);
        ciqu.m150905a(cipu.f191213b, 0, (long) i);
        ciqn ciqn = cipu.f191212a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = ciqn.f191252c;
            int i6 = ciqn.f191251b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                ciqn = ciqn.f191255f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f191259f = new byte[i4][];
        this.f191260g = new int[(i4 + i4)];
        ciqn ciqn2 = cipu.f191212a;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.f191259f;
            bArr[i7] = ciqn2.f191250a;
            int i8 = ciqn2.f191252c;
            int i9 = ciqn2.f191251b;
            i2 += i8 - i9;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.f191260g;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            ciqn2.f191253d = true;
            i7++;
            ciqn2 = ciqn2.f191255f;
        }
    }

    /* renamed from: b */
    private final int m150876b(int i) {
        int binarySearch = Arrays.binarySearch(this.f191260g, 0, this.f191259f.length, i + 1);
        return binarySearch < 0 ? binarySearch ^ -1 : binarySearch;
    }

    /* renamed from: h */
    private final cipx m150877h() {
        return new cipx(mo86347f());
    }

    private Object writeReplace() {
        return m150877h();
    }

    /* renamed from: a */
    public final byte mo86335a(int i) {
        ciqu.m150905a((long) this.f191260g[this.f191259f.length - 1], (long) i, 1);
        int b = m150876b(i);
        int i2 = b != 0 ? this.f191260g[b - 1] : 0;
        int[] iArr = this.f191260g;
        byte[][] bArr = this.f191259f;
        return bArr[b][(i - i2) + iArr[bArr.length + b]];
    }

    /* renamed from: c */
    public final String mo86342c() {
        return m150877h().mo86342c();
    }

    /* renamed from: d */
    public final cipx mo86344d() {
        return m150877h().mo86344d();
    }

    /* renamed from: e */
    public final int mo86345e() {
        return this.f191260g[this.f191259f.length - 1];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cipx)) {
            return false;
        }
        cipx cipx = (cipx) obj;
        return cipx.mo86345e() == mo86345e() && mo86340a(cipx, mo86345e());
    }

    /* renamed from: f */
    public final byte[] mo86347f() {
        int[] iArr = this.f191260g;
        int length = this.f191259f.length;
        byte[] bArr = new byte[iArr[length - 1]];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f191260g;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f191259f[i], i3, bArr, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr;
    }

    /* renamed from: g */
    public final cipx mo86348g() {
        return m150877h().mo86348g();
    }

    public final int hashCode() {
        int i = this.f191217d;
        if (i != 0) {
            return i;
        }
        int length = this.f191259f.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.f191259f[i2];
            int[] iArr = this.f191260g;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.f191217d = i4;
        return i4;
    }

    public final String toString() {
        return m150877h().toString();
    }

    /* renamed from: a */
    public final String mo86336a() {
        return m150877h().mo86336a();
    }

    /* renamed from: b */
    public final String mo86341b() {
        return m150877h().mo86341b();
    }

    /* renamed from: a */
    public final void mo86337a(cipu cipu) {
        int length = this.f191259f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f191260g;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            ciqn ciqn = new ciqn(this.f191259f[i], i3, (i3 + i4) - i2);
            ciqn ciqn2 = cipu.f191212a;
            if (ciqn2 == null) {
                ciqn.f191256g = ciqn;
                ciqn.f191255f = ciqn;
                cipu.f191212a = ciqn;
            } else {
                ciqn2.f191256g.mo86384a(ciqn);
            }
            i++;
            i2 = i4;
        }
        cipu.f191213b += (long) i2;
    }

    /* renamed from: a */
    public final boolean mo86338a(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (i < 0 || i > mo86345e() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int b = m150876b(i);
        while (i3 > 0) {
            if (b != 0) {
                i4 = this.f191260g[b - 1];
            } else {
                i4 = 0;
            }
            int min = Math.min(i3, ((this.f191260g[b] - i4) + i4) - i);
            int[] iArr = this.f191260g;
            byte[][] bArr2 = this.f191259f;
            if (!ciqu.m150906a(bArr2[b], (i - i4) + iArr[bArr2.length + b], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo86340a(cipx cipx, int i) {
        int i2;
        if (mo86345e() - i < 0) {
            return false;
        }
        int b = m150876b(0);
        int i3 = 0;
        int i4 = 0;
        while (i > 0) {
            if (b != 0) {
                i2 = this.f191260g[b - 1];
            } else {
                i2 = 0;
            }
            int min = Math.min(i, ((this.f191260g[b] - i2) + i2) - i3);
            int[] iArr = this.f191260g;
            byte[][] bArr = this.f191259f;
            if (!cipx.mo86338a(i4, bArr[b], (i3 - i2) + iArr[bArr.length + b], min)) {
                return false;
            }
            i3 += min;
            i4 += min;
            i -= min;
            b++;
        }
        return true;
    }
}
