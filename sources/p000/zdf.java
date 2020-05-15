package p000;

import com.google.android.gms.fitness.request.SensorRegistrationRequest;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: zdf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class zdf {

    /* renamed from: b */
    private static final bnic f54937b = bnic.m109492a(bzzn.f172069I, bzzn.f172102ao, bzzn.f172131y, bzzn.f172129w);

    /* renamed from: a */
    public final long f54938a;

    /* renamed from: c */
    private final long f54939c;

    /* renamed from: d */
    private boolean f54940d = false;

    /* renamed from: e */
    private long f54941e = 0;

    static {
        zvt.m46581a();
    }

    public zdf(SensorRegistrationRequest sensorRegistrationRequest) {
        this.f54939c = TimeUnit.MICROSECONDS.toNanos(sensorRegistrationRequest.f32280g);
        long j = sensorRegistrationRequest.f32282i;
        this.f54938a = j != Long.MAX_VALUE ? TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis()) + TimeUnit.MICROSECONDS.toNanos(j) : Long.MAX_VALUE;
    }

    /* renamed from: a */
    public static zdf m45311a(SensorRegistrationRequest sensorRegistrationRequest) {
        if (!f54937b.contains(ywb.m44930a(sensorRegistrationRequest.mo19062a()))) {
            return new zde(sensorRegistrationRequest);
        }
        return new zdd(sensorRegistrationRequest);
    }

    /* renamed from: a */
    public abstract List mo30945a(List list);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo30946a(long j) {
        return this.f54940d && j - this.f54941e < this.f54939c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo30947b(long j) {
        this.f54940d = true;
        this.f54941e = j;
    }
}
