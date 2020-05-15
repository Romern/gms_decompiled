package com.google.android.gms.appinvite.notification;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppInviteInstallIntentOperation extends IntentOperation {

    /* renamed from: a */
    private fuv f9760a = null;

    public AppInviteInstallIntentOperation() {
    }

    public final void onCreate() {
        if (this.f9760a == null) {
            this.f9760a = new fuv(this, null);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: fuv.a(boolean, boolean):int
     arg types: [int, boolean]
     candidates:
      fuv.a(int, long):bojn
      fuv.a(java.util.List, int[]):void
      fuv.a(boolean, boolean):int */
    public final void onHandleIntent(Intent intent) {
        String str;
        String action = intent.getAction();
        if ("android.intent.action.PACKAGE_ADDED".equals(action) || "android.intent.action.PACKAGE_FULLY_REMOVED".equals(action)) {
            String action2 = intent.getAction();
            Uri data = intent.getData();
            if (data != null) {
                str = data.getSchemeSpecificPart();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                Log.e("AppInstallOperation", "Package name not found in the intent.");
            } else if (!fzr.m12816c(this, str)) {
            } else {
                if (action2.equals("android.intent.action.PACKAGE_FULLY_REMOVED")) {
                    fzr.m12813b(this, str);
                } else if (!fzr.m12812a("loggerInstallEvent", true, this, str)) {
                    fzr.m12814b("loggerInstallEvent", this, str);
                    fuv fuv = this.f9760a;
                    if (fuv.f17307a && !fuv.f17311c.mo24805i() && !fuv.f17311c.mo24806j()) {
                        fuv.f17311c.mo24785a(5000, TimeUnit.MILLISECONDS);
                    }
                    fuv fuv2 = this.f9760a;
                    int m = fzr.m12826m(this, str);
                    int i = !fzr.m12812a("isInlineInstall", false, this, str) ? 2 : 3;
                    boolean a = fzr.m12812a("launchFromContinueUrl", false, this, str);
                    boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
                    String h = fzr.m12821h(this, str);
                    int a2 = bzgs.m125778a(fzr.m12822i(this, str));
                    String j = fzr.m12823j(this, str);
                    String k = fzr.m12824k(this, str);
                    String l = fzr.m12825l(this, str);
                    bxvd da = boip.f133201h.mo74144da();
                    if (!TextUtils.isEmpty(str)) {
                        bxvd da2 = boje.f133263c.mo74144da();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        boje boje = (boje) da2.f164949b;
                        str.getClass();
                        boje.f133265a |= 2;
                        boje.f133266b = str;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boip boip = (boip) da.f164949b;
                        boje boje2 = (boje) da2.mo74062i();
                        boje2.getClass();
                        boip.f133204b = boje2;
                        boip.f133203a |= 1;
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    boip boip2 = (boip) da.f164949b;
                    int i2 = m - 1;
                    if (m != 0) {
                        boip2.f133205c = i2;
                        int i3 = boip2.f133203a | 2;
                        boip2.f133203a = i3;
                        boip2.f133206d = i - 1;
                        int i4 = i3 | 4;
                        boip2.f133203a = i4;
                        boip2.f133203a = i4 | 8;
                        boip2.f133207e = a;
                        if (!TextUtils.isEmpty(j) || !TextUtils.isEmpty(k)) {
                            boiz a3 = fuv.m12432a(j, k, h, a2, "");
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            boip boip3 = (boip) da.f164949b;
                            a3.getClass();
                            boip3.f133208f = a3;
                            boip3.f133203a |= 32;
                        }
                        int a4 = fuv.m12431a(true, booleanExtra);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boip boip4 = (boip) da.f164949b;
                        boip4.f133209g = a4 - 1;
                        boip4.f133203a |= 64;
                        fuv2.mo11372a((boip) da.mo74062i(), 11, l);
                        ClientContext clientContext = new ClientContext();
                        clientContext.f30212b = getApplicationInfo().uid;
                        clientContext.f30215e = getPackageName();
                        clientContext.f30216f = getPackageName();
                        try {
                            new fvo(clientContext, fva.m12456a(this), new fuu(this), fzr.m12810a("invitationId", this, str), null).mo11356a(this);
                        } catch (RemoteException | sju e) {
                            bqye.m113758a(e);
                        }
                    } else {
                        throw null;
                    }
                }
            }
        }
    }

    AppInviteInstallIntentOperation(Context context, fuv fuv) {
        attachBaseContext(context);
        this.f9760a = fuv;
    }
}
