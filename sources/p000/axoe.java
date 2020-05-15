package p000;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.walletp2p.internal.firstparty.CheckEligibilityRequest;
import com.google.android.gms.walletp2p.internal.firstparty.CheckRecipientEligibilityRequest;
import com.google.android.gms.walletp2p.internal.firstparty.ConfirmTransactionRequest;
import com.google.android.gms.walletp2p.internal.firstparty.GetTransactionDetailsRequest;
import com.google.android.gms.walletp2p.service.firstparty.FirstPartyWalletP2PChimeraService;

/* renamed from: axoe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axoe extends axna implements aaai {

    /* renamed from: a */
    private final FirstPartyWalletP2PChimeraService f96211a;

    /* renamed from: b */
    private final String f96212b;

    /* renamed from: c */
    private final Bundle f96213c;

    /* renamed from: d */
    private final Account f96214d;

    /* renamed from: e */
    private final aaag f96215e;

    public axoe(FirstPartyWalletP2PChimeraService firstPartyWalletP2PChimeraService, Account account, String str, aaag aaag, Bundle bundle) {
        this.f96211a = firstPartyWalletP2PChimeraService;
        this.f96212b = str;
        this.f96214d = account;
        this.f96213c = bundle;
        this.f96215e = aaag;
    }

    /* renamed from: a */
    public final void mo53258a(CheckEligibilityRequest checkEligibilityRequest, axnc axnc) {
        Account account;
        String str = checkEligibilityRequest.f110776a;
        if (str != null) {
            account = new Account(str, "com.google");
        } else {
            account = this.f96214d;
        }
        this.f96215e.mo16659a(this.f96211a, new axhh(checkEligibilityRequest, account, this.f96213c, axnc));
    }

    /* renamed from: a */
    public final void mo53259a(CheckRecipientEligibilityRequest checkRecipientEligibilityRequest, axnc axnc) {
        this.f96215e.mo16659a(this.f96211a, new axhj(checkRecipientEligibilityRequest, this.f96214d, this.f96213c, axnc));
    }

    /* renamed from: a */
    public final void mo53260a(ConfirmTransactionRequest confirmTransactionRequest, axnc axnc) {
        Account account;
        String str = confirmTransactionRequest.f110780b;
        if (str != null) {
            account = new Account(str, "com.google");
        } else {
            account = this.f96214d;
        }
        this.f96215e.mo16659a(this.f96211a, new axip(confirmTransactionRequest, account, this.f96213c, axnc));
    }

    /* renamed from: a */
    public final void mo53261a(GetTransactionDetailsRequest getTransactionDetailsRequest, axnc axnc) {
        Account account;
        String str = getTransactionDetailsRequest.f110782b;
        if (str != null) {
            account = new Account(str, "com.google");
        } else {
            account = this.f96214d;
        }
        this.f96215e.mo16659a(this.f96211a, new axiq(getTransactionDetailsRequest, account, this.f96213c, axnc));
    }
}
