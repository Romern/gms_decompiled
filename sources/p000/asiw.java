package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.cast.JGCastService;

/* renamed from: asiw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asiw {
    /* renamed from: a */
    public static PendingIntent m74197a(Context context, Intent intent, String str) {
        Intent putExtra = new Intent().setClassName(context, "com.google.android.gms.tapandpay.account.SelectAccountActivity").putExtra("extra_calling_package", str);
        if (intent != null) {
            putExtra.putExtra("extra_next_intent", intent);
        }
        return spn.m35844a(context, putExtra, (int) JGCastService.FLAG_PRIVATE_DISPLAY);
    }
}
