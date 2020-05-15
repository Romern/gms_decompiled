package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.GetAccountsRequest;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;

/* renamed from: gpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class gpi extends dck implements gpj {
    public gpi() {
        super("com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        gpg gpg = null;
        goo goo = null;
        gox gox = null;
        gos gos = null;
        goo goo2 = null;
        rnt rnt = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback");
                    if (queryLocalInterface instanceof gpg) {
                        gpg = (gpg) queryLocalInterface;
                    } else {
                        gpg = new gpe(readStrongBinder);
                    }
                }
                mo12110a(gpg, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readString(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                break;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    rnt = queryLocalInterface2 instanceof rnt ? (rnt) queryLocalInterface2 : new rnr(readStrongBinder2);
                }
                mo12111a(rnt, (ClearTokenRequest) dcl.m8163a(parcel, ClearTokenRequest.CREATOR));
                break;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.auth.account.data.IBundleCallback");
                    if (queryLocalInterface3 instanceof goo) {
                        goo2 = (goo) queryLocalInterface3;
                    } else {
                        goo2 = new goo(readStrongBinder3);
                    }
                }
                mo12107a(goo2, parcel.readString());
                break;
            case 4:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
                    if (queryLocalInterface4 instanceof gos) {
                        gos = (gos) queryLocalInterface4;
                    } else {
                        gos = new goq(readStrongBinder4);
                    }
                }
                mo12108a(gos, (AccountChangeEventsRequest) dcl.m8163a(parcel, AccountChangeEventsRequest.CREATOR));
                break;
            case 5:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.auth.account.data.IGetAccountsCallback");
                    if (queryLocalInterface5 instanceof gox) {
                        gox = (gox) queryLocalInterface5;
                    } else {
                        gox = new gov(readStrongBinder5);
                    }
                }
                mo12109a(gox, (GetAccountsRequest) dcl.m8163a(parcel, GetAccountsRequest.CREATOR));
                break;
            case 6:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.auth.account.data.IBundleCallback");
                    if (queryLocalInterface6 instanceof goo) {
                        goo = (goo) queryLocalInterface6;
                    } else {
                        goo = new goo(readStrongBinder6);
                    }
                }
                mo12106a(goo, (Account) dcl.m8163a(parcel, Account.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
