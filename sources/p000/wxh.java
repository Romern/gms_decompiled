package p000;

import android.app.ApplicationErrorReport;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.feedback.LegacyBugReportChimeraService;
import com.google.android.gms.googlehelp.feedback.Screenshot;

/* renamed from: wxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wxh extends Binder {

    /* renamed from: a */
    final /* synthetic */ LegacyBugReportChimeraService f51540a;

    public wxh(LegacyBugReportChimeraService legacyBugReportChimeraService) {
        this.f51540a = legacyBugReportChimeraService;
    }

    /* access modifiers changed from: protected */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int callingUid = Binder.getCallingUid();
        PackageManager packageManager = this.f51540a.getPackageManager();
        String[] packagesForUid = packageManager.getPackagesForUid(callingUid);
        if (packagesForUid == null || packagesForUid.length == 0) {
            return false;
        }
        ApplicationErrorReport applicationErrorReport = new ApplicationErrorReport();
        applicationErrorReport.packageName = packagesForUid[0];
        applicationErrorReport.type = 11;
        applicationErrorReport.installerPackageName = packageManager.getInstallerPackageName(applicationErrorReport.packageName);
        LegacyBugReportChimeraService legacyBugReportChimeraService = this.f51540a;
        Intent className = new Intent().setClassName(this.f51540a, "com.google.android.gms.feedback.FeedbackActivity");
        className.putExtra("android.intent.extra.BUG_REPORT", applicationErrorReport);
        className.addFlags(268435456);
        if (parcel.dataSize() > 0) {
            Bitmap bitmap = (Bitmap) Bitmap.CREATOR.createFromParcel(parcel);
            if (!bitmap.isRecycled()) {
                className.putExtra("com.android.feedback.SCREENSHOT_EXTRA", Screenshot.m66502a(bitmap));
            }
        }
        legacyBugReportChimeraService.startActivity(className);
        this.f51540a.stopSelf();
        return true;
    }
}
