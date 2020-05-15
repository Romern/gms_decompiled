package p000;

import android.content.Context;
import com.google.android.gms.feedback.FeedbackAsyncChimeraService;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: wwc */
final /* synthetic */ class wwc implements wyt {

    /* renamed from: a */
    private final FeedbackOptions f51458a;

    public wwc(FeedbackOptions feedbackOptions) {
        this.f51458a = feedbackOptions;
    }

    /* renamed from: a */
    public final void mo29471a(Object obj) {
        FeedbackAsyncChimeraService.m23359b((Context) obj, this.f51458a);
    }
}
