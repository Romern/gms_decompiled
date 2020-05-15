package p000;

import android.os.SystemClock;
import java.util.Random;

/* renamed from: bdqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdqa {

    /* renamed from: a */
    private final float f106246a;

    /* renamed from: b */
    private final Random f106247b;

    private bdqa(float f, Random random) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        bmxy.m108589a(z, "Sampling rate should be a floating number >= 0 and <= 1.");
        this.f106246a = f;
        this.f106247b = random;
    }

    /* renamed from: a */
    public static bdqa m91274a(float f) {
        return new bdqa(f, new Random(SystemClock.elapsedRealtime()));
    }

    /* renamed from: a */
    public final boolean mo58289a() {
        return this.f106247b.nextFloat() < this.f106246a;
    }
}
