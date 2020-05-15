package p000;

import android.hardware.GeomagneticField;
import android.location.Location;

/* renamed from: btvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btvm {

    /* renamed from: a */
    private Location f152620a = null;

    /* renamed from: a */
    public final btwc mo72443a(Location location) {
        if (location == null) {
            return null;
        }
        Location location2 = this.f152620a;
        if (location2 != null && location2.distanceTo(location) < 100000.0f) {
            return null;
        }
        GeomagneticField geomagneticField = new GeomagneticField((float) location.getLatitude(), (float) location.getLongitude(), (float) location.getAltitude(), location.getTime());
        bxvd da = btwc.f152687b.mo74144da();
        bxvd da2 = btwf.f152696d.mo74144da();
        double radians = Math.toRadians((double) geomagneticField.getDeclination());
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((btwf) da2.f164949b).f152700c = radians;
        double radians2 = Math.toRadians((double) geomagneticField.getInclination());
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((btwf) da2.f164949b).f152699b = radians2;
        double fieldStrength = (double) geomagneticField.getFieldStrength();
        Double.isNaN(fieldStrength);
        double d = fieldStrength * 0.001d;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((btwf) da2.f164949b).f152698a = d;
        btwf btwf = (btwf) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btwf.getClass();
        ((btwc) da.f164949b).f152689a = btwf;
        btwc btwc = (btwc) da.mo74062i();
        this.f152620a = location;
        return btwc;
    }
}
