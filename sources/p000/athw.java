package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.issuer.RequestTokenizeChimeraActivity;

/* renamed from: athw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class athw extends atkj {

    /* renamed from: a */
    private final String f90386a;

    public athw(String str, String str2, aswm aswm) {
        super("CompletePushTokenizeOperation", str2, aswm);
        this.f90386a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49607a(status, Bundle.EMPTY);
    }

    /* renamed from: a */
    public final boolean mo50004a() {
        return true;
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        PendingIntent pendingIntent;
        super.mo50005b(context);
        if (!cgwn.m147271u()) {
            this.f90414d.mo49607a(new Status(15009, "Feature disabled", null), Bundle.EMPTY);
        } else if (TextUtils.isEmpty(this.f90386a)) {
            this.f90414d.mo49607a(new Status(10, "Invalid request", null), Bundle.EMPTY);
        } else {
            AccountInfo b = asix.m74201b(context, askc.m74272b());
            String str = this.f90413c;
            String str2 = this.f90386a;
            Intent b2 = atrq.m76261b(str, b, null);
            b2.putExtra("server_provisioning_session_id", str2);
            Intent a = RequestTokenizeChimeraActivity.m93052a(context, this.f90413c, b, b2);
            if (b == null) {
                pendingIntent = asiw.m74197a(context, a, this.f90413c);
            } else {
                pendingIntent = atrq.m76258a(context, a);
            }
            this.f90414d.mo49607a(new Status(6, null, pendingIntent), Bundle.EMPTY);
        }
    }
}
