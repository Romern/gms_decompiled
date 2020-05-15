package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.ReserveResourceResponse;
import com.google.android.gms.tapandpay.internal.firstparty.ReserveResourceRequest;
import java.util.concurrent.TimeUnit;

/* renamed from: atjn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atjn extends atki {
    public atjn(ReserveResourceRequest reserveResourceRequest, String str, aswm aswm) {
        super("ReserveResource", reserveResourceRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49614a(status, (ReserveResourceResponse) null);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        try {
            String a = atxv.m76523a().mo50308a(atxt.m76521a(((ReserveResourceRequest) this.f90410b).f108549a), ((ReserveResourceRequest) this.f90410b).f108550b, TimeUnit.MILLISECONDS);
            if (a != null) {
                aswm aswm = this.f90414d;
                Status status = Status.f30107a;
                ReserveResourceResponse reserveResourceResponse = new asok().f89310a;
                reserveResourceResponse.f108419a = a;
                aswm.mo49614a(status, reserveResourceResponse);
                return;
            }
            throw new aaaj(13, "Resource reservation timed out", null);
        } catch (InterruptedException e) {
            throw new aaaj(13, "Resource reservation interrupted", null, e);
        } catch (IllegalArgumentException e2) {
            int i = ((ReserveResourceRequest) this.f90410b).f108549a;
            StringBuilder sb = new StringBuilder(34);
            sb.append("Invalid resource type: ");
            sb.append(i);
            throw new aaaj(13, sb.toString(), null, e2);
        }
    }
}
