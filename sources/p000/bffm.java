package p000;

import android.hardware.GeomagneticField;
import android.location.Location;
import android.os.SystemClock;

/* renamed from: bffm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bffm extends adzy {

    /* renamed from: a */
    final /* synthetic */ bffp f113695a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bffm(bffp bffp, String str, String str2) {
        super(str, str2);
        this.f113695a = bffp;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9927a(Location location) {
        bffp bffp = this.f113695a;
        bffp.f113807j.mo61864a();
        if (bffp.f113700b && !bffp.mo61674i() && !bfkm.m97133a(location)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            bfev bfev = bffp.f113805h;
            bmxy.m108581a(location);
            bfev.f113606a.mo61594a(location, elapsedRealtime);
            bffp.mo61672a(bfgt.f113817g, elapsedRealtime, null);
            if (!bffp.f113699a) {
                bffp.f113699a = true;
                GeomagneticField geomagneticField = new GeomagneticField((float) location.getLatitude(), (float) location.getLongitude(), (float) location.getAltitude(), System.currentTimeMillis());
                bfev bfev2 = bffp.f113805h;
                bfev2.f113606a.mo61580a(geomagneticField.getX(), geomagneticField.getY(), geomagneticField.getZ(), geomagneticField.getDeclination());
            }
        }
    }
}
