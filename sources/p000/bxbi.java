package p000;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.WorkSource;
import com.google.android.gms.location.ActivityRecognitionRequest;

/* renamed from: bxbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxbi {

    /* renamed from: a */
    public final Intent f161815a;

    public bxbi(String str) {
        Intent intent = new Intent("com.google.android.location.internal.GMS_NLP");
        intent.setPackage(str);
        this.f161815a = intent;
    }

    /* renamed from: a */
    public static void m122521a() {
        throw new UnsupportedOperationException("Can't request and remove floor change detection updates at the same time.");
    }

    /* renamed from: b */
    public static void m122522b() {
        throw new UnsupportedOperationException("Can't request and remove sleep segment detection updates at the same time.");
    }

    /* renamed from: c */
    public static void m122523c() {
        throw new UnsupportedOperationException("Can't request and remove activity transition updates at the same time.");
    }

    /* renamed from: d */
    private static void m122524d() {
        throw new UnsupportedOperationException("Can't request and remove activity detection updates at the same time. If you where trying to update the rate of an existing activity detection, simply call requestActivityUpdates with the new rate (you don't need to call requestRemovalOfActivityUpdates).");
    }

    /* renamed from: a */
    public final ComponentName mo73549a(Context context) {
        return context.startService(this.f161815a);
    }

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
    /* renamed from: b */
    public final void mo73555b(PendingIntent pendingIntent) {
        if (this.f161815a.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_PERIOD_MILLIS")) {
            m122524d();
        }
        this.f161815a.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_PENDING_INTENT", pendingIntent);
        this.f161815a.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_REMOVE", true);
    }

    /* renamed from: c */
    public final void mo73557c(PendingIntent pendingIntent) {
        this.f161815a.putExtra("nlp.WIFI_SCAN_INTENT", pendingIntent);
    }

    /* renamed from: a */
    public final void mo73550a(long j, long j2, PendingIntent pendingIntent, String str) {
        this.f161815a.putExtra("com.google.android.location.internal.EXTRA_PENDING_INTENT", pendingIntent);
        this.f161815a.putExtra("com.google.android.location.internal.EXTRA_PERIOD_MILLIS", j);
        this.f161815a.putExtra("com.google.android.location.internal.EXTRA_LOCATION_TAG", str);
        if (j2 > j) {
            this.f161815a.putExtra("com.google.android.location.internal.EXTRA_BATCH_DURATION_MILLIS", j2);
        }
    }

    /* renamed from: c */
    public final void mo73558c(boolean z) {
        this.f161815a.putExtra("com.google.android.location.internal.EXTRA_LOCATION_FORCE_NOW", z);
    }

    /* renamed from: b */
    public final void mo73556b(boolean z) {
        this.f161815a.putExtra("locationSettingsIgnored", z);
    }

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
    public final void mo73551a(PendingIntent pendingIntent) {
        this.f161815a.putExtra("com.google.android.location.internal.EXTRA_PENDING_INTENT", pendingIntent);
        this.f161815a.putExtra("com.google.android.location.internal.EXTRA_LOCATION_REMOVE", true);
    }

    /* renamed from: a */
    public final void mo73552a(WorkSource workSource) {
        if (workSource != null) {
            int i = Build.VERSION.SDK_INT;
            this.f161815a.putExtra("com.google.android.location.internal.EXTRA_LOCATION_WORK_SOURCE", workSource);
        }
    }

    /* renamed from: a */
    public final void mo73553a(ActivityRecognitionRequest activityRecognitionRequest, PendingIntent pendingIntent) {
        if (this.f161815a.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_REMOVE")) {
            m122524d();
        }
        this.f161815a.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_PENDING_INTENT", pendingIntent);
        sef.m35071a(activityRecognitionRequest, this.f161815a, "com.google.android.location.internal.EXTRA_ACTIVITY_RECOGNITION_REQUEST");
    }

    /* renamed from: a */
    public final void mo73554a(boolean z) {
        this.f161815a.putExtra("com.google.android.location.internal.EXTRA_IS_FROM_FIRST_PARTY", z);
    }
}
