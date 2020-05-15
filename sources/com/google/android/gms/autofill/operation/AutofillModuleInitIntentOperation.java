package com.google.android.gms.autofill.operation;

import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Looper;
import android.view.autofill.AutofillManager;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AutofillModuleInitIntentOperation extends qlf {

    /* renamed from: a */
    static final String[] f11658a = {"com.google.android.gms.autofill.service.AutofillService", "com.google.android.gms.autofill.ui.AutofillActivity", "com.google.android.gms.autofill.ui.AutofillDialogActivity", "com.google.android.gms.autofill.ui.AutofillSettingsActivity", "com.google.android.gms.autofill.ui.AutofillTransparentActivity"};

    /* renamed from: b */
    private static final srn f11659b = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: a */
    static void m7150a() {
        int i = Build.VERSION.SDK_INT;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6343a(Intent intent) {
        int i = Build.VERSION.SDK_INT;
        lho e = krc.m18382a(this).mo14830e();
        e.mo15103b(bmvz.f131120a);
        e.mo15100a(bmvz.f131120a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        ((bnsl) f11659b.mo68390d()).mo68409a("AutofillModuleInitIntentOperation onInitRuntimeState(%s)", i);
        int i2 = Build.VERSION.SDK_INT;
        for (String str : f11658a) {
            spn.m35856a(getBaseContext(), str, true);
        }
        kre a = krc.m18382a(this);
        kpv o = a.mo14840o();
        if (o.f24770e.compareAndSet(false, true)) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
            intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
            intentFilter.addDataScheme("package");
            o.f24766a.registerReceiver(o.f24767b, intentFilter);
            new adzt(Looper.getMainLooper()).post(new kpu(o.f24768c, o.f24769d));
        }
        if (ccjs.m130140b() || ccjc.f179140a.mo6606a().mo76097a()) {
            kyr.m18804a(a);
        }
        a.mo14846u().mo14434a();
        bmxv s = a.mo14844s();
        if (lrb.m19569b()) {
            AutofillManager j = a.mo14835j();
            int i3 = Build.VERSION.SDK_INT;
            ComponentName autofillServiceComponentName = j.getAutofillServiceComponentName();
            if (autofillServiceComponentName != null && autofillServiceComponentName.getPackageName().equals("com.google.android.gms")) {
                if (s.mo66813a()) {
                    ((kyi) s.mo66814b()).mo14942c();
                    return;
                }
                return;
            }
        }
        if (s.mo66813a()) {
            ((kyi) s.mo66814b()).mo14943d();
        }
    }
}
