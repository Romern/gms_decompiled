package p000;

import android.hardware.location.ContextHubTransaction;
import android.util.Log;

/* renamed from: bfls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfls implements ContextHubTransaction.OnCompleteListener {

    /* renamed from: a */
    final /* synthetic */ bflv f114368a;

    public bfls(bflv bflv) {
        this.f114368a = bflv;
    }

    public final void onComplete(ContextHubTransaction contextHubTransaction, ContextHubTransaction.Response response) {
        if (this.f114368a.f114377e != null) {
            if (response.getResult() != 0 && Log.isLoggable("ContextHubComms", 6)) {
                int id = this.f114368a.f114377e.getAttachedHub().getId();
                StringBuilder sb = new StringBuilder(50);
                sb.append("Failed to communicate with contexthub: ");
                sb.append(id);
                Log.e("ContextHubComms", sb.toString());
            }
            bflg bflg = (bflg) this.f114368a.f114376d;
            bflg.f114338e.clear();
            bflg.mo61875a();
        }
    }
}
