package com.google.android.gms.subscribedfeeds;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SubscribedFeedsInitializer extends qlf {
    /* renamed from: a */
    private static boolean m93006a(PackageManager packageManager, ComponentName componentName, boolean z) {
        int i;
        if (!z) {
            i = 2;
        } else {
            i = 1;
        }
        if (packageManager.getComponentEnabledSetting(componentName) == i) {
            return false;
        }
        String valueOf = String.valueOf(componentName);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Setting ");
        sb.append(valueOf);
        sb.append(" to ");
        sb.append(i);
        Log.i("SubscribedFeeds", sb.toString());
        packageManager.setComponentEnabledSetting(componentName, i, 1);
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.subscribedfeeds.SubscribedFeedsInitializer.a(android.content.pm.PackageManager, android.content.ComponentName, boolean):boolean
     arg types: [android.content.pm.PackageManager, android.content.ComponentName, int]
     candidates:
      com.google.android.chimera.IntentOperation.a(android.content.Context, android.content.Intent, java.lang.String):dnb
      com.google.android.gms.subscribedfeeds.SubscribedFeedsInitializer.a(android.content.pm.PackageManager, android.content.ComponentName, boolean):boolean */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        boolean a;
        new ashv(this).mo49165a();
        boolean z = false;
        for (Account account : adyd.m51363a(this).mo33916a("com.google")) {
            ashp.m74137a(this, account);
        }
        PackageManager packageManager = getPackageManager();
        m93006a(packageManager, new ComponentName(this, "com.google.android.gms.subscribedfeeds.GcmReceiverService"), true);
        m93006a(packageManager, new ComponentName(this, "com.google.android.gms.subscribedfeeds.GmsSubscribedFeedsProvider"), true);
        ComponentName componentName = new ComponentName(this, "com.google.android.gms.subscribedfeeds.SyncService");
        ComponentName componentName2 = new ComponentName(this, "com.google.android.gms.subscribedfeeds.GmsFeedsSyncService");
        try {
            z = m93006a(packageManager, new ComponentName("com.google.android.gsf", "com.google.android.gsf.subscribedfeeds.SubscribedFeedsSyncAdapterService"), false);
        } catch (IllegalArgumentException e) {
        }
        if ((m93006a(packageManager, componentName2, true) || (m93006a(packageManager, componentName, true) | z)) || (i & 2) != 0) {
            int i2 = ashp.f88985a;
            ContentResolver.requestSync(null, ashp.m74139b(), Bundle.EMPTY);
        }
    }
}
