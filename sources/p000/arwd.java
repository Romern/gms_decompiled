package p000;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;

/* renamed from: arwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface arwd extends IInterface {
    /* renamed from: a */
    void mo48872a(Status status);

    /* renamed from: a */
    void mo48865a(Status status, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest);

    /* renamed from: a */
    void mo48866a(Status status, BootstrapAccount[] bootstrapAccountArr);

    /* renamed from: a */
    void mo48862a(Status status, Assertion[] assertionArr);

    /* renamed from: a */
    void mo48867a(Status status, Challenge[] challengeArr);

    /* renamed from: a */
    void mo48868a(Status status, UserBootstrapInfo[] userBootstrapInfoArr);

    /* renamed from: a */
    void mo48864a(Status status, UserCredential[] userCredentialArr);

    /* renamed from: a */
    void mo48863a(Status status, UserCredential[] userCredentialArr, String str, String str2);

    /* renamed from: b */
    void mo48869b(Status status, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest);

    /* renamed from: c */
    void mo48870c(Status status, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest);
}
