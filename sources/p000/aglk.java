package p000;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: aglk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aglk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aglm f65881a;

    public aglk(aglm aglm) {
        this.f65881a = aglm;
    }

    public final void run() {
        String str;
        agln agln = this.f65881a.f65885c;
        Context z = agln.mo35542z();
        if (this.f65881a.f65885c.mo35537u().f65291a) {
            str = "com.google.android.gms.measurement.PackageMeasurementService";
        } else {
            str = "com.google.android.gms.measurement.AppMeasurementService";
        }
        agln.mo35619a(new ComponentName(z, str));
    }
}
