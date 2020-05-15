package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: bhlj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhlj implements bhlk {

    /* renamed from: a */
    private final bhlk f118963a;

    /* renamed from: b */
    private final float f118964b;

    public bhlj(float f, bhlk bhlk) {
        while (bhlk instanceof bhlj) {
            bhlk = ((bhlj) bhlk).f118963a;
            f += ((bhlj) bhlk).f118964b;
        }
        this.f118963a = bhlk;
        this.f118964b = f;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    /* renamed from: a */
    public final float mo63930a(RectF rectF) {
        return Math.max(0.0f, this.f118963a.mo63930a(rectF) + this.f118964b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bhlj) {
            bhlj bhlj = (bhlj) obj;
            return this.f118963a.equals(bhlj.f118963a) && this.f118964b == bhlj.f118964b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f118963a, Float.valueOf(this.f118964b)});
    }
}
