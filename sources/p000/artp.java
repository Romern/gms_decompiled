package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.smartdevice.setup.accounts.AccountsChimeraService;

/* renamed from: artp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class artp extends rzt {

    /* renamed from: a */
    final /* synthetic */ AccountsChimeraService f88282a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public artp(AccountsChimeraService accountsChimeraService) {
        super(accountsChimeraService, 81, new int[0]);
        this.f88282a = accountsChimeraService;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        AccountsChimeraService accountsChimeraService = this.f88282a;
        try {
            sek sek = AccountsChimeraService.f108108a;
            if (accountsChimeraService.f108109b == null) {
                accountsChimeraService.f108109b = new aruc(accountsChimeraService, accountsChimeraService.f108110c);
            }
            aruc aruc = this.f88282a.f108109b;
            aruc.asBinder();
            sbj.mo16678a(0, aruc, (Bundle) null);
        } catch (RemoteException e) {
            AccountsChimeraService.f108108a.mo25417e("Client died while brokering service", e, new Object[0]);
        }
    }
}
