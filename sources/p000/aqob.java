package p000;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultResponse;
import com.google.android.gms.signin.internal.SignInResponse;

/* renamed from: aqob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aqob extends dck implements aqoc {
    public aqob() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* renamed from: a */
    public void mo47990a(ConnectionResult connectionResult, AuthAccountResult authAccountResult) {
    }

    /* renamed from: a */
    public void mo47988a(Status status) {
    }

    /* renamed from: a */
    public void mo47987a(Status status, GoogleSignInAccount googleSignInAccount) {
    }

    /* renamed from: a */
    public void mo47992a(RecordConsentByConsentResultResponse recordConsentByConsentResultResponse) {
    }

    /* renamed from: a */
    public void mo24903a(SignInResponse signInResponse) {
    }

    /* renamed from: b */
    public void mo47989b(Status status) {
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                mo47990a((ConnectionResult) dcl.m8163a(parcel, ConnectionResult.CREATOR), (AuthAccountResult) dcl.m8163a(parcel, AuthAccountResult.CREATOR));
                break;
            case 4:
                mo47988a((Status) dcl.m8163a(parcel, Status.CREATOR));
                break;
            case 5:
            default:
                return false;
            case 6:
                mo47989b((Status) dcl.m8163a(parcel, Status.CREATOR));
                break;
            case 7:
                mo47987a((Status) dcl.m8163a(parcel, Status.CREATOR), (GoogleSignInAccount) dcl.m8163a(parcel, GoogleSignInAccount.CREATOR));
                break;
            case 8:
                mo24903a((SignInResponse) dcl.m8163a(parcel, SignInResponse.CREATOR));
                break;
            case 9:
                mo47992a((RecordConsentByConsentResultResponse) dcl.m8163a(parcel, RecordConsentByConsentResultResponse.CREATOR));
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
