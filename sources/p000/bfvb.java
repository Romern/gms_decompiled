package p000;

import android.location.LocationListener;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.location.fused.providers.GpsPulseProviderController$StatePulse$AlarmListener;

/* renamed from: bfvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfvb extends bfuy {

    /* renamed from: c */
    public int f115386c;

    /* renamed from: d */
    public final /* synthetic */ bfvd f115387d;

    /* renamed from: e */
    private final LocationListener f115388e = new bfva(this, "location", "GpsPulseProviderController");

    /* renamed from: f */
    private final GpsPulseProviderController$StatePulse$AlarmListener f115389f = new GpsPulseProviderController$StatePulse$AlarmListener(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfvb(bfvd bfvd) {
        super(bfvd);
        this.f115387d = bfvd;
    }

    /* renamed from: a */
    public final void mo62296a() {
        this.f115386c = 0;
        bfvd bfvd = this.f115387d;
        bhbr bhbr = ((bfuz) bfvd).f115376a;
        LocationListener locationListener = this.f115388e;
        Looper looper = bfvd.f115379d.getLooper();
        bfvd bfvd2 = this.f115387d;
        bhbr.mo63534a("gps", 0, locationListener, looper, bfvd2.f115430w, bfvd2.f115431x);
        bfvd bfvd3 = this.f115387d;
        spf spf = bfvd3.f115394j;
        sqv sqv = bfvd3.f115395k;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bfvd bfvd4 = this.f115387d;
        int i = bfvd.f115392q;
        spf.mo25930a("com.google.android.location.GPS_PULSE_TIMEOUT_ALARM", 2, bfvd4.f115398n + elapsedRealtime, this.f115389f, bfvd4.f115379d, saq.m34797a(bfvd4.f115430w));
    }

    /* renamed from: b */
    public final void mo62297b() {
        this.f115387d.f115394j.mo25932a(this.f115389f);
        ((bfuz) this.f115387d).f115376a.mo63529a(this.f115388e);
    }

    /* renamed from: e */
    public final LocationListener mo62301e() {
        return this.f115388e;
    }

    public final String toString() {
        return "pulsing";
    }
}
