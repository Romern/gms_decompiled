package p000;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackChimeraActivity;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.lang.ref.WeakReference;

/* renamed from: wxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wxc extends AsyncTask {

    /* renamed from: a */
    public static final /* synthetic */ int f51529a = 0;

    /* renamed from: b */
    private final WeakReference f51530b;

    /* renamed from: c */
    private final ErrorReport f51531c;

    /* renamed from: d */
    private final wxy f51532d = new wxy();

    public wxc(FeedbackChimeraActivity feedbackChimeraActivity, ErrorReport errorReport) {
        this.f51530b = new WeakReference(feedbackChimeraActivity);
        this.f51531c = errorReport;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        FeedbackChimeraActivity feedbackChimeraActivity;
        Context context;
        HelpConfig[] helpConfigArr = (HelpConfig[]) objArr;
        if (helpConfigArr.length == 0 || (feedbackChimeraActivity = (FeedbackChimeraActivity) this.f51530b.get()) == null) {
            return null;
        }
        try {
            HelpConfig helpConfig = helpConfigArr[0];
            ErrorReport errorReport = this.f51531c;
            if (!aayi.m47270b()) {
                context = feedbackChimeraActivity.getApplicationContext();
            } else {
                context = feedbackChimeraActivity;
            }
            return wyd.m42463a(context, helpConfig, feedbackChimeraActivity.f31580b, errorReport);
        } catch (Exception e) {
            Log.w("gF_FetchSuggestionTask", "Error retrieving suggestions.", e);
            return null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.feedback.FeedbackChimeraActivity.a(com.google.android.gms.feedback.ErrorReport, boolean):void
     arg types: [com.google.android.gms.feedback.ErrorReport, int]
     candidates:
      com.google.android.gms.feedback.FeedbackChimeraActivity.a(rz, java.lang.String):void
      com.google.android.gms.feedback.FeedbackChimeraActivity.a(int, com.google.android.gms.feedback.ErrorReport):void
      com.google.android.gms.feedback.FeedbackChimeraActivity.a(com.google.android.gms.googlehelp.feedback.Screenshot, com.google.android.gms.feedback.ErrorReport):void
      com.google.android.gms.feedback.FeedbackChimeraActivity.a(wwy, boolean):void
      com.google.android.gms.feedback.FeedbackChimeraActivity.a(com.google.android.gms.feedback.ErrorReport, boolean):void */
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Pair pair = (Pair) obj;
        FeedbackChimeraActivity feedbackChimeraActivity = (FeedbackChimeraActivity) this.f51530b.get();
        if (feedbackChimeraActivity != null) {
            try {
                ErrorReport errorReport = this.f51531c;
                wxy wxy = this.f51532d;
                if (pair == null) {
                    errorReport.f31538ab = false;
                    errorReport.f31517H = true;
                    wyb.m42459a(errorReport, feedbackChimeraActivity);
                    feedbackChimeraActivity.mo18596a(errorReport, true);
                    return;
                }
                if (wxy != null) {
                    wxy.dismiss();
                }
                errorReport.f31538ab = true;
                errorReport.f31517H = false;
                FeedbackChimeraActivity.f31578l = (aasm) pair.second;
                aasm aasm = FeedbackChimeraActivity.f31578l;
                wyh wyh = new wyh();
                Bundle bundle = new Bundle();
                bundle.putCharSequence("help_response_title", aasm.f56496f);
                bundle.putCharSequence("help_response_snippet", (String) pair.first);
                wyh.setArguments(bundle);
                wyh.setCancelable(false);
                wyh.show(feedbackChimeraActivity.getSupportFragmentManager(), "suggestionDialog");
                feedbackChimeraActivity.mo18594a(43, errorReport, errorReport.f31546b, FeedbackChimeraActivity.f31578l.f56497g);
                feedbackChimeraActivity.mo18596a(errorReport, false);
            } catch (IllegalStateException e) {
                Log.w("gF_FetchSuggestionTask", "Exception when trying to return suggestions.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        FeedbackChimeraActivity feedbackChimeraActivity = (FeedbackChimeraActivity) this.f51530b.get();
        if (feedbackChimeraActivity != null) {
            this.f51532d.show(feedbackChimeraActivity.getSupportFragmentManager(), "progress_dialog");
        }
    }
}
