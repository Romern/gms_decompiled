package p000;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.location.WifiScan;

/* renamed from: bgcd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgcd {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    /* renamed from: a */
    public static final Location m98578a(bfnb bfnb) {
        WifiScan a;
        Location location = new Location("network");
        bfmz bfmz = bfnb.f114456a;
        bmxy.m108581a(bfmz);
        bmxy.m108581a(bfmz.f114449c);
        bfni bfni = bfmz.f114449c;
        location.setLatitude(ayuo.m84847b(bfni.f114480b));
        location.setLongitude(ayuo.m84847b(bfni.f114481c));
        location.setAccuracy(Math.max(1.0f, ((float) bfni.f114482d) / 1000.0f));
        location.setTime(bfmz.f114451e + bgof.m99492e());
        bgkx bgkx = bgkx.f116729g;
        location.setElapsedRealtimeNanos(bfmz.f114451e * 1000000);
        if (bfni.mo61981b()) {
            location.setAltitude((double) bfni.mo61986g());
        }
        Bundle bundle = new Bundle();
        if (bfni.mo61982c()) {
            float h = bfni.mo61987h();
            location.setVerticalAccuracyMeters(h);
            bundle.putFloat("verticalAccuracy", h);
        }
        bundle.putInt("nlpVersion", 2023);
        bfns bfns = bfnb.f114457b;
        if (bfns != null) {
            bfoa bfoa = bfns.f114509b;
            if (bfoa instanceof bfnv) {
                bfnv bfnv = (bfnv) bfoa;
                if (!cfas.m138548b()) {
                    bundle.putByteArray("wifiScan", bfnv.mo62010d(50));
                } else {
                    byte[] bArr = null;
                    if (!(bfnv == null || (a = bxbj.m122535a(bfnv)) == null)) {
                        bArr = sef.m35074a(a);
                    }
                    if (bArr != null) {
                        bundle.putByteArray("newWifiScan", bArr);
                    }
                }
            }
        }
        if (bfmz == bfnb.f114458c) {
            bundle.putString("networkLocationType", "cell");
            bundle.putInt("locationSubtype", ((bfml) bfmz).f114405a);
        } else if (bfmz == bfnb.f114457b) {
            bundle.putString("networkLocationType", "wifi");
            bundle.putInt("locationSubtype", ((bfns) bfmz).f114508a);
            bfns bfns2 = bfnb.f114457b;
            if (bfns2 != null) {
                bfni bfni2 = bfns2.f114449c;
                bmxy.m108581a(bfni2);
                if (bfni2.mo61983d()) {
                    bundle.putString("levelId", bfni2.mo61988i());
                }
                if (bfni2.mo61984e()) {
                    bundle.putInt("levelNumberE3", bfni2.mo61989j());
                }
                if (cewj.m138359b() && bfni2.mo61985f()) {
                    bundle.putString("floorLabel", bfni2.mo61990k());
                }
            }
        }
        location.setExtras(bundle);
        return location;
    }
}
