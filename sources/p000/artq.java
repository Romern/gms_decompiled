package p000;

import android.accounts.Account;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;

/* renamed from: artq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface artq {
    /* renamed from: a */
    aucb mo24688a(ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest);

    /* renamed from: a */
    aucb mo24706a(Account[] accountArr);

    /* renamed from: a */
    aucb mo24707a(Assertion[] assertionArr);

    /* renamed from: a */
    aucb mo24708a(Challenge[] challengeArr, boolean z, boolean z2);

    /* renamed from: a */
    aucb mo24709a(UserBootstrapInfo[] userBootstrapInfoArr);

    /* renamed from: b */
    aucb mo24730b(ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest);

    /* renamed from: c */
    aucb mo24737c(ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest);
}
