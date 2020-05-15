package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.RequestTokenizeChimeraActivity;

/* renamed from: atif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atif extends atkh {
    public atif(PushTokenizeRequest pushTokenizeRequest, String str, Bundle bundle, aswm aswm) {
        super("PushTokenize", pushTokenizeRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49607a(status, Bundle.EMPTY);
    }

    /* renamed from: a */
    public final boolean mo50006a() {
        return true;
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        PendingIntent pendingIntent;
        super.mo50005b(context);
        SafeParcelable safeParcelable = this.f90410b;
        if (safeParcelable == null || TextUtils.isEmpty(((PushTokenizeRequest) safeParcelable).f108574e) || ((PushTokenizeRequest) this.f90410b).f108572c == null) {
            this.f90414d.mo49607a(new Status(10, "Invalid request", null), Bundle.EMPTY);
            return;
        }
        AccountInfo b = asix.m74201b(context, askc.m74272b());
        Intent b2 = atrq.m76261b(this.f90413c, b, null);
        sef.m35071a((PushTokenizeRequest) this.f90410b, b2, "extra_push_tokenize_request");
        PushTokenizeRequest pushTokenizeRequest = (PushTokenizeRequest) this.f90410b;
        Intent a = RequestTokenizeChimeraActivity.m93051a(context, b2, null, b, pushTokenizeRequest.f108574e, this.f90413c, pushTokenizeRequest, true);
        if (b == null) {
            pendingIntent = asiw.m74197a(context, a, this.f90413c);
        } else {
            pendingIntent = atrq.m76258a(context, a);
        }
        this.f90414d.mo49607a(new Status(6, null, pendingIntent), Bundle.EMPTY);
    }
}
