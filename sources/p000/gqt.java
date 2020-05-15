package p000;

import android.accounts.Account;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import com.google.android.gms.auth.GetAccountsRequest;
import com.google.android.gms.common.api.Status;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: gqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gqt extends aaab {

    /* renamed from: a */
    private final gox f18846a;

    /* renamed from: b */
    private final GetAccountsRequest f18847b;

    public gqt(gox gox, GetAccountsRequest getAccountsRequest) {
        super(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, "GetAccountsGoogleAuthOperation");
        this.f18846a = gox;
        this.f18847b = getAccountsRequest;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        Account[] accountArr;
        GetAccountsRequest getAccountsRequest = this.f18847b;
        String[] strArr = getAccountsRequest.f9930b;
        String str = getAccountsRequest.f9929a;
        Logger a = ght.m13171a("GetAccountsOperation");
        adyd a2 = adyd.m51363a(context);
        if (strArr != null) {
            try {
                accountArr = (Account[]) a2.mo33907a(str, strArr).getResult(5, TimeUnit.SECONDS);
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                a.mo25415d("Failed to get %s accounts with features %s", e, str, Arrays.toString(strArr));
                gql gql = new gql(10);
                gql.f18825a = e;
                throw gql.mo12128a();
            }
        } else {
            accountArr = a2.mo33916a(str);
        }
        this.f18846a.mo12117a(Status.f30107a, Arrays.asList(accountArr));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f18846a.mo12117a(status, null);
    }
}
