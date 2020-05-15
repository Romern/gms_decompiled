package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.walletp2p.internal.firstparty.CheckEligibilityRequest;
import com.google.android.gms.walletp2p.internal.firstparty.CheckRecipientEligibilityRequest;
import com.google.android.gms.walletp2p.internal.firstparty.ConfirmTransactionRequest;
import com.google.android.gms.walletp2p.internal.firstparty.GetTransactionDetailsRequest;

/* renamed from: axna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class axna extends dck implements axnb {
    public axna() {
        super("com.google.android.gms.walletp2p.internal.firstparty.IFirstPartyWalletP2PService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        axnc axnc = null;
        if (i == 1) {
            CheckEligibilityRequest checkEligibilityRequest = (CheckEligibilityRequest) dcl.m8163a(parcel, CheckEligibilityRequest.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.walletp2p.internal.firstparty.IFirstPartyWalletP2PServiceCallbacks");
                if (queryLocalInterface instanceof axnc) {
                    axnc = (axnc) queryLocalInterface;
                } else {
                    axnc = new axnc(readStrongBinder);
                }
            }
            mo53258a(checkEligibilityRequest, axnc);
        } else if (i == 2) {
            GetTransactionDetailsRequest getTransactionDetailsRequest = (GetTransactionDetailsRequest) dcl.m8163a(parcel, GetTransactionDetailsRequest.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.walletp2p.internal.firstparty.IFirstPartyWalletP2PServiceCallbacks");
                if (queryLocalInterface2 instanceof axnc) {
                    axnc = (axnc) queryLocalInterface2;
                } else {
                    axnc = new axnc(readStrongBinder2);
                }
            }
            mo53261a(getTransactionDetailsRequest, axnc);
        } else if (i == 3) {
            ConfirmTransactionRequest confirmTransactionRequest = (ConfirmTransactionRequest) dcl.m8163a(parcel, ConfirmTransactionRequest.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.walletp2p.internal.firstparty.IFirstPartyWalletP2PServiceCallbacks");
                if (queryLocalInterface3 instanceof axnc) {
                    axnc = (axnc) queryLocalInterface3;
                } else {
                    axnc = new axnc(readStrongBinder3);
                }
            }
            mo53260a(confirmTransactionRequest, axnc);
        } else if (i != 4) {
            return false;
        } else {
            CheckRecipientEligibilityRequest checkRecipientEligibilityRequest = (CheckRecipientEligibilityRequest) dcl.m8163a(parcel, CheckRecipientEligibilityRequest.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.walletp2p.internal.firstparty.IFirstPartyWalletP2PServiceCallbacks");
                if (queryLocalInterface4 instanceof axnc) {
                    axnc = (axnc) queryLocalInterface4;
                } else {
                    axnc = new axnc(readStrongBinder4);
                }
            }
            mo53259a(checkRecipientEligibilityRequest, axnc);
        }
        parcel2.writeNoException();
        return true;
    }
}
