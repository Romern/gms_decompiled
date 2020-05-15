package com.google.android.gms.auth.account.p016be;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.auth.account.be.FinishBootstrapIntentOperation */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FinishBootstrapIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f9976a = ght.m13171a("FinishBootstrapMessengerService");

    /* renamed from: b */
    private artq f9977b;

    public FinishBootstrapIntentOperation() {
    }

    /* renamed from: a */
    private static final Message m6274a(Exception exc, String str) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        return m6275a(str);
    }

    public final void onCreate() {
        rjo rjo = aqxb.f87025a;
        this.f9977b = aqxb.m72187a(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bb A[Catch:{ RemoteException -> 0x00f4 }] */
    public final void onHandleIntent(Intent intent) {
        Message message;
        Messenger messenger = (Messenger) intent.getExtras().get("messenger");
        if (messenger != null) {
            try {
                if ("com.google.android.gms.auth.account.be.finish_bootstrap".equals(intent.getAction())) {
                    Account account = (Account) intent.getParcelableExtra("bootstrapAccount");
                    if (account == null) {
                        messenger.send(m6275a("No bootstrap account"));
                        return;
                    }
                    ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest = (ExchangeAssertionsForUserCredentialsRequest) sef.m35067a(intent, "bootstrapAssertion", ExchangeAssertionsForUserCredentialsRequest.CREATOR);
                    if (exchangeAssertionsForUserCredentialsRequest != null) {
                        try {
                            ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest2 = (ExchangeAssertionsForUserCredentialsRequest) aucu.m76782a(this.f9977b.mo24730b(exchangeAssertionsForUserCredentialsRequest));
                            if (exchangeAssertionsForUserCredentialsRequest2 != null) {
                                try {
                                    UserCredential[] userCredentialArr = ((arui) aucu.m76782a(this.f9977b.mo24737c(exchangeAssertionsForUserCredentialsRequest2))).f88316a;
                                    message = null;
                                    if (userCredentialArr != null) {
                                        int length = userCredentialArr.length;
                                        if (length > 0) {
                                            int i = 0;
                                            while (true) {
                                                if (i >= length) {
                                                    break;
                                                }
                                                UserCredential userCredential = userCredentialArr[i];
                                                if (userCredential.f108180c != 0) {
                                                    i++;
                                                } else if (!TextUtils.isEmpty(userCredential.f108182e)) {
                                                    if (f9976a.mo19637a(3)) {
                                                        f9976a.mo25412b("Got a fallback URL, but we do not handle challenges. Reason: %s", userCredential.f108181d);
                                                    }
                                                    message = m6275a("Fallback url.");
                                                } else {
                                                    String str = userCredential.f108183f;
                                                    message = Message.obtain((Handler) null, 1);
                                                    Bundle bundle = new Bundle();
                                                    bundle.setClassLoader(FinishBootstrapIntentOperation.class.getClassLoader());
                                                    bundle.putString("mastercredential", str);
                                                    bundle.putParcelable("dataAccount", account);
                                                    message.setData(bundle);
                                                }
                                            }
                                            if (message == null) {
                                                message = m6275a("bootstrap failed");
                                            }
                                        }
                                    }
                                    message = m6275a("Error while fetching credential.");
                                    if (message == null) {
                                    }
                                } catch (ExecutionException e) {
                                    e = e;
                                    message = m6274a(e, "Error calling api to exchange user creds");
                                    messenger.send(message);
                                    return;
                                } catch (InterruptedException e2) {
                                    e = e2;
                                    message = m6274a(e, "Error calling api to exchange user creds");
                                    messenger.send(message);
                                    return;
                                }
                            } else {
                                message = m6275a("No partialRequest");
                            }
                        } catch (ExecutionException e3) {
                            e = e3;
                            message = m6274a(e, "Error calling api to populate target device info");
                            messenger.send(message);
                            return;
                        } catch (InterruptedException e4) {
                            e = e4;
                            message = m6274a(e, "Error calling api to populate target device info");
                            messenger.send(message);
                            return;
                        }
                        messenger.send(message);
                        return;
                    }
                    messenger.send(m6275a("No partial request to finish bootstrapping"));
                    return;
                }
                messenger.send(m6275a("Unknown action"));
            } catch (RemoteException e5) {
                f9976a.mo25417e("Exception handling intent: ", e5, new Object[0]);
            }
        }
    }

    FinishBootstrapIntentOperation(arto arto, artq artq) {
        this.f9977b = artq;
    }

    /* renamed from: a */
    private static final Message m6275a(String str) {
        Message obtain = Message.obtain((Handler) null, 1001);
        Bundle bundle = new Bundle();
        bundle.setClassLoader(FinishBootstrapIntentOperation.class.getClassLoader());
        bundle.putString("errorMsg", str);
        obtain.setData(bundle);
        return obtain;
    }
}
