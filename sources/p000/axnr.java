package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.walletp2p.internal.zeroparty.CheckIntegratorEligibilityRequest;
import com.google.android.gms.walletp2p.internal.zeroparty.ClaimMoneyRequest;
import com.google.android.gms.walletp2p.internal.zeroparty.DeclineChallengeRequest;
import com.google.android.gms.walletp2p.internal.zeroparty.GetEncryptedIdCreditParamsRequest;
import com.google.android.gms.walletp2p.internal.zeroparty.GetTransactionRequest;
import com.google.android.gms.walletp2p.internal.zeroparty.ValidateDraftTokenRequest;

/* renamed from: axnr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axnr extends dcj implements axnt {
    public axnr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.walletp2p.internal.zeroparty.IZeroPartyWalletP2PService");
    }

    /* renamed from: a */
    public final void mo53286a(CheckIntegratorEligibilityRequest checkIntegratorEligibilityRequest, axnw axnw) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, checkIntegratorEligibilityRequest);
        dcl.m8164a(bj, axnw);
        mo8528b(10, bj);
    }

    /* renamed from: a */
    public final void mo53287a(ClaimMoneyRequest claimMoneyRequest, axnw axnw) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, claimMoneyRequest);
        dcl.m8164a(bj, axnw);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo53288a(DeclineChallengeRequest declineChallengeRequest, axnw axnw) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, declineChallengeRequest);
        dcl.m8164a(bj, axnw);
        mo8528b(11, bj);
    }

    /* renamed from: a */
    public final void mo53289a(GetEncryptedIdCreditParamsRequest getEncryptedIdCreditParamsRequest, axnw axnw) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getEncryptedIdCreditParamsRequest);
        dcl.m8164a(bj, axnw);
        mo8528b(8, bj);
    }

    /* renamed from: a */
    public final void mo53290a(GetTransactionRequest getTransactionRequest, axnw axnw) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getTransactionRequest);
        dcl.m8164a(bj, axnw);
        mo8528b(6, bj);
    }

    /* renamed from: a */
    public final void mo53291a(ValidateDraftTokenRequest validateDraftTokenRequest, axnw axnw) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, validateDraftTokenRequest);
        dcl.m8164a(bj, axnw);
        mo8528b(7, bj);
    }
}
