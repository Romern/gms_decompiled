package com.google.android.gms.auth.cryptauth.gcm;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmReceiverChimeraService extends TracingIntentService {

    /* renamed from: a */
    private static final sek f10559a = new sek(new String[]{"GcmReceiverService"}, (byte[]) null);

    public GcmReceiverChimeraService() {
        super("CryptauthGcmIntentReceiver");
        setIntentRedelivery(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6499a(Intent intent) {
        char c;
        if (ccfa.m129418b()) {
            Account account = null;
            if (intent != null) {
                try {
                    iqt iqt = new iqt(this);
                    if (!intent.hasExtra("S")) {
                        iqt.f21581e.mo25416d("Missing target service", new Object[0]);
                    } else if (!intent.hasExtra("H")) {
                        iqt.f21581e.mo25416d("Missing active key handle field", new Object[0]);
                    } else {
                        try {
                            account = new Account(iqt.f21585d.mo13218a(sqd.m35966a(intent.getStringExtra("H"))).f21640e, "com.google");
                        } catch (isu e) {
                            iqt.f21581e.mo25417e("Couldn't retrieve key from key handle", e, new Object[0]);
                        }
                        if (account == null) {
                            iqt.f21581e.mo25416d("Account could not be retrieved from key handle", new Object[0]);
                        } else {
                            if (intent.hasExtra("F")) {
                                String stringExtra = intent.getStringExtra("F");
                                sek sek = iqt.f21581e;
                                String valueOf = String.valueOf(stringExtra);
                                sek.mo25414c(valueOf.length() == 0 ? new String("Sending device sync feature broadcast for ") : "Sending device sync feature broadcast for ".concat(valueOf), new Object[0]);
                                iqt.f21583b.mo13316a(3);
                                String str = account.name;
                                Intent intent2 = new Intent("com.google.android.gms.auth.cryptauth.DEVICE_SYNC_V2_FEATURE");
                                intent2.setPackage("com.google.android.gms");
                                intent2.putExtra("account_name", str);
                                intent2.putExtra("feature_name", stringExtra);
                                iqt.f21582a.sendBroadcast(intent2);
                            }
                            String stringExtra2 = intent.getStringExtra("S");
                            if (stringExtra2.hashCode() == 50 && stringExtra2.equals("2")) {
                                c = 0;
                            } else {
                                c = 65535;
                            }
                            if (c != 0) {
                                sek sek2 = iqt.f21581e;
                                String valueOf2 = String.valueOf(stringExtra2);
                                sek2.mo25416d(valueOf2.length() == 0 ? new String("Unrecognized target service: ") : "Unrecognized target service: ".concat(valueOf2), new Object[0]);
                            } else {
                                String stringExtra3 = intent.getStringExtra("K");
                                if (stringExtra3 != null) {
                                    iqt.f21584c.mo13260a(account, stringExtra3, intent.getStringExtra("I"));
                                } else {
                                    iqt.f21581e.mo25416d("Missing device sync key name", new Object[0]);
                                }
                            }
                        }
                    }
                } catch (RuntimeException e2) {
                    f10559a.mo25417e("Error", e2, new Object[0]);
                } finally {
                    aseo.m73884b(this, intent);
                }
            } else {
                f10559a.mo25416d("Received null intent.", new Object[0]);
                aseo.m73884b(this, null);
            }
        }
    }
}
