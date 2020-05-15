package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.issuer.CreatePushTokenizeSessionRequest;
import com.google.android.gms.tapandpay.issuer.RequestTokenizeChimeraActivity;

/* renamed from: athx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class athx extends atkh {
    public athx(CreatePushTokenizeSessionRequest createPushTokenizeSessionRequest, String str, Bundle bundle, aswm aswm) {
        super("CreatePushTokenizeSession", createPushTokenizeSessionRequest, str, aswm);
    }

    /* access modifiers changed from: protected */
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
        if (!cgwn.m147271u()) {
            this.f90414d.mo49607a(new Status(15009, "Feature disabled", null), Bundle.EMPTY);
            return;
        }
        SafeParcelable safeParcelable = this.f90410b;
        if (safeParcelable != null && !TextUtils.isEmpty(((CreatePushTokenizeSessionRequest) safeParcelable).f108569c)) {
            AccountInfo b = asix.m74201b(context, askc.m74272b());
            Intent b2 = atrq.m76261b(this.f90413c, b, null);
            sef.m35071a((CreatePushTokenizeSessionRequest) this.f90410b, b2, "extra_push_tokenize_session_request");
            Intent a = RequestTokenizeChimeraActivity.m93051a(context, b2, null, b, ((CreatePushTokenizeSessionRequest) this.f90410b).f108569c, this.f90413c, null, false);
            if (b == null) {
                pendingIntent = asiw.m74197a(context, a, this.f90413c);
            } else {
                pendingIntent = atrq.m76258a(context, a);
            }
            this.f90414d.mo49607a(new Status(6, null, pendingIntent), Bundle.EMPTY);
            return;
        }
        this.f90414d.mo49607a(new Status(10, "Invalid request", null), Bundle.EMPTY);
    }
}
