package com.google.android.gms.ads.identifier.service;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.ads.identifier.settings.C0287e;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Semaphore;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AdvertisingIdNotificationChimeraService extends TracingIntentService {

    /* renamed from: a */
    private C0287e f7998a = C0287e.m5194a(rpr.m34216b());

    /* renamed from: b */
    private final Semaphore f7999b = new Semaphore(1);

    public AdvertisingIdNotificationChimeraService() {
        super("AdvertisingIdNS");
        C0371o.m5339a(rpr.m34216b());
    }

    /* renamed from: a */
    public final void mo6499a(Intent intent) {
        Semaphore semaphore;
        if (cbvp.f178349a.mo6606a().mo75453y()) {
            long longExtra = intent.getLongExtra("time_since_last_update", -1);
            Bundle bundle = new Bundle();
            bundle.putString("lat", !this.f7998a.mo6518i() ? "0" : "1");
            bundle.putString("tslu", Long.toString(longExtra));
            C0387d.m5363a().mo6853a(this, null, "gmob-apps", bundle);
        }
        List<ResolveInfo> queryIntentServices = getPackageManager().queryIntentServices(new Intent("com.google.android.gms.ads.identifier.BIND_LISTENER"), 0);
        HashSet<String> hashSet = new HashSet();
        for (ResolveInfo resolveInfo : queryIntentServices) {
            hashSet.add(resolveInfo.serviceInfo.packageName);
        }
        for (String str : hashSet) {
            C0278a aVar = new C0278a(str, this.f7998a, this, this.f7999b);
            if (!cbvp.f178349a.mo6606a().mo75451w() || rfz.m33557a(aVar.f8002c).mo24610b(aVar.f8000a)) {
                ClientContext clientContext = new ClientContext();
                String str2 = aVar.f8000a;
                clientContext.f30215e = str2;
                clientContext.f30212b = spn.m35897i(aVar.f8002c, str2);
                if (sfr.m35174a(aVar.f8002c, clientContext).mo25481a("com.google.android.gms.permission.AD_ID_NOTIFICATION") == 0) {
                    List<ResolveInfo> queryIntentServices2 = aVar.f8002c.getPackageManager().queryIntentServices(aVar.f8001b, 0);
                    if (queryIntentServices2.size() > 1) {
                        String str3 = aVar.f8000a;
                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 76);
                        sb.append("Unable to pick AdvertisingIdListenerService for ");
                        sb.append(str3);
                        sb.append(", too many services defined.");
                        Log.w("AdvertisingIdNS", sb.toString());
                    }
                    if (queryIntentServices2.size() == 1) {
                        try {
                            aVar.f8003d.acquire();
                            try {
                                if (skh.m35531a().mo25690a(aVar.f8002c, aVar.f8001b, aVar, 1)) {
                                }
                            } catch (SecurityException e) {
                                String str4 = aVar.f8000a;
                                String message = e.getMessage();
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 26 + String.valueOf(message).length());
                                sb2.append("Fail to bind to package ");
                                sb2.append(str4);
                                sb2.append(". ");
                                sb2.append(message);
                                Log.v("AdvertisingIdNS", sb2.toString());
                            }
                            aVar.f8003d.release();
                        } catch (InterruptedException e2) {
                        }
                    } else {
                        String valueOf = String.valueOf(str);
                        Log.w("AdvertisingIdNS", valueOf.length() == 0 ? new String("Does not have proper listener service. Package ") : "Does not have proper listener service. Package ".concat(valueOf));
                    }
                }
            }
            String valueOf2 = String.valueOf(str);
            Log.w("AdvertisingIdNS", valueOf2.length() == 0 ? new String("Permission denied. Package ") : "Permission denied. Package ".concat(valueOf2));
        }
        try {
            this.f7999b.acquire(1);
            semaphore = this.f7999b;
        } catch (InterruptedException e3) {
            semaphore = this.f7999b;
        } catch (Throwable th) {
            this.f7999b.release(1);
            throw th;
        }
        semaphore.release(1);
    }
}
