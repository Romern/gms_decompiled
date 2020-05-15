package p000;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackChimeraActivity;

/* renamed from: wwj */
public final /* synthetic */ class wwj implements Runnable {

    /* renamed from: a */
    private final FeedbackChimeraActivity f51475a;

    public wwj(FeedbackChimeraActivity feedbackChimeraActivity) {
        this.f51475a = feedbackChimeraActivity;
    }

    public final void run() {
        FeedbackChimeraActivity feedbackChimeraActivity = this.f51475a;
        try {
            feedbackChimeraActivity.f31586n.mo29580a(feedbackChimeraActivity.f31587o);
        } catch (RemoteException e) {
            Log.e("gf_FeedbackActivity", e.getMessage());
        }
    }
}
