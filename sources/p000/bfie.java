package p000;

import android.net.wifi.RttManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bfie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfie implements RttManager.RttListener {

    /* renamed from: a */
    final /* synthetic */ bfii f114001a;

    public bfie(bfii bfii) {
        this.f114001a = bfii;
    }

    public final void onAborted() {
        bfii bfii = this.f114001a;
        bfii.f114005c.mo61722a(false);
        bfii.f114005c.mo61720a(bfii.f114004b, bfii.f114003a, (List) null);
    }

    public final void onFailure(int i, String str) {
        bfii bfii = this.f114001a;
        bfii.f114005c.mo61722a(false);
        bfii.f114005c.mo61720a(bfii.f114004b, bfii.f114003a, (List) null);
    }

    public final void onSuccess(RttManager.RttResult[] rttResultArr) {
        if (rttResultArr == null) {
            this.f114001a.mo61719a(Collections.emptyList());
        }
        int length = rttResultArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (RttManager.RttResult rttResult : rttResultArr) {
            if (rttResult != null && rttResult.status == 0) {
                bfnz bfnz = new bfnz();
                bfnz.f114529a = bupz.m120219a(rttResult.bssid);
                bfnz.f114533e = rttResult.distance;
                bfnz.f114534f = rttResult.distanceStandardDeviation;
                bfnz.f114532d = rttResult.rssi;
                bfnz.f114530b = rttResult.status;
                bfnz.f114531c = rttResult.ts;
                bfnz.f114535g = rttResult.measurementType;
                bfnz.f114536h = rttResult.measurementFrameNumber;
                bfnz.f114537i = rttResult.successMeasurementFrameNumber;
                arrayList.add(bfnz);
            }
        }
        this.f114001a.mo61719a(arrayList);
    }
}
