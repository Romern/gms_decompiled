package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultResponse;
import com.google.android.gms.signin.internal.SignInResponse;

/* renamed from: aqoa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqoa extends dcj implements aqoc {
    public aqoa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* renamed from: a */
    public final void mo47990a(ConnectionResult connectionResult, AuthAccountResult authAccountResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, connectionResult);
        dcl.m8165a(bj, authAccountResult);
        mo8528b(3, bj);
    }

    /* renamed from: b */
    public final void mo47989b(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8528b(6, bj);
    }

    /* renamed from: a */
    public final void mo47988a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo47987a(Status status, GoogleSignInAccount googleSignInAccount) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, googleSignInAccount);
        mo8528b(7, bj);
    }

    /* renamed from: a */
    public final void mo47992a(RecordConsentByConsentResultResponse recordConsentByConsentResultResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, recordConsentByConsentResultResponse);
        mo8528b(9, bj);
    }

    /* renamed from: a */
    public final void mo24903a(SignInResponse signInResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, signInResponse);
        mo8528b(8, bj);
    }
}
