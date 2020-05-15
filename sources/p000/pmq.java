package p000;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;

/* renamed from: pmq */
final /* synthetic */ class pmq implements Runnable {

    /* renamed from: a */
    private final pmt f39732a;

    /* renamed from: b */
    private final String f39733b;

    public pmq(pmt pmt, String str) {
        this.f39732a = pmt;
        this.f39733b = str;
    }

    public final void run() {
        boolean z;
        pmt pmt = this.f39732a;
        String str = this.f39733b;
        pmt.f39640e.mo23670a("mdnsGoodbyeMessageReceived: %s", str);
        pmu pmu = (pmu) pmt.f39739a.remove(str);
        if (pmu != null) {
            pmt.f39640e.mo23857a("Removed (%s) %s", pmu.f39748a, pmu.f39749b);
            CastDevice castDevice = pmu.f39749b;
            if (castDevice != null) {
                for (pmu pmu2 : pmt.f39739a.values()) {
                    CastDevice castDevice2 = pmu2.f39749b;
                    if (castDevice2 != null) {
                        if (!TextUtils.isEmpty(castDevice.mo17494a()) && !castDevice.mo17494a().startsWith("__cast_ble__") && !TextUtils.isEmpty(castDevice2.mo17494a()) && !castDevice2.mo17494a().startsWith("__cast_ble__")) {
                            z = ptk.m31236a(castDevice.mo17494a(), castDevice2.mo17494a());
                        } else if (!TextUtils.isEmpty(castDevice.f29725m) && !TextUtils.isEmpty(castDevice2.f29725m)) {
                            z = ptk.m31236a(castDevice.f29725m, castDevice2.f29725m);
                        }
                        if (z) {
                            pmt.f39640e.mo23670a("Another entry exists for this device. Not notifying offline: %s", castDevice);
                            return;
                        }
                    }
                }
                pmt.f39640e.mo23861b("notifyDeviceOffline: because it said goodbye");
                pmt.mo23434a(castDevice);
            }
        }
    }
}
