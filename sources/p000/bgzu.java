package p000;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.location.settings.ActivityRecognitionPermissionChimeraActivity;

/* renamed from: bgzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgzu implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ boolean f118172a;

    /* renamed from: b */
    final /* synthetic */ boolean f118173b;

    /* renamed from: c */
    final /* synthetic */ Context f118174c;

    /* renamed from: d */
    final /* synthetic */ ActivityRecognitionPermissionChimeraActivity f118175d;

    public bgzu(ActivityRecognitionPermissionChimeraActivity activityRecognitionPermissionChimeraActivity, boolean z, boolean z2, Context context) {
        this.f118175d = activityRecognitionPermissionChimeraActivity;
        this.f118172a = z;
        this.f118173b = z2;
        this.f118174c = context;
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
    public void onClick(View view) {
        if (this.f118172a) {
            this.f118175d.finish();
        } else if (this.f118173b) {
            this.f118175d.startActivity(new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"));
            this.f118175d.finish();
        } else {
            sex a = sex.m35104a(this.f118174c);
            if (a != null && !a.mo25455g()) {
                ActivityRecognitionPermissionChimeraActivity.m117337e();
            }
            Intent intent = new Intent();
            intent.setAction("com.google.android.location.settings.ACTIVITY_RECOGNITION_PERMISSION");
            intent.putExtra("secondIntroPage", true);
            this.f118175d.startActivity(intent);
        }
    }
}
