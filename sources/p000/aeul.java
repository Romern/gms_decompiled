package p000;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.locationsharing.ovenfresh.GcmReceiverChimeraService;

/* renamed from: aeul */
public final /* synthetic */ class aeul implements aubq {

    /* renamed from: a */
    private final GcmReceiverChimeraService f63842a;

    /* renamed from: b */
    private final boolean f63843b;

    /* renamed from: c */
    private final Intent f63844c;

    /* renamed from: d */
    private final aeup f63845d;

    public aeul(GcmReceiverChimeraService gcmReceiverChimeraService, boolean z, Intent intent, aeup aeup) {
        this.f63842a = gcmReceiverChimeraService;
        this.f63843b = z;
        this.f63844c = intent;
        this.f63845d = aeup;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        GcmReceiverChimeraService gcmReceiverChimeraService = this.f63842a;
        boolean z = this.f63843b;
        Intent intent = this.f63844c;
        aeup aeup = this.f63845d;
        if (aucb.mo50384b()) {
            Status status = ((aeqp) aucb.mo50386d()).f63635a;
            gcmReceiverChimeraService.f79676d = 0;
            if (z) {
                gcmReceiverChimeraService.mo43799a(intent, aeup);
            }
            gcmReceiverChimeraService.mo43798a(intent, 2);
        }
    }
}
