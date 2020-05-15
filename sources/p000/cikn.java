package p000;

import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: cikn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cikn {

    /* renamed from: a */
    public byte[][] f190532a;

    /* renamed from: b */
    public int f190533b;

    /* renamed from: c */
    public boolean f190534c;

    /* renamed from: d */
    public byte[] f190535d;

    /* renamed from: e */
    public byte[] f190536e;

    /* renamed from: f */
    public byte[] f190537f;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.fill(char[], char):void}
     arg types: [char[], int]
     candidates:
      ClspMth{java.util.Arrays.fill(double[], double):void}
      ClspMth{java.util.Arrays.fill(byte[], byte):void}
      ClspMth{java.util.Arrays.fill(long[], long):void}
      ClspMth{java.util.Arrays.fill(boolean[], boolean):void}
      ClspMth{java.util.Arrays.fill(short[], short):void}
      ClspMth{java.util.Arrays.fill(java.lang.Object[], java.lang.Object):void}
      ClspMth{java.util.Arrays.fill(int[], int):void}
      ClspMth{java.util.Arrays.fill(float[], float):void}
      ClspMth{java.util.Arrays.fill(char[], char):void} */
    /* renamed from: a */
    static final String m150523a(byte[] bArr, int i, int i2) {
        int i3 = (i2 - i) + 1;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        String bigInteger = new BigInteger(1, bArr2).toString(16);
        char[] cArr = new char[((i3 + i3) - bigInteger.length())];
        Arrays.fill(cArr, '0');
        return new String(cArr).concat(bigInteger);
    }

    /* renamed from: b */
    static final int m150524b(byte[] bArr, int i, int i2) {
        return Integer.parseInt(m150523a(bArr, i, i2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo86214a() {
        return this.f190533b == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final byte[] mo86215a(int i) {
        return this.f190532a[i];
    }
}
