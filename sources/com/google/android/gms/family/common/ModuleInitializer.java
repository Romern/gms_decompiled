package com.google.android.gms.family.common;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ModuleInitializer extends qlf {

    /* renamed from: a */
    private static final String[] f31281a = {"com.google.android.gms.family.v2.create.FamilyCreationActivity", "com.google.android.gms.family.v2.manage.FamilyManagementActivity", "com.google.android.gms.family.v2.manage.DeleteMemberActivity", "com.google.android.gms.family.v2.manage.InvitationManagementActivity", "com.google.android.gms.family.v2.invites.SendInvitationsActivity", "com.google.android.gms.family.v2.tos.TosActivity", "com.google.android.gms.family.webview.FamilyWebViewActivity"};

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.family.common.ModuleInitializer, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        for (String str : f31281a) {
            spn.m35856a((Context) this, str, true);
        }
    }
}
