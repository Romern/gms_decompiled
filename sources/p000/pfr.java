package p000;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.DeviceStatus;

/* renamed from: pfr */
final /* synthetic */ class pfr implements Runnable {

    /* renamed from: a */
    private final pfu f39040a;

    /* renamed from: b */
    private final DeviceStatus f39041b;

    public pfr(pfu pfu, DeviceStatus deviceStatus) {
        this.f39040a = pfu;
        this.f39041b = deviceStatus;
    }

    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        pfu pfu = this.f39040a;
        DeviceStatus deviceStatus = this.f39041b;
        pfv pfv = pfu.f39047a;
        ptx ptx = pfv.f39050a;
        ApplicationMetadata applicationMetadata = deviceStatus.f29891d;
        if (!ptk.m31236a(applicationMetadata, pfv.f39060j)) {
            pfv.f39060j = applicationMetadata;
            pfv.f39070t.mo22973a(pfv.f39060j);
        }
        double d = deviceStatus.f29888a;
        if (Double.isNaN(d) || Math.abs(d - pfv.f39062l) <= 1.0E-7d) {
            z = false;
        } else {
            pfv.f39062l = d;
            z = true;
        }
        boolean z4 = deviceStatus.f29889b;
        if (z4 != pfv.f39063m) {
            pfv.f39063m = z4;
            z = true;
        }
        pfv.f39050a.mo23670a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(pfv.f39054d));
        pel pel = pfv.f39070t;
        if (pel != null && (z || pfv.f39054d)) {
            pel.mo22972a();
        }
        Double.isNaN(deviceStatus.f29894g);
        int i = deviceStatus.f29890c;
        if (i != pfv.f39064n) {
            pfv.f39064n = i;
            z2 = true;
        } else {
            z2 = false;
        }
        pfv.f39050a.mo23670a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(pfv.f39054d));
        int i2 = deviceStatus.f29892e;
        if (i2 != pfv.f39065o) {
            pfv.f39065o = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        pfv.f39050a.mo23670a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(pfv.f39054d));
        if (!ptk.m31236a(pfv.f39066p, deviceStatus.f29893f)) {
            pfv.f39066p = deviceStatus.f29893f;
        }
        pfv.f39054d = false;
    }
}
