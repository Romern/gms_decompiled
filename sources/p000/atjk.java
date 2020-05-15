package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.internal.firstparty.ReleaseResourceRequest;

/* renamed from: atjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atjk extends atki {
    public atjk(ReleaseResourceRequest releaseResourceRequest, String str, aswm aswm) {
        super("ReleaseResource", releaseResourceRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49635l(status);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        try {
            atxv.m76523a().mo50309a(atxt.m76521a(((ReleaseResourceRequest) this.f90410b).f108547a), ((ReleaseResourceRequest) this.f90410b).f108548b);
            this.f90414d.mo49635l(Status.f30107a);
        } catch (IllegalArgumentException e) {
            int i = ((ReleaseResourceRequest) this.f90410b).f108547a;
            StringBuilder sb = new StringBuilder(34);
            sb.append("Invalid resource type: ");
            sb.append(i);
            throw new aaaj(13, sb.toString(), null, e);
        }
    }
}
