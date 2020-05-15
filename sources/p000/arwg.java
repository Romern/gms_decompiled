package p000;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;

/* renamed from: arwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface arwg extends IInterface {
    /* renamed from: a */
    void mo48824a();

    /* renamed from: a */
    void mo48825a(arwd arwd);

    /* renamed from: a */
    void mo48826a(arwd arwd, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest);

    /* renamed from: a */
    void mo48827a(arwd arwd, ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest);

    /* renamed from: a */
    void mo48828a(arwd arwd, boolean z);

    /* renamed from: a */
    void mo48829a(arwd arwd, Account[] accountArr);

    /* renamed from: a */
    void mo48830a(arwd arwd, Assertion[] assertionArr);

    /* renamed from: a */
    void mo48831a(arwd arwd, Challenge[] challengeArr, boolean z);

    /* renamed from: a */
    void mo48832a(arwd arwd, Challenge[] challengeArr, boolean z, boolean z2);

    /* renamed from: a */
    void mo48833a(arwd arwd, UserBootstrapInfo[] userBootstrapInfoArr);

    /* renamed from: b */
    void mo48836b(arwd arwd, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest);

    /* renamed from: c */
    void mo48837c(arwd arwd, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest);
}
