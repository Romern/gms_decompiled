package p000;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.walletp2p.internal.zeroparty.ClaimMoneyResponse;
import com.google.android.gms.walletp2p.internal.zeroparty.DeclineChallengeResponse;
import com.google.android.gms.walletp2p.internal.zeroparty.GetEncryptedIdCreditParamsResponse;
import com.google.android.gms.walletp2p.internal.zeroparty.GetTransactionResponse;
import com.google.android.gms.walletp2p.internal.zeroparty.ValidateDraftTokenResponse;

/* renamed from: axnw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface axnw extends IInterface {
    /* renamed from: a */
    void mo53065a(ClaimMoneyResponse claimMoneyResponse, Status status);

    /* renamed from: a */
    void mo53070a(DeclineChallengeResponse declineChallengeResponse, Status status);

    /* renamed from: a */
    void mo53068a(GetEncryptedIdCreditParamsResponse getEncryptedIdCreditParamsResponse, Status status);

    /* renamed from: a */
    void mo53066a(GetTransactionResponse getTransactionResponse, Status status);

    /* renamed from: a */
    void mo53067a(ValidateDraftTokenResponse validateDraftTokenResponse, Status status);

    /* renamed from: a */
    void mo53069a(boolean z, Status status);
}
