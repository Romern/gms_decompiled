package p000;

import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultResponse;
import com.google.android.gms.signin.internal.SignInResponse;

/* renamed from: aqoc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface aqoc extends IInterface {
    /* renamed from: a */
    void mo47990a(ConnectionResult connectionResult, AuthAccountResult authAccountResult);

    /* renamed from: a */
    void mo47988a(Status status);

    /* renamed from: a */
    void mo47987a(Status status, GoogleSignInAccount googleSignInAccount);

    /* renamed from: a */
    void mo47992a(RecordConsentByConsentResultResponse recordConsentByConsentResultResponse);

    /* renamed from: a */
    void mo24903a(SignInResponse signInResponse);

    /* renamed from: b */
    void mo47989b(Status status);
}
