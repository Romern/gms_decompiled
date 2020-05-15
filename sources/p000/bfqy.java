package p000;

import android.location.Location;
import android.os.Build;
import android.util.Log;

/* renamed from: bfqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfqy {
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009e  */
    /* renamed from: a */
    public static Location m97595a(bsbl bsbl, String str, long j, long j2) {
        String str2;
        String str3;
        if (bsbl == null) {
            return null;
        }
        Location location = new Location(str);
        location.setAccuracy(((float) bsbl.f143968d) / 1000.0f);
        if (bsbl.mo70199l()) {
            location.setBearing(bsbl.f143976l);
        }
        int i = Build.VERSION.SDK_INT;
        if (bsbl.mo70200m()) {
            location.setBearingAccuracyDegrees(bsbl.f143977m);
        }
        if (bsbl.mo70196i()) {
            location.setSpeedAccuracyMetersPerSecond(bsbl.f143970f);
        }
        if (bsbl.mo70194h()) {
            location.setSpeed(bsbl.f143969e);
        }
        if (bsbl.mo70197j()) {
            location.setAltitude(bsbl.f143971g);
        }
        double d = (double) bsbl.f143966b;
        Double.isNaN(d);
        location.setLatitude(d / 1.0E7d);
        double d2 = (double) bsbl.f143967c;
        Double.isNaN(d2);
        location.setLongitude(d2 / 1.0E7d);
        location.setTime(j);
        int i2 = Build.VERSION.SDK_INT;
        location.setElapsedRealtimeNanos(j2);
        bsbk bsbk = bsbk.GPS;
        int ordinal = bsbl.f143965a.ordinal();
        int i3 = 3;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i3 = 2;
                } else if (ordinal != 3) {
                    i3 = 0;
                }
            }
            aeim.m51886a(location, i3);
            if (bsbl.mo70198k()) {
                aeim.m51885a(location, (float) bsbl.f143972h);
            }
            str2 = bsbl.f143975k;
            if (str2 != null) {
                aeim.m51896c(location, str2);
            }
            str3 = bsbl.f143973i;
            if (str3 != null) {
                aeim.m51894b(location, str3);
            }
            return location;
        }
        i3 = 1;
        aeim.m51886a(location, i3);
        if (bsbl.mo70198k()) {
        }
        str2 = bsbl.f143975k;
        if (str2 != null) {
        }
        str3 = bsbl.f143973i;
        if (str3 != null) {
        }
        return location;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b1  */
    /* renamed from: a */
    public static Location m97596a(bsbl bsbl, String str, bfqx bfqx, long j, long j2) {
        String str2;
        if (bsbl == null) {
            return null;
        }
        Location location = new Location(str);
        location.setAccuracy(((float) bsbl.f143968d) / 1000.0f);
        if (bsbl.mo70199l()) {
            location.setBearing(bsbl.f143976l);
        }
        int i = Build.VERSION.SDK_INT;
        if (bsbl.mo70200m()) {
            location.setBearingAccuracyDegrees(bsbl.f143977m);
        }
        if (bsbl.mo70196i()) {
            location.setSpeedAccuracyMetersPerSecond(bsbl.f143970f);
        }
        if (bsbl.mo70194h()) {
            location.setSpeed(bsbl.f143969e);
        }
        if (bsbl.mo70197j()) {
            location.setAltitude(bsbl.f143971g);
        }
        double d = (double) bsbl.f143966b;
        Double.isNaN(d);
        location.setLatitude(d / 1.0E7d);
        double d2 = (double) bsbl.f143967c;
        Double.isNaN(d2);
        location.setLongitude(d2 / 1.0E7d);
        location.setTime(j);
        int i2 = Build.VERSION.SDK_INT;
        location.setElapsedRealtimeNanos(j2);
        if (bfqx != null) {
            String str3 = bfqx.f114958a;
            if (str3 != null) {
                aeim.m51894b(location, str3);
            }
            if (bfqx.f114961d) {
                aeim.m51889a(location, Integer.valueOf(bfqx.f114960c));
            }
            if (cewj.m138359b() && (str2 = bfqx.f114959b) != null) {
                aeim.m51896c(location, str2);
            }
        }
        bsbk bsbk = bsbk.GPS;
        int ordinal = bsbl.f143965a.ordinal();
        int i3 = 3;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i3 = 2;
                } else if (ordinal != 3) {
                    i3 = 0;
                }
            }
            aeim.m51886a(location, i3);
            if (bsbl.mo70198k()) {
                aeim.m51885a(location, (float) bsbl.f143972h);
            }
            return location;
        }
        i3 = 1;
        aeim.m51886a(location, i3);
        if (bsbl.mo70198k()) {
        }
        return location;
    }

    /* renamed from: a */
    public static bsbl m97597a(Location location, boolean z) {
        if (location == null) {
            return null;
        }
        bsbk bsbk = bsbk.UNKNOWN;
        String provider = location.getProvider();
        if ("gps".equals(provider)) {
            bsbk = bsbk.GPS;
        } else if ("network".equals(provider)) {
            String a = bxbh.m122519a(location);
            if ("cell".equals(a)) {
                bsbk = bsbk.CELL;
            } else if (!"wifi".equals(a)) {
                String valueOf = String.valueOf(a);
                Log.w("GCoreFlp", valueOf.length() == 0 ? new String("Network provider location has an unexpected type ") : "Network provider location has an unexpected type ".concat(valueOf));
            } else {
                bsbk = bsbk.WIFI;
            }
        } else if ("gps_injected".equals(provider)) {
            bsbk = bsbk.GPS_INJECTED;
        }
        bsbj o = bsbl.m115064o();
        o.mo70176a(location.getLatitude(), location.getLongitude(), Math.round(location.getAccuracy() * 1000.0f));
        o.mo70179a(bsbk);
        if (location.hasBearing()) {
            o.mo70182b((float) ((int) location.getBearing()));
        }
        int i = Build.VERSION.SDK_INT;
        if (location.hasBearingAccuracy()) {
            o.mo70177a(location.getBearingAccuracyDegrees());
        }
        if (location.hasSpeedAccuracy()) {
            o.mo70183c(location.getSpeedAccuracyMetersPerSecond());
        }
        if (location.hasAltitude()) {
            o.mo70175a(location.getAltitude());
        }
        if (location.hasSpeed()) {
            o.mo70184d(location.getSpeed());
        }
        if (aeim.m51904h(location)) {
            o.mo70181b((double) aeim.m51905i(location));
        } else if (location.hasAltitude() && bsbk == bsbk.GPS) {
            float accuracy = location.getAccuracy();
            o.mo70181b((double) (accuracy + accuracy));
        }
        if (aeim.m51903g(location)) {
            o.mo70180a(aeim.m51902f(location));
        }
        if (z && aeim.m51897c(location)) {
            o.f143952k = aeim.m51893b(location);
        }
        return o.mo70174a();
    }
}
