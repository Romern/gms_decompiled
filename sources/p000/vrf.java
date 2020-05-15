package p000;

import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: vrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vrf extends vsh {

    /* renamed from: a */
    final /* synthetic */ String f49840a;

    /* renamed from: b */
    final /* synthetic */ vrh f49841b;

    public vrf(vrh vrh, String str) {
        this.f49841b = vrh;
        this.f49840a = str;
    }

    /* renamed from: a */
    public final void mo28762a() {
        bpdh bpdh;
        vrh vrh = this.f49841b;
        String str = this.f49840a;
        if ("com.google.android.gms.carsetup.drivingmode.LAUNCH_NOTIFICATION_ACCEPT".equals(str) || "com.google.android.gms.carsetup.drivingmode.LAUNCH_NOTIFICATION_TIMEOUT".equals(str)) {
            Log.i("CAR.DRIVINGMODE", "Driving Mode started by launch notification accept/timeout.");
            vrh.f49848c.mo28759a(bpeb.DRIVING_MODE, "com.google.android.gms.carsetup.drivingmode.LAUNCH_NOTIFICATION_ACCEPT".equals(str) ? bpea.DRIVING_MODE_LAUNCH_NOTIFICATION_ACCEPT : bpea.DRIVING_MODE_LAUNCH_NOTIFICATION_TIMEOUT);
            vrh.f49846a.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            vsi vsi = vrh.f49849d;
            vuu o = vsi.mo28799o();
            sdo.m34959a(o);
            vsi.mo28786c(o);
            vrh.f49849d.mo28800p();
            vrh.mo28763a();
        } else if ("com.google.android.gms.carsetup.drivingmode.LAUNCH_NOTIFICATION_CANCEL".equals(str)) {
            Log.i("CAR.DRIVINGMODE", "Cancelled Driving Mode launch from notification.");
            vrh.f49848c.mo28759a(bpeb.DRIVING_MODE, bpea.DRIVING_MODE_LAUNCH_NOTIFICATION_CANCEL);
            vrh.f49849d.mo28800p();
            vrh.f49847b.mo28847c();
            vrh.mo28763a();
        } else if (!vrh.f49849d.mo28791g()) {
            vrh.mo28763a();
        } else if ("com.google.android.gms.carsetup.drivingmode.ACTIVITY_TRANSITION_START".equals(str)) {
            try {
                if (vrh.f49849d.f49901c.mo28890l()) {
                    Log.i("CAR.DRIVINGMODE", "Auto-launch activity transition is suppressed");
                    bpdh = bpdh.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_SUPPRESSED;
                    vrh.mo28763a();
                    vrh.f49848c.mo28758a(bpdi.DRIVING_MODE, bpdh);
                }
            } catch (RemoteException e) {
                Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e);
            }
            Log.i("CAR.DRIVINGMODE", "Auto-launch started by activity transition.");
            bpdh = bpdh.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_LAUNCH;
            vrh.mo28764a(vuu.ACTIVITY_RECOGNITION);
            vrh.f49848c.mo28758a(bpdi.DRIVING_MODE, bpdh);
        } else if ("com.google.android.gms.carsetup.drivingmode.ACTIVITY_TRANSITION_END".equals(str)) {
            Log.i("CAR.DRIVINGMODE", "Ending driving mode by activity transition.");
            vrh.f49848c.mo28758a(bpdi.DRIVING_MODE, bpdh.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_TERMINATE);
            if (!vrh.f49849d.mo28785b(vuu.ACTIVITY_RECOGNITION)) {
                vrh.f49848c.mo28758a(bpdi.DRIVING_MODE, bpdh.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_DISCONNECT_IGNORED);
            }
            vrh.mo28765b();
            vrh.mo28763a();
        }
    }
}
