package p000;

import java.lang.reflect.Array;

/* renamed from: canw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class canw {

    /* renamed from: a */
    public final byte[][] f175422a;

    /* renamed from: b */
    public final int f175423b;

    /* renamed from: c */
    public final int f175424c;

    public canw(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = i;
        iArr[0] = i2;
        this.f175422a = (byte[][]) Array.newInstance(byte.class, iArr);
        this.f175423b = i;
        this.f175424c = i2;
    }

    /* renamed from: a */
    public final byte mo74708a(int i, int i2) {
        return this.f175422a[i2][i];
    }

    public final String toString() {
        int i = this.f175423b;
        StringBuilder sb = new StringBuilder(((i + i) * this.f175424c) + 2);
        for (int i2 = 0; i2 < this.f175424c; i2++) {
            for (int i3 = 0; i3 < this.f175423b; i3++) {
                byte b = this.f175422a[i2][i3];
                if (b == 0) {
                    sb.append(" 0");
                } else if (b != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append(10);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo74709a(int i, int i2, int i3) {
        this.f175422a[i2][i] = (byte) i3;
    }

    /* renamed from: a */
    public final void mo74710a(int i, int i2, boolean z) {
        this.f175422a[i2][i] = z ? (byte) 1 : 0;
    }
}
