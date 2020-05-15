package com.google.android.gms.people.sync.focus.delegation;

import android.accounts.Account;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ContactsSyncDelegateChimeraService extends TracingIntentService {
    public ContactsSyncDelegateChimeraService() {
        super("FSA2_ContactsSyncDelegateService");
    }

    /* renamed from: a */
    private static final void m68205a(String str) {
        amdk.m62659b("FSA2_ContactsSyncDelegateService", "Invalid inputs (%s)", str);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i2, i2);
        return 2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f8, code lost:
        if (r9.equals("sync") != false) goto L_0x00fc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x013c  */
    /* renamed from: a */
    public final void mo6499a(Intent intent) {
        amwq amwq;
        int i;
        if (intent == null) {
            m68205a("null intent");
            amwq = null;
        } else {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                m68205a("no extras found");
                amwq = null;
            } else {
                String string = extras.getString("syncId");
                if (TextUtils.isEmpty(string)) {
                    m68205a("missing syncId");
                    amwq = null;
                } else {
                    String string2 = extras.getString("directive");
                    if (TextUtils.isEmpty(string2)) {
                        m68205a("missing directive");
                        amwq = null;
                    } else {
                        Account account = (Account) extras.getParcelable("account");
                        if (account == null) {
                            m68205a("missing account");
                            amwq = null;
                        } else {
                            Bundle bundle = (Bundle) extras.getParcelable("bundle");
                            if (bundle == null) {
                                m68205a("missing sync-bundle");
                                amwq = null;
                            } else {
                                amwq = new amwq(string, string2, account, bundle);
                            }
                        }
                    }
                }
            }
        }
        if (amwq != null) {
            amig.m62939a();
            char c = 0;
            if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo82997bH()).booleanValue()) {
                try {
                    i = getPackageManager().getApplicationInfo("com.google.android.syncadapters.contacts", 0).uid;
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("FSA2_ContactsSyncDelegateService", "Legacy sync adapter package not found.", e);
                    i = -1;
                }
            } else {
                i = -1;
            }
            ampm a = ampm.m63135a(this, i);
            amwp a2 = amwp.m63559a(this);
            amve.m63347a(getApplicationContext(), a2, a);
            String str = amwq.f76210b;
            if ("sync".equals(str) || "abort".equals(str)) {
                int hashCode = str.hashCode();
                if (hashCode != 3545755) {
                    if (hashCode == 92611376 && str.equals("abort")) {
                        c = 1;
                        if (c != 0) {
                            String str2 = amwq.f76209a;
                            synchronized (a2.f76203a) {
                                boolean equals = str2.equals(a2.f76206d);
                                a2.f76206d = null;
                                if (!equals && a2.f76204b == null) {
                                    a2.f76204b = str2;
                                    a2.mo41501a(str2, "processing-sync-request", null);
                                    amva amva = a2.f76205c;
                                    Account account2 = amwq.f76211c;
                                    Bundle bundle2 = amwq.f76212d;
                                    if (amva.f75984a == null) {
                                        amuz amuz = new amuz(amva, account2, bundle2);
                                        amva.f75984a = amuz;
                                        amuz.getId();
                                        amuz.start();
                                    }
                                }
                            }
                            return;
                        } else if (c == 1) {
                            String str3 = amwq.f76209a;
                            synchronized (a2.f76203a) {
                                a2.f76206d = null;
                                String str4 = a2.f76204b;
                                if (str4 == null) {
                                    a2.f76206d = str3;
                                } else if (!str4.equals(str3)) {
                                    Log.i("FSA2_SyncCoordinator", "Ignoring out-of-sequence abort request");
                                } else {
                                    a2.f76204b = null;
                                    a2.f76205c.mo41364a();
                                    if (cfwa.f185820a.mo6606a().mo82820i()) {
                                        amwp.m63560a(amwq.f76212d, amwq.f76211c);
                                    }
                                }
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                }
                c = 65535;
                if (c != 0) {
                }
            } else {
                amdk.m62659b("FSA2_ContactsSyncDelegateService", "Invalid [%s] directive", str);
                String str5 = amwq.f76209a;
                synchronized (a2.f76203a) {
                    if (str5 != null) {
                        a2.mo41501a(str5, "invalid-sync-request", null);
                    }
                }
            }
        }
    }
}
