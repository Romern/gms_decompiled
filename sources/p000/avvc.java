package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: avvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class avvc extends avuo {
    /* renamed from: c */
    public final void mo51625c(Status status) {
        if (!status.mo17710c()) {
            String valueOf = String.valueOf(status);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
            sb.append("disconnect(): Could not unregister listener: status=");
            sb.append(valueOf);
            Log.e("UsageReportingClientImp", sb.toString());
        }
    }
}
