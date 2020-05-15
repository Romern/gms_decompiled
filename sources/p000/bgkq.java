package p000;

import android.net.MacAddress;
import android.net.wifi.RttManager;
import android.net.wifi.rtt.RangingResult;
import android.net.wifi.rtt.RangingResultCallback;
import java.util.Iterator;
import java.util.List;

/* renamed from: bgkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgkq extends RangingResultCallback {

    /* renamed from: a */
    private final RttManager.RttListener f116714a;

    /* renamed from: b */
    private final bfor f116715b;

    public bgkq(RttManager.RttListener rttListener, bfor bfor) {
        this.f116714a = rttListener;
        this.f116715b = bfor;
    }

    /* renamed from: a */
    private final void m99209a(RttManager.RttResult[] rttResultArr) {
        this.f116714a.onSuccess(rttResultArr);
    }

    public final void onRangingFailure(int i) {
        m99209a(new RttManager.RttResult[0]);
    }

    public final void onRangingResults(List list) {
        byte[] byteArray;
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((RangingResult) it.next()).getStatus() == 0) {
                i++;
            }
        }
        RttManager.RttResult[] rttResultArr = new RttManager.RttResult[i];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            RangingResult rangingResult = (RangingResult) it2.next();
            if (rangingResult.getStatus() == 0) {
                MacAddress macAddress = rangingResult.getMacAddress();
                bmxy.m108581a(macAddress);
                RttManager.RttResult rttResult = new RttManager.RttResult();
                rttResult.bssid = macAddress.toString();
                rttResult.measurementFrameNumber = rangingResult.getNumAttemptedMeasurements();
                rttResult.successMeasurementFrameNumber = rangingResult.getNumSuccessfulMeasurements();
                rttResult.distance = rangingResult.getDistanceMm() / 10;
                rttResult.distanceStandardDeviation = rangingResult.getDistanceStdDevMm() / 10;
                rttResult.rssi = rangingResult.getRssi();
                rttResult.status = rangingResult.getStatus();
                rttResult.measurementType = 2;
                bfor bfor = this.f116715b;
                long j = 0;
                for (byte b : macAddress.toByteArray()) {
                    j = (j << 8) + ((long) (b & 255));
                }
                bfor.mo62047a(new bfoq(bfos.RTT_SCAN_ENTRY, bfor.mo62055b(), "a0=%2$d, a1=%3$d, a2=%4$d", null, (int) j, ((int) (j >>> 32)) | (rttResult.distance << 16), (rttResult.rssi & 255) | (((rttResult.distanceStandardDeviation / 8) << 8) & 65280) | ((rttResult.successMeasurementFrameNumber << 16) & 16711680)));
                rttResult.ts = rangingResult.getRangingTimestampMillis() * 1000;
                i--;
                rttResultArr[i] = rttResult;
            }
        }
        m99209a(rttResultArr);
    }
}
