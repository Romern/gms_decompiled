package com.google.android.gms.auth.proximity;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.volley.DefaultRetryPolicy;
import com.google.android.chimera.IntentOperation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmRegistrationIntentOperation extends IntentOperation {

    /* renamed from: a */
    public static final sek f11132a = jsy.m17256a("GcmRegistrationIntentOperation");

    /* renamed from: a */
    public static Intent m6764a(Context context, boolean z) {
        Intent startIntent = IntentOperation.getStartIntent(context, GcmRegistrationIntentOperation.class, "com.google.android.gms.auth.proximity.REGISTER_GCM");
        startIntent.putExtra("is_initiator", z);
        return startIntent;
    }

    public final void onHandleIntent(Intent intent) {
        String str;
        boolean booleanExtra = intent.getBooleanExtra("is_initiator", false);
        Account[] a = adyd.m51363a(getApplicationContext()).mo33916a("com.google");
        try {
            int b = ((int) cchx.m129770b()) * DefaultRetryPolicy.DEFAULT_TIMEOUT_MS;
            int length = a.length;
            ArrayList arrayList = new ArrayList(length);
            int i = 0;
            while (true) {
                str = null;
                if (i >= length) {
                    break;
                }
                String str2 = a[i].name;
                if (jlq.m16888a(getApplicationContext()).getStringSet("registered_gcm_bootstrap_accounts", new HashSet()).contains(str2)) {
                    f11132a.mo25414c("Account %s is already registered to bootstrap", str2);
                    arrayList.add(bqga.m112775a((Object) null));
                } else {
                    bqgg a2 = jlp.m16887a(getApplicationContext(), str2, "auth_proximity_bootstrap");
                    bqga.m112781a(a2, new jlr(this, str2), bqfb.INSTANCE);
                    arrayList.add(a2);
                }
                i++;
            }
            sek sek = f11132a;
            Object[] objArr = new Object[1];
            int i2 = 0;
            for (String str3 : (List) bqga.m112774a((Iterable) arrayList).get((long) b, TimeUnit.MILLISECONDS)) {
                if (str3 != null) {
                    i2++;
                }
            }
            objArr[0] = Integer.valueOf(i2);
            sek.mo25412b("Subscribed to %d bootstrap topics.", objArr);
            if (booleanExtra) {
                byte[] b2 = jpt.m17081b(this);
                if (b2 == null) {
                    f11132a.mo25418e("Couldn't get public key", new Object[0]);
                } else {
                    str = jkr.m16853a(RemoteDevice.m6768a(b2));
                }
                if (str == null) {
                    f11132a.mo25418e("Couldn't get this device's short device ID", new Object[0]);
                    return;
                }
                for (Account account : a) {
                    Context applicationContext = getApplicationContext();
                    String str4 = account.name;
                    Bundle a3 = jll.m16881a(applicationContext, str4);
                    if (a3 == null) {
                        jll.m16885a(str4, "in");
                    } else {
                        a3.putString("mt", "in");
                        a3.putString("di", str);
                        StringBuilder sb = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            int length2 = a.length;
                            if (i3 >= length2) {
                                break;
                            }
                            sb.append(a[i3].name);
                            if (i3 < length2 - 1) {
                                sb.append('|');
                            }
                            i3++;
                        }
                        a3.putString("al", sb.toString());
                        jll.m16884a(applicationContext, "auth_proximity_bootstrap", str4, str, a3);
                    }
                }
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            f11132a.mo25417e("Subscription to private topics failed, killing GCM registration operation", e, new Object[0]);
        }
    }
}
