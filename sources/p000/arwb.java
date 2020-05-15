package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;

/* renamed from: arwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arwb extends dcj implements arwd {
    public arwb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks");
    }

    /* renamed from: a */
    public final void mo48872a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(9, bj);
    }

    /* renamed from: b */
    public final void mo48869b(Status status, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, exchangeAssertionsForUserCredentialsRequest);
        mo8530c(5, bj);
    }

    /* renamed from: c */
    public final void mo48870c(Status status, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, exchangeAssertionsForUserCredentialsRequest);
        mo8530c(6, bj);
    }

    /* renamed from: a */
    public final void mo48865a(Status status, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, exchangeAssertionsForUserCredentialsRequest);
        mo8530c(4, bj);
    }

    /* renamed from: a */
    public final void mo48866a(Status status, BootstrapAccount[] bootstrapAccountArr) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeTypedArray(bootstrapAccountArr, 0);
        mo8530c(11, bj);
    }

    /* renamed from: a */
    public final void mo48862a(Status status, Assertion[] assertionArr) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeTypedArray(assertionArr, 0);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo48867a(Status status, Challenge[] challengeArr) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeTypedArray(challengeArr, 0);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo48868a(Status status, UserBootstrapInfo[] userBootstrapInfoArr) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeTypedArray(userBootstrapInfoArr, 0);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo48864a(Status status, UserCredential[] userCredentialArr) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeTypedArray(userCredentialArr, 0);
        mo8530c(10, bj);
    }

    /* renamed from: a */
    public final void mo48863a(Status status, UserCredential[] userCredentialArr, String str, String str2) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeTypedArray(userCredentialArr, 0);
        bj.writeString(str);
        bj.writeString(str2);
        mo8530c(7, bj);
    }
}
