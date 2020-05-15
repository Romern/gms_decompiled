package p000;

import android.content.Intent;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.gms.location.reporting.UploadRequest;
import com.google.android.gms.locationsharing.ovenfresh.GcmReceiverChimeraService;

/* renamed from: aeuh */
public final /* synthetic */ class aeuh implements aubq {

    /* renamed from: a */
    private final GcmReceiverChimeraService f63830a;

    /* renamed from: b */
    private final Intent f63831b;

    /* renamed from: c */
    private final aeup f63832c;

    public aeuh(GcmReceiverChimeraService gcmReceiverChimeraService, Intent intent, aeup aeup) {
        this.f63830a = gcmReceiverChimeraService;
        this.f63831b = intent;
        this.f63832c = aeup;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        int i;
        GcmReceiverChimeraService gcmReceiverChimeraService = this.f63830a;
        Intent intent = this.f63831b;
        aeup aeup = this.f63832c;
        if (aucb.mo50384b()) {
            gcmReceiverChimeraService.f79675c = (ReportingState) aucb.mo50386d();
            ReportingState reportingState = gcmReceiverChimeraService.f79675c;
            if (!reportingState.f79600a) {
                i = 3;
            } else if (reportingState.f79601b) {
                aeug aeug = (aeug) aeup;
                boolean z = aeug.f63828f;
                if (!z) {
                    gcmReceiverChimeraService.mo43799a(intent, aeup);
                }
                aeqg a = UploadRequest.m66980a(aeug.f63823a, aeug.f63827e, aeug.f63826d.longValue());
                a.f63626d = 0;
                a.f63627e = 0;
                UploadRequest a2 = a.mo34454a();
                rjx a3 = gcmReceiverChimeraService.mo43797a();
                roz b = rpa.m34196b();
                b.f43472a = new aepz(a2);
                aucb b2 = a3.mo24732b(b.mo24977a());
                b2.mo50371a(new aeul(gcmReceiverChimeraService, z, intent, aeup));
                b2.mo50372a(new aeum(gcmReceiverChimeraService, b2, intent));
                i = 1;
            } else {
                i = 4;
            }
            if (i != 1) {
                gcmReceiverChimeraService.mo43798a(intent, i);
                return;
            }
            return;
        }
        Exception e = aucb.mo50387e();
        bnsl bnsl = (bnsl) GcmReceiverChimeraService.f79670b.mo68388c();
        bnsl.mo68437a(e);
        bnsl.mo68432a("com.google.android.gms.locationsharing.ovenfresh.GcmReceiverChimeraService", "a", 355, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Failure performingOvenfresh");
        gcmReceiverChimeraService.mo43798a(intent, 8);
    }
}
