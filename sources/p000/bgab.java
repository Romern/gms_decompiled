package p000;

import android.hardware.location.GeofenceHardwareMonitorCallback;
import android.location.Location;

/* renamed from: bgab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgab extends GeofenceHardwareMonitorCallback {

    /* renamed from: a */
    final /* synthetic */ bgac f115854a;

    public bgab(bgac bgac) {
        this.f115854a = bgac;
    }

    public final void onMonitoringSystemChange(int i, boolean z, Location location) {
        bgab.super.onMonitoringSystemChange(i, z, location);
        boolean z2 = bfxc.f115575a;
        bgac bgac = this.f115854a;
        if (i == bgac.f115855a) {
            bfzt bfzt = bgac.f115858d;
            synchronized (bfzt.f115806k) {
                bxvd bxvd = bfzt.f115791D;
                if (bxvd != null) {
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bpmn bpmn = (bpmn) bxvd.f164949b;
                    bpmn bpmn2 = bpmn.f138303g;
                    bpmn.f138305a |= 8;
                    bpmn.f138309e = z;
                }
                boolean z3 = bfxc.f115575a;
                bfzt.mo62545b(13, Boolean.valueOf(z));
            }
        }
    }
}
