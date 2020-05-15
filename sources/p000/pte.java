package p000;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.DeviceStatus;

/* renamed from: pte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pte implements Runnable {

    /* renamed from: a */
    final /* synthetic */ pti f40180a;

    /* renamed from: b */
    final /* synthetic */ DeviceStatus f40181b;

    public pte(pti pti, DeviceStatus deviceStatus) {
        this.f40180a = pti;
        this.f40181b = deviceStatus;
    }

    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        pti pti = this.f40180a;
        DeviceStatus deviceStatus = this.f40181b;
        ApplicationMetadata applicationMetadata = deviceStatus.f29891d;
        if (!ptk.m31236a(applicationMetadata, pti.f40195b)) {
            pti.f40195b = applicationMetadata;
            pti.f40197d.mo22973a(pti.f40195b);
        }
        double d = deviceStatus.f29888a;
        if (Double.isNaN(d) || Math.abs(d - pti.f40203j) <= 1.0E-7d) {
            z = false;
        } else {
            pti.f40203j = d;
            z = true;
        }
        boolean z4 = deviceStatus.f29889b;
        if (z4 != pti.f40200g) {
            pti.f40200g = z4;
            z = true;
        }
        Double.isNaN(deviceStatus.f29894g);
        pti.f40190a.mo23670a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(pti.f40202i));
        pel pel = pti.f40197d;
        if (pel != null && (z || pti.f40202i)) {
            pel.mo22972a();
        }
        int i = deviceStatus.f29890c;
        if (i != pti.f40205l) {
            pti.f40205l = i;
            z2 = true;
        } else {
            z2 = false;
        }
        pti.f40190a.mo23670a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(pti.f40202i));
        int i2 = deviceStatus.f29892e;
        if (i2 != pti.f40206m) {
            pti.f40206m = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        pti.f40190a.mo23670a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(pti.f40202i));
        if (!ptk.m31236a(pti.f40204k, deviceStatus.f29893f)) {
            pti.f40204k = deviceStatus.f29893f;
        }
        pti.f40202i = false;
    }
}
