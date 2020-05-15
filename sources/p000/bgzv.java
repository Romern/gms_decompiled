package p000;

import android.content.Context;
import android.view.View;
import com.google.android.location.settings.ActivityRecognitionPermissionChimeraActivity;

/* renamed from: bgzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgzv implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Context f118176a;

    /* renamed from: b */
    final /* synthetic */ ActivityRecognitionPermissionChimeraActivity f118177b;

    public bgzv(ActivityRecognitionPermissionChimeraActivity activityRecognitionPermissionChimeraActivity, Context context) {
        this.f118177b = activityRecognitionPermissionChimeraActivity;
        this.f118176a = context;
    }

    public void onClick(View view) {
        bewq.m95998a(this.f118176a).mo61203a(4);
        this.f118177b.finish();
    }
}
