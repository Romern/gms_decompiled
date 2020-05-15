package p000;

import java.util.Arrays;

/* renamed from: bneo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bneo {
    /* renamed from: a */
    static int m109159a(int i) {
        return Math.max(4, bngg.m109306b(i + 1));
    }

    /* renamed from: a */
    static int m109160a(int i, int i2) {
        return i & (i2 ^ -1);
    }

    /* renamed from: a */
    static int m109161a(int i, int i2, int i3) {
        return (i & (i3 ^ -1)) | (i2 & i3);
    }

    /* renamed from: b */
    static Object m109166b(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            StringBuilder sb = new StringBuilder(52);
            sb.append("must be power of 2 between 2^1 and 2^30: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i <= 256) {
            return new byte[i];
        } else {
            if (i > 65536) {
                return new int[i];
            }
            return new short[i];
        }
    }

    /* renamed from: c */
    static int m109167c(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* renamed from: a */
    static int m109162a(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i];
        }
        return ((int[]) obj)[i];
    }

    /* renamed from: a */
    static int m109163a(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int a = bngg.m109305a(obj);
        int i4 = a & i;
        int a2 = m109162a(obj3, i4);
        if (a2 == 0) {
            return -1;
        }
        int a3 = m109160a(a, i);
        int i5 = -1;
        while (true) {
            i2 = a2 - 1;
            i3 = iArr[i2];
            if (m109160a(i3, i) != a3 || !bmxi.m108538a(obj, objArr[i2]) || (objArr2 != null && !bmxi.m108538a(obj2, objArr2[i2]))) {
                int i6 = i3 & i;
                if (i6 == 0) {
                    return -1;
                }
                i5 = i2;
                a2 = i6;
            }
        }
        int i7 = i3 & i;
        if (i5 != -1) {
            iArr[i5] = m109161a(iArr[i5], i7, i);
        } else {
            m109165a(obj3, i4, i7);
        }
        return i2;
    }

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
    /* renamed from: a */
    static void m109164a(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    /* renamed from: a */
    static void m109165a(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
