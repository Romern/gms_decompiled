package p000;

import java.util.Arrays;
import java.util.BitSet;

/* renamed from: bezh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bezh {

    /* renamed from: a */
    final bezk f113136a;

    /* renamed from: b */
    final double f113137b;

    /* renamed from: c */
    final double f113138c;

    /* renamed from: d */
    public final int f113139d;

    /* renamed from: e */
    public final int f113140e;

    /* renamed from: f */
    final double f113141f;

    /* renamed from: g */
    public BitSet f113142g;

    /* renamed from: h */
    public BitSet f113143h;

    /* renamed from: i */
    public short[] f113144i;

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
    public bezh(bezk bezk, double d, double d2, int i, int i2, double d3) {
        this.f113136a = bezk;
        this.f113137b = d;
        this.f113138c = d2;
        this.f113139d = i;
        this.f113140e = i2;
        this.f113141f = d3;
        int i3 = i * i2;
        this.f113142g = new BitSet(i3);
        this.f113143h = new BitSet(i3);
        short[] sArr = new short[i3];
        this.f113144i = sArr;
        Arrays.fill(sArr, (short) -23575);
    }
}
