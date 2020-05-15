package p000;

import android.os.SystemClock;
import com.google.android.location.fused.providers.GpsPulseProviderController$StatePulseWait$AlarmListener;

/* renamed from: bfvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfvc extends bfuy {

    /* renamed from: c */
    public final /* synthetic */ bfvd f115390c;

    /* renamed from: d */
    private final GpsPulseProviderController$StatePulseWait$AlarmListener f115391d = new GpsPulseProviderController$StatePulseWait$AlarmListener(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected bfvc(bfvd bfvd) {
        super(bfvd);
        this.f115390c = bfvd;
    }

    /* renamed from: a */
    public final void mo62296a() {
        long j;
        sqv sqv = this.f115390c.f115395k;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bfvd bfvd = this.f115390c;
        long j2 = elapsedRealtime + bfvd.f115402r;
        if (j2 < 0) {
            j = Long.MAX_VALUE;
        } else {
            j = j2;
        }
        bfvd.f115394j.mo25930a("com.google.android.location.GPS_PULSE_ALARM", 2, j, this.f115391d, bfvd.f115379d, saq.m34797a(bfvd.f115430w));
    }

    /* renamed from: b */
    public final void mo62297b() {
        this.f115390c.f115394j.mo25932a(this.f115391d);
    }

    public final String toString() {
        return "waiting_to_pulse";
    }
}
