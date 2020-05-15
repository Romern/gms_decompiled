package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.cast.JGCastService;
import com.google.android.gms.auth.account.accounttransfer.AccountBootstrapPayload;
import com.google.android.gms.auth.account.accounttransfer.RestoreDataSender$1;
import com.google.android.gms.auth.api.accounttransfer.internal.UserChallengeRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: gjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gjk {

    /* renamed from: a */
    private static final Logger f18343a = ght.m13171a("AccountTransfer", "AccountTransferImporter");

    /* renamed from: b */
    private final Context f18344b;

    /* renamed from: c */
    private final gjl f18345c;

    /* renamed from: d */
    private final artq f18346d;

    /* renamed from: e */
    private final adyd f18347e;

    /* renamed from: f */
    private final goa f18348f;

    /* renamed from: g */
    private final gjm f18349g;

    /* renamed from: h */
    private final gto f18350h;

    /* renamed from: i */
    private final ayky f18351i;

    public gjk(Context context, gjl gjl, artq artq, adyd adyd, goa goa, gjm gjm, gto gto) {
        this.f18344b = context;
        this.f18345c = gjl;
        this.f18346d = artq;
        this.f18347e = adyd;
        this.f18348f = goa;
        this.f18349g = gjm;
        this.f18350h = gto;
        this.f18351i = ayky.m84210a(snp.m35703a(1, 10), rqz.m34281b(context), rqz.m34280a(context));
    }

    /* renamed from: a */
    private static Object m13269a(aucb aucb) {
        return aucu.m76783a(aucb, gnv.m13534ag(), TimeUnit.SECONDS);
    }

    /* renamed from: b */
    private final void m13274b(List list) {
        Account[] a = this.f18347e.mo33916a("com.google");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UserCredential userCredential = (UserCredential) it.next();
            Account account = new Account(userCredential.f108179b, "com.google");
            gny a2 = gny.m13584a();
            a2.mo12083a(gqd.f18807a, userCredential.f108183f);
            if (userCredential.f108184g != null) {
                a2.mo12083a(gqd.f18813g, userCredential.f108184g);
            }
            if (userCredential.f108185h != null) {
                a2.mo12083a(gqd.f18814h, userCredential.f108185h);
            }
            if (sqc.m35963b(a, account)) {
                this.f18348f.mo12094b(account, a2);
            } else {
                this.f18348f.mo12093a(account, a2);
            }
        }
    }

    /* renamed from: a */
    private final void m13270a(ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest2;
        arui arui = null;
        try {
            exchangeAssertionsForUserCredentialsRequest2 = (ExchangeAssertionsForUserCredentialsRequest) m13269a(this.f18346d.mo24730b(exchangeAssertionsForUserCredentialsRequest));
            gjn.m13281a(exchangeAssertionsForUserCredentialsRequest2);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            m13272a("populate-target-info-failure", gjn.m13279a(e));
            exchangeAssertionsForUserCredentialsRequest2 = null;
        }
        try {
            arui = (arui) m13269a(this.f18346d.mo24737c(exchangeAssertionsForUserCredentialsRequest2));
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            m13272a("exchange-assertions-for-credentials-failed", gjn.m13279a(e2));
        }
        UserCredential[] userCredentialArr = (UserCredential[]) gjn.m13285a((Object[]) arui.f88316a);
        String str = arui.f88317b;
        String str2 = arui.f88318c;
        try {
            gjm gjm = this.f18349g;
            bqgy c = bqgy.m112818c();
            gjm.f18353a.sendBroadcast(new Intent("com.google.android.gms.smartdevice.setup.RESTORE_DATA").putExtra("restoreAccount", str).putExtra("restoreToken", str2).putExtra("resultReceiver", new RestoreDataSender$1(gjm.f18354b, c)).setPackage(gjm.f18353a.getPackageName()));
            c.get(gnv.m13535ah(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
            f18343a.mo25415d("RestoreDataSender.send() failed", e3, new Object[0]);
        }
        int length = userCredentialArr.length;
        ArrayList arrayList = new ArrayList(length);
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        for (UserCredential userCredential : userCredentialArr) {
            if (userCredential.f108180c == 0) {
                arrayList.add(userCredential);
                if (!TextUtils.isEmpty(userCredential.f108182e)) {
                    linkedList.add(userCredential);
                } else {
                    linkedList2.add(userCredential);
                }
            } else {
                f18343a.mo25418e("UserCredential(accountIdentifier=%s, status=%s) not OK", userCredential.f108179b, Integer.valueOf(userCredential.f108180c));
            }
        }
        if (linkedList.isEmpty() && linkedList2.isEmpty()) {
            m13271a("no-user-credentials-ok");
            throw new gji("No UserCredentials OK");
        } else if (linkedList.isEmpty()) {
            m13274b(linkedList2);
            gjn.m13282a(this.f18350h);
        } else {
            try {
                if (this.f18345c.mo11940a().f10075d) {
                    Intent className = new Intent().setClassName(this.f18344b, "com.google.android.gms.smartdevice.setup.ui.AccountChallengeActivity");
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        UserCredential userCredential2 = (UserCredential) arrayList.get(i);
                        Bundle bundle = new Bundle();
                        bundle.putString("name", userCredential2.f108179b);
                        if (TextUtils.isEmpty(userCredential2.f108182e)) {
                            bundle.putString("credential", userCredential2.f108183f);
                        } else {
                            bundle.putString("url", userCredential2.f108182e);
                        }
                        if (!TextUtils.isEmpty(userCredential2.f108184g)) {
                            bundle.putString("firstName", userCredential2.f108184g);
                        }
                        if (!TextUtils.isEmpty(userCredential2.f108185h)) {
                            bundle.putString("lastName", userCredential2.f108185h);
                        }
                        arrayList2.add(bundle);
                    }
                    PendingIntent activity = PendingIntent.getActivity(this.f18344b, 0, className.putExtra("accounts", arrayList2), JGCastService.FLAG_PRIVATE_DISPLAY);
                    gjn.m13281a(activity);
                    gto gto = this.f18350h;
                    sdo.m34959a((Object) "com.google");
                    sdo.m34959a(activity);
                    gto.mo24732b(new gte(new UserChallengeRequest("com.google", activity)));
                    return;
                }
                m13274b(linkedList2);
                gto gto2 = this.f18350h;
                AccountBootstrapPayload accountBootstrapPayload = new AccountBootstrapPayload();
                accountBootstrapPayload.f9960f = new ArrayList(linkedList);
                accountBootstrapPayload.f9955a.add(5);
                gjn.m13283a(gto2, accountBootstrapPayload);
            } catch (InterruptedException | ExecutionException | TimeoutException e4) {
                f18343a.mo25417e("handleAssertions() error", e4, new Object[0]);
                m13271a("device-metadata-failed");
                gjn.m13286b(this.f18350h);
            }
        }
    }

    /* renamed from: a */
    private final void m13271a(String str) {
        this.f18351i.mo54073a("IMPORT", str);
    }

    /* renamed from: a */
    private final void m13272a(String str, Status status) {
        m13271a(str);
        throw new gji(String.format("Import failed %s", status));
    }

    /* renamed from: a */
    private final void m13273a(List list) {
        Challenge[] challengeArr;
        if (gnv.m13519aA()) {
            Account[] a = this.f18347e.mo33916a("com.google");
            HashSet hashSet = new HashSet();
            for (Account account : a) {
                hashSet.add(account.name);
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                UserBootstrapInfo userBootstrapInfo = (UserBootstrapInfo) list.get(i);
                if (hashSet.contains(userBootstrapInfo.f108175b)) {
                    f18343a.logVerbose("Account %s already on device, dropping from challenge request", Logger.m35081a(userBootstrapInfo.f108175b));
                } else {
                    arrayList.add(userBootstrapInfo);
                }
            }
            if (!arrayList.isEmpty()) {
                list = arrayList;
            } else {
                gjn.m13282a(this.f18350h);
                return;
            }
        }
        try {
            challengeArr = (Challenge[]) gjn.m13285a((Object[]) ((Challenge[]) m13269a(this.f18346d.mo24709a((UserBootstrapInfo[]) list.toArray(new UserBootstrapInfo[0])))));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Status a2 = gjn.m13279a(e);
            int i2 = a2.f30115i;
            StringBuilder sb = new StringBuilder(33);
            sb.append("get-challenges-failed-");
            sb.append(i2);
            m13272a(sb.toString(), a2);
            challengeArr = null;
        }
        gto gto = this.f18350h;
        AccountBootstrapPayload accountBootstrapPayload = new AccountBootstrapPayload();
        accountBootstrapPayload.f9958d = new ArrayList(Arrays.asList(challengeArr));
        accountBootstrapPayload.f9955a.add(3);
        gjn.m13283a(gto, accountBootstrapPayload);
    }

    /* renamed from: a */
    public final void mo11939a() {
        f18343a.mo25412b("handleAccountImportDataAvailable()", new Object[0]);
        try {
            AccountBootstrapPayload b = this.f18345c.mo11941b();
            ArrayList arrayList = b.f9957c;
            if (arrayList == null) {
                ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest = b.f9959e;
                if (exchangeAssertionsForUserCredentialsRequest == null) {
                    ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest = b.f9961g;
                    if (exchangeSessionCheckpointsForUserCredentialsRequest != null) {
                        f18343a.mo25414c("SessionCheckpoints: %s", exchangeSessionCheckpointsForUserCredentialsRequest);
                        throw new gji("Unimplemented");
                    }
                    throw new gji("AccountBootstrapPayload invalid");
                }
                m13270a(exchangeAssertionsForUserCredentialsRequest);
                return;
            }
            m13273a(arrayList);
        } catch (gji | InterruptedException | ExecutionException | TimeoutException e) {
            f18343a.mo25417e("handleAccountImportDataAvailable() error", e, new Object[0]);
            gjn.m13286b(this.f18350h);
        }
    }
}
