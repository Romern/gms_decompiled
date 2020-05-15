package com.google.android.gms.wallet.dynamite.logging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: com.google.android.gms.wallet.dynamite.logging.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1676b {
    /* renamed from: a */
    public static void m93930a(Context context, Throwable th, String str) {
        try {
            if ((svr.m36484b(context).mo26172a(context.getPackageName(), 0).flags & 2) == 0) {
                StringWriter stringWriter = new StringWriter();
                bqye.m113760a(th, new PrintWriter(stringWriter));
                C1675a aVar = new C1675a(stringWriter.toString(), str, Runtime.getRuntime().freeMemory(), Runtime.getRuntime().totalMemory());
                String valueOf = String.valueOf(Base64.encodeToString(aVar.f110132b.getBytes(C1675a.f110131a), 10));
                String str2 = valueOf.length() == 0 ? new String("UTF8-BASE64-TRACE:") : "UTF8-BASE64-TRACE:".concat(valueOf);
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append("/");
                sb.append(aVar.f110134d);
                sb.append("/");
                sb.append(aVar.f110135e);
                sb.append("/");
                if (!TextUtils.isEmpty(aVar.f110133c)) {
                    sb.append(aVar.f110133c);
                }
                sb.append("/\n");
                context.sendBroadcast(new Intent().setClassName("com.google.android.gms", "com.google.android.gms.chimera.GmsIntentOperationService$GmsExternalReceiver").setAction("com.google.android.gms.wallet.REPORT_CRASH").putExtra("com.google.android.gms.wallet.CRASH_LOG", sb.toString()));
                return;
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        Log.e("WalletCrash", "Uncaught exception", th);
    }
}
