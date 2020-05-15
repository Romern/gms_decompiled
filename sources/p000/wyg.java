package p000;

import android.view.View;
import com.google.android.chimera.Activity;
import com.google.android.gms.feedback.FeedbackChimeraActivity;

/* renamed from: wyg */
final /* synthetic */ class wyg implements View.OnClickListener {

    /* renamed from: a */
    private final Activity f51566a;

    public wyg(Activity activity) {
        this.f51566a = activity;
    }

    public void onClick(View view) {
        ((FeedbackChimeraActivity) this.f51566a).readMore(view);
    }
}
