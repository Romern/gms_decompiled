package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.List;

/* renamed from: bfpu */
public final /* synthetic */ class bfpu implements Runnable {

    /* renamed from: a */
    private final bfqm f114813a;

    /* renamed from: b */
    private final Intent f114814b;

    public bfpu(bfqm bfqm, Intent intent) {
        this.f114813a = bfqm;
        this.f114814b = intent;
    }

    public final void run() {
        char c;
        bfqm bfqm = this.f114813a;
        bfqm.f114891r.mo25070c(this.f114814b);
        List e = bfqm.f114891r.mo25074e();
        int size = e.size();
        for (int i = 0; i < size; i++) {
            Bundle bundle = (Bundle) e.get(i);
            LocationRequest locationRequest = (LocationRequest) bundle.getParcelable("lr");
            PendingIntent a = bfqm.m97523a(bundle);
            Context context = bfqm.f114879f;
            String targetPackage = a.getTargetPackage();
            boolean z = true;
            if (svr.m36484b(context).mo26171a("android.permission.ACCESS_FINE_LOCATION", targetPackage) != 0) {
                c = svr.m36484b(context).mo26171a("android.permission.ACCESS_COARSE_LOCATION", targetPackage) == 0 ? (char) 1 : 0;
            } else {
                c = 2;
            }
            if (locationRequest == null || a == null || c == 0) {
                Log.e("GCoreFlp", "Incomplete LocationRequest found in SystemMemoryCache.");
            } else {
                LocationRequestInternal a2 = LocationRequestInternal.m66889a(null, locationRequest);
                if (c != 2) {
                    z = false;
                }
                bfqm.mo62134a(a2, a, z);
            }
        }
    }
}
