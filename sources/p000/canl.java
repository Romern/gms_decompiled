package p000;

/* renamed from: canl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class canl {

    /* renamed from: a */
    public int[] f175375a = new int[1];

    /* renamed from: b */
    public int f175376b = 0;

    /* renamed from: b */
    private final void m126823b(int i) {
        int[] iArr = this.f175375a;
        int length = iArr.length;
        if (i > (length << 5)) {
            int[] iArr2 = new int[((i + 31) >> 5)];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.f175375a = iArr2;
        }
    }

    /* renamed from: a */
    public final int mo74683a() {
        return (this.f175376b + 7) >> 3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.f175376b);
        for (int i = 0; i < this.f175376b; i++) {
            if ((i & 7) == 0) {
                sb.append(' ');
            }
            sb.append(!mo74687a(i) ? '.' : 'X');
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo74684a(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        m126823b(this.f175376b + i2);
        while (i2 > 0) {
            i2--;
            boolean z = true;
            if (((i >> i2) & 1) == 0) {
                z = false;
            }
            mo74686a(z);
        }
    }

    /* renamed from: a */
    public final void mo74685a(canl canl) {
        int i = canl.f175376b;
        m126823b(this.f175376b + i);
        for (int i2 = 0; i2 < i; i2++) {
            mo74686a(canl.mo74687a(i2));
        }
    }

    /* renamed from: a */
    public final void mo74686a(boolean z) {
        m126823b(this.f175376b + 1);
        if (z) {
            int[] iArr = this.f175375a;
            int i = this.f175376b;
            int i2 = i >> 5;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f175376b++;
    }

    /* renamed from: a */
    public final boolean mo74687a(int i) {
        return ((1 << (i & 31)) & this.f175375a[i >> 5]) != 0;
    }
}
