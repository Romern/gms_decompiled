package p000;

import android.hardware.location.ContextHubInfo;
import android.hardware.location.ContextHubTransaction;
import android.hardware.location.NanoAppState;
import android.util.Log;
import java.util.List;
import java.util.Set;

/* renamed from: bflu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bflu implements ContextHubTransaction.OnCompleteListener {

    /* renamed from: a */
    final /* synthetic */ bflv f114369a;

    /* renamed from: b */
    private final ContextHubInfo f114370b;

    /* renamed from: c */
    private final List f114371c;

    /* renamed from: d */
    private final Set f114372d;

    public bflu(bflv bflv, ContextHubInfo contextHubInfo, List list, Set set) {
        this.f114369a = bflv;
        this.f114370b = contextHubInfo;
        this.f114371c = list;
        this.f114372d = set;
    }

    public final void onComplete(ContextHubTransaction contextHubTransaction, ContextHubTransaction.Response response) {
        bflv bflv = this.f114369a;
        if (bflv.f114377e == null && bflv.f114375c) {
            if (response.getResult() != 0) {
                if (Log.isLoggable("ContextHubComms", 6)) {
                    int id = this.f114370b.getId();
                    StringBuilder sb = new StringBuilder(50);
                    sb.append("Failed to communicate with contexthub: ");
                    sb.append(id);
                    Log.e("ContextHubComms", sb.toString());
                }
                this.f114371c.remove(this.f114370b);
            } else {
                for (NanoAppState nanoAppState : (List) response.getContents()) {
                    if (this.f114372d.contains(Long.valueOf(nanoAppState.getNanoAppId()))) {
                        bflv bflv2 = this.f114369a;
                        bflv2.f114377e = bflv2.f114373a.createClient(this.f114370b, bflv2, bflv2.f114374b);
                        this.f114369a.f114376d.mo61877a(true);
                        return;
                    }
                }
                this.f114371c.remove(this.f114370b);
            }
            if (this.f114371c.isEmpty()) {
                this.f114369a.f114376d.mo61877a(false);
            }
        }
    }
}
