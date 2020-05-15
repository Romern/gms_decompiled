package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent;
import com.google.android.gms.wallet.intentoperation.AnalyticsIntentOperation;

/* renamed from: awqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awqc {
    /* renamed from: a */
    public static void m80662a(Context context, WalletAnalyticsEvent walletAnalyticsEvent) {
        if (context != null && ((Boolean) awiu.f94495b.mo58455c()).booleanValue()) {
            Intent startIntent = IntentOperation.getStartIntent(context, AnalyticsIntentOperation.class, "com.google.android.gms.wallet.analytics.LOG");
            startIntent.putExtra("wallet.analytics.event", walletAnalyticsEvent);
            context.startService(startIntent);
        }
    }
}
