package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fido.u2f.api.StateUpdate;
import com.google.android.gms.fido.u2f.api.common.BrowserRegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;

/* renamed from: ybe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ybe extends dck implements ybf {
    public ybe() {
        super("com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        rnt rnt;
        rnt rnt2;
        xxf xxf = null;
        rnt rnt3 = null;
        xxc xxc = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                rnt = queryLocalInterface instanceof rnt ? (rnt) queryLocalInterface : new rnr(readStrongBinder);
            } else {
                rnt = null;
            }
            BrowserSignRequestParams browserSignRequestParams = (BrowserSignRequestParams) dcl.m8163a(parcel, BrowserSignRequestParams.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.fido.u2f.api.ISignResponseHandler");
                if (queryLocalInterface2 instanceof xxf) {
                    xxf = (xxf) queryLocalInterface2;
                } else {
                    xxf = new xxd(readStrongBinder2);
                }
            }
            mo30342a(rnt, browserSignRequestParams, xxf);
        } else if (i == 2) {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                rnt2 = queryLocalInterface3 instanceof rnt ? (rnt) queryLocalInterface3 : new rnr(readStrongBinder3);
            } else {
                rnt2 = null;
            }
            BrowserRegisterRequestParams browserRegisterRequestParams = (BrowserRegisterRequestParams) dcl.m8163a(parcel, BrowserRegisterRequestParams.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.fido.u2f.api.IRegisterResponseHandler");
                if (queryLocalInterface4 instanceof xxc) {
                    xxc = (xxc) queryLocalInterface4;
                } else {
                    xxc = new xxc(readStrongBinder4);
                }
            }
            mo30341a(rnt2, browserRegisterRequestParams, xxc);
        } else if (i != 3) {
            return false;
        } else {
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                if (queryLocalInterface5 instanceof rnt) {
                    rnt3 = (rnt) queryLocalInterface5;
                } else {
                    rnt3 = new rnr(readStrongBinder5);
                }
            }
            mo30340a(rnt3, (StateUpdate) dcl.m8163a(parcel, StateUpdate.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
