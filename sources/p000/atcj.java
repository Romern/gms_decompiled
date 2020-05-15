package p000;

import android.content.Context;
import com.google.android.chimera.IntentOperation;

/* renamed from: atcj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atcj {
    /* renamed from: a */
    public static void m75548a(Context context) {
        context.startService(IntentOperation.getStartIntent(context, "com.google.android.gms.tapandpay.paymentbundle.PaymentBundleIntentOperation", "com.google.android.gms.tapandpay.paymentbundle.SCHEDULE_REFRESHES_ACTION"));
    }
}
