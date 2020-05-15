package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.gms.checkin.internal.FirstAccountReadySender$1;

/* renamed from: qff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qff {
    /* renamed from: a */
    public static void m32062a(Context context) {
        svu a = svu.m36486a();
        String e = a.mo26194e(context);
        if (e == null) {
            e = a.mo26191d(context);
        }
        if (e != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("android.for.work.preferences", 0);
            if (!sharedPreferences.getBoolean("first.account.ready.received", false)) {
                Intent intent = new Intent("com.google.android.work.action.FIRST_ACCOUNT_READY");
                svu.m36486a().mo26185a(intent);
                intent.setPackage(e);
                intent.putExtra("deviceHint", qdg.m31926g(context));
                context.sendOrderedBroadcast(intent, null, new FirstAccountReadySender$1("checkin", sharedPreferences), null, 0, null, null);
            }
        }
    }
}
