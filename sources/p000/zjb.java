package p000;

import com.google.android.gms.fitness.sensors.derived.SoftStepCounter;

/* renamed from: zjb */
public final /* synthetic */ class zjb implements Runnable {

    /* renamed from: a */
    private final SoftStepCounter f55188a;

    /* renamed from: b */
    private final bfku f55189b;

    /* renamed from: c */
    private final zje f55190c;

    /* renamed from: d */
    private final zgg f55191d;

    public zjb(SoftStepCounter softStepCounter, bfku bfku, zje zje, zgg zgg) {
        this.f55188a = softStepCounter;
        this.f55189b = bfku;
        this.f55190c = zje;
        this.f55191d = zgg;
    }

    public final void run() {
        zje zje;
        SoftStepCounter softStepCounter = this.f55188a;
        bfku bfku = this.f55189b;
        zje zje2 = this.f55190c;
        zgg zgg = this.f55191d;
        long a = bfku.mo61857a(bfku.f114316b - 1);
        zjc zjc = new zjc();
        softStepCounter.f32375d.f62924a = zjc;
        int i = 0;
        long a2 = bfku.mo61857a(0);
        int i2 = bfku.f114316b;
        long j = a2;
        int i3 = 0;
        while (i3 < i2) {
            float a3 = bfku.mo61854a(i3, i);
            float a4 = bfku.mo61854a(i3, 1);
            float a5 = bfku.mo61854a(i3, 2);
            long a6 = bfku.mo61857a(i3);
            j = Math.max(j, a6);
            softStepCounter.f32375d.mo33941a(a6, a3, a4, a5);
            i3++;
            a2 = a2;
            i = 0;
        }
        zje zje3 = new zje(SoftStepCounter.m23740b(), j - a2, zjc.f55192a);
        zjd zjd = softStepCounter.f32372a;
        zjd.f55193a = zje3;
        zjd.f55194b.add(zje3);
        long currentTimeMillis = System.currentTimeMillis();
        if (zje2 != null) {
            long j2 = softStepCounter.f32373b.get();
            long j3 = j2 + j2;
            long j4 = zje3.f55195a - zje3.f55196b;
            long j5 = j4 - zje2.f55195a;
            if (j5 > j3) {
                j5 = j3;
            }
            double d = (double) j5;
            Double.isNaN(d);
            zje zje4 = new zje(j4, j5, (int) (((zje2.mo31165a() + zje3.mo31165a()) / 2.0d) * d));
            int i4 = zje4.f55197c;
            if (i4 > 0) {
                softStepCounter.f32374c.addAndGet(i4);
                zje = zje3;
                softStepCounter.mo19157a(zgg, zje4.f55195a, currentTimeMillis, a);
            } else {
                zje = zje3;
            }
        } else {
            zje = zje3;
        }
        int i5 = zje.f55197c;
        if (i5 > 0) {
            softStepCounter.f32374c.addAndGet(i5);
            softStepCounter.mo19157a(zgg, zje.f55195a, currentTimeMillis, a);
        }
    }
}
