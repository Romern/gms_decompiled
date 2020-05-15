package p000;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;

/* renamed from: awnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awnp extends awbs {

    /* renamed from: a */
    final /* synthetic */ GetClientTokenRequest f94668a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awnp(rkb rkb, GetClientTokenRequest getClientTokenRequest) {
        super(rkb);
        this.f94668a = getClientTokenRequest;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        awno awno = (awno) rjd;
        GetClientTokenRequest getClientTokenRequest = this.f94668a;
        awnn awnn = new awnn(this);
        try {
            ((awnf) awno.mo25289B()).mo52319a(getClientTokenRequest, awno.m80361a(awno.f94664b, awno.f94663a.getPackageName(), awno.f94665c, awno.f94666d, awno.f94667e), awnn);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting client token", e);
            awnn.mo52336a(Status.f30109c, new GetClientTokenResponse(new byte[0]), Bundle.EMPTY);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new awkm(status, new GetClientTokenResponse(new byte[0]));
    }
}
