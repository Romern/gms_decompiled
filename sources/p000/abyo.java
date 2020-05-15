package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: abyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abyo {

    /* renamed from: a */
    private long f58743a = 0;

    /* renamed from: b */
    private float f58744b = abyp.f58745a.nextFloat();

    /* renamed from: a */
    public final synchronized boolean mo32455a(float f, long j, TimeUnit timeUnit) {
        boolean z;
        long millis = timeUnit.toMillis(j);
        long currentTimeMillis = System.currentTimeMillis();
        float f2 = this.f58744b - f;
        this.f58744b = f2;
        if (currentTimeMillis - this.f58743a < millis || f2 >= 0.0f) {
            z = false;
        } else {
            this.f58743a = currentTimeMillis;
            this.f58744b = f2 + 1.0f;
            z = true;
        }
        return z;
    }
}
