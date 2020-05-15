package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.SyncDeviceInfoRequest;
import java.io.IOException;

/* renamed from: atkd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atkd extends atki {
    public atkd(SyncDeviceInfoRequest syncDeviceInfoRequest, String str, aswm aswm) {
        super("SyncDeviceInfo", syncDeviceInfoRequest, str, aswm);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49629f(status);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        try {
            if (asiv.m74195e(askg.m74284b(((SyncDeviceInfoRequest) this.f90410b).f108437a, context, this.f90413c))) {
                this.f90414d.mo49629f(Status.f30107a);
                return;
            }
            throw new aaaj(8, null);
        } catch (IOException e) {
            m76116a(e);
        }
    }
}
