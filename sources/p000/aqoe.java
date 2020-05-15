package p000;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.CheckServerAuthResult;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultRequest;
import com.google.android.gms.signin.internal.RecordConsentRequest;
import com.google.android.gms.signin.internal.SignInRequest;

/* renamed from: aqoe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aqoe extends dck implements aqof {
    public aqoe() {
        super("com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        aqoc aqoc = null;
        aqoc aqoc2 = null;
        aqoc aqoc3 = null;
        aqoc aqoc4 = null;
        aqoc aqoc5 = null;
        scb scb = null;
        aqoc aqoc6 = null;
        sct sct = null;
        switch (i) {
            case 2:
                AuthAccountRequest authAccountRequest = (AuthAccountRequest) dcl.m8163a(parcel, AuthAccountRequest.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                    if (queryLocalInterface instanceof aqoc) {
                        aqoc = (aqoc) queryLocalInterface;
                    } else {
                        aqoc = new aqoa(readStrongBinder);
                    }
                }
                mo48001a(authAccountRequest, aqoc);
                break;
            case 3:
                CheckServerAuthResult checkServerAuthResult = (CheckServerAuthResult) dcl.m8163a(parcel, CheckServerAuthResult.CREATOR);
                mo47997a();
                break;
            case 4:
                dcl.m8167a(parcel);
                mo48008c();
                break;
            case 5:
                ResolveAccountRequest resolveAccountRequest = (ResolveAccountRequest) dcl.m8163a(parcel, ResolveAccountRequest.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
                    if (queryLocalInterface2 instanceof sct) {
                        sct = (sct) queryLocalInterface2;
                    } else {
                        sct = new scr(readStrongBinder2);
                    }
                }
                mo48002a(resolveAccountRequest, sct);
                break;
            case 6:
            default:
                return false;
            case 7:
                mo47998a(parcel.readInt());
                break;
            case 8:
                int readInt = parcel.readInt();
                Account account = (Account) dcl.m8163a(parcel, Account.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                    if (queryLocalInterface3 instanceof aqoc) {
                        aqoc6 = (aqoc) queryLocalInterface3;
                    } else {
                        aqoc6 = new aqoa(readStrongBinder3);
                    }
                }
                mo47999a(readInt, account, aqoc6);
                break;
            case 9:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                    if (queryLocalInterface4 instanceof scb) {
                        scb = (scb) queryLocalInterface4;
                    } else {
                        scb = new sbz(readStrongBinder4);
                    }
                }
                mo48006a(scb, parcel.readInt(), dcl.m8167a(parcel));
                break;
            case 10:
                RecordConsentRequest recordConsentRequest = (RecordConsentRequest) dcl.m8163a(parcel, RecordConsentRequest.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                    if (queryLocalInterface5 instanceof aqoc) {
                        aqoc5 = (aqoc) queryLocalInterface5;
                    } else {
                        aqoc5 = new aqoa(readStrongBinder5);
                    }
                }
                mo48004a(recordConsentRequest, aqoc5);
                break;
            case 11:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                    if (queryLocalInterface6 instanceof aqoc) {
                        aqoc4 = (aqoc) queryLocalInterface6;
                    } else {
                        aqoc4 = new aqoa(readStrongBinder6);
                    }
                }
                mo48000a(aqoc4);
                break;
            case 12:
                SignInRequest signInRequest = (SignInRequest) dcl.m8163a(parcel, SignInRequest.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                    if (queryLocalInterface7 instanceof aqoc) {
                        aqoc3 = (aqoc) queryLocalInterface7;
                    } else {
                        aqoc3 = new aqoa(readStrongBinder7);
                    }
                }
                mo48005a(signInRequest, aqoc3);
                break;
            case 13:
                mo48007a(dcl.m8167a(parcel));
                break;
            case 14:
                RecordConsentByConsentResultRequest recordConsentByConsentResultRequest = (RecordConsentByConsentResultRequest) dcl.m8163a(parcel, RecordConsentByConsentResultRequest.CREATOR);
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                    if (queryLocalInterface8 instanceof aqoc) {
                        aqoc2 = (aqoc) queryLocalInterface8;
                    } else {
                        aqoc2 = new aqoa(readStrongBinder8);
                    }
                }
                mo48003a(recordConsentByConsentResultRequest, aqoc2);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
