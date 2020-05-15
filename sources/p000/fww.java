package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.p015ui.context.SelectionFragmentOptions;
import java.util.List;

/* renamed from: fww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class fww extends dck implements fwx {
    public fww() {
        super("com.google.android.gms.appinvite.ui.context.ISelectionFragmentHolder");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            vzr vzr = null;
            fwu fwu = null;
            fwr fwr = null;
            if (i == 2) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    vzr = queryLocalInterface instanceof vzr ? (vzr) queryLocalInterface : new vzp(readStrongBinder);
                }
                mo7285a(vzr);
                parcel2.writeNoException();
            } else if (i != 3) {
                switch (i) {
                    case 101:
                        List c = mo7289c();
                        parcel2.writeNoException();
                        parcel2.writeTypedList(c);
                        break;
                    case 102:
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.appinvite.ui.context.ILoadingListener");
                            if (queryLocalInterface2 instanceof fwr) {
                                fwr = (fwr) queryLocalInterface2;
                            } else {
                                fwr = new fwp(readStrongBinder2);
                            }
                        }
                        mo7283a(fwr);
                        parcel2.writeNoException();
                        break;
                    case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                        IBinder readStrongBinder3 = parcel.readStrongBinder();
                        if (readStrongBinder3 != null) {
                            IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.appinvite.ui.context.ISelectionChangeListener");
                            if (queryLocalInterface3 instanceof fwu) {
                                fwu = (fwu) queryLocalInterface3;
                            } else {
                                fwu = new fws(readStrongBinder3);
                            }
                        }
                        mo7284a(fwu);
                        parcel2.writeNoException();
                        break;
                    case ErrorInfo.TYPE_SDU_FAILED:
                        mo7286a(dcl.m8167a(parcel));
                        parcel2.writeNoException();
                        break;
                    case ErrorInfo.TYPE_SDU_MEMORY_FULL:
                        mo7281a((ContactPerson) dcl.m8163a(parcel, ContactPerson.CREATOR));
                        parcel2.writeNoException();
                        break;
                    case 106:
                        mo7288b((ContactPerson) dcl.m8163a(parcel, ContactPerson.CREATOR));
                        parcel2.writeNoException();
                        break;
                    case 107:
                        mo7280a(parcel.readInt());
                        parcel2.writeNoException();
                        break;
                    case 108:
                        mo7287b(parcel.readInt());
                        parcel2.writeNoException();
                        break;
                    default:
                        return false;
                }
            } else {
                mo7282a((SelectionFragmentOptions) dcl.m8163a(parcel, SelectionFragmentOptions.CREATOR));
                parcel2.writeNoException();
            }
        } else {
            vzr a = mo7279a();
            parcel2.writeNoException();
            dcl.m8164a(parcel2, a);
        }
        return true;
    }
}
