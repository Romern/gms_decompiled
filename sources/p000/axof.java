package p000;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.walletp2p.internal.zeroparty.CheckIntegratorEligibilityRequest;
import com.google.android.gms.walletp2p.internal.zeroparty.ClaimMoneyRequest;
import com.google.android.gms.walletp2p.internal.zeroparty.DeclineChallengeRequest;
import com.google.android.gms.walletp2p.internal.zeroparty.GetEncryptedIdCreditParamsRequest;
import com.google.android.gms.walletp2p.internal.zeroparty.GetTransactionRequest;
import com.google.android.gms.walletp2p.internal.zeroparty.ValidateDraftTokenRequest;
import com.google.android.gms.walletp2p.service.zeroparty.ZeroPartyWalletP2PChimeraService;

/* renamed from: axof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axof extends axns implements aaai {

    /* renamed from: a */
    private final ZeroPartyWalletP2PChimeraService f96216a;

    /* renamed from: b */
    private final aaag f96217b;

    /* renamed from: c */
    private final Account f96218c;

    /* renamed from: d */
    private final String f96219d;

    /* renamed from: e */
    private final Bundle f96220e;

    public axof(ZeroPartyWalletP2PChimeraService zeroPartyWalletP2PChimeraService, Account account, String str, aaag aaag, Bundle bundle) {
        this.f96216a = zeroPartyWalletP2PChimeraService;
        this.f96217b = aaag;
        this.f96218c = account;
        this.f96219d = str;
        this.f96220e = bundle;
    }

    /* renamed from: a */
    private final Account m82798a(String str) {
        return str != null ? new Account(str, "com.google") : this.f96218c;
    }

    /* renamed from: a */
    public final void mo53286a(CheckIntegratorEligibilityRequest checkIntegratorEligibilityRequest, axnw axnw) {
        this.f96217b.mo16659a(this.f96216a, new axhi(checkIntegratorEligibilityRequest, m82798a(checkIntegratorEligibilityRequest.f110790b), this.f96220e, axnw));
    }

    /* renamed from: a */
    public final void mo53287a(ClaimMoneyRequest claimMoneyRequest, axnw axnw) {
        this.f96217b.mo16659a(this.f96216a, new axko(claimMoneyRequest, m82798a(claimMoneyRequest.f110798h), this.f96220e, axnw));
    }

    /* renamed from: a */
    public final void mo53288a(DeclineChallengeRequest declineChallengeRequest, axnw axnw) {
        this.f96217b.mo16659a(this.f96216a, new axkq(declineChallengeRequest, m82798a(declineChallengeRequest.f110802b), this.f96220e, axnw));
    }

    /* renamed from: a */
    public final void mo53289a(GetEncryptedIdCreditParamsRequest getEncryptedIdCreditParamsRequest, axnw axnw) {
        this.f96217b.mo16659a(this.f96216a, new axhl(getEncryptedIdCreditParamsRequest, m82798a(getEncryptedIdCreditParamsRequest.f110811a), this.f96220e, axnw));
    }

    /* renamed from: a */
    public final void mo53290a(GetTransactionRequest getTransactionRequest, axnw axnw) {
        this.f96217b.mo16659a(this.f96216a, new axir(getTransactionRequest, m82798a(getTransactionRequest.f110816c), this.f96220e, axnw));
    }

    /* renamed from: a */
    public final void mo53291a(ValidateDraftTokenRequest validateDraftTokenRequest, axnw axnw) {
        this.f96217b.mo16659a(this.f96216a, new axkw(validateDraftTokenRequest, m82798a(validateDraftTokenRequest.f110848c), this.f96220e, axnw));
    }
}
