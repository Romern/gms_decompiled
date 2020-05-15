package p000;

import java.util.Arrays;

/* renamed from: rgb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rgb {

    /* renamed from: a */
    final short[] f42902a;

    /* renamed from: b */
    public final long[] f42903b;

    /* renamed from: c */
    private final int f42904c;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.fill(short[], short):void}
     arg types: [short[], int]
     candidates:
      ClspMth{java.util.Arrays.fill(double[], double):void}
      ClspMth{java.util.Arrays.fill(byte[], byte):void}
      ClspMth{java.util.Arrays.fill(long[], long):void}
      ClspMth{java.util.Arrays.fill(boolean[], boolean):void}
      ClspMth{java.util.Arrays.fill(char[], char):void}
      ClspMth{java.util.Arrays.fill(java.lang.Object[], java.lang.Object):void}
      ClspMth{java.util.Arrays.fill(int[], int):void}
      ClspMth{java.util.Arrays.fill(float[], float):void}
      ClspMth{java.util.Arrays.fill(short[], short):void} */
    public rgb(long[] jArr) {
        boolean z;
        boolean z2;
        int length = jArr.length;
        if ((length & 3) == 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        if (length < 32767) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34975b(z2, "too many digests");
        this.f42903b = jArr;
        int max = Math.max(4, 29 - Integer.numberOfLeadingZeros(length));
        this.f42904c = max;
        short[] sArr = new short[(1 << max)];
        this.f42902a = sArr;
        Arrays.fill(sArr, Short.MAX_VALUE);
        int i = length - 4;
        while (i >= 0) {
            sdo.m34975b(i == 0 || jArr[i] > jArr[i + -4], "Must be sorted");
            this.f42902a[mo24612a(jArr[i])] = (short) i;
            i -= 4;
        }
    }

    /* renamed from: a */
    public final int mo24612a(long j) {
        return (int) (j >>> (64 - this.f42904c));
    }
}
