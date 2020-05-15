package p000;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: ymt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ymt {

    /* renamed from: a */
    public final float f54114a;

    /* renamed from: b */
    private final float[] f54115b;

    /* renamed from: c */
    private final float f54116c;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.fill(float[], float):void}
     arg types: [float[], int]
     candidates:
      ClspMth{java.util.Arrays.fill(double[], double):void}
      ClspMth{java.util.Arrays.fill(byte[], byte):void}
      ClspMth{java.util.Arrays.fill(long[], long):void}
      ClspMth{java.util.Arrays.fill(boolean[], boolean):void}
      ClspMth{java.util.Arrays.fill(char[], char):void}
      ClspMth{java.util.Arrays.fill(short[], short):void}
      ClspMth{java.util.Arrays.fill(java.lang.Object[], java.lang.Object):void}
      ClspMth{java.util.Arrays.fill(int[], int):void}
      ClspMth{java.util.Arrays.fill(float[], float):void} */
    public ymt(Map map, float f, float f2) {
        float[] fArr = new float[123];
        Arrays.fill(fArr, Float.NaN);
        for (Map.Entry entry : map.entrySet()) {
            fArr[((Integer) entry.getKey()).intValue()] = ((Float) entry.getValue()).floatValue();
        }
        this.f54115b = fArr;
        this.f54116c = f;
        this.f54114a = f2;
    }

    /* renamed from: a */
    public static float m44386a(long j) {
        return ((float) j) / ((float) TimeUnit.DAYS.toNanos(1));
    }

    /* renamed from: a */
    public final float mo30610a(float f, float f2, float f3) {
        return (((f * 10.0f) + (f2 * 6.25f)) - (f3 * 5.0f)) + this.f54116c;
    }

    /* renamed from: a */
    public final float mo30611a(int i) {
        float[] fArr = this.f54115b;
        if (i >= fArr.length || Float.isNaN(fArr[i])) {
            return 1.0f;
        }
        return this.f54115b[i];
    }
}
