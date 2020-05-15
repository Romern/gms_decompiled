package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.GetAvailableOtherPaymentMethodsResponse;
import com.google.android.gms.tapandpay.internal.firstparty.GetAvailableOtherPaymentMethodsRequest;
import java.util.ArrayList;

/* renamed from: atiw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atiw extends atkk {

    /* renamed from: a */
    private final GetAvailableOtherPaymentMethodsRequest f90400a;

    public atiw(GetAvailableOtherPaymentMethodsRequest getAvailableOtherPaymentMethodsRequest, String str, aswm aswm) {
        super("GetAvailableOtherPaymentMethods", str, aswm);
        this.f90400a = getAvailableOtherPaymentMethodsRequest;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49243a(status, new GetAvailableOtherPaymentMethodsResponse(new int[0]));
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        if (asjg.m74215b(context, this.f90400a.f108541a) == null) {
            this.f90414d.mo49243a(new Status(5), new GetAvailableOtherPaymentMethodsResponse(new int[0]));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (cgxf.m147444b()) {
            arrayList.add(2);
        }
        this.f90414d.mo49243a(Status.f30107a, new GetAvailableOtherPaymentMethodsResponse(sqc.m35960a(arrayList)));
    }
}
