package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.walletp2p.internal.zeroparty.ClaimMoneyResponse;
import com.google.android.gms.walletp2p.internal.zeroparty.DeclineChallengeResponse;
import com.google.android.gms.walletp2p.internal.zeroparty.GetEncryptedIdCreditParamsResponse;
import com.google.android.gms.walletp2p.internal.zeroparty.GetTransactionResponse;
import com.google.android.gms.walletp2p.internal.zeroparty.ValidateDraftTokenResponse;

/* renamed from: axnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class axnv extends dck implements axnw {

    /* renamed from: a */
    public final aucf f96206a;

    /* renamed from: a */
    public void mo53065a(ClaimMoneyResponse claimMoneyResponse, Status status) {
        throw new UnsupportedOperationException();
    }

    public axnv(aucf aucf) {
        super("com.google.android.gms.walletp2p.internal.zeroparty.IZeroPartyWalletP2PServiceCallbacks");
        this.f96206a = aucf;
    }

    /* renamed from: a */
    public void mo53070a(DeclineChallengeResponse declineChallengeResponse, Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo53068a(GetEncryptedIdCreditParamsResponse getEncryptedIdCreditParamsResponse, Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo53066a(GetTransactionResponse getTransactionResponse, Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo53067a(ValidateDraftTokenResponse validateDraftTokenResponse, Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo53069a(boolean z, Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 5:
                mo53065a((ClaimMoneyResponse) dcl.m8163a(parcel, ClaimMoneyResponse.CREATOR), (Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 6:
                mo53066a((GetTransactionResponse) dcl.m8163a(parcel, GetTransactionResponse.CREATOR), (Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 7:
                mo53067a((ValidateDraftTokenResponse) dcl.m8163a(parcel, ValidateDraftTokenResponse.CREATOR), (Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 8:
                mo53068a((GetEncryptedIdCreditParamsResponse) dcl.m8163a(parcel, GetEncryptedIdCreditParamsResponse.CREATOR), (Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 9:
            default:
                return false;
            case 10:
                mo53069a(dcl.m8167a(parcel), (Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 11:
                mo53070a((DeclineChallengeResponse) dcl.m8163a(parcel, DeclineChallengeResponse.CREATOR), (Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
        }
    }
}
