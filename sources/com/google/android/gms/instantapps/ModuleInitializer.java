package com.google.android.gms.instantapps;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.instantapps.routing.DomainFilterUpdateChimeraService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ModuleInitializer extends qlf {

    /* renamed from: a */
    private static final String[] f79141a = new String[0];

    static {
        new adfs("ModuleInitializer");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6343a(Intent intent) {
        DomainFilterUpdateChimeraService.m66762a(this);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.instantapps.ModuleInitializer, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        new Object[1][0] = Integer.valueOf(i);
        for (String str : f79141a) {
            String valueOf = String.valueOf(str);
            String str2 = valueOf.length() == 0 ? new String("com.google.android.gms.instantapps.") : "com.google.android.gms.instantapps.".concat(valueOf);
            new Object[1][0] = str2;
            spn.m35856a((Context) this, str2, true);
        }
        DomainFilterUpdateChimeraService.m66766c();
    }
}
