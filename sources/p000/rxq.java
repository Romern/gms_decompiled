package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.download.DownloadAndroidChimeraService;
import com.google.android.gms.common.download.DownloadDetails;
import com.google.android.gms.common.download.DownloadIntentOperation;

/* renamed from: rxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rxq extends rxm {

    /* renamed from: b */
    private final String f43828b;

    /* renamed from: c */
    private final String f43829c;

    public rxq(ryp ryp, String str, String str2) {
        super(ryp, "TryDownload");
        this.f43828b = str;
        this.f43829c = str2;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        Status e = DownloadIntentOperation.m22566e(context, this.f43829c);
        if (e.f30115i == 7000) {
            PackageManager packageManager = context.getPackageManager();
            try {
                CharSequence applicationLabel = packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f43828b, 0));
                DownloadDetails d = ryd.m34647d(context, this.f43829c);
                if (d != null) {
                    DownloadIntentOperation.m22558a(context, d, context.getString(C0126R.string.download_notification_title), context.getString(C0126R.string.download_notification_description, applicationLabel));
                    Intent startIntent = IntentOperation.getStartIntent(context, DownloadIntentOperation.class, "com.google.android.gms.common.download.START");
                    if (startIntent == null) {
                        bnsl bnsl = (bnsl) DownloadAndroidChimeraService.f30172a.mo68387b();
                        bnsl.mo68432a("rxq", "a", 170, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("getStartIntent returned null!  Unable to start download");
                        this.f43823a.mo25255a(new Status(13, context.getString(C0126R.string.download_msg_error_invalid), null));
                        return;
                    }
                    context.startService(startIntent);
                    this.f43823a.mo25255a(new Status(7001, context.getString(C0126R.string.download_msg_in_progress), null));
                    return;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                this.f43823a.mo25255a(new Status(8));
                return;
            }
        }
        this.f43823a.mo25255a(e);
    }
}
