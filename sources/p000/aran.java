package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.SessionCheckpoint;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;

/* renamed from: aran */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aran {

    /* renamed from: a */
    private static final sek f87216a = ascp.m73787a("D2D", "SourceAccountTransferController");

    /* renamed from: b */
    private final Context f87217b;

    /* renamed from: c */
    private final armh f87218c;

    /* renamed from: d */
    private final aram f87219d;

    /* renamed from: e */
    private final artq f87220e;

    /* renamed from: f */
    private final boolean f87221f;

    /* renamed from: g */
    private final boolean f87222g;

    /* renamed from: h */
    private final ArrayList f87223h;

    public aran(Context context, armh armh, aram aram, boolean z, boolean z2, ArrayList arrayList, artq artq) {
        sdo.m34959a(context);
        this.f87217b = context;
        sdo.m34959a(armh);
        this.f87218c = armh;
        sdo.m34959a(aram);
        this.f87219d = aram;
        this.f87221f = z;
        this.f87222g = z2;
        this.f87223h = arrayList;
        this.f87220e = artq;
    }

    /* renamed from: a */
    private final void m72332a(int i, String str) {
        f87216a.mo25418e(str, new Object[0]);
        this.f87219d.mo48339a(i, str);
    }

    /* renamed from: a */
    public final void mo48344a() {
        int i;
        f87216a.mo25409a("Sending BootstrapInfos.", new Object[0]);
        armh armh = this.f87218c;
        armh.mo48651d(2);
        int a = arpz.m73287a(this.f87223h);
        bxvd bxvd = armh.f87899e;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bove bove = (bove) bxvd.f164949b;
        bove bove2 = bove.f135002g;
        bove.f135004a |= 2;
        bove.f135006c = a;
        if (asbs.m73758a(this.f87217b).mo33916a("com.google").length != 0) {
            ArrayList arrayList = this.f87223h;
            Account[] accountArr = null;
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = this.f87223h.size();
                accountArr = new Account[size];
                for (int i2 = 0; i2 < size; i2++) {
                    BootstrapAccount bootstrapAccount = (BootstrapAccount) this.f87223h.get(i2);
                    accountArr[i2] = new Account(bootstrapAccount.f107799b, bootstrapAccount.f107800c);
                }
            }
            Resources resources = this.f87217b.getResources();
            if (!cgrq.m146758c()) {
                i = C0126R.plurals.smartdevice_d2d_setting_up_accounts_and_data_text;
            } else {
                i = C0126R.plurals.smartdevice_d2d_copying_accounts;
            }
            int length = accountArr.length;
            String quantityString = resources.getQuantityString(i, length);
            this.f87219d.mo48342a(quantityString);
            if (accountArr != null && length > 0) {
                try {
                    UserBootstrapInfo[] userBootstrapInfoArr = (UserBootstrapInfo[]) aucu.m76782a(this.f87220e.mo24706a(accountArr));
                    AccountBootstrapPayload accountBootstrapPayload = new AccountBootstrapPayload();
                    accountBootstrapPayload.f107957b = new ArrayList(Arrays.asList(userBootstrapInfoArr));
                    accountBootstrapPayload.f107956a.add(2);
                    MessagePayload messagePayload = new MessagePayload();
                    messagePayload.mo59096a(accountBootstrapPayload);
                    messagePayload.mo59104e(quantityString);
                    this.f87219d.mo48341a(messagePayload);
                } catch (InterruptedException | ExecutionException e) {
                    f87216a.mo25410a(e);
                    m72332a(10573, "Error trying to fetch user bootstrap info");
                }
            } else {
                m72332a(10573, "No accounts to bootstrap");
            }
        } else {
            m72332a(10573, "No accounts found");
        }
    }

    /* renamed from: a */
    public final void mo48345a(AccountBootstrapPayload accountBootstrapPayload) {
        if (accountBootstrapPayload.f107958c != null) {
            f87216a.mo25409a("Processing Challenges using connectionless client", new Object[0]);
            sdo.m34959a(accountBootstrapPayload);
            ArrayList arrayList = accountBootstrapPayload.f107958c;
            sdo.m34959a(arrayList);
            try {
                Assertion[] assertionArr = (Assertion[]) aucu.m76782a(this.f87220e.mo24708a((Challenge[]) arrayList.toArray(new Challenge[arrayList.size()]), this.f87222g, false));
                if (assertionArr == null || assertionArr.length <= 0) {
                    m72332a(10578, "Assertions are empty.");
                } else {
                    ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest = (ExchangeAssertionsForUserCredentialsRequest) aucu.m76782a(this.f87220e.mo24688a((ExchangeAssertionsForUserCredentialsRequest) aucu.m76782a(this.f87220e.mo24707a(assertionArr))));
                    if (!TextUtils.isEmpty(exchangeAssertionsForUserCredentialsRequest.f108152g)) {
                        bxvd bxvd = this.f87218c.f87899e;
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bove bove = (bove) bxvd.f164949b;
                        bove bove2 = bove.f135002g;
                        bove.f135004a |= 4;
                        bove.f135007d = true;
                    }
                    f87216a.mo25409a("Sending ExchangeAssertionsForUserCredentialsRequest.", new Object[0]);
                    AccountBootstrapPayload accountBootstrapPayload2 = new AccountBootstrapPayload();
                    accountBootstrapPayload2.f107959d = exchangeAssertionsForUserCredentialsRequest;
                    accountBootstrapPayload2.f107956a.add(4);
                    MessagePayload messagePayload = new MessagePayload();
                    messagePayload.mo59096a(accountBootstrapPayload2);
                    this.f87219d.mo48341a(messagePayload);
                }
            } catch (InterruptedException | ExecutionException e) {
                int i = ascs.m73793a(e).f30115i;
                StringBuilder sb = new StringBuilder(59);
                sb.append("Error while processing challenges. Status code: ");
                sb.append(i);
                m72332a(10578, sb.toString());
            }
        }
        if (accountBootstrapPayload.f107960e != null) {
            f87216a.mo25409a("Processing UserCredentials.", new Object[0]);
            sdo.m34959a(accountBootstrapPayload);
            ArrayList arrayList2 = accountBootstrapPayload.f107960e;
            sdo.m34959a(arrayList2);
            sdo.m34975b(this.f87221f, "Target asked to process UserCredentials, but BootstrapOptions don't require source-side challenges.");
            this.f87219d.mo48338a();
            this.f87219d.mo48343a(arqi.m73307a(arrayList2));
        }
    }

    /* renamed from: a */
    public final void mo48346a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Bundle bundle = (Bundle) arrayList.get(i);
            String string = bundle.getString("name");
            String string2 = bundle.getString("sessionCheckpoint");
            if (TextUtils.isEmpty(string2)) {
                sek sek = f87216a;
                String valueOf = String.valueOf(string);
                sek.mo25412b(valueOf.length() == 0 ? new String("Session checkpoint is empty: ") : "Session checkpoint is empty: ".concat(valueOf), new Object[0]);
            } else {
                arrayList2.add(new SessionCheckpoint(string, string2));
            }
        }
        ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest = new ExchangeSessionCheckpointsForUserCredentialsRequest(arrayList2);
        f87216a.mo25409a("Sending ExchangeSessionCheckpointsForUserCredentialsRequest.", new Object[0]);
        AccountBootstrapPayload accountBootstrapPayload = new AccountBootstrapPayload();
        accountBootstrapPayload.f107961f = exchangeSessionCheckpointsForUserCredentialsRequest;
        accountBootstrapPayload.f107956a.add(6);
        MessagePayload messagePayload = new MessagePayload();
        messagePayload.mo59096a(accountBootstrapPayload);
        this.f87219d.mo48341a(messagePayload);
    }
}
