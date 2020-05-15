package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.reporting.UploadRequest;
import com.google.android.gms.location.reporting.UploadRequestResult;

/* renamed from: aepz */
public final /* synthetic */ class aepz implements roo {

    /* renamed from: a */
    private final UploadRequest f63618a;

    public aepz(UploadRequest uploadRequest) {
        this.f63618a = uploadRequest;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        int i;
        UploadRequestResult a = ((aeql) ((aeqn) obj).mo25289B()).mo34461a(this.f63618a);
        int i2 = a.f79618a;
        if (i2 != 0) {
            i = i2 != 100 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? i2 != 6 ? 8 : 3509 : 3508 : 3500 : 3504 : 3505 : 3506;
        } else {
            i = 0;
        }
        Status status = new Status(i);
        rpc.m34202a(status, new aeqp(status, a.f79619b), (aucf) obj2);
    }
}
