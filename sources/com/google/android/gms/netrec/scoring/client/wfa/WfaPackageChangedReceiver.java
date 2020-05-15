package com.google.android.gms.netrec.scoring.client.wfa;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WfaPackageChangedReceiver extends aacn {

    /* renamed from: a */
    private static WfaPackageChangedReceiver f81200a;

    private WfaPackageChangedReceiver() {
        super("netrec");
    }

    /* renamed from: a */
    public static synchronized void m67653a(Context context) {
        synchronized (WfaPackageChangedReceiver.class) {
            if (f81200a == null) {
                f81200a = new WfaPackageChangedReceiver();
                Context applicationContext = context.getApplicationContext();
                WfaPackageChangedReceiver wfaPackageChangedReceiver = f81200a;
                IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_CHANGED");
                intentFilter.addDataScheme("package");
                applicationContext.registerReceiver(wfaPackageChangedReceiver, intentFilter);
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m67654b(Context context) {
        synchronized (WfaPackageChangedReceiver.class) {
            if (f81200a != null) {
                context.getApplicationContext().unregisterReceiver(f81200a);
                f81200a = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        Uri data;
        if (TextUtils.equals("android.intent.action.PACKAGE_CHANGED", intent.getAction()) && (data = intent.getData()) != null && TextUtils.equals(cfpm.m142486b(), data.getSchemeSpecificPart())) {
            String[] stringArrayExtra = intent.getStringArrayExtra("android.intent.extra.changed_component_name_list");
            String className = akld.m59953a().getClassName();
            String className2 = aklk.m59960b().getClassName();
            for (String str : stringArrayExtra) {
                if (TextUtils.equals(className, str)) {
                    new Object[1][0] = str;
                    int i = eoa.f15378a;
                    aklc.m59952a();
                    akld.m59956c(context);
                }
                if (TextUtils.equals(className2, str)) {
                    new Object[1][0] = str;
                    int i2 = eoa.f15378a;
                    aklk.m59959a(context);
                }
            }
        }
    }
}
