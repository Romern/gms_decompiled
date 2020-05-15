package p000;

import java.util.Arrays;

/* renamed from: bfoz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfoz {

    /* renamed from: a */
    private final int f114742a;

    /* renamed from: b */
    private int[] f114743b;

    /* renamed from: c */
    private int f114744c;

    /* renamed from: d */
    private int f114745d;

    public bfoz(int i) {
        this.f114742a = i;
        m97459c();
    }

    /* renamed from: b */
    private final int m97458b() {
        int i = this.f114744c;
        if (i < this.f114742a) {
            return i;
        }
        this.f114744c = 0;
        return 0;
    }

    /* renamed from: c */
    private final void m97459c() {
        this.f114743b = new int[Math.min(this.f114742a, 10)];
        this.f114744c = 0;
        this.f114745d = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo62074a(long j) {
        int i;
        int[] iArr = this.f114743b;
        int length = iArr.length;
        if (length != 0) {
            int i2 = this.f114744c;
            if (i2 == length && i2 < (i = this.f114742a)) {
                this.f114743b = Arrays.copyOf(iArr, Math.min(i, length + 10));
            }
            this.f114743b[m97458b()] = (int) j;
            this.f114744c++;
            int i3 = this.f114745d;
            if (i3 < this.f114742a) {
                this.f114745d = i3 + 1;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long[] mo62075a() {
        int i = this.f114745d;
        long[] jArr = new long[i];
        if (i != this.f114742a) {
            this.f114744c = 0;
        }
        for (int i2 = 0; i2 < this.f114745d; i2++) {
            jArr[i2] = (long) this.f114743b[m97458b()];
            this.f114744c++;
        }
        m97459c();
        return jArr;
    }
}
