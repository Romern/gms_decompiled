package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.walletp2p.internal.zeroparty.GetEncryptedIdCreditParamsRequest;
import com.google.android.gms.walletp2p.internal.zeroparty.GetEncryptedIdCreditParamsResponse;

/* renamed from: axhl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axhl extends axeq {
    public axhl(GetEncryptedIdCreditParamsRequest getEncryptedIdCreditParamsRequest, Account account, Bundle bundle, axnw axnw) {
        super("GetEncryptedIdCreditParamsOperation", getEncryptedIdCreditParamsRequest, account, bundle, axnw);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        ((axnw) this.f95864c).mo53068a((GetEncryptedIdCreditParamsResponse) null, status);
    }

    /* renamed from: b */
    public final void mo53072b(Context context) {
        bttt bttt = (bttt) axmo.m82727a("b/kyc/getKycMegabloxInitializationToken", this.f95862a, btts.f150390a, bttt.f150392d, mo53071a()).get();
        if ((bttt.f150394a & 2) != 0) {
            axnw axnw = (axnw) this.f95864c;
            bzvu bzvu = bttt.f150396c;
            if (bzvu == null) {
                bzvu = bzvu.f171552g;
            }
            axnw.mo53068a(new GetEncryptedIdCreditParamsResponse(null, axep.m82424a(context, bzvu)), new Status(-16500));
            return;
        }
        try {
            ((axnw) this.f95864c).mo53068a(new GetEncryptedIdCreditParamsResponse(Base64.decode(bttt.f150395b, 0), null), Status.f30107a);
        } catch (IllegalArgumentException e) {
            ((axnw) this.f95864c).mo53068a((GetEncryptedIdCreditParamsResponse) null, new Status(13));
        }
    }
}
