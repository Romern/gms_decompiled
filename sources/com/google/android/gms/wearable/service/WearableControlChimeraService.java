package com.google.android.gms.wearable.service;

import android.content.Intent;
import android.database.Cursor;
import android.util.Log;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import java.util.HashSet;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WearableControlChimeraService extends TracingIntentService {
    public WearableControlChimeraService() {
        super("Wear_ControlService");
    }

    /* renamed from: a */
    private final void m94446a() {
        Log.d("Wear_ControlService", "startWearableServices");
        startService(new Intent().setClassName(this, "com.google.android.gms.wearable.service.WearableService"));
    }

    /* renamed from: b */
    private static final void m94448b(String str) {
        if (axuv.f96418a != null) {
            axuv.f96418a.mo53607b(str);
        }
        if (axxv.f96690a != null) {
            axxv.f96690a.mo53746c(str);
        }
    }

    /* renamed from: a */
    private static final void m94447a(String str) {
        axuv axuv;
        axue a;
        if (axuv.f96418a != null && (a = (axuv = axuv.f96418a).mo53597a(str)) != null) {
            axuv.mo53599a(a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6499a(Intent intent) {
        axuv axuv;
        axue a;
        axuv axuv2;
        axue a2;
        Cursor b;
        String action = intent.getAction();
        String schemeSpecificPart = intent.getData() != null ? intent.getData().getSchemeSpecificPart() : null;
        if ("com.google.android.gms.wearable.ACTION_STARTUP".equals(action)) {
            m94446a();
            return;
        } else if ("com.google.android.gms.wearable.ACTION_WEARABLE_APP_PACKAGE_ADDED".equals(action)) {
            m94446a();
            m94447a(schemeSpecificPart);
            return;
        } else if ("com.google.android.gms.wearable.ACTION_WEARABLE_APP_PACKAGE_REMOVED".equals(action)) {
            m94448b(schemeSpecificPart);
            Log.d("Wear_ControlService", "stopWearableServices");
            stopService(new Intent().setClassName(this, "com.google.android.gms.wearable.service.WearableService"));
            return;
        } else if ("com.google.android.gms.wearable.ACTION_PACKAGE_ADDED".equals(action)) {
            m94447a(schemeSpecificPart);
            return;
        } else if (!"com.google.android.gms.wearable.ACTION_PACKAGE_CHANGED".equals(action)) {
            if ("com.google.android.gms.wearable.ACTION_PACKAGE_DATA_CLEARED".equals(action)) {
                if (!(axuv.f96418a == null || (a2 = (axuv2 = axuv.f96418a).mo53597a(schemeSpecificPart)) == null)) {
                    axyo a3 = axuv2.f96425f.mo53771a(a2.f96377a);
                    try {
                        HashSet<String> hashSet = new HashSet();
                        b = axuv2.mo53605b(a2, axuv2.f96427h.mo53808b().f96814a);
                        b.moveToFirst();
                        while (!b.isAfterLast()) {
                            axxi a4 = axxj.m83472a(b);
                            String a5 = axuv.m83265a(a4);
                            if (axuv.m83263a(a4.f96647b) == axus.DYNAMIC) {
                                hashSet.add(a5);
                            }
                        }
                        if (b != null) {
                            b.close();
                        }
                        String str = axuv2.f96427h.mo53808b().f96814a;
                        for (String str2 : hashSet) {
                            axuv2.mo53604a(a2, str, str2);
                        }
                        a3.close();
                    } catch (Throwable th) {
                        try {
                            a3.close();
                        } catch (Throwable th2) {
                            bqye.m113761a(th, th2);
                        }
                        throw th;
                    }
                }
                if (axxv.f96690a != null) {
                    axxv.f96690a.mo53746c(schemeSpecificPart);
                    return;
                }
                return;
            } else if ("com.google.android.gms.wearable.ACTION_PACKAGE_REMOVED".equals(action)) {
                m94448b(schemeSpecificPart);
                return;
            } else {
                String valueOf = String.valueOf(action);
                Log.w("Wear_ControlService", valueOf.length() == 0 ? new String("started with invalid action: ") : "started with invalid action: ".concat(valueOf));
                return;
            }
        } else if (axuv.f96418a != null && (a = (axuv = axuv.f96418a).mo53597a(schemeSpecificPart)) != null) {
            axuv.mo53599a(a);
            return;
        } else {
            return;
        }
        throw th;
    }
}
