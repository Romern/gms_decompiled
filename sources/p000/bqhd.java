package p000;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: bqhd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqhd extends bqfk {

    /* renamed from: a */
    public bqgg f140656a;

    /* renamed from: b */
    public ScheduledFuture f140657b;

    public bqhd(bqgg bqgg) {
        bmxy.m108581a(bqgg);
        this.f140656a = bqgg;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bc */
    public final void mo19850bc() {
        mo69135a((Future) this.f140656a);
        ScheduledFuture scheduledFuture = this.f140657b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f140656a = null;
        this.f140657b = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bi */
    public final String mo60815bi() {
        bqgg bqgg = this.f140656a;
        ScheduledFuture scheduledFuture = this.f140657b;
        if (bqgg == null) {
            return null;
        }
        String valueOf = String.valueOf(bqgg);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("inputFuture=[");
        sb.append(valueOf);
        sb.append("]");
        String sb2 = sb.toString();
        if (scheduledFuture == null) {
            return sb2;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return sb2;
        }
        String valueOf2 = String.valueOf(sb2);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 43);
        sb3.append(valueOf2);
        sb3.append(", remaining delay=[");
        sb3.append(delay);
        sb3.append(" ms]");
        return sb3.toString();
    }
}
