package p000;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;

/* renamed from: arwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class arwf extends dck implements arwg {
    public arwf() {
        super("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        arwd arwd = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks");
                    if (queryLocalInterface instanceof arwd) {
                        arwd = (arwd) queryLocalInterface;
                    } else {
                        arwd = new arwb(readStrongBinder);
                    }
                }
                mo48829a(arwd, (Account[]) parcel.createTypedArray(Account.CREATOR));
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks");
                    arwd = queryLocalInterface2 instanceof arwd ? (arwd) queryLocalInterface2 : new arwb(readStrongBinder2);
                }
                mo48833a(arwd, (UserBootstrapInfo[]) parcel.createTypedArray(UserBootstrapInfo.CREATOR));
                return true;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks");
                    if (queryLocalInterface3 instanceof arwd) {
                        arwd = (arwd) queryLocalInterface3;
                    } else {
                        arwd = new arwb(readStrongBinder3);
                    }
                }
                mo48831a(arwd, (Challenge[]) parcel.createTypedArray(Challenge.CREATOR), dcl.m8167a(parcel));
                return true;
            case 4:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks");
                    if (queryLocalInterface4 instanceof arwd) {
                        arwd = (arwd) queryLocalInterface4;
                    } else {
                        arwd = new arwb(readStrongBinder4);
                    }
                }
                mo48830a(arwd, (Assertion[]) parcel.createTypedArray(Assertion.CREATOR));
                return true;
            case 5:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks");
                    if (queryLocalInterface5 instanceof arwd) {
                        arwd = (arwd) queryLocalInterface5;
                    } else {
                        arwd = new arwb(readStrongBinder5);
                    }
                }
                mo48826a(arwd, (ExchangeAssertionsForUserCredentialsRequest) dcl.m8163a(parcel, ExchangeAssertionsForUserCredentialsRequest.CREATOR));
                return true;
            case 6:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks");
                    if (queryLocalInterface6 instanceof arwd) {
                        arwd = (arwd) queryLocalInterface6;
                    } else {
                        arwd = new arwb(readStrongBinder6);
                    }
                }
                mo48836b(arwd, (ExchangeAssertionsForUserCredentialsRequest) dcl.m8163a(parcel, ExchangeAssertionsForUserCredentialsRequest.CREATOR));
                return true;
            case 7:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks");
                    if (queryLocalInterface7 instanceof arwd) {
                        arwd = (arwd) queryLocalInterface7;
                    } else {
                        arwd = new arwb(readStrongBinder7);
                    }
                }
                mo48837c(arwd, (ExchangeAssertionsForUserCredentialsRequest) dcl.m8163a(parcel, ExchangeAssertionsForUserCredentialsRequest.CREATOR));
                return true;
            case 8:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks");
                    if (queryLocalInterface8 instanceof arwd) {
                        arwd = (arwd) queryLocalInterface8;
                    } else {
                        arwd = new arwb(readStrongBinder8);
                    }
                }
                mo48828a(arwd, dcl.m8167a(parcel));
                return true;
            case 9:
                mo48824a();
                return true;
            case 10:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks");
                    if (queryLocalInterface9 instanceof arwd) {
                        arwd = (arwd) queryLocalInterface9;
                    } else {
                        arwd = new arwb(readStrongBinder9);
                    }
                }
                mo48827a(arwd, (ExchangeSessionCheckpointsForUserCredentialsRequest) dcl.m8163a(parcel, ExchangeSessionCheckpointsForUserCredentialsRequest.CREATOR));
                return true;
            case 11:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks");
                    if (queryLocalInterface10 instanceof arwd) {
                        arwd = (arwd) queryLocalInterface10;
                    } else {
                        arwd = new arwb(readStrongBinder10);
                    }
                }
                mo48832a(arwd, (Challenge[]) parcel.createTypedArray(Challenge.CREATOR), dcl.m8167a(parcel), dcl.m8167a(parcel));
                return true;
            case 12:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks");
                    if (queryLocalInterface11 instanceof arwd) {
                        arwd = (arwd) queryLocalInterface11;
                    } else {
                        arwd = new arwb(readStrongBinder11);
                    }
                }
                mo48825a(arwd);
                return true;
            default:
                return false;
        }
    }
}
