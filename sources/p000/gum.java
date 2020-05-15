package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import com.google.android.gms.auth.api.accounttransfer.internal.DeviceMetaDataRequest;
import com.google.android.gms.auth.api.accounttransfer.internal.NotifyCompletionRequest;
import com.google.android.gms.auth.api.accounttransfer.internal.RetrieveDataRequest;
import com.google.android.gms.auth.api.accounttransfer.internal.SendDataRequest;
import com.google.android.gms.auth.api.accounttransfer.internal.UserChallengeRequest;

/* renamed from: gum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class gum extends dck implements gun {
    public gum() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        guk guk = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
                    if (queryLocalInterface instanceof guk) {
                        guk = (guk) queryLocalInterface;
                    } else {
                        guk = new gui(readStrongBinder);
                    }
                }
                mo12179a(guk, (AccountTransferMsg) dcl.m8163a(parcel, AccountTransferMsg.CREATOR));
                break;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
                    guk = queryLocalInterface2 instanceof guk ? (guk) queryLocalInterface2 : new gui(readStrongBinder2);
                }
                mo12186b(guk, (AccountTransferMsg) dcl.m8163a(parcel, AccountTransferMsg.CREATOR));
                break;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
                    if (queryLocalInterface3 instanceof guk) {
                        guk = (guk) queryLocalInterface3;
                    } else {
                        guk = new gui(readStrongBinder3);
                    }
                }
                mo12180a(guk, (AuthenticatorTransferInfo) dcl.m8163a(parcel, AuthenticatorTransferInfo.CREATOR));
                break;
            case 4:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
                    if (queryLocalInterface4 instanceof guk) {
                        guk = (guk) queryLocalInterface4;
                    } else {
                        guk = new gui(readStrongBinder4);
                    }
                }
                mo12187b(guk, (AuthenticatorTransferInfo) dcl.m8163a(parcel, AuthenticatorTransferInfo.CREATOR));
                break;
            case 5:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
                    if (queryLocalInterface5 instanceof guk) {
                        guk = (guk) queryLocalInterface5;
                    } else {
                        guk = new gui(readStrongBinder5);
                    }
                }
                mo12184a(guk, (SendDataRequest) dcl.m8163a(parcel, SendDataRequest.CREATOR));
                break;
            case 6:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
                    if (queryLocalInterface6 instanceof guk) {
                        guk = (guk) queryLocalInterface6;
                    } else {
                        guk = new gui(readStrongBinder6);
                    }
                }
                mo12183a(guk, (RetrieveDataRequest) dcl.m8163a(parcel, RetrieveDataRequest.CREATOR));
                break;
            case 7:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
                    if (queryLocalInterface7 instanceof guk) {
                        guk = (guk) queryLocalInterface7;
                    } else {
                        guk = new gui(readStrongBinder7);
                    }
                }
                mo12181a(guk, (DeviceMetaDataRequest) dcl.m8163a(parcel, DeviceMetaDataRequest.CREATOR));
                break;
            case 8:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
                    if (queryLocalInterface8 instanceof guk) {
                        guk = (guk) queryLocalInterface8;
                    } else {
                        guk = new gui(readStrongBinder8);
                    }
                }
                mo12185a(guk, (UserChallengeRequest) dcl.m8163a(parcel, UserChallengeRequest.CREATOR));
                break;
            case 9:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
                    if (queryLocalInterface9 instanceof guk) {
                        guk = (guk) queryLocalInterface9;
                    } else {
                        guk = new gui(readStrongBinder9);
                    }
                }
                mo12182a(guk, (NotifyCompletionRequest) dcl.m8163a(parcel, NotifyCompletionRequest.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
