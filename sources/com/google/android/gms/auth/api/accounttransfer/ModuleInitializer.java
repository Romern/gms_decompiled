package com.google.android.gms.auth.api.accounttransfer;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ModuleInitializer extends qlf {

    /* renamed from: a */
    protected static final String[] f10076a = {"com.google.android.gms.auth.api.accounttransfer.PurgeAccountTransferDataService"};

    /* renamed from: b */
    private static final sbw f10077b = new sbw("AccountTransfer", "[ATModuleInitializer]");

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.auth.api.accounttransfer.ModuleInitializer, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        bmxr a = bmxr.m108544a("; ").mo66873a();
        sbw sbw = f10077b;
        String[] strArr = f10076a;
        int length = strArr.length;
        String a2 = a.mo66876a((Object[]) strArr);
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 33);
        sb.append("Enabling ");
        sb.append(length);
        sb.append(" components: ");
        sb.append(a2);
        sbw.mo25371b(sb.toString());
        for (String str : f10076a) {
            spn.m35856a((Context) this, str, true);
        }
    }
}
