package com.google.android.gms.auth.account.p016be;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.ModuleManager;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.auth.account.be.SupervisedAccountIntentOperation */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SupervisedAccountIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f9979a = ght.m13171a("SupervisedAccountIntentOperation");

    /* renamed from: a */
    private final void m6278a() {
        ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
        featureRequest.requestFeatureAtLatestVersion("kids");
        featureRequest.setUrgent();
        f9979a.mo25414c("Requesting feature: kids...", new Object[0]);
        ModuleManager.get(this).requestFeatures(featureRequest);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f5  */
    public final void onHandleIntent(Intent intent) {
        char c;
        String str;
        Set set;
        sek sek = f9979a;
        String valueOf = String.valueOf(intent.getAction());
        sek.mo25414c(valueOf.length() == 0 ? new String("onHandleIntent(): ") : "onHandleIntent(): ".concat(valueOf), new Object[0]);
        if (!gnv.m13562g()) {
            f9979a.mo25414c("This operation is disabled", new Object[0]);
            return;
        }
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode != 438946629) {
            if (hashCode == 1544582882 && action.equals("android.intent.action.PACKAGE_ADDED")) {
                c = 0;
                if (c != 0) {
                    if (c == 1) {
                        f9979a.mo25414c("onContainerUpdated", new Object[0]);
                        if (!gnv.m13564i()) {
                            f9979a.mo25414c("Skipping token refresh", new Object[0]);
                        } else {
                            for (Account account : soz.m35801d(this, getPackageName())) {
                                try {
                                    sek sek2 = f9979a;
                                    String valueOf2 = String.valueOf(sek.m35081a(account));
                                    sek2.mo25414c(valueOf2.length() == 0 ? new String("Refreshing servivce flags for account %s") : "Refreshing servivce flags for account %s".concat(valueOf2), new Object[0]);
                                    gik.m13217e(this, gik.m13211b(this, account, "ac2dm", Bundle.EMPTY));
                                    gik.m13211b(this, account, "ac2dm", Bundle.EMPTY);
                                } catch (Exception e) {
                                    sek sek3 = f9979a;
                                    String valueOf3 = String.valueOf(sek.m35081a(account));
                                    sek3.mo25416d(valueOf3.length() == 0 ? new String("Failed to refresh service flags for account %s") : "Failed to refresh service flags for account %s".concat(valueOf3), new Object[0]);
                                }
                            }
                        }
                    }
                    if (!soz.m35795b(this).isEmpty()) {
                        m6278a();
                        return;
                    }
                    return;
                }
                Uri data = intent.getData();
                if (data != null) {
                    str = data.getSchemeSpecificPart();
                } else {
                    str = null;
                }
                if (!bmxx.m108577a(str)) {
                    String h = gnv.m13563h();
                    if (h.isEmpty()) {
                        set = Collections.emptySet();
                    } else {
                        C1225nr nrVar = new C1225nr();
                        Collections.addAll(nrVar, h.split(","));
                        set = nrVar;
                    }
                    if (set.contains(str)) {
                        m6278a();
                        return;
                    }
                    return;
                }
                sek sek4 = f9979a;
                String action2 = intent.getAction();
                StringBuilder sb = new StringBuilder(String.valueOf(action2).length() + 42);
                sb.append("Dropping ");
                sb.append(action2);
                sb.append(" Intent with missing package name");
                sek4.mo25416d(sb.toString(), new Object[0]);
                return;
            }
        } else if (action.equals("com.google.android.gms.chimera.container.CONTAINER_UPDATED")) {
            c = 1;
            if (c != 0) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
    }
}
