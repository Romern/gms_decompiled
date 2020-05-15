package p000;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;

/* renamed from: gom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class gom extends dck implements gon {
    public gom() {
        super("com.google.android.gms.auth.account.data.IAccountDataService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        rnt rnt = null;
        gpd gpd = null;
        gpb gpb = null;
        got got = null;
        gos gos = null;
        gou gou = null;
        gpa gpa = null;
        gop gop = null;
        gpc gpc = null;
        if (i != 1) {
            switch (i) {
                case 4:
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGetTokenCallback");
                        gpc = queryLocalInterface instanceof gpc ? (gpc) queryLocalInterface : new gpc(readStrongBinder);
                    }
                    mo12102a(gpc, (TokenRequest) dcl.m8163a(parcel, TokenRequest.CREATOR));
                    break;
                case 5:
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.auth.account.data.IClearTokenCallback");
                        if (queryLocalInterface2 instanceof gop) {
                            gop = (gop) queryLocalInterface2;
                        } else {
                            gop = new gop(readStrongBinder2);
                        }
                    }
                    mo12096a(gop, (ClearTokenRequest) dcl.m8163a(parcel, ClearTokenRequest.CREATOR));
                    break;
                case 6:
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.auth.account.data.IGetDeviceManagementInfoCallback");
                        if (queryLocalInterface3 instanceof gpa) {
                            gpa = (gpa) queryLocalInterface3;
                        } else {
                            gpa = new goy(readStrongBinder3);
                        }
                    }
                    mo12100a(gpa, (Account) dcl.m8163a(parcel, Account.CREATOR));
                    break;
                case 7:
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.auth.account.data.IGetAccountIdCallback");
                        if (queryLocalInterface4 instanceof gou) {
                            gou = (gou) queryLocalInterface4;
                        } else {
                            gou = new gou(readStrongBinder4);
                        }
                    }
                    mo12099a(gou, (Account) dcl.m8163a(parcel, Account.CREATOR));
                    break;
                case 8:
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
                        if (queryLocalInterface5 instanceof gos) {
                            gos = (gos) queryLocalInterface5;
                        } else {
                            gos = new goq(readStrongBinder5);
                        }
                    }
                    mo12097a(gos, (AccountChangeEventsRequest) dcl.m8163a(parcel, AccountChangeEventsRequest.CREATOR));
                    break;
                case 9:
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.auth.account.data.IGetAccountExportDataCallback");
                        if (queryLocalInterface6 instanceof got) {
                            got = (got) queryLocalInterface6;
                        } else {
                            got = new got(readStrongBinder6);
                        }
                    }
                    mo12098a(got, parcel.readString());
                    break;
                case 10:
                    IBinder readStrongBinder7 = parcel.readStrongBinder();
                    if (readStrongBinder7 != null) {
                        IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.auth.account.data.IGetGoogleAccountDataCallback");
                        if (queryLocalInterface7 instanceof gpb) {
                            gpb = (gpb) queryLocalInterface7;
                        } else {
                            gpb = new gpb(readStrongBinder7);
                        }
                    }
                    mo12101a(gpb, (Account) dcl.m8163a(parcel, Account.CREATOR));
                    break;
                case 11:
                    IBinder readStrongBinder8 = parcel.readStrongBinder();
                    if (readStrongBinder8 != null) {
                        IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.auth.account.data.IGetTokenHandleCallback");
                        if (queryLocalInterface8 instanceof gpd) {
                            gpd = (gpd) queryLocalInterface8;
                        } else {
                            gpd = new gpd(readStrongBinder8);
                        }
                    }
                    mo12103a(gpd, parcel.readString());
                    break;
                default:
                    return false;
            }
        } else {
            IBinder readStrongBinder9 = parcel.readStrongBinder();
            if (readStrongBinder9 != null) {
                IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                if (queryLocalInterface9 instanceof rnt) {
                    rnt = (rnt) queryLocalInterface9;
                } else {
                    rnt = new rnr(readStrongBinder9);
                }
            }
            mo12104a(rnt, (Account) dcl.m8163a(parcel, Account.CREATOR), dcl.m8167a(parcel));
        }
        parcel2.writeNoException();
        return true;
    }
}
