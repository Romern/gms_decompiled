package p000;

import android.content.Context;
import com.google.android.gms.feedback.FeedbackAsyncChimeraService;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: wwf */
final /* synthetic */ class wwf implements wyt {

    /* renamed from: a */
    private final FeedbackOptions f51463a;

    public wwf(FeedbackOptions feedbackOptions) {
        this.f51463a = feedbackOptions;
    }

    /* renamed from: a */
    public final void mo29471a(Object obj) {
        FeedbackAsyncChimeraService.m23357a((Context) obj, this.f51463a);
    }
}
