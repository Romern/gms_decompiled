package com.google.android.gms.wallet;

import android.accounts.Account;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import java.io.IOException;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmReceiverChimeraService extends TracingIntentService {
    public GcmReceiverChimeraService() {
        super("WalletGcmReceiver");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6499a(Intent intent) {
        Account account;
        int i;
        try {
            if (((Boolean) awjc.f94524a.mo58455c()).booleanValue()) {
                if (intent != null) {
                    if (intent.hasExtra("serverPushMessageBase64")) {
                        try {
                            bmqt bmqt = (bmqt) GeneratedMessageLite.m124016a(bmqt.f130424e, Base64.decode(intent.getStringExtra("serverPushMessageBase64"), 2), bxus.m123744c());
                            if ((bmqt.f130426a & 1) != 0) {
                                long a = (long) awft.m79871a(this);
                                bmqs bmqs = bmqt.f130429d;
                                if (bmqs == null) {
                                    bmqs = bmqs.f130419c;
                                }
                                if (a < bmqs.f130422b) {
                                    return;
                                }
                            }
                            awst awst = null;
                            if ((bmqt.f130426a & 1) != 0) {
                                bmqs bmqs2 = bmqt.f130429d;
                                if (bmqs2 == null) {
                                    bmqs2 = bmqs.f130419c;
                                }
                                if (!bmqs2.f130421a.isEmpty()) {
                                    Account[] a2 = adyd.m51363a(this).mo33916a("com.google");
                                    int length = a2.length;
                                    i = 0;
                                    while (true) {
                                        if (i >= length) {
                                            account = null;
                                            break;
                                        }
                                        account = a2[i];
                                        String c = gie.m13198c(this, account.name);
                                        bmqs bmqs3 = bmqt.f130429d;
                                        if (bmqs3 == null) {
                                            bmqs3 = bmqs.f130419c;
                                        }
                                        if (TextUtils.equals(bmqs3.f130421a, c)) {
                                            break;
                                        }
                                        i++;
                                    }
                                    if (account == null) {
                                        Log.w("WalletGcmReceiver", "Failed to find account corresponding to serverMessage!");
                                        return;
                                    }
                                } else {
                                    account = null;
                                }
                            } else {
                                account = null;
                            }
                            if (bmqt.f130427b != 2) {
                                Log.w("WalletGcmReceiver", "Could not find a supported specific submessage from ServerPushMessage to handle!");
                            } else {
                                awst = new awst(getApplicationContext(), account, bmqt);
                            }
                            if (awst != null) {
                                awst.run();
                                return;
                            }
                            return;
                        } catch (IllegalArgumentException e) {
                            e = e;
                            Log.w("WalletGcmReceiver", "Failed to parse serverPushMessage", e);
                            return;
                        } catch (bxwf e2) {
                            e = e2;
                            Log.w("WalletGcmReceiver", "Failed to parse serverPushMessage", e);
                            return;
                        }
                    }
                }
                Log.w("WalletGcmReceiver", "Received GCM intent is either null or does not contain the expected extra!");
            }
        } catch (IOException e3) {
            e = e3;
            Log.w("WalletGcmReceiver", String.format(Locale.US, "Failed determining id for account! Skipping account %s", account.name), e);
            i++;
        } catch (gid e4) {
            e = e4;
            Log.w("WalletGcmReceiver", String.format(Locale.US, "Failed determining id for account! Skipping account %s", account.name), e);
            i++;
        } catch (Throwable th) {
            awye.m81493a(this, th);
        }
    }
}
