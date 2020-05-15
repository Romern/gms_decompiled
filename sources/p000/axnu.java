package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.walletp2p.internal.zeroparty.ClaimMoneyResponse;
import com.google.android.gms.walletp2p.internal.zeroparty.DeclineChallengeResponse;
import com.google.android.gms.walletp2p.internal.zeroparty.GetEncryptedIdCreditParamsResponse;
import com.google.android.gms.walletp2p.internal.zeroparty.GetTransactionResponse;
import com.google.android.gms.walletp2p.internal.zeroparty.ValidateDraftTokenResponse;

/* renamed from: axnu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axnu extends dcj implements axnw {
    public axnu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.walletp2p.internal.zeroparty.IZeroPartyWalletP2PServiceCallbacks");
    }

    /* renamed from: a */
    public final void mo53065a(ClaimMoneyResponse claimMoneyResponse, Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, claimMoneyResponse);
        dcl.m8165a(bj, status);
        mo8530c(5, bj);
    }

    /* renamed from: a */
    public final void mo53070a(DeclineChallengeResponse declineChallengeResponse, Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, declineChallengeResponse);
        dcl.m8165a(bj, status);
        mo8530c(11, bj);
    }

    /* renamed from: a */
    public final void mo53068a(GetEncryptedIdCreditParamsResponse getEncryptedIdCreditParamsResponse, Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getEncryptedIdCreditParamsResponse);
        dcl.m8165a(bj, status);
        mo8530c(8, bj);
    }

    /* renamed from: a */
    public final void mo53066a(GetTransactionResponse getTransactionResponse, Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getTransactionResponse);
        dcl.m8165a(bj, status);
        mo8530c(6, bj);
    }

    /* renamed from: a */
    public final void mo53067a(ValidateDraftTokenResponse validateDraftTokenResponse, Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, validateDraftTokenResponse);
        dcl.m8165a(bj, status);
        mo8530c(7, bj);
    }

    /* renamed from: a */
    public final void mo53069a(boolean z, Status status) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, z);
        dcl.m8165a(bj, status);
        mo8530c(10, bj);
    }
}
