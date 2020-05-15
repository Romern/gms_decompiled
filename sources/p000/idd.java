package p000;

import android.os.Parcel;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: idd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class idd extends dck implements ide {
    public idd() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 101:
                mo12919a((GoogleSignInAccount) dcl.m8163a(parcel, GoogleSignInAccount.CREATOR), (Status) dcl.m8163a(parcel, Status.CREATOR));
                break;
            case 102:
                mo12920a((Status) dcl.m8163a(parcel, Status.CREATOR));
                break;
            case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                mo12921b((Status) dcl.m8163a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
