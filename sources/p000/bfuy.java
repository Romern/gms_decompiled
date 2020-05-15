package p000;

import android.location.LocationListener;
import android.os.Looper;

/* renamed from: bfuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bfuy extends bfuv {

    /* renamed from: b */
    final /* synthetic */ bfuz f115374b;

    /* renamed from: c */
    private final LocationListener f115375c = new bfux(this, "location", "GpsProviderController");

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfuy(bfuz bfuz) {
        super(bfuz);
        this.f115374b = bfuz;
    }

    /* renamed from: a */
    public void mo62296a() {
        bfuz bfuz = this.f115374b;
        bhbr bhbr = bfuz.f115376a;
        long j = bfuz.f115402r;
        LocationListener e = mo62301e();
        Looper looper = this.f115374b.f115379d.getLooper();
        bfuz bfuz2 = this.f115374b;
        bhbr.mo63534a("gps", j, e, looper, bfuz2.f115430w, bfuz2.f115431x);
    }

    /* renamed from: b */
    public void mo62297b() {
        this.f115374b.f115376a.mo63529a(mo62301e());
    }

    /* renamed from: c */
    public final void mo62298c() {
        mo62296a();
    }

    /* renamed from: e */
    public LocationListener mo62301e() {
        return this.f115375c;
    }

    public String toString() {
        return "on";
    }
}
