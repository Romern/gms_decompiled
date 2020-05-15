package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: awkb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awkb extends awnk {

    /* renamed from: a */
    final /* synthetic */ aucf f94582a;

    public awkb(aucf aucf) {
        this.f94582a = aucf;
    }

    /* renamed from: a */
    public final void mo52195a(Status status, Bundle bundle) {
        awjz awjz;
        if (status.mo17710c() && bundle != null) {
            bundle.getString("com.google.android.gms.wallet.firstparty.EXTRA_ORDER_ID");
            bundle.getString("com.google.android.gms.wallet.firstparty.EXTRA_DISPLAY_MESSAGE");
            bundle.getByteArray("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN");
            awjz = new awjz(status);
        } else {
            awjz = new awjz(status);
        }
        awah.m79566a(status, new rkj(awjz), this.f94582a);
    }
}
