package p000;

import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* renamed from: aert */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aert {
    /* renamed from: a */
    public static Intent m52468a(Account account) {
        Intent intent = new Intent("com.google.android.gms.location.settings.LOCATION_HISTORY");
        if (account != null) {
            intent.putExtra("account", account);
        }
        return intent;
    }

    /* renamed from: a */
    public static void m52469a(Context context) {
        m52470a(context, "com.google.android.gms.location.settings.GOOGLE_LOCATION_SETTINGS");
    }

    /* renamed from: a */
    private static void m52470a(Context context, String str) {
        Intent intent = new Intent(str);
        intent.setFlags(268435456);
        intent.setPackage("com.google.android.gms");
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
            sb.append("Problem while starting settings activity");
            sb.append(valueOf);
            Log.e("GCoreLocationSettings", sb.toString());
        }
    }
}
