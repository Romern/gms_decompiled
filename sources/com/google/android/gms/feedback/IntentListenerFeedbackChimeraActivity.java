package com.google.android.gms.feedback;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.gms.googlehelp.feedback.Screenshot;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IntentListenerFeedbackChimeraActivity extends Activity {

    /* renamed from: a */
    private String f31612a;

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        String a = spn.m35852a((Activity) this);
        this.f31612a = a;
        if (!TextUtils.isEmpty(a)) {
            PackageManager packageManager = getPackageManager();
            ErrorReport errorReport = new ErrorReport();
            errorReport.f31536a.packageName = this.f31612a;
            errorReport.f31536a.type = 11;
            errorReport.f31536a.installerPackageName = packageManager.getInstallerPackageName(this.f31612a);
            Intent className = new Intent().setClassName(this, "com.google.android.gms.feedback.FeedbackActivity");
            className.addFlags(268435456);
            Intent intent = getIntent();
            if (intent.hasExtra("com.android.feedback.SCREENSHOT_EXTRA")) {
                className.putExtra("com.android.feedback.SCREENSHOT_EXTRA", Screenshot.m66502a((Bitmap) intent.getParcelableExtra("com.android.feedback.SCREENSHOT_EXTRA")));
            }
            if (intent.hasExtra("com.android.feedback.GOOGLE_ACCOUNT_EXTRA")) {
                CharSequence charSequenceExtra = intent.getCharSequenceExtra("com.android.feedback.GOOGLE_ACCOUNT_EXTRA");
                if (!TextUtils.isEmpty(charSequenceExtra)) {
                    errorReport.f31511B = charSequenceExtra.toString();
                }
            }
            if (intent.hasExtra("com.android.feedback.PSD_EXTRA") && (bundleExtra = intent.getBundleExtra("com.android.feedback.PSD_EXTRA")) != null && bundleExtra.size() > 0) {
                errorReport.f31513D = bundleExtra;
            }
            className.putExtra("com.android.feedback.SAFEPARCELABLE_REPORT", errorReport);
            startActivity(className);
            finish();
            return;
        }
        finish();
    }
}
