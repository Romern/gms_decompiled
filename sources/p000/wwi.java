package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackBoundService;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: wwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wwi extends wzd implements aaai {

    /* renamed from: a */
    public final FeedbackBoundService f51471a;

    /* renamed from: b */
    public final String f51472b;

    /* renamed from: c */
    String f51473c;

    /* renamed from: d */
    private final aaag f51474d;

    public wwi(FeedbackBoundService feedbackBoundService, aaag aaag, String str) {
        this.f51471a = feedbackBoundService;
        this.f51472b = str;
        this.f51474d = aaag;
    }

    /* renamed from: a */
    static final Intent m42374a(Context context, ErrorReport errorReport, Long l) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.feedback.FeedbackActivity");
        className.putExtra("com.android.feedback.SAFEPARCELABLE_REPORT", errorReport);
        if (l != null) {
            className.putExtra("ASYNC_PSD_START_TICK_NANOS", l);
        }
        className.addFlags(268435456);
        return className;
    }

    /* renamed from: c */
    private final boolean m42375c(ErrorReport errorReport) {
        if (TextUtils.isEmpty(this.f51472b)) {
            Log.e("gf_FeedbackService", "Can't run feedback, no calling package set");
            return false;
        }
        PackageManager packageManager = this.f51471a.getPackageManager();
        errorReport.f31536a.packageName = this.f51472b;
        errorReport.f31527R = this.f51472b;
        errorReport.f31536a.type = 11;
        errorReport.f31536a.installerPackageName = packageManager.getInstallerPackageName(this.f51472b);
        return true;
    }

    /* renamed from: b */
    public final boolean mo29478b(ErrorReport errorReport) {
        ErrorReport errorReport2 = new ErrorReport();
        if (!m42375c(errorReport2)) {
            return false;
        }
        aayh.m47250a(errorReport2, errorReport, this.f51471a);
        errorReport2.f31514E = true;
        this.f51473c = errorReport2.f31511B;
        this.f51474d.mo16658a(new wvc("SilentSendFeedbackOperation", new wwe(errorReport2)));
        return true;
    }

    /* renamed from: c */
    private final boolean m42376c(FeedbackOptions feedbackOptions) {
        if (TextUtils.isEmpty(this.f51472b)) {
            Log.e("gf_FeedbackService", "Can't run feedback, no calling package set");
            return false;
        }
        String str = this.f51472b;
        feedbackOptions.f31596g = str;
        feedbackOptions.f31593d.packageName = str;
        feedbackOptions.f31593d.type = 11;
        feedbackOptions.f31593d.installerPackageName = this.f51471a.getPackageManager().getInstallerPackageName(this.f51472b);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final GoogleHelp mo29472a() {
        GoogleHelp a = GoogleHelp.m66336a("feedbackBoundService");
        if (!TextUtils.isEmpty(this.f51473c)) {
            a.f78760c = new Account(this.f51473c, "com.google");
        }
        a.f78762e = this.f51472b;
        return a;
    }

    /* renamed from: b */
    public final boolean mo29479b(FeedbackOptions feedbackOptions) {
        if (!m42376c(feedbackOptions)) {
            return false;
        }
        feedbackOptions.f31604o = true;
        this.f51474d.mo16658a(new wvc("SilentSendFeedbackOperation", new wwf(feedbackOptions)));
        return true;
    }

    /* renamed from: a */
    public final void mo29473a(Bundle bundle, long j) {
        this.f51474d.mo16658a(new wvc("SaveAsyncFeedbackPsdOperation", new wwg(this, j, bundle)));
    }

    /* renamed from: a */
    public final void mo29474a(ErrorReport errorReport, long j) {
        ErrorReport errorReport2 = new ErrorReport();
        if (m42375c(errorReport2)) {
            aayh.m47250a(errorReport2, errorReport, this.f51471a);
            this.f51473c = errorReport2.f31511B;
            this.f51474d.mo16658a(new wvc("StartFeedbackOperation", new wwd(this, errorReport2, j)));
        }
    }

    /* renamed from: a */
    public final void mo29475a(FeedbackOptions feedbackOptions) {
        if (m42376c(feedbackOptions)) {
            this.f51474d.mo16658a(new wvc("StartFeedbackOperation", new wwc(feedbackOptions)));
        }
    }

    /* renamed from: a */
    public final void mo29476a(FeedbackOptions feedbackOptions, Bundle bundle, long j) {
        this.f51474d.mo16658a(new wvc("SaveAsyncFeedbackPsbdOperation", new wwh(this, j, feedbackOptions, bundle)));
    }

    /* renamed from: a */
    public final boolean mo29477a(ErrorReport errorReport) {
        ErrorReport errorReport2 = new ErrorReport();
        if (!m42375c(errorReport2)) {
            return false;
        }
        aayh.m47250a(errorReport2, errorReport, this.f51471a);
        this.f51473c = errorReport2.f31511B;
        this.f51474d.mo16658a(new wvc("StartFeedbackOperation", new wwb(this, errorReport2)));
        return true;
    }
}
