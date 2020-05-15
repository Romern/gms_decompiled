package p000;

import android.os.IInterface;
import com.google.android.gms.walletp2p.internal.zeroparty.CheckIntegratorEligibilityRequest;
import com.google.android.gms.walletp2p.internal.zeroparty.ClaimMoneyRequest;
import com.google.android.gms.walletp2p.internal.zeroparty.DeclineChallengeRequest;
import com.google.android.gms.walletp2p.internal.zeroparty.GetEncryptedIdCreditParamsRequest;
import com.google.android.gms.walletp2p.internal.zeroparty.GetTransactionRequest;
import com.google.android.gms.walletp2p.internal.zeroparty.ValidateDraftTokenRequest;

/* renamed from: axnt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface axnt extends IInterface {
    /* renamed from: a */
    void mo53286a(CheckIntegratorEligibilityRequest checkIntegratorEligibilityRequest, axnw axnw);

    /* renamed from: a */
    void mo53287a(ClaimMoneyRequest claimMoneyRequest, axnw axnw);

    /* renamed from: a */
    void mo53288a(DeclineChallengeRequest declineChallengeRequest, axnw axnw);

    /* renamed from: a */
    void mo53289a(GetEncryptedIdCreditParamsRequest getEncryptedIdCreditParamsRequest, axnw axnw);

    /* renamed from: a */
    void mo53290a(GetTransactionRequest getTransactionRequest, axnw axnw);

    /* renamed from: a */
    void mo53291a(ValidateDraftTokenRequest validateDraftTokenRequest, axnw axnw);
}
