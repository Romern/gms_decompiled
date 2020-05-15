package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;

/* renamed from: arwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class arwc extends dck implements arwd {

    /* renamed from: a */
    protected final rlf f88354a;

    /* renamed from: a */
    public final void mo48872a(Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public void mo48869b(Status status, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public void mo48870c(Status status, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        throw new UnsupportedOperationException();
    }

    protected arwc(rlf rlf) {
        super("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks");
        this.f88354a = rlf;
    }

    /* renamed from: a */
    public void mo48865a(Status status, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo48866a(Status status, BootstrapAccount[] bootstrapAccountArr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo48862a(Status status, Assertion[] assertionArr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo48867a(Status status, Challenge[] challengeArr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo48868a(Status status, UserBootstrapInfo[] userBootstrapInfoArr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo48864a(Status status, UserCredential[] userCredentialArr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo48863a(Status status, UserCredential[] userCredentialArr, String str, String str2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                mo48868a((Status) dcl.m8163a(parcel, Status.CREATOR), (UserBootstrapInfo[]) parcel.createTypedArray(UserBootstrapInfo.CREATOR));
                return true;
            case 2:
                mo48867a((Status) dcl.m8163a(parcel, Status.CREATOR), (Challenge[]) parcel.createTypedArray(Challenge.CREATOR));
                return true;
            case 3:
                mo48862a((Status) dcl.m8163a(parcel, Status.CREATOR), (Assertion[]) parcel.createTypedArray(Assertion.CREATOR));
                return true;
            case 4:
                mo48865a((Status) dcl.m8163a(parcel, Status.CREATOR), (ExchangeAssertionsForUserCredentialsRequest) dcl.m8163a(parcel, ExchangeAssertionsForUserCredentialsRequest.CREATOR));
                return true;
            case 5:
                mo48869b((Status) dcl.m8163a(parcel, Status.CREATOR), (ExchangeAssertionsForUserCredentialsRequest) dcl.m8163a(parcel, ExchangeAssertionsForUserCredentialsRequest.CREATOR));
                return true;
            case 6:
                mo48870c((Status) dcl.m8163a(parcel, Status.CREATOR), (ExchangeAssertionsForUserCredentialsRequest) dcl.m8163a(parcel, ExchangeAssertionsForUserCredentialsRequest.CREATOR));
                return true;
            case 7:
                mo48863a((Status) dcl.m8163a(parcel, Status.CREATOR), (UserCredential[]) parcel.createTypedArray(UserCredential.CREATOR), parcel.readString(), parcel.readString());
                return true;
            case 8:
                Status status = (Status) dcl.m8163a(parcel, Status.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR);
                throw new UnsupportedOperationException();
            case 9:
                mo48872a((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 10:
                mo48864a((Status) dcl.m8163a(parcel, Status.CREATOR), (UserCredential[]) parcel.createTypedArray(UserCredential.CREATOR));
                return true;
            case 11:
                mo48866a((Status) dcl.m8163a(parcel, Status.CREATOR), (BootstrapAccount[]) parcel.createTypedArray(BootstrapAccount.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
