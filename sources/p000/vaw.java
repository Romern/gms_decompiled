package p000;

import java.util.Arrays;

/* renamed from: vaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vaw {

    /* renamed from: a */
    public final long[] f48891a;

    /* renamed from: b */
    private int f48892b = 0;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.fill(long[], long):void}
     arg types: [long[], int]
     candidates:
      ClspMth{java.util.Arrays.fill(double[], double):void}
      ClspMth{java.util.Arrays.fill(byte[], byte):void}
      ClspMth{java.util.Arrays.fill(boolean[], boolean):void}
      ClspMth{java.util.Arrays.fill(char[], char):void}
      ClspMth{java.util.Arrays.fill(short[], short):void}
      ClspMth{java.util.Arrays.fill(java.lang.Object[], java.lang.Object):void}
      ClspMth{java.util.Arrays.fill(int[], int):void}
      ClspMth{java.util.Arrays.fill(float[], float):void}
      ClspMth{java.util.Arrays.fill(long[], long):void} */
    public vaw() {
        long[] jArr = new long[2];
        this.f48891a = jArr;
        Arrays.fill(jArr, 0L);
    }

    /* renamed from: a */
    public final long mo28183a(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f48891a.length) {
            z = true;
        }
        sdo.m34975b(z, "Offset is out ot bounds");
        int i2 = this.f48892b - i;
        if (i2 < 0) {
            i2 += this.f48891a.length;
        }
        return this.f48891a[i2];
    }

    /* renamed from: a */
    public final void mo28184a(long j) {
        int i = this.f48892b + 1;
        this.f48892b = i;
        long[] jArr = this.f48891a;
        if (i >= jArr.length) {
            this.f48892b = 0;
            i = 0;
        }
        long j2 = jArr[i];
        jArr[i] = j;
    }
}
