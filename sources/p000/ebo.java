package p000;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: ebo */
final /* synthetic */ class ebo implements Runnable {

    /* renamed from: a */
    private final ebr f14610a;

    /* renamed from: b */
    private final GpsStatus f14611b;

    public ebo(ebr ebr, GpsStatus gpsStatus) {
        this.f14610a = ebr;
        this.f14611b = gpsStatus;
    }

    public final void run() {
        ebr ebr = this.f14610a;
        GpsStatus gpsStatus = this.f14611b;
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (gpsStatus != null) {
            ecc ecc = new ecc();
            for (GpsSatellite gpsSatellite : gpsStatus.getSatellites()) {
                int prn = gpsSatellite.getPrn();
                float snr = gpsSatellite.getSnr();
                boolean usedInFix = gpsSatellite.usedInFix();
                if (prn > 0 && prn <= 31) {
                    ecc.f14664a.add(Float.valueOf(snr));
                    if (usedInFix) {
                        ecc.f14665b++;
                    }
                }
            }
            List list = ecc.f14664a;
            Float valueOf = Float.valueOf(-5.0f);
            ArrayList arrayList = new ArrayList(list);
            Collections.sort(arrayList, Collections.reverseOrder());
            ecb ecb = new ecb(nanos, ece.m10100a(arrayList, valueOf), ecc.f14665b);
            if (ecb.f14662b.isEmpty() || ((Float) ecb.f14662b.get(0)).floatValue() != 0.0f) {
                ebr.f14617d = 0;
            } else {
                int i = ebr.f14617d + 1;
                ebr.f14617d = i;
                if (i <= 4) {
                    return;
                }
            }
            ebr.f14616c = ecb;
            ebu ebu = ebr.f14619f;
            ecb ecb2 = ebr.f14616c;
            ebu.f14626a.mo9930a();
            return;
        }
        Log.e("IndoorOutdoorPredictor", "", new IllegalStateException("Null scan results found inside onGpsStatusChanged()"));
    }
}
