package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;

/* renamed from: area */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class area {

    /* renamed from: a */
    private static final sek f87493a = ascp.m73787a("D2D", "TargetAccountTransferController");

    /* renamed from: b */
    private final Context f87494b;

    /* renamed from: c */
    private final armn f87495c;

    /* renamed from: d */
    private final ardz f87496d;

    /* renamed from: e */
    private final artq f87497e;

    /* renamed from: f */
    private final boolean f87498f;

    /* renamed from: g */
    private final boolean f87499g;

    public area(Context context, armn armn, ardz ardz, boolean z, boolean z2, artq artq) {
        sdo.m34959a(context);
        this.f87494b = context;
        sdo.m34959a(armn);
        this.f87495c = armn;
        sdo.m34959a(ardz);
        this.f87496d = ardz;
        this.f87498f = z;
        this.f87499g = z2;
        this.f87497e = artq;
    }

    /* renamed from: a */
    private final void m72584a(int i, String str) {
        f87493a.mo25418e(str, new Object[0]);
        this.f87496d.mo48454a(i, str);
    }

    /* renamed from: a */
    public final void mo48461a(AccountBootstrapPayload accountBootstrapPayload) {
        int length;
        AccountBootstrapPayload accountBootstrapPayload2 = accountBootstrapPayload;
        this.f87495c.mo48663b(2);
        ArrayList arrayList = accountBootstrapPayload2.f107957b;
        boolean z = false;
        if (arrayList != null) {
            f87493a.mo25409a("Processing UserBootstrapInfos", new Object[0]);
            sdo.m34959a(arrayList);
            if (arrayList.size() > 0) {
                try {
                    Challenge[] challengeArr = (Challenge[]) aucu.m76782a(this.f87497e.mo24709a((UserBootstrapInfo[]) arrayList.toArray(new UserBootstrapInfo[arrayList.size()])));
                    if (challengeArr != null && challengeArr.length > 0) {
                        MessagePayload messagePayload = new MessagePayload();
                        AccountBootstrapPayload accountBootstrapPayload3 = new AccountBootstrapPayload();
                        messagePayload.mo59096a(accountBootstrapPayload3);
                        accountBootstrapPayload3.f107958c = new ArrayList(Arrays.asList(challengeArr));
                        accountBootstrapPayload3.f107956a.add(3);
                        this.f87496d.mo48457a(messagePayload);
                    } else {
                        m72584a(10573, "No challenges were returned in the UserBootstrapInfos.");
                    }
                } catch (InterruptedException | ExecutionException e) {
                    m72584a(ascs.m73793a(e).f30115i, "Failure processing user bootstrap info.");
                }
            } else {
                m72584a(10573, "UserBootstrapInfos are empty.");
            }
        }
        ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest = accountBootstrapPayload2.f107959d;
        if (exchangeAssertionsForUserCredentialsRequest != null) {
            f87493a.mo25409a("Processing ExchangeAssertionsForUserCredentialsRequest", new Object[0]);
            try {
                ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest2 = (ExchangeAssertionsForUserCredentialsRequest) aucu.m76782a(this.f87497e.mo24730b(exchangeAssertionsForUserCredentialsRequest));
                exchangeAssertionsForUserCredentialsRequest2.mo59156a(this.f87498f);
                arui arui = (arui) aucu.m76782a(this.f87497e.mo24737c(exchangeAssertionsForUserCredentialsRequest2));
                UserCredential[] userCredentialArr = arui.f88316a;
                if (userCredentialArr != null) {
                    bxvd bxvd = this.f87495c.f87923n;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bowe bowe = bowe.f135103h;
                    ((bowe) bxvd.f164949b).f135110f = bxvk.m124030de();
                    int length2 = userCredentialArr.length;
                    ArrayList arrayList2 = new ArrayList(length2);
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int i = 0;
                    int i2 = 0;
                    while (i < length2) {
                        UserCredential userCredential = userCredentialArr[i];
                        int i3 = userCredential.f108180c;
                        if (i3 == 0) {
                            arrayList2.add(userCredential);
                            if (TextUtils.isEmpty(userCredential.f108182e)) {
                                arrayList3.add(userCredential);
                            } else {
                                arrayList4.add(userCredential);
                            }
                        } else {
                            bxvd bxvd2 = this.f87495c.f87923n;
                            bxvd da = bowc.f135092c.mo74144da();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = z;
                            }
                            bowc bowc = (bowc) da.f164949b;
                            bowc.f135094a |= 1;
                            bowc.f135095b = i3;
                            if (bxvd2.f164950c) {
                                bxvd2.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            bowe bowe2 = (bowe) bxvd2.f164949b;
                            bowc bowc2 = (bowc) da.mo74062i();
                            bowc2.getClass();
                            if (!bowe2.f135110f.mo73666a()) {
                                bowe2.f135110f = bxvk.m124021a(bowe2.f135110f);
                            }
                            bowe2.f135110f.add(bowc2);
                            sek sek = f87493a;
                            String str = userCredential.f108179b;
                            int i4 = userCredential.f108180c;
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39);
                            sb.append("Account (");
                            sb.append(str);
                            sb.append(") not OK (Status: ");
                            sb.append(i4);
                            sb.append(")");
                            sek.mo25412b(sb.toString(), new Object[0]);
                            i2++;
                            this.f87496d.mo48456a(new BootstrapAccount(userCredential.f108179b, "com.google"));
                        }
                        i++;
                        z = false;
                    }
                    if (i2 > 0) {
                        sek sek2 = f87493a;
                        StringBuilder sb2 = new StringBuilder(38);
                        sb2.append(i2);
                        sb2.append(" account(s) were not added.");
                        sek2.mo25414c(sb2.toString(), new Object[0]);
                    }
                    armn armn = this.f87495c;
                    int length3 = userCredentialArr.length;
                    bxvd bxvd3 = armn.f87923n;
                    if (bxvd3.f164950c) {
                        bxvd3.mo74035c();
                        bxvd3.f164950c = false;
                    }
                    bowe bowe3 = (bowe) bxvd3.f164949b;
                    bowe3.f135105a |= 1;
                    bowe3.f135106b = length3;
                    int size = arrayList3.size();
                    bxvd bxvd4 = armn.f87923n;
                    if (bxvd4.f164950c) {
                        bxvd4.mo74035c();
                        bxvd4.f164950c = false;
                    }
                    bowe bowe4 = (bowe) bxvd4.f164949b;
                    bowe4.f135105a |= 2;
                    bowe4.f135107c = size;
                    int size2 = arrayList4.size();
                    bxvd bxvd5 = armn.f87923n;
                    if (bxvd5.f164950c) {
                        bxvd5.mo74035c();
                        bxvd5.f164950c = false;
                    }
                    bowe bowe5 = (bowe) bxvd5.f164949b;
                    bowe5.f135105a |= 4;
                    bowe5.f135108d = size2;
                    if (arrayList2.isEmpty()) {
                        m72584a(10500, "No credentials successfully fetched.");
                    } else {
                        String str2 = arui.f88317b;
                        String str3 = arui.f88318c;
                        this.f87496d.mo48458a(str2, str3);
                        sek sek3 = f87493a;
                        String valueOf = String.valueOf(str2);
                        sek3.mo25409a(valueOf.length() == 0 ? new String("restoreAccountId: ") : "restoreAccountId: ".concat(valueOf), new Object[0]);
                        sek sek4 = f87493a;
                        String valueOf2 = String.valueOf(str3);
                        sek4.mo25409a(valueOf2.length() == 0 ? new String("restoreToken: ") : "restoreToken: ".concat(valueOf2), new Object[0]);
                        if (arrayList4.isEmpty()) {
                            arpt.m73277a(this.f87494b, arrayList3);
                            this.f87496d.mo48459a(arqi.m73308a(userCredentialArr));
                            this.f87496d.mo48453a();
                        } else if (!this.f87498f) {
                            this.f87496d.mo48460b(arqi.m73307a(arrayList2));
                            if (this.f87499g) {
                                this.f87496d.mo48453a();
                            }
                        } else {
                            if (!arrayList3.isEmpty()) {
                                arpt.m73277a(this.f87494b, arrayList3);
                                this.f87496d.mo48459a(arqi.m73307a(arrayList3));
                            }
                            ArrayList arrayList5 = new ArrayList(arrayList2);
                            MessagePayload messagePayload2 = new MessagePayload();
                            AccountBootstrapPayload accountBootstrapPayload4 = new AccountBootstrapPayload();
                            messagePayload2.mo59096a(accountBootstrapPayload4);
                            accountBootstrapPayload4.f107960e = arrayList5;
                            accountBootstrapPayload4.f107956a.add(5);
                            this.f87496d.mo48457a(messagePayload2);
                        }
                    }
                } else {
                    m72584a(10573, "Request returned no user credentials.");
                }
            } catch (InterruptedException | ExecutionException e2) {
                int i5 = ascs.m73793a(e2).f30115i;
                StringBuilder sb3 = new StringBuilder(40);
                sb3.append("API Failure with error code: ");
                sb3.append(i5);
                m72584a(10573, sb3.toString());
            }
        }
        ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest = accountBootstrapPayload2.f107961f;
        if (exchangeSessionCheckpointsForUserCredentialsRequest != null) {
            f87493a.mo25409a("Processing ExchangeSessionCheckpointsForUserCredentialsRequest", new Object[0]);
            if (exchangeSessionCheckpointsForUserCredentialsRequest.f108157b.size() > 0) {
                try {
                    artq artq = this.f87497e;
                    sdo.m34959a(exchangeSessionCheckpointsForUserCredentialsRequest);
                    arvy arvy = new arvy(exchangeSessionCheckpointsForUserCredentialsRequest);
                    roz b = rpa.m34196b();
                    b.f43472a = arvy;
                    UserCredential[] userCredentialArr2 = (UserCredential[]) aucu.m76782a(((rjx) artq).mo24701a(b.mo24977a()));
                    if (userCredentialArr2 == null || (length = userCredentialArr2.length) == 0) {
                        m72584a(10500, "Exchanging session checkpoints did not return any credentials.");
                        return;
                    }
                    bxvd bxvd6 = this.f87495c.f87923n;
                    if (bxvd6.f164950c) {
                        bxvd6.mo74035c();
                        bxvd6.f164950c = false;
                    }
                    bowe bowe6 = (bowe) bxvd6.f164949b;
                    bowe bowe7 = bowe.f135103h;
                    bowe6.f135105a |= 16;
                    bowe6.f135111g = length;
                    arpt.m73278a(this.f87494b, userCredentialArr2);
                    this.f87496d.mo48459a(arqi.m73308a(userCredentialArr2));
                } catch (InterruptedException | ExecutionException e3) {
                    m72584a(ascs.m73793a(e3).f30115i, "Failure trying to exchange checkpoints for user credentials.");
                    return;
                }
            }
            this.f87496d.mo48453a();
        }
    }
}
