package p000;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: wzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wzf {
    /* renamed from: a */
    public static void m42514a(Context context, abeh abeh) {
        if (TextUtils.isEmpty(abeh.f57209d)) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires appPackageName to be set");
        }
        if (TextUtils.isEmpty(abeh.f57214i)) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires sessionId to be set");
        }
        if (TextUtils.isEmpty(abeh.f57212g)) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires flow to be set");
        }
        if (abeh.f57230y <= 0) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires clientVersion to be set");
        }
        if (abeh.f57225t <= 0) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires timestamp to be set");
        }
        int a = bzqd.m126036a(abeh.f57215j);
        if (a == 0 || a == 1) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires user action type to be set");
        }
        context.sendBroadcast(new Intent().setClassName("com.google.android.gms", "com.google.android.gms.chimera.GmsIntentOperationService$GmsExternalReceiver").setAction("com.google.android.gms.googlehelp.metrics.MetricsIntentOperation.LOG_METRIC").putExtra("EXTRA_METRIC_DATA", abeh.serializeToBytes()));
    }
}
