package p000;

import java.util.Arrays;

/* renamed from: bnwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnwo {

    /* renamed from: a */
    private int f132315a = 0;

    /* renamed from: b */
    private final int[] f132316b;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.String, int):void
     arg types: [int, java.lang.String, int]
     candidates:
      bmxy.a(int, int, java.lang.String):java.lang.String
      bmxy.a(int, int, int):void
      bmxy.a(java.lang.Object, java.lang.String, int):void
      bmxy.a(java.lang.Object, java.lang.String, java.lang.Object):void
      bmxy.a(boolean, java.lang.String, char):void
      bmxy.a(boolean, java.lang.String, long):void
      bmxy.a(boolean, java.lang.String, java.lang.Object):void
      bmxy.a(boolean, java.lang.String, int):void */
    public bnwo() {
        bmxy.m108591a(true, "Unsupported N: %s", 2);
        int[] iArr = new int[10];
        this.f132316b = iArr;
        Arrays.fill(iArr, 0, 2, 0);
    }

    /* renamed from: a */
    public final int mo68671a(int i) {
        int i2 = this.f132315a;
        if (i2 < 2) {
            i2++;
            this.f132315a = i2;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            int[] iArr = this.f132316b;
            i += iArr[i3];
            iArr[i3] = i;
        }
        return i;
    }
}
