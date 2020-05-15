package p000;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;

/* renamed from: hwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class hwh extends dck implements hwi {
    public hwh() {
        super("com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        rnr rnr;
        hwl hwl = null;
        hwb hwb = null;
        rnr rnr2 = null;
        hwe hwe = null;
        rnt rnt = null;
        hwo hwo = null;
        rnt rnt2 = null;
        rnt rnt3 = null;
        rnt rnt4 = null;
        rnt rnt5 = null;
        hvw hvw = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IListSignInCredentialsCallback");
                    if (queryLocalInterface instanceof hwl) {
                        hwl = (hwl) queryLocalInterface;
                    } else {
                        hwl = new hwj(readStrongBinder);
                    }
                }
                mo12583a(hwl, parcel.readString(), (BeginSignInRequest) dcl.m8163a(parcel, BeginSignInRequest.CREATOR));
                break;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICompleteSignInCallback");
                    hvw = queryLocalInterface2 instanceof hvw ? (hvw) queryLocalInterface2 : new hvu(readStrongBinder2);
                }
                mo12580a(hvw, parcel.readString(), (BeginSignInRequest) dcl.m8163a(parcel, BeginSignInRequest.CREATOR), (InternalSignInCredentialWrapper) dcl.m8163a(parcel, InternalSignInCredentialWrapper.CREATOR));
                break;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface3 instanceof rnt) {
                        rnt5 = (rnt) queryLocalInterface3;
                    } else {
                        rnt5 = new rnr(readStrongBinder3);
                    }
                }
                mo12588a(rnt5, parcel.readString(), parcel.readString(), (Account) dcl.m8163a(parcel, Account.CREATOR));
                break;
            case 4:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface4 instanceof rnt) {
                        rnt4 = (rnt) queryLocalInterface4;
                    } else {
                        rnt4 = new rnr(readStrongBinder4);
                    }
                }
                mo12590b(rnt4, parcel.readString(), parcel.readString(), (Account) dcl.m8163a(parcel, Account.CREATOR));
                break;
            case 5:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface5 instanceof rnt) {
                        rnt3 = (rnt) queryLocalInterface5;
                    } else {
                        rnt3 = new rnr(readStrongBinder5);
                    }
                }
                mo12587a(rnt3, parcel.readString(), parcel.readString());
                break;
            case 6:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface6 instanceof rnt) {
                        rnt2 = (rnt) queryLocalInterface6;
                    } else {
                        rnt2 = new rnr(readStrongBinder6);
                    }
                }
                mo12589b(rnt2, parcel.readString(), parcel.readString());
                break;
            case 7:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IMatchPasswordCallback");
                    if (queryLocalInterface7 instanceof hwo) {
                        hwo = (hwo) queryLocalInterface7;
                    } else {
                        hwo = new hwm(readStrongBinder7);
                    }
                }
                mo12584a(hwo, (SavePasswordRequest) dcl.m8163a(parcel, SavePasswordRequest.CREATOR), parcel.readString());
                break;
            case 8:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface8 instanceof rnt) {
                        rnt = (rnt) queryLocalInterface8;
                    } else {
                        rnt = new rnr(readStrongBinder8);
                    }
                }
                mo12586a(rnt, (SavePasswordRequest) dcl.m8163a(parcel, SavePasswordRequest.CREATOR), parcel.createTypedArrayList(Account.CREATOR), parcel.readString());
                break;
            case 9:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IGetDefaultAccountCallback");
                    if (queryLocalInterface9 instanceof hwe) {
                        hwe = (hwe) queryLocalInterface9;
                    } else {
                        hwe = new hwc(readStrongBinder9);
                    }
                }
                mo12582a(hwe, parcel.readString(), parcel.readString());
                break;
            case 10:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface10 instanceof rnt) {
                        rnr = (rnt) queryLocalInterface10;
                        mo12585a(rnr, (SaveAccountLinkingTokenRequest) dcl.m8163a(parcel, SaveAccountLinkingTokenRequest.CREATOR), parcel.readString(), (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readString());
                        break;
                    } else {
                        rnr2 = new rnr(readStrongBinder10);
                    }
                }
                rnr = rnr2;
                mo12585a(rnr, (SaveAccountLinkingTokenRequest) dcl.m8163a(parcel, SaveAccountLinkingTokenRequest.CREATOR), parcel.readString(), (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readString());
            case 11:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IGetCachedSaveAccountLinkingTokenRequestCallback");
                    if (queryLocalInterface11 instanceof hwb) {
                        hwb = (hwb) queryLocalInterface11;
                    } else {
                        hwb = new hvz(readStrongBinder11);
                    }
                }
                mo12581a(hwb, parcel.readString(), parcel.readString());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
