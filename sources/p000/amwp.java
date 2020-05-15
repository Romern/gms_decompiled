package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SyncRequest;
import android.content.SyncResult;
import android.os.Build;
import android.os.Bundle;

/* renamed from: amwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amwp {

    /* renamed from: f */
    private static amwp f76202f = null;

    /* renamed from: a */
    public final Object f76203a = new Object();

    /* renamed from: b */
    public String f76204b;

    /* renamed from: c */
    public amva f76205c;

    /* renamed from: d */
    public String f76206d;

    /* renamed from: e */
    public long f76207e = 0;

    /* renamed from: g */
    private final Context f76208g;

    public amwp(Context context) {
        this.f76208g = context.getApplicationContext();
    }

    /* renamed from: a */
    public static synchronized amwp m63559a(Context context) {
        amwp amwp;
        synchronized (amwp.class) {
            if (f76202f == null) {
                f76202f = new amwp(context);
            }
            amwp = f76202f;
        }
        return amwp;
    }

    /* renamed from: a */
    public static void m63560a(Bundle bundle, Account account) {
        int i = bundle.getInt("NUM_REMAINING_RETRIES_ON_CANCEL", (int) cfwa.f185820a.mo6606a().mo82816e());
        if (i > 0) {
            SyncRequest.Builder builder = new SyncRequest.Builder();
            builder.setSyncAdapter(account, "com.android.contacts");
            builder.setDisallowMetered(cfwa.f185820a.mo6606a().mo82814c());
            int i2 = Build.VERSION.SDK_INT;
            builder.setRequiresCharging(cfwa.f185820a.mo6606a().mo82819h());
            Bundle bundle2 = new Bundle();
            bundle2.putInt("NUM_REMAINING_RETRIES_ON_CANCEL", i - 1);
            builder.setExtras(bundle2);
            ContentResolver.requestSync(builder.build());
            String str = account.name;
        }
    }

    /* renamed from: a */
    public final synchronized void mo41501a(String str, String str2, SyncResult syncResult) {
        Intent intent = new Intent("android.intent.action.RUN");
        intent.setPackage("com.google.android.syncadapters.contacts");
        intent.putExtra("syncId", str);
        intent.putExtra("response", str2);
        if (syncResult != null) {
            intent.putExtra("result", syncResult);
        }
        int i = Build.VERSION.SDK_INT;
        amig.m62939a();
        if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo83008bi()).booleanValue()) {
            intent.setAction("com.google.android.syncadapters.contacts.DELEGATION");
            this.f76208g.sendBroadcast(intent);
            return;
        }
        this.f76208g.startService(intent);
    }
}
