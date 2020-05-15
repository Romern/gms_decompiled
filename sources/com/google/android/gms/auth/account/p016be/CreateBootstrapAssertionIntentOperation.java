package com.google.android.gms.auth.account.p016be;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.auth.account.be.CreateBootstrapAssertionIntentOperation */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CreateBootstrapAssertionIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f9974a = ght.m13171a("CreateBootstrapAssertionIntentOperation");

    /* renamed from: b */
    private artq f9975b;

    public CreateBootstrapAssertionIntentOperation() {
    }

    /* renamed from: a */
    private static final Message m6272a(Exception exc, String str) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        return m6273a(str);
    }

    public final void onCreate() {
        rjo rjo = aqxb.f87025a;
        this.f9975b = aqxb.m72187a(this);
    }

    public final void onHandleIntent(Intent intent) {
        Message message;
        Messenger messenger = (Messenger) intent.getExtras().get("messenger");
        if (messenger == null) {
            f9974a.mo25416d("Missing a messenger, unable to bootstrap", new Object[0]);
            return;
        }
        try {
            if ("com.google.android.gms.auth.account.be.create_bootstrap_assertion".equals(intent.getAction())) {
                Account account = (Account) intent.getParcelableExtra("bootstrapAccount");
                if (account != null) {
                    try {
                        UserBootstrapInfo[] userBootstrapInfoArr = (UserBootstrapInfo[]) aucu.m76782a(this.f9975b.mo24706a(new Account[]{account}));
                        if (userBootstrapInfoArr != null) {
                            if (userBootstrapInfoArr.length > 0) {
                                try {
                                    Challenge[] challengeArr = (Challenge[]) aucu.m76782a(this.f9975b.mo24709a(userBootstrapInfoArr));
                                    if (challengeArr != null) {
                                        if (challengeArr.length > 0) {
                                            try {
                                                Assertion[] assertionArr = (Assertion[]) aucu.m76782a(this.f9975b.mo24708a(challengeArr, false, true));
                                                if (assertionArr != null) {
                                                    if (assertionArr.length > 0) {
                                                        try {
                                                            ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest = (ExchangeAssertionsForUserCredentialsRequest) aucu.m76782a(this.f9975b.mo24707a(assertionArr));
                                                            if (exchangeAssertionsForUserCredentialsRequest != null) {
                                                                try {
                                                                    ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest2 = (ExchangeAssertionsForUserCredentialsRequest) aucu.m76782a(this.f9975b.mo24688a(exchangeAssertionsForUserCredentialsRequest));
                                                                    if (exchangeAssertionsForUserCredentialsRequest2 != null) {
                                                                        message = Message.obtain((Handler) null, 1);
                                                                        Bundle bundle = new Bundle();
                                                                        bundle.putByteArray("bootstrapAssertion", sef.m35074a(exchangeAssertionsForUserCredentialsRequest2));
                                                                        message.setData(bundle);
                                                                    } else {
                                                                        message = m6273a("Error populating source device info");
                                                                    }
                                                                } catch (ExecutionException e) {
                                                                    e = e;
                                                                    message = m6272a(e, "Error calling api to populate source device info");
                                                                    messenger.send(message);
                                                                    return;
                                                                } catch (InterruptedException e2) {
                                                                    e = e2;
                                                                    message = m6272a(e, "Error calling api to populate source device info");
                                                                    messenger.send(message);
                                                                    return;
                                                                }
                                                            } else {
                                                                message = m6273a("Error generating partial request.");
                                                            }
                                                        } catch (ExecutionException e3) {
                                                            e = e3;
                                                            message = m6272a(e, "Error calling api to generate partial request");
                                                            messenger.send(message);
                                                            return;
                                                        } catch (InterruptedException e4) {
                                                            e = e4;
                                                            message = m6272a(e, "Error calling api to generate partial request");
                                                            messenger.send(message);
                                                            return;
                                                        }
                                                        messenger.send(message);
                                                        return;
                                                    }
                                                }
                                                message = m6273a("No assertions");
                                            } catch (ExecutionException e5) {
                                                e = e5;
                                                message = m6272a(e, "Error calling api to get assertions");
                                                messenger.send(message);
                                                return;
                                            } catch (InterruptedException e6) {
                                                e = e6;
                                                message = m6272a(e, "Error calling api to get assertions");
                                                messenger.send(message);
                                                return;
                                            }
                                            messenger.send(message);
                                            return;
                                        }
                                    }
                                    message = m6273a("No challenges");
                                } catch (ExecutionException e7) {
                                    e = e7;
                                    message = m6272a(e, "Error calling api to get challenges");
                                    messenger.send(message);
                                    return;
                                } catch (InterruptedException e8) {
                                    e = e8;
                                    message = m6272a(e, "Error calling api to get challenges");
                                    messenger.send(message);
                                    return;
                                }
                                messenger.send(message);
                                return;
                            }
                        }
                        message = m6273a("No bootstrap infos");
                    } catch (ExecutionException e9) {
                        e = e9;
                        message = m6272a(e, "Error calling api to get bootstrap info");
                        messenger.send(message);
                        return;
                    } catch (InterruptedException e10) {
                        e = e10;
                        message = m6272a(e, "Error calling api to get bootstrap info");
                        messenger.send(message);
                        return;
                    }
                    messenger.send(message);
                    return;
                }
                messenger.send(m6273a("No bootstrap account"));
                return;
            }
            messenger.send(m6273a("Unknown action"));
        } catch (RemoteException e11) {
            f9974a.mo25417e("Exception sending message: ", e11, new Object[0]);
        }
    }

    CreateBootstrapAssertionIntentOperation(arto arto, artq artq) {
        this.f9975b = artq;
    }

    /* renamed from: a */
    private static final Message m6273a(String str) {
        Message obtain = Message.obtain((Handler) null, 1001);
        Bundle bundle = new Bundle();
        bundle.setClassLoader(CreateBootstrapAssertionIntentOperation.class.getClassLoader());
        bundle.putString("errorMsg", str);
        obtain.setData(bundle);
        return obtain;
    }
}
