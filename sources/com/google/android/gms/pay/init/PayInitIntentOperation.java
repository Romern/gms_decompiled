package com.google.android.gms.pay.init;

import android.content.Context;
import android.content.Intent;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PayInitIntentOperation extends qlf {

    /* renamed from: a */
    private static final srn f81671a = srn.m36127a(sgj.PAY);

    /* renamed from: b */
    private static final String[] f81672b = {"com.google.android.gms.pay.gcmtask.PayGcmTaskService", "com.google.android.gms.pay.security.storagekey.service.StorageKeyCacheService", "com.google.android.gms.pay.notifications.GcmBroadcastReceiver", "com.google.android.gms.pay.notifications.PayNotificationService", "com.google.android.gms.pay.main.PayActivity", "com.google.android.gms.pay.deeplink.DeepLinkActivity"};

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.pay.init.PayInitIntentOperation, java.lang.String, boolean]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* renamed from: a */
    private final void m67778a(Set set) {
        String[] strArr = f81672b;
        for (String str : strArr) {
            boolean contains = set.contains(str);
            try {
                spn.m35856a((Context) this, str, contains);
            } catch (IllegalArgumentException e) {
                if (contains) {
                    bnsl bnsl = (bnsl) f81671a.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("com.google.android.gms.pay.init.PayInitIntentOperation", "a", 64, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("component %s not enabled", str);
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.pay.init.PayInitIntentOperation, java.lang.String, boolean]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        HashSet hashSet;
        if (!cfuc.f185713a.mo6606a().mo82725a() || !soz.m35810g(this)) {
            hashSet = new HashSet();
            if (cfuc.f185713a.mo6606a().mo82733i()) {
                hashSet.add("com.google.android.gms.pay.deeplink.DeepLinkActivity");
            }
        } else {
            hashSet = new HashSet();
        }
        String[] strArr = f81672b;
        for (String str : strArr) {
            boolean contains = hashSet.contains(str);
            try {
                spn.m35856a((Context) this, str, contains);
            } catch (IllegalArgumentException e) {
                if (contains) {
                    bnsl bnsl = (bnsl) f81671a.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("com.google.android.gms.pay.init.PayInitIntentOperation", "a", 64, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("component %s not enabled", str);
                }
            }
        }
        new alhw(this).mo40355a();
    }
}
