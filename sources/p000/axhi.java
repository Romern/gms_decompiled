package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.walletp2p.internal.zeroparty.CheckIntegratorEligibilityRequest;

/* renamed from: axhi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axhi extends axeq {
    public axhi(CheckIntegratorEligibilityRequest checkIntegratorEligibilityRequest, Account account, Bundle bundle, axnw axnw) {
        super("CheckIntegratorEligibilityOperation", checkIntegratorEligibilityRequest, account, bundle, axnw);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axnw.a(boolean, com.google.android.gms.common.api.Status):void
     arg types: [int, com.google.android.gms.common.api.Status]
     candidates:
      axnw.a(com.google.android.gms.walletp2p.internal.zeroparty.ClaimMoneyResponse, com.google.android.gms.common.api.Status):void
      axnw.a(com.google.android.gms.walletp2p.internal.zeroparty.DeclineChallengeResponse, com.google.android.gms.common.api.Status):void
      axnw.a(com.google.android.gms.walletp2p.internal.zeroparty.GetEncryptedIdCreditParamsResponse, com.google.android.gms.common.api.Status):void
      axnw.a(com.google.android.gms.walletp2p.internal.zeroparty.GetTransactionResponse, com.google.android.gms.common.api.Status):void
      axnw.a(com.google.android.gms.walletp2p.internal.zeroparty.ValidateDraftTokenResponse, com.google.android.gms.common.api.Status):void
      axnw.a(boolean, com.google.android.gms.common.api.Status):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        ((axnw) this.f95864c).mo53069a(false, Status.f30109c);
    }

    /* renamed from: b */
    public final void mo53072b(Context context) {
        axhk axhk = new axhk(context);
        axnw axnw = (axnw) this.f95864c;
        int a = mo53071a();
        String str = ((CheckIntegratorEligibilityRequest) this.f95865d).f110789a;
        boolean z = false;
        if (axhk.mo53150a(a, this.f95862a)) {
            if (a == 3 || a == 9) {
                z = true;
            } else if (rfz.m33557a(axhk.f95947a).mo24610b(str)) {
                z = true;
            }
        }
        axnw.mo53069a(z, Status.f30107a);
    }
}
