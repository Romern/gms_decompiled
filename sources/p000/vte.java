package p000;

import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.chimera.Activity;

/* renamed from: vte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vte extends PackageInstaller.SessionCallback {

    /* renamed from: a */
    public final Activity f49940a;

    /* renamed from: b */
    public PackageManager f49941b;

    /* renamed from: c */
    public PackageInstaller f49942c;

    /* renamed from: d */
    public int f49943d = -1;

    /* renamed from: e */
    public int f49944e;

    /* renamed from: f */
    float f49945f;

    /* renamed from: g */
    final /* synthetic */ vtf f49946g;

    public vte(vtf vtf, Activity activity) {
        this.f49946g = vtf;
        this.f49940a = activity;
    }

    public final void onActiveChanged(int i, boolean z) {
        StringBuilder sb = new StringBuilder(65);
        sb.append("DrivingModeFrxDownloadFragment#onActiveChanged: ");
        sb.append(i);
        sb.append(" ");
        sb.append(z);
        Log.i("CAR.DRIVINGMODE", sb.toString());
        if (i == this.f49943d && !z && this.f49944e != 5) {
            this.f49944e = 5;
            this.f49946g.mo28835a();
        }
    }

    public final void onBadgingChanged(int i) {
    }

    public final void onCreated(int i) {
        PackageInstaller.SessionInfo sessionInfo = this.f49942c.getSessionInfo(i);
        if (sessionInfo != null) {
            if (sessionInfo.getAppPackageName().equals("com.google.android.projection.gearhead")) {
                this.f49943d = i;
            }
            StringBuilder sb = new StringBuilder(53);
            sb.append("DrivingModeFrxDownloadFragment#onCreated: ");
            sb.append(i);
            Log.i("CAR.DRIVINGMODE", sb.toString());
        }
    }

    public final void onFinished(int i, boolean z) {
        StringBuilder sb = new StringBuilder(59);
        sb.append("DrivingModeFrxDownloadFragment#onFinished ");
        sb.append(i);
        sb.append(" ");
        sb.append(z);
        sb.toString();
        if (i != this.f49943d) {
            return;
        }
        if (z) {
            vtf vtf = this.f49946g;
            vtf.f49930g.mo28758a(bpdi.DRIVING_MODE, bpdh.DRIVING_MODE_GEARHEAD_INSTALL_SUCCESS);
            vtf.f49947a.mo28778a(new vtd(vtf));
        } else if (this.f49944e != 5) {
            this.f49944e = 5;
            this.f49946g.mo28835a();
        }
    }

    public final void onProgressChanged(int i, float f) {
        StringBuilder sb = new StringBuilder(77);
        sb.append("DrivingModeFrxDownloadFragment#onProgressChanged: ");
        sb.append(i);
        sb.append(" ");
        sb.append(f);
        sb.toString();
        if (i == this.f49943d) {
            this.f49946g.mo28836a(f);
        }
    }
}
