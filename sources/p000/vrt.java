package p000;

import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;

/* renamed from: vrt */
final /* synthetic */ class vrt implements View.OnClickListener {

    /* renamed from: a */
    private final vrv f49876a;

    /* renamed from: b */
    private final String f49877b;

    public vrt(vrv vrv, String str) {
        this.f49876a = vrv;
        this.f49877b = str;
    }

    public void onClick(View view) {
        vrv vrv = this.f49876a;
        String str = this.f49877b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25);
        sb.append("Behavior Option ");
        sb.append(str);
        sb.append(" clicked.");
        sb.toString();
        vrv.f49879a.mo28785b(vuu.MANUAL);
        vsi vsi = vrv.f49879a;
        try {
            vsi.f49901c.mo28874b(str);
        } catch (RemoteException e) {
            Log.i("CAR.DRIVINGMODE", "saveBehaviorChoice RemoteException", e);
        }
        vsi.mo28802r();
        vrs a = vrs.m41126a(str);
        if (a.mo28743c() == 3 && !a.mo28745d(vrv.getContext())) {
            vrv.mo28772a("DND_ACCESS");
        } else if (a.mo28743c() == 2 && !a.mo28745d(vrv.getContext())) {
            vrv.mo28772a("GEARHEAD_INSTALL");
        }
        if (vrv.getTargetFragment() != null) {
            vrv.getTargetFragment().onActivityResult(vrv.getTargetRequestCode(), -1, new Intent());
        }
        vrv.dismiss();
    }
}
