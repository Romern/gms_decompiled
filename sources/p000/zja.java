package p000;

import com.google.android.gms.fitness.sensors.derived.SoftStepCounter;
import java.util.concurrent.TimeUnit;

/* renamed from: zja */
public final /* synthetic */ class zja implements Runnable {

    /* renamed from: a */
    private final SoftStepCounter f55186a;

    /* renamed from: b */
    private final zgg f55187b;

    public zja(SoftStepCounter softStepCounter, zgg zgg) {
        this.f55186a = softStepCounter;
        this.f55187b = zgg;
    }

    public final void run() {
        SoftStepCounter softStepCounter = this.f55186a;
        zgg zgg = this.f55187b;
        long currentTimeMillis = System.currentTimeMillis();
        softStepCounter.mo19157a(zgg, TimeUnit.MILLISECONDS.toNanos(currentTimeMillis), currentTimeMillis, 0);
    }
}
