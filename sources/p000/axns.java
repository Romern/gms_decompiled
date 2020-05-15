package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.walletp2p.internal.zeroparty.CheckIntegratorEligibilityRequest;
import com.google.android.gms.walletp2p.internal.zeroparty.ClaimMoneyRequest;
import com.google.android.gms.walletp2p.internal.zeroparty.DeclineChallengeRequest;
import com.google.android.gms.walletp2p.internal.zeroparty.GetEncryptedIdCreditParamsRequest;
import com.google.android.gms.walletp2p.internal.zeroparty.GetTransactionRequest;
import com.google.android.gms.walletp2p.internal.zeroparty.ValidateDraftTokenRequest;

/* renamed from: axns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class axns extends dck implements axnt {
    public axns() {
        super("com.google.android.gms.walletp2p.internal.zeroparty.IZeroPartyWalletP2PService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        axnw axnw = null;
        switch (i) {
            case 5:
                ClaimMoneyRequest claimMoneyRequest = (ClaimMoneyRequest) dcl.m8163a(parcel, ClaimMoneyRequest.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.walletp2p.internal.zeroparty.IZeroPartyWalletP2PServiceCallbacks");
                    if (queryLocalInterface instanceof axnw) {
                        axnw = (axnw) queryLocalInterface;
                    } else {
                        axnw = new axnu(readStrongBinder);
                    }
                }
                mo53287a(claimMoneyRequest, axnw);
                break;
            case 6:
                GetTransactionRequest getTransactionRequest = (GetTransactionRequest) dcl.m8163a(parcel, GetTransactionRequest.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.walletp2p.internal.zeroparty.IZeroPartyWalletP2PServiceCallbacks");
                    axnw = queryLocalInterface2 instanceof axnw ? (axnw) queryLocalInterface2 : new axnu(readStrongBinder2);
                }
                mo53290a(getTransactionRequest, axnw);
                break;
            case 7:
                ValidateDraftTokenRequest validateDraftTokenRequest = (ValidateDraftTokenRequest) dcl.m8163a(parcel, ValidateDraftTokenRequest.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.walletp2p.internal.zeroparty.IZeroPartyWalletP2PServiceCallbacks");
                    if (queryLocalInterface3 instanceof axnw) {
                        axnw = (axnw) queryLocalInterface3;
                    } else {
                        axnw = new axnu(readStrongBinder3);
                    }
                }
                mo53291a(validateDraftTokenRequest, axnw);
                break;
            case 8:
                GetEncryptedIdCreditParamsRequest getEncryptedIdCreditParamsRequest = (GetEncryptedIdCreditParamsRequest) dcl.m8163a(parcel, GetEncryptedIdCreditParamsRequest.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.walletp2p.internal.zeroparty.IZeroPartyWalletP2PServiceCallbacks");
                    if (queryLocalInterface4 instanceof axnw) {
                        axnw = (axnw) queryLocalInterface4;
                    } else {
                        axnw = new axnu(readStrongBinder4);
                    }
                }
                mo53289a(getEncryptedIdCreditParamsRequest, axnw);
                break;
            case 9:
            default:
                return false;
            case 10:
                CheckIntegratorEligibilityRequest checkIntegratorEligibilityRequest = (CheckIntegratorEligibilityRequest) dcl.m8163a(parcel, CheckIntegratorEligibilityRequest.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.walletp2p.internal.zeroparty.IZeroPartyWalletP2PServiceCallbacks");
                    if (queryLocalInterface5 instanceof axnw) {
                        axnw = (axnw) queryLocalInterface5;
                    } else {
                        axnw = new axnu(readStrongBinder5);
                    }
                }
                mo53286a(checkIntegratorEligibilityRequest, axnw);
                break;
            case 11:
                DeclineChallengeRequest declineChallengeRequest = (DeclineChallengeRequest) dcl.m8163a(parcel, DeclineChallengeRequest.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.walletp2p.internal.zeroparty.IZeroPartyWalletP2PServiceCallbacks");
                    if (queryLocalInterface6 instanceof axnw) {
                        axnw = (axnw) queryLocalInterface6;
                    } else {
                        axnw = new axnu(readStrongBinder6);
                    }
                }
                mo53288a(declineChallengeRequest, axnw);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
