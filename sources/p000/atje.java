package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.GetSecurityParamsResponse;
import com.google.android.gms.tapandpay.service.TapAndPayChimeraService;

/* renamed from: atje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atje extends atkk {
    public atje(String str, aswm aswm) {
        super("GetSecurityParams", str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49612a(status, (GetSecurityParamsResponse) null);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        this.f90414d.mo49612a(Status.f30107a, new GetSecurityParamsResponse(TapAndPayChimeraService.m93111b(context), TapAndPayChimeraService.m93110a(context)));
    }
}
