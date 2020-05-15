package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: nfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nfm extends rns {
    /* renamed from: a */
    public final void mo11797a(Status status) {
        if (!status.mo17710c()) {
            String valueOf = String.valueOf(status);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
            sb.append("Failed to cancel dangling listener. Status: ");
            sb.append(valueOf);
            Log.e("BleClientImpl", sb.toString());
        }
    }
}
