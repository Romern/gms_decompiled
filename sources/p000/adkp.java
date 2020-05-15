package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.List;

/* renamed from: adkp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adkp implements adkq {

    /* renamed from: a */
    private final Context f62069a;

    public adkp(Context context) {
        this.f62069a = context;
    }

    /* renamed from: a */
    public final void mo33598a(Account account, int i, int i2) {
        if (C1133kh.m17835a(this.f62069a, "com.google.android.finsky.permission.INSTANT_APP_STATE") == 0 && this.f62069a.getPackageManager().checkPermission("com.google.android.finsky.permission.INSTANT_APP_STATE", "com.android.vending") == 0) {
            Intent intent = new Intent("com.google.android.instantapps.OPT_IN_STATUS_CHANGED").setPackage("com.android.vending");
            intent.putExtra("com.google.android.instantapps.OPT_IN_STATUS_CHANGED_ACCOUNT", account);
            intent.putExtra("com.google.android.instantapps.OPT_IN_STATUS_CHANGED_OLD_STATE", i);
            intent.putExtra("com.google.android.instantapps.OPT_IN_STATUS_CHANGED_NEW_STATE", i2);
            List<ResolveInfo> queryBroadcastReceivers = this.f62069a.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
                this.f62069a.sendBroadcast(intent);
            }
        }
    }
}
