package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.asterism.SetAsterismConsentResponse;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import java.util.UUID;

/* renamed from: gbn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gbn extends tdl {

    /* renamed from: a */
    final /* synthetic */ gbq f17845a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gbn(gbq gbq, Handler handler) {
        super(handler);
        this.f17845a = gbq;
    }

    /* renamed from: a */
    public final void mo11624a(tdw tdw) {
        gbq.f17854a.mo25417e("Verification exception:", tdw, new Object[0]);
        gbq gbq = this.f17845a;
        gbq.f17859f.mo26403a(gbq.f17860g, 56, 69, tdw.getMessage());
        try {
            this.f17845a.f17855b.mo11611a(new Status(34504), new SetAsterismConsentResponse(this.f17845a.f17858e));
        } catch (RemoteException e) {
            gbq.f17854a.mo25415d("Remote exception:", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo11625a(boolean z, Map map) {
        gbq gbq = this.f17845a;
        Logger Logger = gbq.f17854a;
        gbq.f17859f.mo26402a(gbq.f17860g, 56, 6);
        try {
            this.f17845a.f17855b.mo11611a(Status.f30107a, new SetAsterismConsentResponse(this.f17845a.f17858e));
        } catch (RemoteException e) {
            gbq.f17854a.mo25415d("Remote exception:", e, new Object[0]);
        }
        sxt.m36563a();
        sxt.m36564a(this.f17845a.f17857d, UUID.randomUUID(), 7, Bundle.EMPTY, null, null, new tdl(new snr(new sns(10))));
    }
}
