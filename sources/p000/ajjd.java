package p000;

import android.content.Intent;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.TextAttachment;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;
import java.util.Arrays;

/* renamed from: ajjd */
public final /* synthetic */ class ajjd implements Runnable {

    /* renamed from: a */
    private final NearbySharingChimeraService f70737a;

    /* renamed from: b */
    private final bqgy f70738b;

    /* renamed from: c */
    private final Intent f70739c;

    public ajjd(NearbySharingChimeraService nearbySharingChimeraService, bqgy bqgy, Intent intent) {
        this.f70737a = nearbySharingChimeraService;
        this.f70738b = bqgy;
        this.f70739c = intent;
    }

    public final void run() {
        Object obj;
        NearbySharingChimeraService nearbySharingChimeraService = this.f70737a;
        bqgy bqgy = this.f70738b;
        Intent intent = this.f70739c;
        TextAttachment a = akhv.m59739a(nearbySharingChimeraService, intent);
        if (a != null) {
            obj = Arrays.asList(a);
        } else {
            WifiCredentialsAttachment a2 = akhv.m59740a(intent);
            if (a2 != null) {
                obj = bngx.m109356a(a2);
            } else {
                obj = akhv.m59744b(nearbySharingChimeraService, intent);
            }
        }
        bqgy.mo69138b(obj);
    }
}
