package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: abcm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abcm {
    /* renamed from: a */
    public static void m47448a(Context context, byte[] bArr, GoogleHelp googleHelp) {
        Intent className = new Intent("com.google.android.gms.googlehelp.metrics.MetricsIntentOperation.LOG_METRIC").setClassName(context, "com.google.android.gms.chimera.GmsIntentOperationService");
        className.putExtra("EXTRA_METRIC_DATA", bArr);
        className.putExtra("EXTRA_GOOGLE_HELP", googleHelp);
        context.startService(className);
    }
}
