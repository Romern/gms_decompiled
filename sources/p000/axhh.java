package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.walletp2p.internal.firstparty.CheckEligibilityRequest;

/* renamed from: axhh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axhh extends axeq {
    public axhh(CheckEligibilityRequest checkEligibilityRequest, Account account, Bundle bundle, axnc axnc) {
        super("CheckEligibilityOperation", checkEligibilityRequest, account, bundle, axnc);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axnc.a(boolean, com.google.android.gms.common.api.Status):void
     arg types: [int, com.google.android.gms.common.api.Status]
     candidates:
      axnc.a(com.google.android.gms.walletp2p.internal.firstparty.ConfirmTransactionResponse, com.google.android.gms.common.api.Status):void
      axnc.a(com.google.android.gms.walletp2p.internal.firstparty.GetTransactionDetailsResponse, com.google.android.gms.common.api.Status):void
      dcj.a(int, android.os.Parcel):android.os.Parcel
      axnc.a(boolean, com.google.android.gms.common.api.Status):void */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        ((axnc) this.f95864c).mo53265a(false, Status.f30109c);
    }

    /* renamed from: b */
    public final void mo53072b(Context context) {
        ((axnc) this.f95864c).mo53265a(new axhk(context).mo53150a(mo53071a(), this.f95862a), Status.f30107a);
    }
}
