package com.google.android.gms.romanesco.base;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RomanescoInitIntentOperation extends qlf {

    /* renamed from: a */
    static final String[] f107224a = {"com.google.android.gms.romanesco.settings.ContactsRestoreSettingsActivity", "com.google.android.gms.romanesco.settings.ContactsRestoreDialogActivity", "com.google.android.gms.romanesco.settings.ContactsRestoreContactsActivity"};

    /* renamed from: b */
    private final aoyh f107225b = aoyh.m69805a("RomanescoInit");

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        if (cgjk.m145710c() && cgjk.f187071a.mo6606a().mo83909g()) {
            aozh.m69900a(this).mo34081b();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.romanesco.base.RomanescoInitIntentOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        String[] strArr = f107224a;
        for (String str : strArr) {
            new Object[1][0] = str;
            try {
                spn.m35856a((Context) this, str, true);
            } catch (IllegalArgumentException e) {
                aoyh aoyh = this.f107225b;
                String valueOf = String.valueOf(e.getMessage());
                aoyh.mo46985d(valueOf.length() == 0 ? new String("Component invalid: ") : "Component invalid: ".concat(valueOf));
            }
        }
    }
}
