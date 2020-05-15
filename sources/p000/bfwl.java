package p000;

import android.location.Location;
import com.google.android.gms.location.internal.ParcelableGeofence;

/* renamed from: bfwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfwl {

    /* renamed from: a */
    protected final ParcelableGeofence f115512a;

    /* renamed from: b */
    public byte f115513b = 0;

    /* renamed from: c */
    protected double f115514c = Double.MAX_VALUE;

    /* renamed from: d */
    private final double f115515d;

    /* renamed from: a */
    public final void mo62378a(Location location) {
        double d;
        ParcelableGeofence parcelableGeofence = this.f115512a;
        this.f115514c = ayuo.m84846b(parcelableGeofence.f79441d, parcelableGeofence.f79442e, location.getLatitude(), location.getLongitude());
        double max = Math.max(0.2d, (double) location.getAccuracy());
        double d2 = (double) this.f115512a.f79443f;
        double max2 = Math.max(max, d2);
        double min = Math.min(max, d2);
        double d3 = 3.141592653589793d * max * max;
        double d4 = this.f115514c;
        if (d4 >= max2 + min) {
            d = 0.0d;
        } else if (d4 > max2 - min) {
            double d5 = min * min;
            double d6 = d4 * d4;
            double d7 = max2 * max2;
            double d8 = d4 + d4;
            double d9 = d4 + min;
            d = ((Math.acos(((d6 + d5) - d7) / (d8 * min)) * d5) + (d7 * Math.acos(((d6 + d7) - d5) / (d8 * max2)))) - (Math.sqrt((((((-d4) + min) + max2) * (d9 - max2)) * ((d4 - min) + max2)) * (d9 + max2)) * 0.5d);
        } else {
            d = Math.min(d3, this.f115515d);
        }
        double d10 = d / d3;
        this.f115513b = d10 < 0.5d ? d10 < 1.0E-7d ? (byte) 2 : 4 : d10 >= ((this.f115512a.f79443f > 100.0f ? 1 : (this.f115512a.f79443f == 100.0f ? 0 : -1)) <= 0 ? 0.75d : 0.85d) ? (byte) 1 : 3;
    }

    public bfwl(ParcelableGeofence parcelableGeofence) {
        this.f115512a = parcelableGeofence;
        double d = (double) parcelableGeofence.f79443f;
        Double.isNaN(d);
        Double.isNaN(d);
        this.f115515d = 3.141592653589793d * d * d;
    }
}
