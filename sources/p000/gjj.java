package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.account.accounttransfer.AccountBootstrapPayload;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: gjj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gjj {

    /* renamed from: a */
    public static final sek f18337a = ght.m13171a("AccountTransfer", "AccountTransferExporter");

    /* renamed from: b */
    public final gto f18338b;

    /* renamed from: c */
    private final gjl f18339c;

    /* renamed from: d */
    private final artq f18340d;

    /* renamed from: e */
    private final adyd f18341e;

    /* renamed from: f */
    private final ayky f18342f;

    public gjj(Context context, gjl gjl, artq artq, adyd adyd, gto gto) {
        this.f18339c = gjl;
        this.f18340d = artq;
        this.f18341e = adyd;
        this.f18338b = gto;
        this.f18342f = ayky.m84210a(snp.m35703a(1, 10), rqz.m34281b(context), rqz.m34280a(context));
    }

    /* renamed from: a */
    private final ExchangeAssertionsForUserCredentialsRequest m13263a(List list, boolean z) {
        Assertion[] assertionArr;
        aucb a = this.f18340d.mo24708a((Challenge[]) list.toArray(new Challenge[0]), z, false);
        ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest = null;
        try {
            assertionArr = (Assertion[]) gjn.m13285a((Object[]) ((Assertion[]) m13264a(a)));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Status a2 = gjn.m13279a(e);
            m13265a(String.format(Locale.US, "convert-challenges-to-assertions-%d", Integer.valueOf(a2.f30115i)), a2);
            assertionArr = null;
        }
        try {
            ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest2 = (ExchangeAssertionsForUserCredentialsRequest) m13264a(this.f18340d.mo24707a(assertionArr));
            gjn.m13281a(exchangeAssertionsForUserCredentialsRequest2);
            exchangeAssertionsForUserCredentialsRequest = exchangeAssertionsForUserCredentialsRequest2;
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            Status a3 = gjn.m13279a(e2);
            m13265a(String.format(Locale.US, "partial-exchange-assertions-%d", Integer.valueOf(a3.f30115i)), a3);
        }
        try {
            ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest3 = (ExchangeAssertionsForUserCredentialsRequest) m13264a(this.f18340d.mo24688a(exchangeAssertionsForUserCredentialsRequest));
            gjn.m13281a(exchangeAssertionsForUserCredentialsRequest3);
            return exchangeAssertionsForUserCredentialsRequest3;
        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
            Status a4 = gjn.m13279a(e3);
            m13265a(String.format(Locale.US, "populate-source-info-%d", Integer.valueOf(a4.f30115i)), a4);
            return exchangeAssertionsForUserCredentialsRequest;
        }
    }

    /* renamed from: b */
    public final void mo11938b() {
        UserBootstrapInfo[] userBootstrapInfoArr;
        Account[] accountArr = (Account[]) gjn.m13281a((Object) this.f18341e.mo33916a("com.google"));
        if (accountArr.length == 0) {
            gjn.m13282a(this.f18338b);
            return;
        }
        try {
            userBootstrapInfoArr = (UserBootstrapInfo[]) gjn.m13285a((Object[]) ((UserBootstrapInfo[]) m13264a(this.f18340d.mo24706a(accountArr))));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Status a = gjn.m13279a(e);
            m13265a(String.format(Locale.US, "get-bootstrap-infos-%d", Integer.valueOf(a.f30115i)), a);
            userBootstrapInfoArr = null;
        }
        gto gto = this.f18338b;
        AccountBootstrapPayload accountBootstrapPayload = new AccountBootstrapPayload();
        accountBootstrapPayload.f9957c = new ArrayList(Arrays.asList(userBootstrapInfoArr));
        accountBootstrapPayload.f9955a.add(2);
        gjn.m13283a(gto, accountBootstrapPayload);
    }

    /* renamed from: a */
    private static Object m13264a(aucb aucb) {
        return aucu.m76783a(aucb, gnv.m13534ag(), TimeUnit.SECONDS);
    }

    /* renamed from: a */
    private final void m13265a(String str, Status status) {
        this.f18342f.mo54073a("EXPORT", str);
        throw new gji(String.format("Export failed %s", status));
    }

    /* renamed from: a */
    private final void m13266a(List list) {
        boolean z = false;
        try {
            z = this.f18339c.mo11940a().f10073b;
        } catch (gji | InterruptedException | ExecutionException | TimeoutException e) {
            f18337a.mo25415d("GoogleAccountTransferClient#getDeviceMetadata() failed error", e, new Object[0]);
        }
        ExchangeAssertionsForUserCredentialsRequest a = m13263a(list, z);
        gto gto = this.f18338b;
        AccountBootstrapPayload accountBootstrapPayload = new AccountBootstrapPayload();
        accountBootstrapPayload.f9959e = a;
        accountBootstrapPayload.f9955a.add(4);
        gjn.m13283a(gto, accountBootstrapPayload);
    }

    /* renamed from: a */
    public final void mo11937a() {
        f18337a.mo25412b("handleAccountExportDataAvailable()", new Object[0]);
        try {
            AccountBootstrapPayload b = this.f18339c.mo11941b();
            ArrayList arrayList = b.f9958d;
            if (arrayList == null) {
                ArrayList arrayList2 = b.f9960f;
                if (arrayList2 != null) {
                    f18337a.mo25414c("UserCredentials: %s", arrayList2);
                    throw new gji("Unimplemented");
                }
                throw new gji("AccountBootstrapPayload invalid");
            }
            m13266a(arrayList);
        } catch (gji | InterruptedException | ExecutionException | TimeoutException e) {
            f18337a.mo25417e("handleAccountExportDataAvailable() error", e, new Object[0]);
            gjn.m13286b(this.f18338b);
        }
    }
}
