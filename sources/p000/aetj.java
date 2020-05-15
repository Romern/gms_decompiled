package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: aetj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aetj {
    /* renamed from: a */
    public static void m52535a(Context context, String str, boolean z, long j) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.locationsharing.service.GcmReceiverService");
        className.putExtra("account_name", str);
        if (z) {
            className.putExtra("burst_reason", "LOCATION_SHARING_FORCE_PRIMARY_DEVICE");
        }
        if (j > 0 && j <= cfaz.f183554a.mo6606a().mo80795r()) {
            StringBuilder sb = new StringBuilder(20);
            sb.append(j);
            className.putExtra("burst_duration_millis", sb.toString());
        }
        context.startService(className);
    }
}
