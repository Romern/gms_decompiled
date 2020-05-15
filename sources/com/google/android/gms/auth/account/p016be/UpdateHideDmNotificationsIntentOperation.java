package com.google.android.gms.auth.account.p016be;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.auth.account.be.UpdateHideDmNotificationsIntentOperation */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UpdateHideDmNotificationsIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f9980a = ght.m13171a("UpdateHideDmNotificationsIntentOperation");

    /* renamed from: b */
    private static final long f9981b = TimeUnit.MINUTES.toMillis(5);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    public static Intent m6279a(Context context, Account account) {
        Intent putExtra = IntentOperation.getStartIntent(context, UpdateHideDmNotificationsIntentOperation.class, "com.google.android.gms.auth.account.be.update_hide_dm_notifications").putExtra("account_name", account);
        putExtra.putExtra("hide_notifications", true);
        return putExtra;
    }

    public final void onHandleIntent(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("hide_notifications", false);
        Account account = (Account) intent.getParcelableExtra("account_name");
        if (booleanExtra) {
            f9980a.mo25414c("setting timestamp", new Object[0]);
            ((goa) goa.f18759a.mo13145b()).mo12095b(account, gqd.f18821o, Long.valueOf(System.currentTimeMillis() + f9981b));
            return;
        }
        f9980a.mo25414c("clearing timestamp", new Object[0]);
        ((goa) goa.f18759a.mo13145b()).mo12095b(account, gqd.f18821o, null);
    }
}
