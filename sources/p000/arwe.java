package p000;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;

/* renamed from: arwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arwe extends dcj implements arwg {
    public arwe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsService");
    }

    /* renamed from: a */
    public final void mo48824a() {
        throw null;
    }

    /* renamed from: a */
    public final void mo48828a(arwd arwd, boolean z) {
        throw null;
    }

    /* renamed from: a */
    public final void mo48831a(arwd arwd, Challenge[] challengeArr, boolean z) {
        throw null;
    }

    /* renamed from: b */
    public final void mo48836b(arwd arwd, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, arwd);
        dcl.m8165a(bj, exchangeAssertionsForUserCredentialsRequest);
        mo8530c(6, bj);
    }

    /* renamed from: c */
    public final void mo48837c(arwd arwd, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, arwd);
        dcl.m8165a(bj, exchangeAssertionsForUserCredentialsRequest);
        mo8530c(7, bj);
    }

    /* renamed from: a */
    public final void mo48825a(arwd arwd) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, arwd);
        mo8530c(12, bj);
    }

    /* renamed from: a */
    public final void mo48826a(arwd arwd, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, arwd);
        dcl.m8165a(bj, exchangeAssertionsForUserCredentialsRequest);
        mo8530c(5, bj);
    }

    /* renamed from: a */
    public final void mo48827a(arwd arwd, ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, arwd);
        dcl.m8165a(bj, exchangeSessionCheckpointsForUserCredentialsRequest);
        mo8530c(10, bj);
    }

    /* renamed from: a */
    public final void mo48829a(arwd arwd, Account[] accountArr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, arwd);
        bj.writeTypedArray(accountArr, 0);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo48830a(arwd arwd, Assertion[] assertionArr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, arwd);
        bj.writeTypedArray(assertionArr, 0);
        mo8530c(4, bj);
    }

    /* renamed from: a */
    public final void mo48832a(arwd arwd, Challenge[] challengeArr, boolean z, boolean z2) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, arwd);
        bj.writeTypedArray(challengeArr, 0);
        dcl.m8166a(bj, z);
        dcl.m8166a(bj, z2);
        mo8530c(11, bj);
    }

    /* renamed from: a */
    public final void mo48833a(arwd arwd, UserBootstrapInfo[] userBootstrapInfoArr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, arwd);
        bj.writeTypedArray(userBootstrapInfoArr, 0);
        mo8530c(2, bj);
    }
}
