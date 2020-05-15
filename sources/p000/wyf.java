package p000;

import android.view.View;
import com.google.android.chimera.Activity;
import com.google.android.gms.feedback.FeedbackChimeraActivity;

/* renamed from: wyf */
final /* synthetic */ class wyf implements View.OnClickListener {

    /* renamed from: a */
    private final Activity f51565a;

    public wyf(Activity activity) {
        this.f51565a = activity;
    }

    public void onClick(View view) {
        ((FeedbackChimeraActivity) this.f51565a).dismiss(view);
    }
}
